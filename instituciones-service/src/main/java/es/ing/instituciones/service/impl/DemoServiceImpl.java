package es.ing.instituciones.service.impl;

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
	
    private IDemoRepository demoRepository;

    public DemoServiceImpl(IDemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public String getHelloWorld() {
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

}
