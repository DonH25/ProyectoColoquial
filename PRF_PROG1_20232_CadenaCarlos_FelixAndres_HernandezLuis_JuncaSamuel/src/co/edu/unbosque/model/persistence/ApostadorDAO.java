package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ApostadorDTO;
import co.edu.unbosque.model.JuegoDTO;

/**
 * Esta clase sirve como un DAO (Objeto de Acceso a Datos) para manejar la
 * persistencia de los datos de las sedes de las casas de apuestas. Cumple con
 * la interfaz CRUDOperation, permitiéndole realizar operaciones de creación,
 * lectura, actualización y eliminación de datos asociados con las sedes de las
 * casas de apuestas.
 * 
 * @see CRUDOperation
 */
public class ApostadorDAO implements CRUDOperation {
	ArrayList<ApostadorDTO> listOfApostadores;
	final String SERIAL_FILENAME = "apostador.dat";
	int index = 0;

	/**
	 * Constructor de la clase ApostadorDAO. Inicializa la lista de apostadores y
	 * trata de leer los datos existentes de un archivo serializado. Si el archivo
	 * existe y contiene una ArrayList de ApostadorDTO, se carga en la lista de
	 * apostadores. Si el archivo no existe o no contiene una ArrayList de
	 * ApostadorDTO, se inicializa una nueva lista vacía.
	 */
	public ApostadorDAO() {
		listOfApostadores = new ArrayList<ApostadorDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<ApostadorDTO> temp2 = (ArrayList<ApostadorDTO>) temp;
				listOfApostadores = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de juegos.");
			}
		} else {
			listOfApostadores = new ArrayList<>();
		}
	}

	/**
	 * Este método crea un nuevo objeto ApostadorDTO y lo añade a la lista de
	 * apostadores.
	 *
	 * @param args Un array de Strings que contiene los detalles del apostador en el
	 *             siguiente orden: args[0] - Nombre del apostador args[1] - Cédula
	 *             del apostador (como String, se convertirá a Long) args[2] - Sede
	 *             del juego args[3] - Dirección del apostador args[4] - Número de
	 *             celular del apostador (como String, se convertirá a Long) args[5]
	 *             - Año de nacimiento del apostador (como String, se convertirá a
	 *             Integer)
	 */
	@Override
	public void create(String... args) {
		ApostadorDTO site = new ApostadorDTO();
		site.setNombre(args[0]);
		site.setCedula(Long.parseLong(args[1]));
		site.setSedeJuego(args[2]);
		site.setDireccion(args[3]);
		site.setCelular(Long.parseLong(args[4]));
		site.setAnoN(Integer.parseInt(args[5]));

		listOfApostadores.add(site);
		writeDataSerializable();
	}

	/**
	 * Este método sobrescribe el método 'create' de la interfaz CRUDOperation.
	 * Añade un nuevo objeto ApostadorDTO a la lista de apostadores y luego escribe
	 * la lista en un archivo serializado.
	 *
	 * @param o Un objeto que se supone es una instancia de ApostadorDTO que se
	 *          añadirá a la lista de apostadores.
	 */
	@Override
	public void create(Object o) {
		listOfApostadores.add((ApostadorDTO) o);
		writeDataSerializable();
	}

	/**
	 * Este método sobrescribe el método 'read' de la interfaz CRUDOperation. Lee
	 * todos los objetos ApostadorDTO en la lista de apostadores y devuelve una
	 * representación de cadena de ellos.
	 *
	 * @return Una cadena que representa todos los objetos ApostadorDTO en la lista
	 *         de apostadores. Cada objeto se representa en una nueva línea con su
	 *         índice en la lista seguido de '->' y luego su representación de
	 *         cadena.
	 */
	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfApostadores.forEach(site -> {
			Sb.append(index + "->" + (site.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	/**
	 * Este método sobrescribe el método 'update' de la interfaz CRUDOperation.
	 * Actualiza un objeto ApostadorDTO existente en la lista de apostadores en el
	 * índice especificado con los nuevos valores proporcionados.
	 *
	 * @param index El índice del objeto ApostadorDTO en la lista de apostadores que
	 *              se va a actualizar.
	 * @param args  Un array de Strings que contiene los nuevos valores para el
	 *              apostador en el siguiente orden: args[0] - Nuevo nombre del
	 *              apostador (si no está vacío) args[1] - Nueva cédula del
	 *              apostador (como String, se convertirá a Long si no está vacío)
	 *              args[2] - Nueva sede del juego (si no está vacío) args[3] -
	 *              Nueva dirección del apostador (si no está vacío) args[4] - Nuevo
	 *              número de celular del apostador (como String, se convertirá a
	 *              Long si no está vacío) args[5] - Nuevo año de nacimiento del
	 *              apostador (como String, se convertirá a Integer si no está
	 *              vacío)
	 * @return Un booleano que indica si la operación de actualización fue exitosa.
	 *         Devuelve 'false' si el índice es inválido, 'true' de lo contrario.
	 */
	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfApostadores.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
				listOfApostadores.get(index).setNombre(args[0]);
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfApostadores.get(index).setCedula(Long.parseLong(args[1]));
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfApostadores.get(index).setSedeJuego(args[2]);
			}
			if (!args[3].isBlank() || !args[3].isEmpty() || args[3] != null) {
				listOfApostadores.get(index).setDireccion(args[3]);
			}
			if (!args[4].isBlank() || !args[4].isEmpty() || args[4] != null) {
				listOfApostadores.get(index).setCelular(Long.parseLong(args[4]));

			}
			if (!args[5].isBlank() || !args[5].isEmpty() || args[5] != null) {
				listOfApostadores.get(index).setAnoN(Integer.parseInt(args[5]));
			}
		}
		writeDataSerializable();
		return true;
	}

	/**
	 * Este método sobrescribe el método 'delete' de la interfaz CRUDOperation.
	 * Elimina un objeto ApostadorDTO existente en la lista de apostadores en el
	 * índice especificado.
	 *
	 * @param index El índice del objeto ApostadorDTO en la lista de apostadores que
	 *              se va a eliminar.
	 * @return Un booleano que indica si la operación de eliminación fue exitosa.
	 *         Devuelve 'false' si el índice es inválido, 'true' de lo contrario.
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfApostadores.size()) {
			return false;
		} else {
			listOfApostadores.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	/**
	 * Este método sobrescribe el método 'delete' de la interfaz CRUDOperation.
	 * Elimina un objeto ApostadorDTO existente en la lista de apostadores si el
	 * objeto se encuentra en la lista.
	 *
	 * @param o Un objeto que se supone es una instancia de ApostadorDTO que se
	 *          eliminará de la lista de apostadores.
	 * @return Un booleano que indica si la operación de eliminación fue exitosa.
	 *         Devuelve 'false' si el objeto no se encuentra en la lista, 'true' de
	 *         lo contrario.
	 */

	@Override
	public boolean delete(Object o) {
		ApostadorDTO toDelete = (ApostadorDTO) o;
		if (listOfApostadores.contains(toDelete)) {
			listOfApostadores.remove(toDelete);
			writeDataSerializable();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Escribe los datos de la lista de sedes de casas de apuestas en un archivo
	 * serializado.
	 */
	public void writeDataSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfApostadores);
	}

	/**
	 * Obtiene la lista de sedes de casas de apuestas.
	 *
	 * @return Lista de sedes de casas de apuestas.
	 */
	public ArrayList<ApostadorDTO> getListOfApostadores() {
		return listOfApostadores;
	}

	/**
	 * Establece la lista de sedes de casas de apuestas.
	 *
	 * @param listOfLocations Lista de sedes de casas de apuestas.
	 */
	public void setListOfApostadores(ArrayList<ApostadorDTO> listOfApostadores) {
		this.listOfApostadores = listOfApostadores;
	}

	/**
	 * Obtiene el índice actual.
	 *
	 * @return Índice actual.
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Establece el índice actual.
	 *
	 * @param index Índice actual.
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Obtiene el nombre del archivo serializado.
	 *
	 * @return Nombre del archivo serializado.
	 */
	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}

}
