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
 * Java class for RemittanceLocation2 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceLocation2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RmtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="RmtLctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}RemittanceLocationMethod2Code" minOccurs="0"/>
 *         &lt;element name="RmtLctnElctrncAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max2048Text" minOccurs="0"/>
 *         &lt;element name="RmtLctnPstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}NameAndAddress10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocation2", propOrder = { "rmtId", "rmtLctnMtd", "rmtLctnElctrncAdr", "rmtLctnPstlAdr" })
@Getter
@Setter
public class RemittanceLocation2 implements Serializable {

    private static final long               serialVersionUID = -7150341913330347343L;

    @XmlElement(name = "RmtId")
    private String                        rmtId;
    @XmlElement(name = "RmtLctnMtd")
    private RemittanceLocationMethod2Code rmtLctnMtd;
    @XmlElement(name = "RmtLctnElctrncAdr")
    private String                        rmtLctnElctrncAdr;
    @XmlElement(name = "RmtLctnPstlAdr")
    private NameAndAddress10              rmtLctnPstlAdr;

}
