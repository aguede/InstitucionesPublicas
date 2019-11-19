package com.ing.pensions.service;

import java.util.List;

import com.ing.pensions.bean.database.remittance.RemittanceBean;

/**
 * Business logic for remittances.
 *
 * @author alejandro.guede
 *
 */
public interface IRemittanceService {

    /**
     * Inserts a remittance on the database.
     *
     * @param remittanceBean
     *            the remittanceBean to insert.
     */
    public void insertRemittance(RemittanceBean remittanceBean);

    /**
     * Gets all the remittances.
     *
     * @return a list of remittances.
     */
    public List<RemittanceBean> getRemittances();

}
