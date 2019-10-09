package es.ing.instituciones.bean.exception;

/**
 * Excepción para la capa Controller.
 * 
 * @author alejandro.guede
 *
 */
public class InstitucionesPublicasControllerException extends InstitucionesPublicasException {

    /** SerialVersionUID. */
    private static final long serialVersionUID = -2413244354740929842L;

    public InstitucionesPublicasControllerException(Exception another) {
        super(another);
    }

}
