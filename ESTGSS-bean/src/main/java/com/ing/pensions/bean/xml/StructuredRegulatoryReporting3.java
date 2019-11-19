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
 * Java class for StructuredRegulatoryReporting3 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredRegulatoryReporting3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ISODate" minOccurs="0"/>
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CountryCode" minOccurs="0"/>
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max10Text" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Inf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRegulatoryReporting3", propOrder = { "tp", "dt", "ctry", "cd", "amt", "inf" })
@Getter
@Setter
public class StructuredRegulatoryReporting3 implements Serializable {

    private static final long                   serialVersionUID = -6565364612937014482L;

    @XmlElement(name = "Tp")
    private String                            tp;
    @XmlElement(name = "Dt")
    private XMLGregorianCalendar              dt;
    @XmlElement(name = "Ctry")
    private String                            ctry;
    @XmlElement(name = "Cd")
    private String                            cd;
    @XmlElement(name = "Amt")
    private ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "Inf")
    private List<String>                      inf;

    public List<String> getInf() {
        return this.inf != null ? this.inf : new ArrayList<>();
    }

}
