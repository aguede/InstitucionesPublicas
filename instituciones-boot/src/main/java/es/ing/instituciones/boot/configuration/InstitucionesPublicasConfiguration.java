package es.ing.instituciones.boot.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.ing.instituciones.controller.ICourseController;
import es.ing.instituciones.controller.IDemoController;
import es.ing.instituciones.controller.exception.InstitucionesPublicasErrorAdvice;
import es.ing.instituciones.controller.impl.CourseControllerImpl;
import es.ing.instituciones.controller.impl.DemoControllerImpl;
import es.ing.instituciones.repository.mock.IDemoRepository;
import es.ing.instituciones.repository.mock.impl.DemoRepositoryImpl;
import es.ing.instituciones.service.ICourseService;
import es.ing.instituciones.service.IDemoService;
import es.ing.instituciones.service.impl.CourseServiceImpl;
import es.ing.instituciones.service.impl.DemoServiceImpl;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
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
@MapperScan("es.ing.instituciones.repository.database.mapper")
public class InstitucionesPublicasConfiguration {

    /**
     * Definición de Bean para Swagger
     */
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("es.ing.instituciones.controller")).paths(PathSelectors.any())
                .build().apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder().title("Spring Boot Swagger App").description("\"Spring Boot Swagger Server App\"")
                .version("1.0.0").license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"").build();
    }

    public ApiInfo apiInfo() {
        final ApiInfoBuilder builder = new ApiInfoBuilder();
        builder.title("Swagger Test App").version("1.0").license("(C) Copyright Test")
                .description("The API provides a platform to query build test swagger api");

        return builder.build();
    }

    /** Definicion de bean para ControllerAdvice */
    @Bean
    public InstitucionesPublicasErrorAdvice institucionesPublicasErrorAdvice() {
        return new InstitucionesPublicasErrorAdvice();
    }

    /** Definicion de bean para DemoController */
    @Bean
    public IDemoController demoController() {
        return new DemoControllerImpl(demoService());
    }

    /**
     * Bean de DemoService.
     * 
     * @return demoService.
     */
    @Bean
    public IDemoService demoService() {
        return new DemoServiceImpl(demoRepository());
    }

    /**
     * Bean de DemoRepository.
     * 
     * @return CourseRepository.
     */
    @Bean
    public IDemoRepository demoRepository() {
        return new DemoRepositoryImpl();
    }

    
    
    /** Definicion de bean para CourseController */
    @Bean
    public ICourseController courseController() {
        return new CourseControllerImpl(courseService());
    }

    /**
     * Bean de CourseService.
     * 
     * @return courseService.
     */
    @Bean
    public ICourseService courseService() {
        return new CourseServiceImpl();
    }
}
