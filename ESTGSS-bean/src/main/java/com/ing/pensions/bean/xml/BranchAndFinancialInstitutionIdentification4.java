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
 * Java class for BranchAndFinancialInstitutionIdentification4 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}FinancialInstitutionIdentification7"/>
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchData2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification4", propOrder = { "finInstnId", "brnchId" })
@Getter
@Setter
public class BranchAndFinancialInstitutionIdentification4 implements Serializable {

    private static final long                     serialVersionUID = 6639197879452637762L;

    @XmlElement(name = "FinInstnId", required = true)
    private FinancialInstitutionIdentification7 finInstnId;
    @XmlElement(name = "BrnchId")
    private BranchData2                         brnchId;

}
