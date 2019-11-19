package com.ing.pensions.bean.database.payment;

import java.util.List;

import com.ing.pensions.bean.database.operation.OperationBean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentBean {

    /** Autonumeric Id of the remittance. */
    private int                 paymentId;
    /** Autonumeric Id of the remittance. */
    private int                 remittanceId;
    /** List of payments. */
    private List<OperationBean> operations;
}
