package es.ing.instituciones.controller.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import es.ing.instituciones.service.impl.DemoServiceImpl;

@ExtendWith(MockitoExtension.class)
public class DemoControllerImplTest {

    @InjectMocks
    DemoControllerImpl demoControllerImpl;

    @Mock
    DemoServiceImpl    demoServiceImpl;

    @Test
    public void getHelloWorldTest() {
        // 1- Given
        final String returnGiven = "Hello World!";
        Mockito.when(demoServiceImpl.getHelloWorld()).thenReturn(returnGiven);

        // 2- Act
        final ResponseEntity<String> returnResulted = demoControllerImpl.getHelloWorld();

        // 3- Assert
        Assertions.assertEquals(returnGiven, returnResulted.getBody());
        Assertions.assertEquals(HttpStatus.OK, returnResulted.getStatusCode());
    }

    @Test
    public void getHelloWorldWithErrorTest() {
        // 1- Given
        final String returnGiven = "hello world";
        Mockito.when(demoServiceImpl.getHelloWorldError()).thenReturn(returnGiven);

        // 2- Act
        final ResponseEntity<String> returnResulted = demoControllerImpl.getHelloWorldWithError();

        // 3- Assert
        Assertions.assertEquals(returnGiven, returnResulted.getBody());
        Assertions.assertEquals(HttpStatus.OK, returnResulted.getStatusCode());
    }

}
