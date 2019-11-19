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
 * Java class for RemittanceAmount1 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceAmount1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DuePyblAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="DscntApldAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="CdtNoteAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="AdjstmntAmtAndRsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}DocumentAdjustment1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RmtdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceAmount1", propOrder = { "duePyblAmt", "dscntApldAmt", "cdtNoteAmt", "taxAmt",
                                                   "adjstmntAmtAndRsn", "rmtdAmt" })
@Getter
@Setter
public class RemittanceAmount1 implements Serializable {

    private static final long                   serialVersionUID = 8496988711483106335L;

    @XmlElement(name = "DuePyblAmt")
    private ActiveOrHistoricCurrencyAndAmount duePyblAmt;
    @XmlElement(name = "DscntApldAmt")
    private ActiveOrHistoricCurrencyAndAmount dscntApldAmt;
    @XmlElement(name = "CdtNoteAmt")
    private ActiveOrHistoricCurrencyAndAmount cdtNoteAmt;
    @XmlElement(name = "TaxAmt")
    private ActiveOrHistoricCurrencyAndAmount taxAmt;
    @XmlElement(name = "AdjstmntAmtAndRsn")
    private List<DocumentAdjustment1>         adjstmntAmtAndRsn;
    @XmlElement(name = "RmtdAmt")
    private ActiveOrHistoricCurrencyAndAmount rmtdAmt;

    public List<DocumentAdjustment1> getAdjstmntAmtAndRsn() {
        return this.adjstmntAmtAndRsn != null ? this.adjstmntAmtAndRsn : new ArrayList<>();
    }

}
