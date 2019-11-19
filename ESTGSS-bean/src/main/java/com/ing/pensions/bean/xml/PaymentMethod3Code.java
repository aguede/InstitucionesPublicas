package com.ing.pensions.bean.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PaymentMethod3Code.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="PaymentMethod3Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHK"/>
 *     &lt;enumeration value="TRF"/>
 *     &lt;enumeration value="TRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethod3Code")
@XmlEnum
public enum PaymentMethod3Code {

    CHK, TRF, TRA;

    public String value() {
        return name();
    }

    public static PaymentMethod3Code fromValue(String v) {
        return valueOf(v);
    }

}
