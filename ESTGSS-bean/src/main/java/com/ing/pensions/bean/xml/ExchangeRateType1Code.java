package com.ing.pensions.bean.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExchangeRateType1Code.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ExchangeRateType1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPOT"/>
 *     &lt;enumeration value="SALE"/>
 *     &lt;enumeration value="AGRD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExchangeRateType1Code")
@XmlEnum
public enum ExchangeRateType1Code {

    SPOT, SALE, AGRD;

    public String value() {
        return name();
    }

    public static ExchangeRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
