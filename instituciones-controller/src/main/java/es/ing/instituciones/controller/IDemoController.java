package es.ing.instituciones.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Api de ejemplo para un controlador.
 * 
 * @author alejandro.guede
 *
 */
@RequestMapping(IDemoController.Paths.RESOURCE)
@Api(value = "APi rest para demostración.")
public interface IDemoController {

    /** Paths del api rest. */
    public static class Paths {
        /** Mapeo del api rest definido. */
        public static final String RESOURCE = "/restAPi";
        /** Mapeo de servicio de prueba. */
        public static final String DEMO = "/demo";
        /** Mapeo de servicio de excepcion. */
        public static final String EXCEPTION = "/exception";
    }

    @GetMapping(value = IDemoController.Paths.DEMO)
    @ApiOperation(value = "Servicio de prueba para la aplicación de instituciones publicas.", notes = "Hola Mundo!.", httpMethod = "GET", response = String.class, responseContainer = "ResponseEntity")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Respuesta OK"),
            @ApiResponse(code = 403, message = "Forbbiden") })
    ResponseEntity<String> getHelloWorld();

    @GetMapping(value = IDemoController.Paths.EXCEPTION)
    @ApiOperation(value = "Servicio de excepciones para la aplicación de instituciones publicas.", notes = "Hola Mundo!.", httpMethod = "GET", response = String.class, responseContainer = "ResponseEntity")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Respuesta OK"),
            @ApiResponse(code = 403, message = "Forbbiden") })
    ResponseEntity<String> getHelloWorldWithError();
}
