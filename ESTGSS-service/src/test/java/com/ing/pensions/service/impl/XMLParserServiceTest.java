package com.ing.pensions.service.impl;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import com.ing.pensions.bean.xml.Document;
import com.ing.pensions.service.exception.ESTGSSServiceException;

/**
 *
 * @author Inaki Rodriguez
 *
 *         Babel Sistemas de Informacion
 *
 */
@ExtendWith(MockitoExtension.class)
public class XMLParserServiceTest {

    @InjectMocks
    XMLParserServiceImpl  xmlParserServiceImpl;

    private static String fileName;
    private static String filePath;
    private static String pathScheme;

    @BeforeAll
    public static void init() {
        fileName = "pain.001.001.03-Test.xml";
        filePath = "src/test/resources/";
        pathScheme = "pain.001.001.03.xsd";

    }

    @BeforeEach
    public void setPaths() {
        ReflectionTestUtils.setField(xmlParserServiceImpl, "PATH_FILES", filePath);
        ReflectionTestUtils.setField(xmlParserServiceImpl, "SEPA_SCHEMA_NAME", pathScheme);
    }

    @Test
    public void generateXMLStreamReaderTest() throws Exception {
        final XMLStreamReader xmlsr = xmlParserServiceImpl.generateXMLStreamReader(fileName);

        Assertions.assertNotNull(xmlsr);

    }

    @Test()
    @DisplayName("╯°□°）╯")
    public void generateXMLStreamReaderTestKO() throws Exception {
        assertThrows(ESTGSSServiceException.class, () -> {
            xmlParserServiceImpl.generateXMLStreamReader("");
        });

    }

    @Test
    public void parseXMLFileTest() throws Exception {
        final XMLStreamReader xmlsr = xmlParserServiceImpl.generateXMLStreamReader(fileName);
        final Document document = xmlParserServiceImpl.parseXMLFile(xmlsr);

        Assertions.assertNotNull(xmlsr);
        Assertions.assertNotNull(document);

    }

    @Test
    public void parseXMLFileTestKO() throws Exception {
        ReflectionTestUtils.setField(xmlParserServiceImpl, "SEPA_SCHEMA_NAME", "foo");

        final XMLStreamReader xmlsr = xmlParserServiceImpl.generateXMLStreamReader(fileName);

        Assertions.assertNotNull(xmlsr);
        assertThrows(ESTGSSServiceException.class, () -> {
            xmlParserServiceImpl.parseXMLFile(xmlsr);
        });

    }

    @Test
    public void initializeUnmarshallerTest() throws Exception {
        final Unmarshaller unmarshaller = xmlParserServiceImpl.initializeUnmarshaller();

        Assertions.assertNotNull(unmarshaller);

    }

    @Test
    public void setSchemeTest() throws Exception {
        final Unmarshaller unmarshaller = xmlParserServiceImpl.initializeUnmarshaller();
        xmlParserServiceImpl.setScheme(unmarshaller);

        Assertions.assertNotNull(unmarshaller);
        Assertions.assertNotNull(unmarshaller.getSchema());
    }

    @Test
    public void setSchemeTestKO() throws Exception {
        ReflectionTestUtils.setField(xmlParserServiceImpl, "SEPA_SCHEMA_NAME", "foo");
        final Unmarshaller unmarshaller = xmlParserServiceImpl.initializeUnmarshaller();

        assertThrows(ESTGSSServiceException.class, () -> {
            xmlParserServiceImpl.setScheme(unmarshaller);
        });
    }

    @Test
    public void benchMark() {
        final XMLStreamReader xmlsr = xmlParserServiceImpl.generateXMLStreamReader(fileName);

        printMemory();

        final Long begin = System.nanoTime();

        final Document document = xmlParserServiceImpl.parseXMLFile(xmlsr);

        final Long end = System.nanoTime();
        System.out.println("Elapsed Time: " + (end - begin) / 1000 + "millisec.");

        printTotalOperations(document);
        printTotalAmount(document);
        printMemory();

    }

    public void printTotalAmount(Document sepa) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Header:    " + sepa.getCstmrCdtTrfInitn().getGrpHdr().getCtrlSum() + " total amount");
        final List<BigDecimal> amounts = sepa.getCstmrCdtTrfInitn().getPmtInf().get(0).getCdtTrfTxInf().stream()
                .map(p -> p.getAmt().getInstdAmt().getValue()).collect(Collectors.toList());
        final BigDecimal totalAmount = amounts.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Calc:      " + totalAmount + " total amount");
    }

    public void printTotalOperations(Document sepa) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Header:     " + sepa.getCstmrCdtTrfInitn().getGrpHdr().getNbOfTxs() + " transactions");
        System.out.println("Operations: " + sepa.getCstmrCdtTrfInitn().getPmtInf().get(0).getCdtTrfTxInf().size()
                + " transactions");
    }

    public void printMemory() {
        final int mb = 1024 * 1024;
        final Runtime runtime = Runtime.getRuntime();
        System.out.println("--------------------------------------------------------");
        System.out.println("Used Memory:" + (runtime.totalMemory() - runtime.freeMemory()) / mb);
        System.out.println("Free Memory:" + runtime.freeMemory() / mb);
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);

    }

}
