package es.ing.instituciones.controller.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import es.ing.instituciones.bean.error.InstitucionesPublicasErrorBean;
import es.ing.instituciones.bean.exception.InstitucionesPublicasServiceException;

/**
 * Gestión de errores de controladores de Portal de Proveedores.
 */
@ControllerAdvice(basePackages = { "es.ing.instituciones.controller" })
public class InstitucionesPublicasErrorAdvice extends ResponseEntityExceptionHandler {

    /**
     * Gestión de excepciones de tipo InstitucionesPublicasControllerException.
     * 
     * @param e       InstitucionesPublicasControllerException recibida.
     * @param request Petición de la llamada.
     * @return ResponseEntity con los datos de la excepción.
     */
    @ExceptionHandler(InstitucionesPublicasServiceException.class)
    public ResponseEntity<InstitucionesPublicasErrorBean> handleProveedoresException(
            InstitucionesPublicasServiceException e, WebRequest request) {

        return new ResponseEntity<>(e.getError(), e.getStatus());
    }

}
