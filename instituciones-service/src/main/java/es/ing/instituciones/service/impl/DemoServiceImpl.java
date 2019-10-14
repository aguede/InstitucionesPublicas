package es.ing.instituciones.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.ing.instituciones.bean.exception.InstitucionesPublicasServiceException;
import es.ing.instituciones.repository.mock.IDemoRepository;
import es.ing.instituciones.service.IDemoService;

/**
 * Implementación de la clase DemoService.
 * 
 * @author alejandro.guede
 *
 */
public class DemoServiceImpl implements IDemoService {

    Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    private IDemoRepository demoRepository;

    public DemoServiceImpl(IDemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public String getHelloWorld() {
        logger.debug("[DemoServiceImpl]: Enter into getHelloWorld");

        return demoRepository.getHelloWorld();
    }

    @Override
    public String getHelloWorldError() throws InstitucionesPublicasServiceException {

        try {
            Integer.parseInt("hola");
        } catch (Exception e) {
            throw new InstitucionesPublicasServiceException(e);
        }

        return "hello world";
    }

    @Override
    public String getCsvAsStream() {

        this.getClass().getResourceAsStream("csv/");

        return null;
    }

}
