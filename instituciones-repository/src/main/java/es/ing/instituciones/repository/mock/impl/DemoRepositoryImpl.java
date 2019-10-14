package es.ing.instituciones.repository.mock.impl;

import es.ing.instituciones.repository.mock.IDemoRepository;

/**
 * Implementación de la clase DemoRepository.
 * 
 * @author alejandro.guede
 *
 */
public class DemoRepositoryImpl implements IDemoRepository {

    @Override
    public String getHelloWorld() {
        return "Hello World!";
    }

}
