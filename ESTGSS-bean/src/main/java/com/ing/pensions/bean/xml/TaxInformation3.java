package com.ing.pensions.bean.xml;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Java class for TaxInformation3 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInformation3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}TaxParty1" minOccurs="0"/>
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}TaxParty2" minOccurs="0"/>
 *         &lt;element name="AdmstnZn" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max140Text" minOccurs="0"/>
 *         &lt;element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="TtlTaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ISODate" minOccurs="0"/>
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Number" minOccurs="0"/>
 *         &lt;element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}TaxRecord1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformation3", propOrder = { "cdtr", "dbtr", "admstnZn", "refNb", "mtd", "ttlTaxblBaseAmt",
                                                 "ttlTaxAmt", "dt", "seqNb", "rcrd" })
@Getter
@Setter
public class TaxInformation3 implements Serializable {

    private static final long                   serialVersionUID = -6338424337221976671L;

    @XmlElement(name = "Cdtr")
    private TaxParty1                         cdtr;
    @XmlElement(name = "Dbtr")
    private TaxParty2                         dbtr;
    @XmlElement(name = "AdmstnZn")
    private String                            admstnZn;
    @XmlElement(name = "RefNb")
    private String                            refNb;
    @XmlElement(name = "Mtd")
    private String                            mtd;
    @XmlElement(name = "TtlTaxblBaseAmt")
    private ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt;
    @XmlElement(name = "TtlTaxAmt")
    private ActiveOrHistoricCurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "Dt")
    private XMLGregorianCalendar              dt;
    @XmlElement(name = "SeqNb")
    private BigDecimal                        seqNb;
    @XmlElement(name = "Rcrd")
    private List<TaxRecord1>                  rcrd;

    public List<TaxRecord1> getRcrd() {
        return this.rcrd != null ? this.rcrd : new ArrayList<>();
    }

}
