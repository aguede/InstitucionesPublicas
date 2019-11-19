package com.ing.pensions.controller.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ing.pensions.bean.error.ESGTSSErrorBean;
import com.ing.pensions.service.exception.ESTGSSServiceException;

/**
 * Exception controller advice for ESTGSSPensions.
 */
@ControllerAdvice(basePackages = { "com.ing.pensions.controller" })
public class ESTGSSPensionsControllerAdvice extends ResponseEntityExceptionHandler {

    /**
     * Exception capture of type ESTGSSPensionsException.
     *
     * @param estgssServiceException
     *            -exception received.
     * @param request
     *            -petition request.
     * @return -ResponseEntity with status given.
     */
    @ExceptionHandler(ESTGSSServiceException.class)
    public ResponseEntity<ESGTSSErrorBean> handleESTGSSException(ESTGSSServiceException estgssServiceException,
            WebRequest request) {

        return new ResponseEntity<>(estgssServiceException.getError(), estgssServiceException.getStatus());
    }

}
