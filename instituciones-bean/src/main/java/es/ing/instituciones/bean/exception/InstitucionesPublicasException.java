<<<<<<< HEAD
package es.ing.instituciones.bean.exception;

import org.springframework.http.HttpStatus;

import es.ing.instituciones.bean.error.InstitucionesPublicasErrorBean;
import lombok.Getter;
import lombok.Setter;

/**
 * Excepción padre de excepciones Unchecked para la aplicación de instituciones
 * publicas. Excepciones to wapas para el project
 * 
 * @author alejandro.guede
 *
 */
@Setter
@Getter
public class InstitucionesPublicasException extends RuntimeException {

    /** SerialVersionUID. */
    private static final long serialVersionUID = 253343219816133133L;
    /** Error Bean institucionesPublicas */
    private InstitucionesPublicasErrorBean error;
    /** Status del error */
    private HttpStatus status;

    public InstitucionesPublicasException(Exception another) {
        super(another);
        error = new InstitucionesPublicasErrorBean();
        error.setTimestamp(System.currentTimeMillis());
        error.setMessage(another.getMessage());
        error.setException(another.getMessage());
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public InstitucionesPublicasException(Exception e, HttpStatus status, String message) {
        super(e);
        error = new InstitucionesPublicasErrorBean();
        error.setTimestamp(System.currentTimeMillis());
        error.setMessage(message);
        error.setException(e == null ? "" : e.getMessage());
        this.status = status;
    }

}
=======
package es.ing.instituciones.bean.exception;

import org.springframework.http.HttpStatus;

import es.ing.instituciones.bean.error.InstitucionesPublicasErrorBean;
import lombok.Getter;
import lombok.Setter;

/**
 * Excepción padre de excepciones Unchecked para la aplicación de instituciones
 * publicas.
 * 
 * @author alejandro.guede
 *
 */
@Setter
@Getter
public class InstitucionesPublicasException extends RuntimeException {

    /** SerialVersionUID. */
    private static final long serialVersionUID = 253343219816133133L;
    /** Error Bean institucionesPublicas */
    private InstitucionesPublicasErrorBean error;
    /** Status del error */
    private HttpStatus status;

    public InstitucionesPublicasException(Exception another) {
        super(another);
        error = new InstitucionesPublicasErrorBean();
        error.setTimestamp(System.currentTimeMillis());
        error.setMessage(another.getMessage());
        error.setException(another.getMessage());
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public InstitucionesPublicasException(Exception e, HttpStatus status, String message) {
        super(e);
        error = new InstitucionesPublicasErrorBean();
        error.setTimestamp(System.currentTimeMillis());
        error.setMessage(message);
        error.setException(e == null ? "" : e.getMessage());
        this.status = status;
    }

}
>>>>>>> originBase/develop
