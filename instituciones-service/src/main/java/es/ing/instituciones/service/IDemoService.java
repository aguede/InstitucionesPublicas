package es.ing.instituciones.service;

/**
 * Lógica de negocio para una demostración.
 *
 * @author alejandro.guede
 *
 */
public interface IDemoService {

    /**
     * Lógica de negocio que contiene un Hello World.
     *
     * @return Hello Horld!.
     */
    public String getHelloWorld();

    /**
     * Lanza una posible excepción.
     *
     * @return
     */
    public String getHelloWorldError();

    /**
     * Lee un csv y lo devuelve en Base64.
     *
     * @return el csv en base64
     */
    public String getCsvAsStream();

}
