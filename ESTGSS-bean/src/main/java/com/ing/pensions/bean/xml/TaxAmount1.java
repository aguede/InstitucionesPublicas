package com.ing.pensions.bean.xml;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Java class for TaxAmount1 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAmount1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PercentageRate" minOccurs="0"/>
 *         &lt;element name="TaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Dtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}TaxRecordDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAmount1", propOrder = { "rate", "taxblBaseAmt", "ttlAmt", "dtls" })
@Getter
@Setter
public class TaxAmount1 implements Serializable {

    private static final long                   serialVersionUID = 1692413382752704885L;

    @XmlElement(name = "Rate")
    private BigDecimal                        rate;
    @XmlElement(name = "TaxblBaseAmt")
    private ActiveOrHistoricCurrencyAndAmount taxblBaseAmt;
    @XmlElement(name = "TtlAmt")
    private ActiveOrHistoricCurrencyAndAmount ttlAmt;
    @XmlElement(name = "Dtls")
    private List<TaxRecordDetails1>           dtls;

    public List<TaxRecordDetails1> getDtls() {
        return this.dtls != null ? this.dtls : new ArrayList<>();
    }

}
