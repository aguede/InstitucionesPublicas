package com.ing.pensions.bean.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * Java class for GroupHeader32 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GroupHeader32">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text"/>
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ISODateTime"/>
 *         &lt;element name="Authstn" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Authorisation1Choice" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max15NumericText"/>
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PartyIdentification32"/>
 *         &lt;element name="FwdgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader32", propOrder = { "msgId", "creDtTm", "authstn", "nbOfTxs", "ctrlSum", "initgPty",
                                               "fwdgAgt" })
@Getter
@Setter
public class GroupHeader32 implements Serializable {

    private static final long                              serialVersionUID = 6657070397321674603L;

    @XmlElement(name = "MsgId", required = true)
    private String                                       msgId;
    @XmlElement(name = "CreDtTm", required = true)
    private XMLGregorianCalendar                         creDtTm;
    @XmlElement(name = "Authstn")
    private List<Authorisation1Choice>                   authstn;
    @XmlElement(name = "NbOfTxs", required = true)
    private String                                       nbOfTxs;
    @XmlElement(name = "CtrlSum")
    private BigDecimal                                   ctrlSum;
    @XmlElement(name = "InitgPty", required = true)
    private PartyIdentification32                        initgPty;
    @XmlElement(name = "FwdgAgt")
    private BranchAndFinancialInstitutionIdentification4 fwdgAgt;

    public List<Authorisation1Choice> getAuthstn() {
        return this.authstn != null ? this.authstn : new ArrayList<>();
    }

}
