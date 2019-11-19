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
 * Java class for FinancialInstitutionIdentification7 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitutionIdentification7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIC" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BICIdentifier" minOccurs="0"/>
 *         &lt;element name="ClrSysMmbId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ClearingSystemMemberIdentification2" minOccurs="0"/>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max140Text" minOccurs="0"/>
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PostalAddress6" minOccurs="0"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}GenericFinancialIdentification1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentification7", propOrder = { "bic", "clrSysMmbId", "nm", "pstlAdr", "othr" })
@Getter
@Setter
public class FinancialInstitutionIdentification7 implements Serializable {

    private static final long                     serialVersionUID = 7224934274932624688L;

    @XmlElement(name = "BIC")
    private String                              bic;
    @XmlElement(name = "ClrSysMmbId")
    private ClearingSystemMemberIdentification2 clrSysMmbId;
    @XmlElement(name = "Nm")
    private String                              nm;
    @XmlElement(name = "PstlAdr")
    private PostalAddress6                      pstlAdr;
    @XmlElement(name = "Othr")
    private GenericFinancialIdentification1     othr;

}
