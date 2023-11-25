package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ChanceDTO;

/**
 * Esta clase actúa como un DAO (Data Access Object) para manejar la
 * persistencia de datos de las sedes de las casas de apuestas. Implementa la
 * interfaz CRUDOperation para llevar a cabo operaciones de creación, lectura,
 * actualización y eliminación en los datos de las sedes de las casas de
 * apuestas.
 *
 * @see CRUDOperation
 */
public class ChanceDAO implements CRUDOperation {
	ArrayList<ChanceDTO> listOfChances;
	final String SERIAL_FILENAME = "apuestas-chance.dat";
	int index = 0;

	/**
	 * Constructor por defecto para ChanceDAO. Inicializa la lista de chances. Si
	 * existe un archivo serializado con datos de chances, los carga en la lista. Si
	 * el archivo no contiene una lista de chances o no existe, se crea una nueva
	 * lista vacía.
	 */
	public ChanceDAO() {
		listOfChances = new ArrayList<ChanceDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<ChanceDTO> temp2 = (ArrayList<ChanceDTO>) temp;
				listOfChances = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de chances.");
			}
		} else {
			listOfChances = new ArrayList<>();
		}
	}

	/**
	 * Crea una nueva chance y la añade a la lista de chances. También escribe los
	 * datos en un archivo serializado.
	 *
	 * @param args Los argumentos utilizados para crear la nueva chance. args[0] es
	 *             el primer dígito de la chance. args[1] es el segundo dígito de la
	 *             chance. args[2] es el tercer dígito de la chance. args[3] es el
	 *             cuarto dígito de la chance. args[4] es el valor de la apuesta.
	 *             args[5] es la lotería. args[6] es el número de cédula. args[7] es
	 *             el nombre de la sede. args[8] es el día de la apuesta.
	 * @throws NumberFormatException si args[0], args[1], args[2], args[3], args[4],
	 *                               or args[6] no pueden ser convertidos a un
	 *                               número.
	 */
	@Override
	public void create(String... args) {
		ChanceDTO site = new ChanceDTO();
		site.setDigito1(Integer.parseInt(args[0]));
		site.setDigito2(Integer.parseInt(args[1]));
		site.setDigito3(Integer.parseInt(args[2]));
		site.setDigito4(Integer.parseInt(args[3]));
		site.setValorDeLaApuesta(Double.parseDouble(args[4]));
		site.setLoteria(args[5]);
		site.setNumDeCedula(Long.parseLong(args[6]));
		site.setNameSede(args[7]);
		site.setDiaDeLaApuesta(args[8]);

		listOfChances.add(site);
		writeDataSerializable();
	}

	/**
	 * Añade una nueva chance a la lista de chances y escribe los datos en un
	 * archivo serializado.
	 *
	 * @param o El objeto que se va a añadir a la lista de chances. Debe ser de tipo
	 *          ChanceDTO.
	 * @throws ClassCastException si el objeto no es de tipo ChanceDTO.
	 */
	@Override
	public void create(Object o) {
		listOfChances.add((ChanceDTO) o);
		writeDataSerializable();
	}

	/**
	 * Lee y devuelve una representación de cadena de todas las chances en la lista.
	 *
	 * @return Una cadena que representa todas las chances en la lista. Cada chance
	 *         se representa en una nueva línea con su índice en la lista seguido de
	 *         '->' y su representación de cadena.
	 */
	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfChances.forEach(site -> {
			Sb.append(index + "->" + (site.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	/**
	 * Actualiza la chance en el índice especificado con los nuevos argumentos
	 * proporcionados y escribe los datos en un archivo serializado.
	 *
	 * @param index El índice de la chance en la lista que se va a actualizar.
	 * @param args  Los nuevos argumentos para la chance. args[0] es el primer
	 *              dígito de la chance. args[1] es el segundo dígito de la chance.
	 *              args[2] es el tercer dígito de la chance. args[3] es el cuarto
	 *              dígito de la chance.
	 * @return Verdadero si la chance se actualizó con éxito, falso si el índice es
	 *         inválido.
	 * @throws NumberFormatException si args[0], args[1], args[2], or args[3] no
	 *                               pueden ser convertidos a un número.
	 */
	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfChances.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
				listOfChances.get(index).setDigito1(Integer.parseInt(args[0]));
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfChances.get(index).setDigito2(Integer.parseInt(args[1]));
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfChances.get(index).setDigito3(Integer.parseInt(args[2]));
			}
			if (!args[3].isBlank() || !args[3].isEmpty() || args[3] != null) {
				listOfChances.get(index).setDigito4(Integer.parseInt(args[3]));
			}
		}
		writeDataSerializable();
		return true;
	}

	/**
	 * Elimina la chance en el índice especificado de la lista de chances y escribe
	 * los datos en un archivo serializado.
	 *
	 * @param index El índice de la chance en la lista que se va a eliminar.
	 * @return Verdadero si la chance se eliminó con éxito, falso si el índice es
	 *         inválido.
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfChances.size()) {
			return false;
		} else {
			listOfChances.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	/**
	 * Elimina la chance especificada de la lista de chances y escribe los datos en
	 * un archivo serializado.
	 *
	 * @param o La chance que se va a eliminar de la lista. Debe ser de tipo
	 *          ChanceDTO.
	 * @return Verdadero si la chance se eliminó con éxito, falso si la chance no se
	 *         encontró en la lista.
	 * @throws ClassCastException si el objeto no es de tipo ChanceDTO.
	 */
	@Override
	public boolean delete(Object o) {
		ChanceDTO toDelete = (ChanceDTO) o;
		if (listOfChances.contains(toDelete)) {
			listOfChances.remove(toDelete);
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
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfChances);
	}

	/**
	 * Obtiene la lista de chances.
	 *
	 * @return La lista de chances.
	 */
	public ArrayList<ChanceDTO> getListOfChances() {
		return listOfChances;
	}

	/**
	 * Establece la lista de chances.
	 *
	 * @param listOfChances La nueva lista de chances.
	 */
	public void setListOfChances(ArrayList<ChanceDTO> listOfChances) {
		this.listOfChances = listOfChances;
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
