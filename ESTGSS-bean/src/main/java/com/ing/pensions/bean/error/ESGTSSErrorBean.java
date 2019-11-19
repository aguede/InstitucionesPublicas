package com.ing.pensions.bean.error;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * InstitucionesPublicasErrorBean información sobre un error de la aplicación de
 * instituciones publicas.
 *
 * Prueba jenkins
 */
@Getter
@Setter
public class ESGTSSErrorBean implements Serializable {

    /** Default serialUid. */
    private static final long serialVersionUID = -4098874123944708557L;
    /** Fecha y hora del error. */
    private long              timestamp;
    /** Mensaje de error de la excepción. */
    private String            message;
    /** Tipo de excepción lanzada. **/
    private String            exception;

    public ESGTSSErrorBean() {
        timestamp = System.currentTimeMillis();
    }

}
