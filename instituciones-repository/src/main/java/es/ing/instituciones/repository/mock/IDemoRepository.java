package es.ing.instituciones.repository.mock;

import org.springframework.stereotype.Repository;

/**
 * Interfaz de demostración que simula un acceso a datos.
 * 
 * @author alejandro.guede
 *
 */
@Repository
public interface IDemoRepository {

    /**
     * Obtiene un helloWorld.
     * 
     * @return Hello Horld!.
     */
    public String getHelloWorld();
}
