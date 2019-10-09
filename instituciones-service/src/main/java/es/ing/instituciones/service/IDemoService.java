package es.ing.instituciones.service;

import es.ing.instituciones.bean.exception.InstitucionesPublicasServiceException;

/**
 * Lógica de negocio para una demostración.
 * 
 * @author alejandro.guede
 *
 */
public interface IDemoService {

    /**
     * Lógica de negocio que contiene un Hello World.
     * 
     * @return Hello Horld!.
     */
    public String getHelloWorld();

    /**
     * Lanza una posible excepción.
     * 
     * @return
     */
    public String getHelloWorldError() throws InstitucionesPublicasServiceException;
}
