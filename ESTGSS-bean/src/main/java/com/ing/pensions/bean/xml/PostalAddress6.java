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
 * Java class for PostalAddress6 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdrTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}AddressType2Code" minOccurs="0"/>
 *         &lt;element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max70Text" minOccurs="0"/>
 *         &lt;element name="SubDept" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max70Text" minOccurs="0"/>
 *         &lt;element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max70Text" minOccurs="0"/>
 *         &lt;element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max16Text" minOccurs="0"/>
 *         &lt;element name="PstCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max16Text" minOccurs="0"/>
 *         &lt;element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CountryCode" minOccurs="0"/>
 *         &lt;element name="AdrLine" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max70Text" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress6", propOrder = { "adrTp", "dept", "subDept", "strtNm", "bldgNb", "pstCd", "twnNm",
                                                "ctrySubDvsn", "ctry", "adrLine" })
@Getter
@Setter
public class PostalAddress6 implements Serializable {

    private static final long  serialVersionUID = -8213032603298511022L;

    @XmlElement(name = "AdrTp")
    private AddressType2Code adrTp;
    @XmlElement(name = "Dept")
    private String           dept;
    @XmlElement(name = "SubDept")
    private String           subDept;
    @XmlElement(name = "StrtNm")
    private String           strtNm;
    @XmlElement(name = "BldgNb")
    private String           bldgNb;
    @XmlElement(name = "PstCd")
    private String           pstCd;
    @XmlElement(name = "TwnNm")
    private String           twnNm;
    @XmlElement(name = "CtrySubDvsn")
    private String           ctrySubDvsn;
    @XmlElement(name = "Ctry")
    private String           ctry;
    @XmlElement(name = "AdrLine")
    private List<String>     adrLine;

    public List<String> getAdrLine() {
        return this.adrLine != null ? this.adrLine : new ArrayList<>();
    }

}
