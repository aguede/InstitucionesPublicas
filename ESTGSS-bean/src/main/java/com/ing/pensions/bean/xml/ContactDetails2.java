package com.ing.pensions.bean.xml;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Java class for ContactDetails2 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDetails2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NmPrfx" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}NamePrefix1Code" minOccurs="0"/>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max140Text" minOccurs="0"/>
 *         &lt;element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PhoneNumber" minOccurs="0"/>
 *         &lt;element name="MobNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PhoneNumber" minOccurs="0"/>
 *         &lt;element name="FaxNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PhoneNumber" minOccurs="0"/>
 *         &lt;element name="EmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max2048Text" minOccurs="0"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetails2", propOrder = { "nmPrfx", "nm", "phneNb", "mobNb", "faxNb", "emailAdr", "othr" })
@Getter
@Setter
public class ContactDetails2 implements Serializable {

    private static final long serialVersionUID = 4798717039742501943L;

    @XmlElement(name = "NmPrfx")
    private NamePrefix1Code nmPrfx;
    @XmlElement(name = "Nm")
    private String          nm;
    @XmlElement(name = "PhneNb")
    private String          phneNb;
    @XmlElement(name = "MobNb")
    private String          mobNb;
    @XmlElement(name = "FaxNb")
    private String          faxNb;
    @XmlElement(name = "EmailAdr")
    private String          emailAdr;
    @XmlElement(name = "Othr")
    private String          othr;

}
