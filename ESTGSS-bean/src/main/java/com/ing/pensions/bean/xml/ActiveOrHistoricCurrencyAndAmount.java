package com.ing.pensions.bean.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Java class for ActiveOrHistoricCurrencyAndAmount complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ActiveOrHistoricCurrencyAndAmount">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:iso:std:iso:20022:tech:xsd:pain.001.001.03>ActiveOrHistoricCurrencyAndAmount_SimpleType">
 *       &lt;attribute name="Ccy" use="required" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveOrHistoricCurrencyAndAmount", propOrder = { "value" })
@Getter
@Setter
public class ActiveOrHistoricCurrencyAndAmount implements Serializable {

    private static final long serialVersionUID = 3909946911660649737L;

    @XmlValue
    private BigDecimal      value;
    @XmlAttribute(name = "Ccy", required = true)
    private String          ccy;

}
