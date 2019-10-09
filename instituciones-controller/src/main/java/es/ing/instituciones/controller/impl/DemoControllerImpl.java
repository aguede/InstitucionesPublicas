package es.ing.instituciones.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import es.ing.instituciones.controller.IDemoController;
import es.ing.instituciones.service.IDemoService;

/**
 * Implementación de la interfaz {@link IDemoController}
 * 
 * @author alejandro.guede
 *
 */
public class DemoControllerImpl implements IDemoController {

    @Autowired
    private IDemoService demoService;

    @Override
    public ResponseEntity<String> getHelloWorld() {
        return new ResponseEntity<String>(demoService.getHelloWorld(), HttpStatus.OK);
    }

}
