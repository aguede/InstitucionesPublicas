package com.ing.pensions.bean.database.remittance;

import java.util.List;

import com.ing.pensions.bean.database.payment.PaymentBean;

import lombok.Getter;
import lombok.Setter;

/**
 * Bean que representa una remesa.
 *
 * @author alejandro guede
 *
 */
@Getter
@Setter
public class RemittanceBean {

    /** Autonumeric Id of the remittance. */
    private int               remittanceId;
    /** MessageId of a remittance. */
    private String            messageId;
    /** List of payments. */
    private List<PaymentBean> payments;
}