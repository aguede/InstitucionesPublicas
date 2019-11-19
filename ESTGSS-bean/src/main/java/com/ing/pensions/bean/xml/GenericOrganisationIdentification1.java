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
 * Java class for GenericOrganisationIdentification1 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GenericOrganisationIdentification1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text"/>
 *         &lt;element name="SchmeNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}OrganisationIdentificationSchemeName1Choice" minOccurs="0"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericOrganisationIdentification1", propOrder = { "id", "schmeNm", "issr" })
@Getter
@Setter
public class GenericOrganisationIdentification1 implements Serializable {

    private static final long                             serialVersionUID = -4028844592671555173L;

    @XmlElement(name = "Id", required = true)
    private String                                      id;
    @XmlElement(name = "SchmeNm")
    private OrganisationIdentificationSchemeName1Choice schmeNm;
    @XmlElement(name = "Issr")
    private String                                      issr;

}
