package es.ing.instituciones.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import es.ing.instituciones.controller.IDemoController;

/**
 * Implementación de la interfaz {@link IDemoController}
 * 
 * @author alejandro.guede
 *
 */
public class DemoControllerImpl implements IDemoController {

    @Override
    public ResponseEntity<String> getList() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }

}
