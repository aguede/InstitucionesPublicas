package com.ing.pensions.service;

/**
 * Bussiness logic for Pension Files.
 *
 * @author Daniel Diaz
 *
 */
public interface IFileService {

    /**
     * Captures and processes a Pension File, validating it´s format and
     * content, and inserting it in the database, alongside all it´s Remittances
     * and Operations.
     *
     * If The validations failed, the file it´s saved alongside the reason for
     * which it did not passed the validations.
     *
     * @param filename
     *            - Name of the file to capture
     */
    public void fileCapture(String filename);
}
