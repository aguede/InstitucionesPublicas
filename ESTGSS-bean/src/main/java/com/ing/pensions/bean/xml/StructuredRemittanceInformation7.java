package com.ing.pensions.bean.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Java class for StructuredRemittanceInformation7 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredRemittanceInformation7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RfrdDocInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ReferredDocumentInformation3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RfrdDocAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}RemittanceAmount1" minOccurs="0"/>
 *         &lt;element name="CdtrRefInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CreditorReferenceInformation2" minOccurs="0"/>
 *         &lt;element name="Invcr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="Invcee" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="AddtlRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max140Text" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation7", propOrder = { "rfrdDocInf", "rfrdDocAmt", "cdtrRefInf", "invcr",
                                                                  "invcee", "addtlRmtInf" })
@Getter
@Setter
public class StructuredRemittanceInformation7 implements Serializable {

    private static final long                    serialVersionUID = 2816077052808896947L;

    @XmlElement(name = "RfrdDocInf")
    private List<ReferredDocumentInformation3> rfrdDocInf;
    @XmlElement(name = "RfrdDocAmt")
    private RemittanceAmount1                  rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf")
    private CreditorReferenceInformation2      cdtrRefInf;
    @XmlElement(name = "Invcr")
    private PartyIdentification32              invcr;
    @XmlElement(name = "Invcee")
    private PartyIdentification32              invcee;
    @XmlElement(name = "AddtlRmtInf")
    private List<String>                       addtlRmtInf;

    public List<ReferredDocumentInformation3> getRfrdDocInf() {
        return this.rfrdDocInf != null ? this.rfrdDocInf : new ArrayList<>();
    }

    public List<String> getAddtlRmtInf() {
        return this.addtlRmtInf != null ? this.addtlRmtInf : new ArrayList<>();
    }

}
