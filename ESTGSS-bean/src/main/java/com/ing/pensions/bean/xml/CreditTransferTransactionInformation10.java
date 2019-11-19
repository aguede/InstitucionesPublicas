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
 * Java class for CreditTransferTransactionInformation10 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CreditTransferTransactionInformation10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PaymentIdentification1"/>
 *         &lt;element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PaymentTypeInformation19" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}AmountType3Choice"/>
 *         &lt;element name="XchgRateInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ExchangeRateInformation1" minOccurs="0"/>
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ChargeBearerType1Code" minOccurs="0"/>
 *         &lt;element name="ChqInstr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Cheque6" minOccurs="0"/>
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt1" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt1Acct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CashAccount16" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt2" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt2Acct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CashAccount16" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt3" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/>
 *         &lt;element name="IntrmyAgt3Acct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CashAccount16" minOccurs="0"/>
 *         &lt;element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/>
 *         &lt;element name="CdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CashAccount16" minOccurs="0"/>
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CashAccount16" minOccurs="0"/>
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="InstrForCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}InstructionForCreditorAgent1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstrForDbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max140Text" minOccurs="0"/>
 *         &lt;element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Purpose2Choice" minOccurs="0"/>
 *         &lt;element name="RgltryRptg" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}RegulatoryReporting3" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}TaxInformation3" minOccurs="0"/>
 *         &lt;element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}RemittanceLocation2" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}RemittanceInformation5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransactionInformation10", propOrder = { "pmtId", "pmtTpInf", "amt", "xchgRateInf",
                                                                        "chrgBr", "chqInstr", "ultmtDbtr", "intrmyAgt1",
                                                                        "intrmyAgt1Acct", "intrmyAgt2",
                                                                        "intrmyAgt2Acct", "intrmyAgt3",
                                                                        "intrmyAgt3Acct", "cdtrAgt", "cdtrAgtAcct",
                                                                        "cdtr", "cdtrAcct", "ultmtCdtr",
                                                                        "instrForCdtrAgt", "instrForDbtrAgt", "purp",
                                                                        "rgltryRptg", "tax", "rltdRmtInf", "rmtInf" })
@Getter
@Setter
public class CreditTransferTransactionInformation10 implements Serializable {

    private static final long                              serialVersionUID = -7557205415236137774L;

    @XmlElement(name = "PmtId", required = true)
    private PaymentIdentification1                       pmtId;
    @XmlElement(name = "PmtTpInf")
    private PaymentTypeInformation19                     pmtTpInf;
    @XmlElement(name = "Amt", required = true)
    private AmountType3Choice                            amt;
    @XmlElement(name = "XchgRateInf")
    private ExchangeRateInformation1                     xchgRateInf;
    @XmlElement(name = "ChrgBr")
    private ChargeBearerType1Code                        chrgBr;
    @XmlElement(name = "ChqInstr")
    private Cheque6                                      chqInstr;
    @XmlElement(name = "UltmtDbtr")
    private PartyIdentification32                        ultmtDbtr;
    @XmlElement(name = "IntrmyAgt1")
    private BranchAndFinancialInstitutionIdentification4 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt1Acct")
    private CashAccount16                                intrmyAgt1Acct;
    @XmlElement(name = "IntrmyAgt2")
    private BranchAndFinancialInstitutionIdentification4 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt2Acct")
    private CashAccount16                                intrmyAgt2Acct;
    @XmlElement(name = "IntrmyAgt3")
    private BranchAndFinancialInstitutionIdentification4 intrmyAgt3;
    @XmlElement(name = "IntrmyAgt3Acct")
    private CashAccount16                                intrmyAgt3Acct;
    @XmlElement(name = "CdtrAgt")
    private BranchAndFinancialInstitutionIdentification4 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    private CashAccount16                                cdtrAgtAcct;
    @XmlElement(name = "Cdtr")
    private PartyIdentification32                        cdtr;
    @XmlElement(name = "CdtrAcct")
    private CashAccount16                                cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    private PartyIdentification32                        ultmtCdtr;
    @XmlElement(name = "InstrForCdtrAgt")
    private List<InstructionForCreditorAgent1>           instrForCdtrAgt;
    @XmlElement(name = "InstrForDbtrAgt")
    private String                                       instrForDbtrAgt;
    @XmlElement(name = "Purp")
    private Purpose2Choice                               purp;
    @XmlElement(name = "RgltryRptg")
    private List<RegulatoryReporting3>                   rgltryRptg;
    @XmlElement(name = "Tax")
    private TaxInformation3                              tax;
    @XmlElement(name = "RltdRmtInf")
    private List<RemittanceLocation2>                    rltdRmtInf;
    @XmlElement(name = "RmtInf")
    private RemittanceInformation5                       rmtInf;

    public List<InstructionForCreditorAgent1> getInstrForCdtrAgt() {
        return this.instrForCdtrAgt != null ? this.instrForCdtrAgt : new ArrayList<>();
    }

    public List<RegulatoryReporting3> getRgltryRptg() {
        return this.rgltryRptg != null ? this.rgltryRptg : new ArrayList<>();
    }

    public List<RemittanceLocation2> getRltdRmtInf() {
        return this.rltdRmtInf != null ? this.rltdRmtInf : new ArrayList<>();
    }

}
