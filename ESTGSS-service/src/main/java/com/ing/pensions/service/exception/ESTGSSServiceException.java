package com.ing.pensions.service.exception;

import org.springframework.http.HttpStatus;

import com.ing.pensions.bean.exception.ESTGSSException;

/**
 * Excepción para la capa Service.
 *
 * @author alejandro.guede
 *
 */
public class ESTGSSServiceException extends ESTGSSException {

    /** SerialVersionUID. */
    private static final long serialVersionUID = -2413244354740929842L;

    public ESTGSSServiceException(Exception another) {
        super(another);
    }

    public ESTGSSServiceException(Exception e, HttpStatus status, String message) {
        super(e, status, message);
    }

}
