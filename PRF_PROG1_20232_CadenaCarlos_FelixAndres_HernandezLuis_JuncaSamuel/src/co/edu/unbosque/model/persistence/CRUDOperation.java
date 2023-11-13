package co.edu.unbosque.model.persistence;

/**
 * La interfaz `CRUDOperation` define operaciones básicas para realizar
 * operaciones de creación, lectura, actualización y eliminación (CRUD) en una
 * fuente de datos.
 */
public interface CRUDOperation {

    /**
     * Crea un nuevo registro o elemento en la fuente de datos utilizando los
     * argumentos proporcionados.
     *
     * @param args Los argumentos necesarios para crear el nuevo registro.
     */
    public void create(String... args);

    /**
     * Crea un nuevo registro o elemento en la fuente de datos utilizando un objeto.
     *
     * @param o El objeto que representa el nuevo registro.
     */
    public void create(Object o);

    /**
     * Lee y recupera datos de la fuente de datos y los devuelve en forma de cadena.
     *
     * @return Los datos leídos de la fuente de datos en forma de cadena.
     */
    public String read();

    /**
     * Actualiza un registro existente en la fuente de datos en la posición
     * especificada.
     *
     * @param index La posición del registro que se actualizará.
     * @param args  Los argumentos necesarios para la actualización.
     * @return `true` si la actualización fue exitosa, de lo contrario `false`.
     */
    public boolean update(int index, String... args);

    /**
     * Elimina un registro existente en la fuente de datos en la posición
     * especificada.
     *
     * @param index La posición del registro que se eliminará.
     * @return `true` si la eliminación fue exitosa, de lo contrario `false`.
     */
    public boolean delete(int index);

    /**
     * Elimina un registro existente en la fuente de datos utilizando un objeto.
     *
     * @param o El objeto que representa el registro que se eliminará.
     * @return `true` si la eliminación fue exitosa, de lo contrario `false`.
     */
    public boolean delete(Object o);
}


