package es.ing.instituciones.bean.exception;

/**
 * Excepción para la capa Batch.
 * 
 * @author alejandro.guede
 *
 */
public class InstitucionesPublicasBatchException extends InstitucionesPublicasException {

    /** SerialVersionUID. */
    private static final long serialVersionUID = -2413244354740929842L;

    public InstitucionesPublicasBatchException(Exception another) {
        super(another);
    }

}
