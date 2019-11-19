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
 * Java class for PersonIdentification5 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentification5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DtAndPlcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}DateAndPlaceOfBirth" minOccurs="0"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}GenericPersonIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification5", propOrder = { "dtAndPlcOfBirth", "othr" })
@Getter
@Setter
public class PersonIdentification5 implements Serializable {

    private static final long                    serialVersionUID = 8187485645720046414L;

    @XmlElement(name = "DtAndPlcOfBirth")
    private DateAndPlaceOfBirth                dtAndPlcOfBirth;
    @XmlElement(name = "Othr")
    private List<GenericPersonIdentification1> othr;

    public List<GenericPersonIdentification1> getOthr() {
        return this.othr != null ? this.othr : new ArrayList<>();
    }

}
