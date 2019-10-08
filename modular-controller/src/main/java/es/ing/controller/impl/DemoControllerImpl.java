package es.ing.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import es.ing.controller.DemoController;
import es.ing.services.DemoService;

/**
 * Controller para pruebas de configuración. Implementa DemoController.
 * 
 * @author alejandro.guede
 *
 */
public class DemoControllerImpl implements DemoController {

	private DemoService demoService;

	public DemoControllerImpl(DemoService demoService) {
		this.demoService = demoService;
	}

	@Override
	public ResponseEntity<String> createAuthenticationToken() {
		return new ResponseEntity<String>(demoService.getHelloWorld(), HttpStatus.OK);
	}

}
