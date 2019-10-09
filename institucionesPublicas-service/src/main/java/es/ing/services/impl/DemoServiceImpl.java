package es.ing.services.impl;

import es.ing.services.DemoService;

/**
 * Implementación de la clase DemoService.
 * 
 * @author alejandro.guede
 *
 */
public class DemoServiceImpl implements DemoService {

	@Override
	public String getHelloWorld() {
		return "hello!";
	}

}
