package com.ing.pensions.service.impl;

import java.util.List;

import com.ing.pensions.bean.database.remittance.RemittanceBean;
import com.ing.pensions.repository.database.IRemittanceMapper;
import com.ing.pensions.service.IRemittanceService;

/**
 * Implementation of {@link IRemittanceService}.
 *
 * @author alejandro.guede
 *
 */
public class RemittanceServiceImpl implements IRemittanceService {

    /** Injection of IRemittanceMapper. */
    private final IRemittanceMapper remittanceMapper;

    public RemittanceServiceImpl(IRemittanceMapper remittanceMapper) {
        this.remittanceMapper = remittanceMapper;
    }

    @Override
    public void insertRemittance(RemittanceBean remittanceBean) {
        remittanceMapper.insertRemittance(remittanceBean);
    }

    @Override
    public List<RemittanceBean> getRemittances() {
        return remittanceMapper.selectRemittances();
    }

}
