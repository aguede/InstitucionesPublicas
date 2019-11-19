package com.ing.pensions.repository.exception;

import org.springframework.http.HttpStatus;

import com.ing.pensions.bean.exception.ESTGSSException;

/**
 * Excepción para la capa Repository.
 *
 * @author alejandro.guede
 *
 */
public class ESTGSSRepositoryException extends ESTGSSException {

    /** SerialVersionUID. */
    private static final long serialVersionUID = -2413244354740929842L;

    public ESTGSSRepositoryException(Exception another) {
        super(another);
    }

    public ESTGSSRepositoryException(Exception e, HttpStatus status, String message) {
        super(e, status, message);
    }

}
