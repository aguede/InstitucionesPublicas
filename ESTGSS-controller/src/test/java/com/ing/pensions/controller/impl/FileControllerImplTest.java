package com.ing.pensions.controller.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ing.pensions.service.IFileService;

/**
 * Test class for File controller {@link FileControllerImpl}
 *
 * @author Daniel Diaz
 *
 */
@ExtendWith(MockitoExtension.class)
public class FileControllerImplTest {

    @InjectMocks
    FileControllerImpl          fileController;

    @Mock
    IFileService                fileService;

    /** Absolute Path to the location of the files to capture */
    private static final String PATH = "C://ESTGSS//files//in";

    @Test
    public void should_callToGetFile_Almost1Time() {

        // 2- Act
        final ResponseEntity<Void> returnResulted = fileController.fileCapture(PATH);

        // 3- Assert
        Mockito.verify(fileService, Mockito.times(1)).fileCapture(PATH);
        Assertions.assertEquals(HttpStatus.OK, returnResulted.getStatusCode());
    }
}
