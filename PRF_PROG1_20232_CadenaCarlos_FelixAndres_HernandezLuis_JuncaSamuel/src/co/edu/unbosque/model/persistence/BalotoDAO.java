package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.BalotoDTO;

/**
 * Esta clase sirve como un DAO (Objeto de Acceso a Datos) para manejar la
 * persistencia de los datos de las sedes de las casas de apuestas. Cumple con
 * la interfaz CRUDOperation, permitiéndole realizar operaciones de creación,
 * lectura, actualización y eliminación de datos asociados con las sedes de las
 * casas de apuestas.
 *
 * @see CRUDOperation
 */

public class BalotoDAO implements CRUDOperation {
	ArrayList<BalotoDTO> listOfBalotos;
	final String SERIAL_FILENAME = "apuestas-baloto.dat";
	int index = 0;

	/**
	 * Constructor de la clase BalotoDAO. Inicializa la lista de balotos y trata de
	 * leer los datos existentes de un archivo serializado. Si el archivo existe y
	 * contiene una ArrayList de BalotoDTO, se carga en la lista de balotos. Si el
	 * archivo no existe o no contiene una ArrayList de BalotoDTO, se inicializa una
	 * nueva lista vacía.
	 */

	BalotoDAO() {
		listOfBalotos = new ArrayList<BalotoDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<BalotoDTO> temp2 = (ArrayList<BalotoDTO>) temp;
				listOfBalotos = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de balotos.");
			}
		} else {
			listOfBalotos = new ArrayList<>();
		}
	}

	/**
	 * Este método crea un nuevo objeto BalotoDTO y lo añade a la lista de balotos.
	 *
	 * @param args Un array de Strings que contiene los detalles del baloto en el
	 *             siguiente orden: args[0] - Primer dígito del baloto (como String,
	 *             se convertirá a Integer) args[1] - Segundo dígito del baloto
	 *             (como String, se convertirá a Integer) args[2] - Tercer dígito
	 *             del baloto (como String, se convertirá a Integer) args[3] -
	 *             Cuarto dígito del baloto (como String, se convertirá a Integer)
	 *             args[4] - Quinto dígito del baloto (como String, se convertirá a
	 *             Integer) args[5] - Sexto dígito del baloto (como String, se
	 *             convertirá a Integer) args[6] - Valor de la apuesta (como String,
	 *             se convertirá a Double) args[7] - Número de cédula del apostador
	 *             (como String, se convertirá a Long) args[8] - Nombre de la sede
	 *             args[9] - Día de la apuesta
	 */
	@Override
	public void create(String... args) {
		BalotoDTO site = new BalotoDTO();
		site.setDigito1(Integer.parseInt(args[0]));
		site.setDigito2(Integer.parseInt(args[1]));
		site.setDigito3(Integer.parseInt(args[2]));
		site.setDigito4(Integer.parseInt(args[3]));
		site.setDigito5(Integer.parseInt(args[4]));
		site.setDigito6(Integer.parseInt(args[5]));
		site.setValorDeLaApuesta(Double.parseDouble(args[6]));
		site.setNumDeCedula(Long.parseLong(args[7]));
		site.setNameSede(args[8]);
		site.setDiaDeLaApuesta(args[9]);

		listOfBalotos.add(site);
		writeDataSerializable();
	}

	/**
	 * Este método sobrescribe el método 'create' de la interfaz CRUDOperation.
	 * Añade un nuevo objeto BalotoDTO a la lista de balotos y luego escribe la
	 * lista en un archivo serializado.
	 *
	 * @param o Un objeto que se supone es una instancia de BalotoDTO que se añadirá
	 *          a la lista de balotos.
	 */
	@Override
	public void create(Object o) {
		listOfBalotos.add((BalotoDTO) o);
		writeDataSerializable();
	}

	/**
	 * Este método sobrescribe el método 'read' de la interfaz CRUDOperation. Lee
	 * todos los objetos BalotoDTO en la lista de balotos y devuelve una
	 * representación de cadena de ellos.
	 *
	 * @return Una cadena que representa todos los objetos BalotoDTO en la lista de
	 *         balotos. Cada objeto se representa en una nueva línea con su índice
	 *         en la lista seguido de '->' y luego su representación de cadena.
	 */
	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfBalotos.forEach(site -> {
			Sb.append(index + "->" + (site.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	/**
	 * Este método sobrescribe el método 'update' de la interfaz CRUDOperation.
	 * Actualiza un objeto BalotoDTO existente en la lista de balotos en el índice
	 * especificado con los nuevos valores proporcionados.
	 *
	 * @param index El índice del objeto BalotoDTO en la lista de balotos que se va
	 *              a actualizar.
	 * @param args  Un array de Strings que contiene los nuevos valores para el
	 *              baloto en el siguiente orden: args[0] - Nuevo primer dígito del
	 *              baloto (como String, se convertirá a Integer si no está vacío)
	 *              args[1] - Nuevo segundo dígito del baloto (como String, se
	 *              convertirá a Integer si no está vacío) args[2] - Nuevo tercer
	 *              dígito del baloto (como String, se convertirá a Integer si no
	 *              está vacío) args[3] - Nuevo cuarto dígito del baloto (como
	 *              String, se convertirá a Integer si no está vacío) args[4] -
	 *              Nuevo quinto dígito del baloto (como String, se convertirá a
	 *              Integer si no está vacío) args[5] - Nuevo sexto dígito del
	 *              baloto (como String, se convertirá a Integer si no está vacío)
	 * @return Un booleano que indica si la operación de actualización fue exitosa.
	 *         Devuelve 'false' si el índice es inválido, 'true' de lo contrario.
	 */
	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfBalotos.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
				listOfBalotos.get(index).setDigito1(Integer.parseInt(args[0]));
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfBalotos.get(index).setDigito2(Integer.parseInt(args[1]));
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfBalotos.get(index).setDigito3(Integer.parseInt(args[2]));
			}
			if (!args[3].isBlank() || !args[3].isEmpty() || args[3] != null) {
				listOfBalotos.get(index).setDigito4(Integer.parseInt(args[3]));
			}
			if (!args[4].isBlank() || !args[4].isEmpty() || args[4] != null) {
				listOfBalotos.get(index).setDigito5(Integer.parseInt(args[4]));

			}
			if (!args[5].isBlank() || !args[5].isEmpty() || args[5] != null) {
				listOfBalotos.get(index).setDigito6(Integer.parseInt(args[5]));
			}
		}
		writeDataSerializable();
		return true;
	}

	/**
	 * Este método sobrescribe el método 'delete' de la interfaz CRUDOperation.
	 * Elimina un objeto BalotoDTO existente en la lista de balotos en el índice
	 * especificado.
	 *
	 * @param index El índice del objeto BalotoDTO en la lista de balotos que se va
	 *              a eliminar.
	 * @return Un booleano que indica si la operación de eliminación fue exitosa.
	 *         Devuelve 'false' si el índice es inválido, 'true' de lo contrario.
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfBalotos.size()) {
			return false;
		} else {
			listOfBalotos.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	/**
	 * Este método sobrescribe el método 'delete' de la interfaz CRUDOperation.
	 * Elimina un objeto BalotoDTO existente en la lista de balotos si el objeto se
	 * encuentra en la lista.
	 *
	 * @param o Un objeto que se supone es una instancia de BalotoDTO que se
	 *          eliminará de la lista de balotos.
	 * @return Un booleano que indica si la operación de eliminación fue exitosa.
	 *         Devuelve 'false' si el objeto no se encuentra en la lista, 'true' de
	 *         lo contrario.
	 */

	@Override
	public boolean delete(Object o) {
		BalotoDTO toDelete = (BalotoDTO) o;
		if (listOfBalotos.contains(toDelete)) {
			listOfBalotos.remove(toDelete);
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
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfBalotos);
	}

	/**
	 * Este método devuelve la lista de objetos BalotoDTO.
	 *
	 * @return Una lista de objetos BalotoDTO.
	 */

	public ArrayList<BalotoDTO> getListOfBalotos() {
		return listOfBalotos;
	}

	/**
	 * Establece la lista de sedes de casas de apuestas.
	 *
	 * @param listOfLocations Lista de sedes de casas de apuestas.
	 */
	public void setListOfBalotos(ArrayList<BalotoDTO> listOfBalotos) {
		this.listOfBalotos = listOfBalotos;
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