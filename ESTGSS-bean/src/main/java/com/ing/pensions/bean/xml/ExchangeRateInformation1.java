package com.ing.pensions.bean.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Java class for ExchangeRateInformation1 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BaseOneRate" minOccurs="0"/>
 *         &lt;element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ExchangeRateType1Code" minOccurs="0"/>
 *         &lt;element name="CtrctId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateInformation1", propOrder = { "xchgRate", "rateTp", "ctrctId" })
@Getter
@Setter
public class ExchangeRateInformation1 implements Serializable {

    private static final long       serialVersionUID = 8967755414890018672L;

    @XmlElement(name = "XchgRate")
    private BigDecimal            xchgRate;
    @XmlElement(name = "RateTp")
    private ExchangeRateType1Code rateTp;
    @XmlElement(name = "CtrctId")
    private String                ctrctId;

}
