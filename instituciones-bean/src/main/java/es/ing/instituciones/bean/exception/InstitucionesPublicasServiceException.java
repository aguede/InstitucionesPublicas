package es.ing.instituciones.bean.exception;

/**
 * Excepción para la capa Service.
 * 
 * @author alejandro.guede
 *
 */
public class InstitucionesPublicasServiceException extends InstitucionesPublicasException {

    /** SerialVersionUID. */
    private static final long serialVersionUID = -2413244354740929842L;

    public InstitucionesPublicasServiceException(Exception another) {
        super(another);
    }

}
