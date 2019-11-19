package com.ing.pensions.service;

import javax.xml.stream.XMLStreamReader;

import com.ing.pensions.bean.xml.Document;

/**
 * XML Parser which uses Stax and JaxB for parsing xml files.
 * 
 * @author Inaki Rodriguez Babel Sistemas de Informacion
 *
 */
public interface IXMLParserService {

    /**
     * Initializes a XMLStreamReader object in order to use Stax. A stream is
     * needed in order to maintain performance with big files.
     * 
     * @param pathFile
     * @return XMLStreamReader
     */
    public XMLStreamReader generateXMLStreamReader(String pathFile);

    /**
     * Parses an XMLStreamReader containing a XML file. This method uses an XSD
     * Scheme which is provided in the properties file. The result is a new
     * Document with all the file information.
     * 
     * @return Document
     */
    public Document parseXMLFile(XMLStreamReader xmlr);

}
