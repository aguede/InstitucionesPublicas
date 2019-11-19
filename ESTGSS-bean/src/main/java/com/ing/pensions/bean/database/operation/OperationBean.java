package com.ing.pensions.bean.database.operation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperationBean {

    /** Autonumeric Id of the operation. */
    private int operationId;
    /** Foreign key Id of the payment. */
    private int paymentId;

}
