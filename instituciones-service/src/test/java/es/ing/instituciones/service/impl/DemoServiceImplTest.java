package es.ing.instituciones.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import es.ing.instituciones.repository.mock.impl.DemoRepositoryImpl;

/**
 * Test de demostración para análisis de cobertura.
 *
 * @author alejandro.guede
 *
 */
@ExtendWith(MockitoExtension.class)
public class DemoServiceImplTest {

    @InjectMocks
    DemoServiceImpl    demoServiceImpl;

    @Mock
    DemoRepositoryImpl demoRepositoryImpl;

    @Test
    public void demoTest() {
        // 1- Given
        final String returnGiven = "hello";
        Mockito.when(demoRepositoryImpl.getHelloWorld()).thenReturn(returnGiven);

        // 2- Act
        final String returnResulted = demoServiceImpl.getHelloWorld();

        // 3- Assert
        Assertions.assertEquals(returnGiven, returnResulted);
    }
}
