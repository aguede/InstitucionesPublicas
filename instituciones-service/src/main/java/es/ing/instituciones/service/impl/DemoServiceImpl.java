package es.ing.instituciones.service.impl;

import es.ing.instituciones.service.IDemoService;

/**
 * Implementación de la clase DemoService.
 * 
 * @author alejandro.guede
 *
 */
public class DemoServiceImpl implements IDemoService {

    @Override
    public String getHelloWorld() {
        return "Hello World";
    }

}
