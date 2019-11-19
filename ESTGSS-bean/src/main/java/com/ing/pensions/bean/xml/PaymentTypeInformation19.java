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
 * Java class for PaymentTypeInformation19 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformation19">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Priority2Code" minOccurs="0"/>
 *         &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ServiceLevel8Choice" minOccurs="0"/>
 *         &lt;element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}LocalInstrument2Choice" minOccurs="0"/>
 *         &lt;element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CategoryPurpose1Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformation19", propOrder = { "instrPrty", "svcLvl", "lclInstrm", "ctgyPurp" })
@Getter
@Setter
public class PaymentTypeInformation19 implements Serializable {

    private static final long        serialVersionUID = 1770097536082735358L;

    @XmlElement(name = "InstrPrty")
    private Priority2Code          instrPrty;
    @XmlElement(name = "SvcLvl")
    private ServiceLevel8Choice    svcLvl;
    @XmlElement(name = "LclInstrm")
    private LocalInstrument2Choice lclInstrm;
    @XmlElement(name = "CtgyPurp")
    private CategoryPurpose1Choice ctgyPurp;

}
