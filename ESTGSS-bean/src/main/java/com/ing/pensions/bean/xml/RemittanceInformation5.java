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
 * Java class for RemittanceInformation5 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceInformation5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ustrd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max140Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Strd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}StructuredRemittanceInformation7" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceInformation5", propOrder = { "ustrd", "strd" })
@Getter
@Setter
public class RemittanceInformation5 implements Serializable {

    private static final long                        serialVersionUID = 7836357989625771796L;

    @XmlElement(name = "Ustrd")
    private List<String>                           ustrd;
    @XmlElement(name = "Strd")
    private List<StructuredRemittanceInformation7> strd;

    public List<StructuredRemittanceInformation7> getStrd() {
        return this.strd != null ? this.strd : new ArrayList<>();
    }

}
