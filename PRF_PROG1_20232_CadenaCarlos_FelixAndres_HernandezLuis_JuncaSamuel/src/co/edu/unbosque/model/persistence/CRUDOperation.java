package co.edu.unbosque.model.persistence;

/**
 * La interfaz `CRUDOperation` establece las operaciones fundamentales para
 * llevar a cabo operaciones de creación, lectura, actualización y eliminación
 * (CRUD) en una fuente de datos.
 */
public interface CRUDOperation {

	/**
	 * Genera un nuevo registro o elemento en la fuente de datos utilizando los
	 * argumentos proporcionados.
	 *
	 * @param args Los argumentos requeridos para generar el nuevo registro.
	 */
	public void create(String... args);

	/**
	 * Genera un nuevo registro o elemento en la fuente de datos utilizando un
	 * objeto.
	 *
	 * @param o El objeto que representa el nuevo registro.
	 */
	public void create(Object o);

	/**
	 * Lee y recupera información de la fuente de datos y la devuelve en formato de
	 * texto.
	 *
	 * @return Los datos recuperados de la fuente de datos en formato de texto.
	 */
	public String read();

	/**
	 * Elimina un registro existente en la fuente de datos en la posición
	 * especificada.
	 *
	 * @param index La posición del registro que se eliminará.
	 * @return `true` si la eliminación fue exitosa, de lo contrario `false`.
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
