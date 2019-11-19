package com.ing.pensions.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Test class for {@link FileServiceImpl}
 *
 * @author Daniel Diaz
 *
 */
@ExtendWith(MockitoExtension.class)
public class FileServiceImplTest {

    @InjectMocks
    FileServiceImpl fileService;

    @Test
    public void fileCaptureTest() {
        // 1- Given
        final String filename = "pension.xml";

        // 2- Act
        fileService.fileCapture(filename);

        // 3- Assert
    }

}
