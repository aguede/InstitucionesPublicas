package es.ing.instituciones.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import es.ing.instituciones.controller.IDemoController;
import es.ing.instituciones.service.IDemoService;

/**
 * Implementación de la interfaz {@link IDemoController}
 *
 *
 * @author alejandro.guede
 *
 */
public class DemoControllerImpl implements IDemoController {

    private final IDemoService demoService;

    public DemoControllerImpl(IDemoService demoService) {
        this.demoService = demoService;
    }

    @Override
    public ResponseEntity<String> getHelloWorld() {
        return new ResponseEntity<>(demoService.getHelloWorld(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> getHelloWorldWithError() {
        return new ResponseEntity<>(demoService.getHelloWorldError(), HttpStatus.OK);
    }

}
