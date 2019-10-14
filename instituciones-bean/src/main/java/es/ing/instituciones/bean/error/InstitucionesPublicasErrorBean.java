package es.ing.instituciones.bean.error;

import lombok.Getter;
import lombok.Setter;

/**
 * InstitucionesPublicasErrorBean información sobre un error de la aplicación de
 * instituciones publicas.
 */
@Getter
@Setter
public class InstitucionesPublicasErrorBean {

    /** Fecha y hora del error. */
    private long timestamp;
    /** Mensaje de error de la excepción. */
    private String message;
    /** Tipo de excepción lanzada. **/
    private String exception;

    public InstitucionesPublicasErrorBean() {
        timestamp = System.currentTimeMillis();
    }

}
