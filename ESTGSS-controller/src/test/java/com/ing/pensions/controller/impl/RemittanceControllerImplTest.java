package com.ing.pensions.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ing.pensions.bean.database.remittance.RemittanceBean;
import com.ing.pensions.service.IRemittanceService;

/**
 * Test class for Remitances controller {@link RemittanceControllerImpl}
 *
 * @author alejandro.guede
 *
 */
@ExtendWith(MockitoExtension.class)
public class RemittanceControllerImplTest {

    @InjectMocks
    RemittanceControllerImpl remittanceController;

    @Mock
    IRemittanceService       remittanceService;

    @Test
    public void should_RemittanceController_insertRemittance() {
        // 1- Given
        final RemittanceBean remittanceBeanGiven = new RemittanceBean();
        remittanceBeanGiven.setMessageId("messageId");
        remittanceBeanGiven.setRemittanceId(2);

        final ResponseEntity<Void> responseGiven = new ResponseEntity<>(HttpStatus.OK);

        // 2- Act
        final ResponseEntity<Void> responseReturned = remittanceController.insertRemittance(remittanceBeanGiven);

        // 3- Assert
        Mockito.verify(remittanceService, Mockito.times(1)).insertRemittance(remittanceBeanGiven);
        Assertions.assertEquals(responseGiven.getStatusCodeValue(), responseReturned.getStatusCodeValue());

    }

    @Test
    public void should_RemittanceController_retrieveAllRemittances() {
        // 1- Given
        final RemittanceBean remittanceBeanGiven = new RemittanceBean();
        remittanceBeanGiven.setMessageId("messageId");
        remittanceBeanGiven.setRemittanceId(2);

        final List<RemittanceBean> remittancesGiven = new ArrayList<>();
        remittancesGiven.add(remittanceBeanGiven);

        final ResponseEntity<List<RemittanceBean>> responseGiven = new ResponseEntity<>(remittancesGiven,
                HttpStatus.OK);

        Mockito.when(remittanceService.getRemittances()).thenReturn(remittancesGiven);

        // 2- Act
        final ResponseEntity<List<RemittanceBean>> responseReturned = remittanceController.getRemittances();

        // 3- Assert
        Assertions.assertTrue(responseReturned.getBody().equals(remittancesGiven));
        Assertions.assertEquals(responseGiven.getStatusCodeValue(), responseReturned.getStatusCodeValue());
    }

}
