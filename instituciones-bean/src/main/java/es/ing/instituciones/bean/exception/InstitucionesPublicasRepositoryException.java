package es.ing.instituciones.bean.exception;

/**
 * Excepción para la capa Repository.
 * 
 * @author alejandro.guede
 *
 */
public class InstitucionesPublicasRepositoryException extends InstitucionesPublicasException {

    /** SerialVersionUID. */
    private static final long serialVersionUID = -2413244354740929842L;

    public InstitucionesPublicasRepositoryException(Exception another) {
        super(another);
    }

}
