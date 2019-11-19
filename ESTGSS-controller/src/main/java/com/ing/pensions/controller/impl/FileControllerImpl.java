package com.ing.pensions.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ing.pensions.controller.IFileController;
import com.ing.pensions.service.IFileService;

/**
 * Implementation of {@link IFileController}}
 *
 * @author Daniel Diaz
 *
 */
public class FileControllerImpl implements IFileController {

    private final IFileService fileService;

    public FileControllerImpl(IFileService fileService) {
        this.fileService = fileService;
    }

    @Override
    public ResponseEntity<Void> fileCapture(String filename) {
        fileService.fileCapture(filename);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
