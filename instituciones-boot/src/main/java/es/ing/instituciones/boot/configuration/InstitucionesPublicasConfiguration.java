package es.ing.instituciones.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.ing.instituciones.controller.IDemoController;
import es.ing.instituciones.controller.exception.InstitucionesPublicasErrorAdvice;
import es.ing.instituciones.controller.impl.DemoControllerImpl;
import springfox.documentation.builders.PathSelectors;
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
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("es.ing.instituciones.controller")).paths(PathSelectors.any())
                .build();
    }

    /** Definicion de bean para ControllerAdvice */
    @Bean
    public InstitucionesPublicasErrorAdvice institucionesPublicasErrorAdvice() {
        return new InstitucionesPublicasErrorAdvice();
    }

    /** Definicion de bean para DemoController */
    @Bean
    public IDemoController demoController() {
        return new DemoControllerImpl();
    }
}
