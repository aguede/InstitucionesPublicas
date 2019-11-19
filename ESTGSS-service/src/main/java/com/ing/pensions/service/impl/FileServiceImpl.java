package com.ing.pensions.service.impl;

import java.io.File;

import com.ing.pensions.service.IFileService;

/**
 * Implementation of {@link IFileService}
 *
 * @author Daniel Diaz
 *
 */
public class FileServiceImpl implements IFileService {

    /** Absolute Path to the location of the files to capture */
    private static final String PATH = "C://ESTGSS//files//in";

    @Override
    public void fileCapture(String filename) {
        new File(PATH);
    }

}
