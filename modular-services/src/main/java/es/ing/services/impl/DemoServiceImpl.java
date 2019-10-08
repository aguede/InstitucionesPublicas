package es.ing.services.impl;

import es.ing.demo.service.DemoService;

/**
 * Implementación de la clase DemoService.
 * 
 * @author alejandro.guede
 *
 */
public class DemoServiceImpl implements DemoService {

	private String email;

	public DemoServiceImpl(String email) {
		this.email = email;
	}

	@Override
	public String getHelloWorld() {
		return "hello!";
	}

}
