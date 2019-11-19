package com.ing.pensions.controller.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;

import com.ing.pensions.bean.error.ESGTSSErrorBean;
import com.ing.pensions.service.exception.ESTGSSServiceException;

/**
 * Test for {@link ESTGSSPensionsControllerAdvice.java}
 */
public class ESTGSSPensionsControllerAdviceTest {

    private static final String messageErrorTest = "messageErrorTest";

    @Test
    public void should_ESTGSSPensionsControllerAdvice_returnResponseEntity() {

        // Given
        final HttpClientErrorException clientException = new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
        final ESTGSSServiceException pe = new ESTGSSServiceException(clientException, HttpStatus.UNAUTHORIZED,
                messageErrorTest);
        final WebRequest request = Mockito.mock(WebRequest.class);
        // When
        final ESTGSSPensionsControllerAdvice proveedoresErrorAdvice = new ESTGSSPensionsControllerAdvice();
        final ResponseEntity<ESGTSSErrorBean> responseResulted = proveedoresErrorAdvice.handleESTGSSException(pe,
                request);
        // Then
        Assertions.assertNotNull(responseResulted);
        Assertions.assertEquals(messageErrorTest, responseResulted.getBody().getMessage());

    }
}
