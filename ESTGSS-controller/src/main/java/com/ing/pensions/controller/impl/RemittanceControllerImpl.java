package com.ing.pensions.controller.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ing.pensions.bean.database.remittance.RemittanceBean;
import com.ing.pensions.controller.IRemittanceController;
import com.ing.pensions.service.IRemittanceService;

/**
 * Implementation of {@link IRemittanceController}
 *
 *
 * @author alejandro.guede
 *
 */
public class RemittanceControllerImpl implements IRemittanceController {

    private final IRemittanceService remittanceService;

    public RemittanceControllerImpl(IRemittanceService remittanceService) {
        this.remittanceService = remittanceService;
    }

    @Override
    public ResponseEntity<Void> insertRemittance(RemittanceBean remittanceBean) {
        remittanceService.insertRemittance(remittanceBean);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<RemittanceBean>> getRemittances() {
        return new ResponseEntity<>(remittanceService.getRemittances(), HttpStatus.OK);

    }

}
