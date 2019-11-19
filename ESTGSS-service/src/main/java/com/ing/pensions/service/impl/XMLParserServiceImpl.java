package com.ing.pensions.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.xml.sax.SAXException;

import com.ing.pensions.bean.xml.Document;
import com.ing.pensions.service.IXMLParserService;
import com.ing.pensions.service.exception.ESTGSSServiceException;
import com.ing.pensions.utils.IBANUtils;

/**
 *
 * @author Inaki Rodriguez
 *
 *         Babel Sistemas de Informacion
 *
 */
@Service
public class XMLParserServiceImpl implements IXMLParserService {

    /**
     * Path where the files are going to be stored
     */
    @Value("${file.location.base:C:\\ESTSS\\files\\}")
    public String PATH_FILES;

    /**
     * Name of the SEPA pain.001.001.03 xsd scheme
     */
    @Value("${file.location.scheme:pain.001.001.03.xsd}")
    public String SEPA_SCHEMA_NAME;

    @Override
    public XMLStreamReader generateXMLStreamReader(String fileName) {
        try {
            Assert.isTrue(StringUtils.hasText(fileName), "Empty path file");

            final XMLInputFactory xmlif = XMLInputFactory.newInstance();
            xmlif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, Boolean.FALSE);
            xmlif.setProperty(XMLInputFactory.SUPPORT_DTD, Boolean.FALSE);
            final XMLStreamReader xmlsr = xmlif.createXMLStreamReader(new FileReader(PATH_FILES + fileName));
            return xmlsr;
        }
        catch (final XMLStreamException | IllegalArgumentException | FileNotFoundException e) {
            throw new ESTGSSServiceException(e, HttpStatus.INTERNAL_SERVER_ERROR,
                    "Could not initialize file reader for the path " + fileName);
        }
    }

    @Override
    public Document parseXMLFile(XMLStreamReader xmlr) {
        final Unmarshaller unmarshaller = initializeUnmarshaller();
        setScheme(unmarshaller);

        return unmarshallXMLStreamReader(xmlr, unmarshaller);

    }

    /**
     * Initializes Unmarshaller for the Document class scheme
     *
     * @return
     */
    protected Unmarshaller initializeUnmarshaller() {
        Unmarshaller unmarshaller = null;
        try {
            final JAXBContext ucontext = JAXBContext.newInstance(Document.class);
            unmarshaller = ucontext.createUnmarshaller();

        }
        catch (final JAXBException e) {
            throw new ESTGSSServiceException(e, HttpStatus.INTERNAL_SERVER_ERROR, e.getLocalizedMessage());
        }

        return unmarshaller;
    }

    /**
     * Sets the provided xsd validation scheme to the input unmarshaller
     * 
     * @param unmarshaller
     */
    protected void setScheme(Unmarshaller unmarshaller) {
        try {
            final SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            final Schema employeeSchema = sf.newSchema(new File(PATH_FILES + SEPA_SCHEMA_NAME));
            unmarshaller.setSchema(employeeSchema);

        }
        catch (final SAXException e) {
            throw new ESTGSSServiceException(e, HttpStatus.INTERNAL_SERVER_ERROR, e.getLocalizedMessage());
        }
    }

    /**
     * Does the unmarshalling itself to the provided XML stream with the
     * generated unmarshaller
     * 
     * @param xmlr
     * @param unmarshaller
     * @return
     */
    protected Document unmarshallXMLStreamReader(XMLStreamReader xmlr, final Unmarshaller unmarshaller) {
        Document document = null;
        try {

            xmlr.nextTag();

            while (xmlr.getEventType() == XMLStreamConstants.START_ELEMENT) {

                final JAXBElement<Document> pt = unmarshaller.unmarshal(xmlr, Document.class);
                document = pt.getValue();

                if (xmlr.getEventType() == XMLStreamConstants.CHARACTERS) {
                    xmlr.next();
                }
            }

            IBANUtils.validateAllIBANs(document);

        }
        catch (final JAXBException | XMLStreamException e) {
            throw new ESTGSSServiceException(e, HttpStatus.INTERNAL_SERVER_ERROR, e.getLocalizedMessage());
        }
        return document;
    }

}
