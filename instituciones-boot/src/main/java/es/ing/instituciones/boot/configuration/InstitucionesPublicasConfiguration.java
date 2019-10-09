package es.ing.instituciones.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuración del proyecto Instituciones Públicas. Toda la posible
 * configuración irá dentro de esta clase.
 * 
 * @author alejandro.guede
 *
 */
@Configuration
@EnableSwagger2
public class InstitucionesPublicasConfiguration {

    /**
     * Definición de Bean para Swagger
     */
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("es.ing.instituciones.controller")).build();
    }
}
