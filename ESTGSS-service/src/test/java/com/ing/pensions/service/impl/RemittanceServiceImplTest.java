package com.ing.pensions.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ing.pensions.bean.database.remittance.RemittanceBean;
import com.ing.pensions.repository.database.IRemittanceMapper;

/***
 * Test de demostración para análisis de cobertura.**
 *
 * @author alejandro.guede
 **/
@ExtendWith(MockitoExtension.class)
public class RemittanceServiceImplTest {

    @InjectMocks
    RemittanceServiceImpl remittanceServiceImpl;

    @Mock
    IRemittanceMapper     remittanceMapper;

    @Test
    public void getRemittances() {
        // 1- Given
        final List<RemittanceBean> remittancesGiven = new ArrayList<RemittanceBean>();
        final RemittanceBean remittance = new RemittanceBean();
        remittance.setMessageId("1");
        remittance.setRemittanceId(1);
        remittancesGiven.add(remittance);

        Mockito.when(remittanceMapper.selectRemittances()).thenReturn(remittancesGiven);

        // 2- Act
        final List<RemittanceBean> remittancesReturned = remittanceServiceImpl.getRemittances();

        // 3- Assert
        Assertions.assertEquals(remittancesReturned.get(0).getRemittanceId(),
                remittancesGiven.get(0).getRemittanceId());
    }
}
