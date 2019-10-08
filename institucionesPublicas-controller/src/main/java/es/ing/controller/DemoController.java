package es.ing.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;

/**
 * Api REST para pruebas de configuración.
 * 
 * @author alejandro.guede
 *
 */

@RequestMapping("hello")
@Api(value = "DemoController", tags = { "Demo Controller" })
public interface DemoController {

	@RequestMapping(value = "world", method = RequestMethod.POST)
	public ResponseEntity<String> createAuthenticationToken();
}
