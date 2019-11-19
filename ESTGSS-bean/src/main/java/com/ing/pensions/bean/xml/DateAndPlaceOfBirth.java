package com.ing.pensions.bean.xml;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Java class for DateAndPlaceOfBirth complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndPlaceOfBirth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BirthDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ISODate"/>
 *         &lt;element name="PrvcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="CityOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text"/>
 *         &lt;element name="CtryOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CountryCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndPlaceOfBirth", propOrder = { "birthDt", "prvcOfBirth", "cityOfBirth", "ctryOfBirth" })
@Getter
@Setter
public class DateAndPlaceOfBirth implements Serializable {

    private static final long      serialVersionUID = 3896204347133474975L;

    @XmlElement(name = "BirthDt", required = true)
    private XMLGregorianCalendar birthDt;
    @XmlElement(name = "PrvcOfBirth")
    private String               prvcOfBirth;
    @XmlElement(name = "CityOfBirth", required = true)
    private String               cityOfBirth;
    @XmlElement(name = "CtryOfBirth", required = true)
    private String               ctryOfBirth;

}
