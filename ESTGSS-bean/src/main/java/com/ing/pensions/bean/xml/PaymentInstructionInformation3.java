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
 * Java class for PaymentInstructionInformation3 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInstructionInformation3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text"/>
 *         &lt;element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PaymentMethod3Code"/>
 *         &lt;element name="BtchBookg" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BatchBookingIndicator" minOccurs="0"/>
 *         &lt;element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max15NumericText" minOccurs="0"/>
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PaymentTypeInformation19" minOccurs="0"/>
 *         &lt;element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ISODate"/>
 *         &lt;element name="PoolgAdjstmntDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ISODate" minOccurs="0"/>
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PartyIdentification32"/>
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CashAccount16"/>
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchAndFinancialInstitutionIdentification4"/>
 *         &lt;element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CashAccount16" minOccurs="0"/>
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ChargeBearerType1Code" minOccurs="0"/>
 *         &lt;element name="ChrgsAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CashAccount16" minOccurs="0"/>
 *         &lt;element name="ChrgsAcctAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/>
 *         &lt;element name="CdtTrfTxInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CreditTransferTransactionInformation10" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstructionInformation3", propOrder = { "pmtInfId", "pmtMtd", "btchBookg", "nbOfTxs", "ctrlSum",
                                                                "pmtTpInf", "reqdExctnDt", "poolgAdjstmntDt", "dbtr",
                                                                "dbtrAcct", "dbtrAgt", "dbtrAgtAcct", "ultmtDbtr",
                                                                "chrgBr", "chrgsAcct", "chrgsAcctAgt", "cdtTrfTxInf" })
@Getter
@Setter
public class PaymentInstructionInformation3 implements Serializable {

    private static final long                              serialVersionUID = 8925739147513935549L;

    @XmlElement(name = "PmtInfId", required = true)
    private String                                       pmtInfId;
    @XmlElement(name = "PmtMtd", required = true)
    private PaymentMethod3Code                           pmtMtd;
    @XmlElement(name = "BtchBookg")
    private Boolean                                      btchBookg;
    @XmlElement(name = "NbOfTxs")
    private String                                       nbOfTxs;
    @XmlElement(name = "CtrlSum")
    private BigDecimal                                   ctrlSum;
    @XmlElement(name = "PmtTpInf")
    private PaymentTypeInformation19                     pmtTpInf;
    @XmlElement(name = "ReqdExctnDt", required = true)
    private XMLGregorianCalendar                         reqdExctnDt;
    @XmlElement(name = "PoolgAdjstmntDt")
    private XMLGregorianCalendar                         poolgAdjstmntDt;
    @XmlElement(name = "Dbtr", required = true)
    private PartyIdentification32                        dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    private CashAccount16                                dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    private BranchAndFinancialInstitutionIdentification4 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    private CashAccount16                                dbtrAgtAcct;
    @XmlElement(name = "UltmtDbtr")
    private PartyIdentification32                        ultmtDbtr;
    @XmlElement(name = "ChrgBr")
    private ChargeBearerType1Code                        chrgBr;
    @XmlElement(name = "ChrgsAcct")
    private CashAccount16                                chrgsAcct;
    @XmlElement(name = "ChrgsAcctAgt")
    private BranchAndFinancialInstitutionIdentification4 chrgsAcctAgt;
    @XmlElement(name = "CdtTrfTxInf", required = true)
    private List<CreditTransferTransactionInformation10> cdtTrfTxInf;

    public List<CreditTransferTransactionInformation10> getCdtTrfTxInf() {
        return this.cdtTrfTxInf != null ? this.cdtTrfTxInf : new ArrayList<>();
    }

}
