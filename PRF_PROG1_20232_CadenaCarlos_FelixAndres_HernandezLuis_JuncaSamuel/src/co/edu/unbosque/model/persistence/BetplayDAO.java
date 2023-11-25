package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.BetplayDTO;

/**
 * La clase BetplayDAO implementa la interfaz CRUDOperation y gestiona una lista
 * de objetos BetplayDTO.
 */

public class BetplayDAO implements CRUDOperation {
	ArrayList<BetplayDTO> listOfBetplays;
	final String SERIAL_FILENAME = "apuestas-betplay.dat";
	int index = 0;

	/**
	 * Constructor de la clase BetplayDAO. Inicializa la lista de betplays y trata
	 * de leer los datos existentes de un archivo serializado. Si el archivo existe
	 * y contiene una ArrayList de BetplayDTO, se carga en la lista de betplays. Si
	 * el archivo no existe o no contiene una ArrayList de BetplayDTO, se inicializa
	 * una nueva lista vacía.
	 */

	public BetplayDAO() {
		listOfBetplays = new ArrayList<BetplayDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<BetplayDTO> temp2 = (ArrayList<BetplayDTO>) temp;
				listOfBetplays = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de los betplays.");
			}
		} else {
			listOfBetplays = new ArrayList<>();
		}
	}

	/**
	 * Este método crea un nuevo objeto BetplayDTO y lo añade a la lista de
	 * betplays.
	 *
	 * @param args Un array de Strings que contiene los resultados de los partidos
	 *             en el siguiente orden: args[0] - Resultado del primer partido
	 *             args[1] - Resultado del segundo partido args[2] - Resultado del
	 *             tercer partido args[3] - Resultado del cuarto partido args[4] -
	 *             Resultado del quinto partido args[5] - Resultado del sexto
	 *             partido args[6] - Resultado del séptimo partido args[7] -
	 *             Resultado del octavo partido args[8] - Resultado del noveno
	 *             partido args[9] - Resultado del décimo partido args[10] -
	 *             Resultado del undécimo partido args[11] - Resultado del duodécimo
	 *             partido args[12] - Resultado del decimotercer partido args[13] -
	 *             Resultado del decimocuarto partido
	 */
	@Override
	public void create(String... args) {
		BetplayDTO site = new BetplayDTO();
		site.setPartido1Resultado(args[0]);
		site.setPartido2Resultado(args[1]);
		site.setPartido3Resultado(args[2]);
		site.setPartido4Resultado(args[3]);
		site.setPartido5Resultado(args[4]);
		site.setPartido6Resultado(args[5]);
		site.setPartido7Resultado(args[6]);
		site.setPartido8Resultado(args[7]);
		site.setPartido9Resultado(args[8]);
		site.setPartido10Resultado(args[9]);
		site.setPartido11Resultado(args[10]);
		site.setPartido12Resultado(args[11]);
		site.setPartido13Resultado(args[12]);
		site.setPartido14Resultado(args[13]);
		site.setValorDeLaApuesta(Double.parseDouble(args[14]));
		site.setNumDeCedula(Long.parseLong(args[15]));
		site.setNameSede(args[16]);
		site.setDiaDeLaApuesta(args[17]);

		listOfBetplays.add(site);
		writeDataSerializable();
	}

	/**
	 * Este método sobrescribe el método 'create' de la interfaz CRUDOperation.
	 * Añade un nuevo objeto BetplayDTO a la lista de betplays y luego escribe la
	 * lista en un archivo serializado.
	 *
	 * @param o Un objeto que se supone es una instancia de BetplayDTO que se
	 *          añadirá a la lista de betplays.
	 */

	@Override
	public void create(Object o) {
		listOfBetplays.add((BetplayDTO) o);
		writeDataSerializable();
	}

	/**
	 * Este método sobrescribe el método 'read' de la interfaz CRUDOperation. Lee
	 * todos los objetos BetplayDTO en la lista de betplays y devuelve una
	 * representación de cadena de ellos.
	 *
	 * @return Una cadena que representa todos los objetos BetplayDTO en la lista de
	 *         betplays. Cada objeto se representa en una nueva línea con su índice
	 *         en la lista seguido de '->' y luego su representación de cadena.
	 */
	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfBetplays.forEach(site -> {
			Sb.append(index + "->" + (site.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	/**
	 * Este método sobrescribe el método 'update' de la interfaz CRUDOperation.
	 * Actualiza un objeto BetplayDTO existente en la lista de betplays en el índice
	 * especificado con los nuevos valores proporcionados.
	 *
	 * @param index El índice del objeto BetplayDTO en la lista de betplays que se
	 *              va a actualizar.
	 * @param args  Un array de Strings que contiene los nuevos resultados de los
	 *              partidos en el siguiente orden: args[0] - Nuevo resultado del
	 *              primer partido (como String, se convertirá a Integer si no está
	 *              vacío) args[1] - Nuevo resultado del segundo partido (como
	 *              String, se convertirá a Integer si no está vacío) args[2] -
	 *              Nuevo resultado del tercer partido (como String, se convertirá a
	 *              Integer si no está vacío) args[3] - Nuevo resultado del cuarto
	 *              partido (como String, se convertirá a Integer si no está vacío)
	 *              args[4] - Nuevo resultado del quinto partido (como String, se
	 *              convertirá a Integer si no está vacío) args[5] - Nuevo resultado
	 *              del sexto partido (como String, se convertirá a Integer si no
	 *              está vacío) args[6] - Nuevo resultado del séptimo partido (como
	 *              String, se convertirá a Integer si no está vacío) args[7] -
	 *              Nuevo resultado del octavo partido (como String, se convertirá a
	 *              Integer si no está vacío) args[8] - Nuevo resultado del noveno
	 *              partido (como String, se convertirá a Integer si no está vacío)
	 *              args[9] - Nuevo resultado del décimo partido (como String, se
	 *              convertirá a Integer si no está vacío) args[10] - Nuevo
	 *              resultado del undécimo partido (como String, se convertirá a
	 *              Integer si no está vacío) args[11] - Nuevo resultado del
	 *              duodécimo partido (como String, se convertirá a Integer si no
	 *              está vacío) args[12] - Nuevo resultado del decimotercer partido
	 *              (como String, se convertirá a Integer si no está vacío) args[13]
	 *              - Nuevo resultado del decimocuarto partido (como String, se
	 *              convertirá a Integer si no está vacío)
	 * @return Un booleano que indica si la operación de actualización fue exitosa.
	 *         Devuelve 'false' si el índice es inválido, 'true' de lo contrario.
	 */
	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfBetplays.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
				listOfBetplays.get(index).setPartido1Resultado(args[0]);
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfBetplays.get(index).setPartido2Resultado(args[1]);
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfBetplays.get(index).setPartido3Resultado(args[2]);
			}
			if (!args[3].isBlank() || !args[3].isEmpty() || args[3] != null) {
				listOfBetplays.get(index).setPartido4Resultado(args[3]);
			}
			if (!args[4].isBlank() || !args[4].isEmpty() || args[4] != null) {
				listOfBetplays.get(index).setPartido5Resultado(args[4]);
			}
			if (!args[5].isBlank() || !args[5].isEmpty() || args[5] != null) {
				listOfBetplays.get(index).setPartido6Resultado(args[5]);
			}
			if (!args[6].isBlank() || !args[6].isEmpty() || args[6] != null) {
				listOfBetplays.get(index).setPartido7Resultado(args[6]);
			}
			if (!args[7].isBlank() || !args[7].isEmpty() || args[7] != null) {
				listOfBetplays.get(index).setPartido8Resultado(args[7]);
			}
			if (!args[8].isBlank() || !args[8].isEmpty() || args[8] != null) {
				listOfBetplays.get(index).setPartido9Resultado(args[8]);
			}
			if (!args[9].isBlank() || !args[9].isEmpty() || args[9] != null) {
				listOfBetplays.get(index).setPartido10Resultado(args[9]);
			}
			if (!args[10].isBlank() || !args[10].isEmpty() || args[10] != null) {
				listOfBetplays.get(index).setPartido11Resultado(args[10]);
			}
			if (!args[11].isBlank() || !args[11].isEmpty() || args[11] != null) {
				listOfBetplays.get(index).setPartido12Resultado(args[11]);
			}
			if (!args[12].isBlank() || !args[12].isEmpty() || args[12] != null) {
				listOfBetplays.get(index).setPartido13Resultado(args[12]);
			}
			if (!args[12].isBlank() || !args[12].isEmpty() || args[12] != null) {
				listOfBetplays.get(index).setPartido14Resultado(args[12]);
			}
		}
		writeDataSerializable();
		return true;
	}

	/**
	 * Este método sobrescribe el método 'delete' de la interfaz CRUDOperation.
	 * Elimina un objeto BetplayDTO existente en la lista de betplays en el índice
	 * especificado.
	 *
	 * @param index El índice del objeto BetplayDTO en la lista de betplays que se
	 *              va a eliminar.
	 * @return Un booleano que indica si la operación de eliminación fue exitosa.
	 *         Devuelve 'false' si el índice es inválido, 'true' de lo contrario.
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfBetplays.size()) {
			return false;
		} else {
			listOfBetplays.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	/**
	 * Este método sobrescribe el método 'delete' de la interfaz CRUDOperation.
	 * Elimina un objeto BetplayDTO existente en la lista de betplays si el objeto
	 * se encuentra en la lista.
	 *
	 * @param o Un objeto que se supone es una instancia de BetplayDTO que se
	 *          eliminará de la lista de betplays.
	 * @return Un booleano que indica si la operación de eliminación fue exitosa.
	 *         Devuelve 'false' si el objeto no se encuentra en la lista, 'true' de
	 *         lo contrario.
	 */
	@Override
	public boolean delete(Object o) {
		BetplayDTO toDelete = (BetplayDTO) o;
		if (listOfBetplays.contains(toDelete)) {
			listOfBetplays.remove(toDelete);
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
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfBetplays);
	}

	/**
	 * Este método devuelve la lista de objetos BetplayDTO.
	 *
	 * @return Una lista de objetos BetplayDTO.
	 */
	public ArrayList<BetplayDTO> getListOfBetplays() {
		return listOfBetplays;
	}

	/**
	 * Este método establece la lista de objetos BetplayDTO.
	 *
	 * @param listOfBetplays Una lista de objetos BetplayDTO que se va a establecer.
	 */
	public void setListOfBetplays(ArrayList<BetplayDTO> listOfBetplays) {
		this.listOfBetplays = listOfBetplays;
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
