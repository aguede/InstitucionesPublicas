package com.ing.pensions.bean.exception;

import org.springframework.http.HttpStatus;

import com.ing.pensions.bean.error.ESGTSSErrorBean;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * Parent unchecked exception for ESTGSSPensions.
 *
 * @author alejandro.guede
 *
 */
@Setter
@Getter
public class ESTGSSException extends RuntimeException {

    /** SerialVersionUID. */
    private static final long     serialVersionUID = 253343219816133133L;
    /** Error Bean pensions */
    private final ESGTSSErrorBean error;
    /** Status of the error */
    private final HttpStatus      status;

    public ESTGSSException(Exception another) {
        super(another);
        error = new ESGTSSErrorBean();
        error.setTimestamp(System.currentTimeMillis());
        error.setMessage(another.getMessage());
        error.setException(another.getMessage());
        status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public ESTGSSException(Exception e, HttpStatus status, String message) {
        super(e);
        error = new ESGTSSErrorBean();
        error.setTimestamp(System.currentTimeMillis());
        error.setMessage(message);
        error.setException(e == null ? "" : e.getMessage());
        this.status = status;
    }

}
