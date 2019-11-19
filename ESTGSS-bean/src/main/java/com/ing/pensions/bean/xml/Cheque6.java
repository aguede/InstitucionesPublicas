package com.ing.pensions.bean.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Java class for Cheque6 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Cheque6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChqTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ChequeType2Code" minOccurs="0"/>
 *         &lt;element name="ChqNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="ChqFr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}NameAndAddress10" minOccurs="0"/>
 *         &lt;element name="DlvryMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ChequeDeliveryMethod1Choice" minOccurs="0"/>
 *         &lt;element name="DlvrTo" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}NameAndAddress10" minOccurs="0"/>
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Priority2Code" minOccurs="0"/>
 *         &lt;element name="ChqMtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ISODate" minOccurs="0"/>
 *         &lt;element name="FrmsCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="MemoFld" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="RgnlClrZone" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="PrtLctn" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque6", propOrder = { "chqTp", "chqNb", "chqFr", "dlvryMtd", "dlvrTo", "instrPrty", "chqMtrtyDt",
                                         "frmsCd", "memoFld", "rgnlClrZone", "prtLctn" })
@Getter
@Setter
public class Cheque6 implements Serializable {

    private static final long             serialVersionUID = 2275653553168434718L;

    @XmlElement(name = "ChqTp")
    private ChequeType2Code             chqTp;
    @XmlElement(name = "ChqNb")
    private String                      chqNb;
    @XmlElement(name = "ChqFr")
    private NameAndAddress10            chqFr;
    @XmlElement(name = "DlvryMtd")
    private ChequeDeliveryMethod1Choice dlvryMtd;
    @XmlElement(name = "DlvrTo")
    private NameAndAddress10            dlvrTo;
    @XmlElement(name = "InstrPrty")
    private Priority2Code               instrPrty;
    @XmlElement(name = "ChqMtrtyDt")
    private XMLGregorianCalendar        chqMtrtyDt;
    @XmlElement(name = "FrmsCd")
    private String                      frmsCd;
    @XmlElement(name = "MemoFld")
    private List<String>                memoFld;
    @XmlElement(name = "RgnlClrZone")
    private String                      rgnlClrZone;
    @XmlElement(name = "PrtLctn")
    private String                      prtLctn;

    public List<String> getMemoFld() {
        return this.memoFld != null ? this.memoFld : new ArrayList<>();
    }
}
