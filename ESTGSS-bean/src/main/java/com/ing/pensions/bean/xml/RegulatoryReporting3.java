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
 * Java class for RegulatoryReporting3 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryReporting3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DbtCdtRptgInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}RegulatoryReportingType1Code" minOccurs="0"/>
 *         &lt;element name="Authrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}RegulatoryAuthority2" minOccurs="0"/>
 *         &lt;element name="Dtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}StructuredRegulatoryReporting3" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting3", propOrder = { "dbtCdtRptgInd", "authrty", "dtls" })
@Getter
@Setter
public class RegulatoryReporting3 implements Serializable {

    private static final long                      serialVersionUID = -4541765530471795896L;

    @XmlElement(name = "DbtCdtRptgInd")
    private RegulatoryReportingType1Code         dbtCdtRptgInd;
    @XmlElement(name = "Authrty")
    private RegulatoryAuthority2                 authrty;
    @XmlElement(name = "Dtls")
    private List<StructuredRegulatoryReporting3> dtls;

    public List<StructuredRegulatoryReporting3> getDtls() {
        return this.dtls != null ? this.dtls : new ArrayList<>();
    }

}
