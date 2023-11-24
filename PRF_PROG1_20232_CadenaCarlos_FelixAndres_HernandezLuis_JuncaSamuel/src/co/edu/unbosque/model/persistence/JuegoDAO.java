package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.JuegoDTO;

/**
 * La clase JuegoDAO implementa la interfaz CRUDOperation y gestiona la
 * persistencia de datos de juegos.
 */
public class JuegoDAO implements CRUDOperation {

	ArrayList<JuegoDTO> listOfJuego;
	final String SERIAL_FILENAME = "juegos.dat";
	int index = 0;

	/**
	 * Constructor por defecto para JuegoDAO. Inicializa la lista de juegos. Si
	 * existe un archivo serializado con datos de juegos, los carga en la lista. Si
	 * el archivo no contiene una lista de juegos o no existe, se crea una nueva
	 * lista vacía.
	 */
	public JuegoDAO() {
		listOfJuego = new ArrayList<JuegoDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<JuegoDTO> temp2 = (ArrayList<JuegoDTO>) temp;
				listOfJuego = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de juegos.");
			}
		} else {
			listOfJuego = new ArrayList<>();
		}
	}

	/**
	 * Crea un nuevo juego y lo añade a la lista de juegos. También escribe los
	 * datos en un archivo serializado.
	 *
	 * @param args Los argumentos utilizados para crear el nuevo juego. args[0] es
	 *             el nombre del juego. args[1] es el tipo de juego. args[2] es el
	 *             presupuesto del juego.
	 * @throws NumberFormatException si args[2] no puede ser convertido a un número.
	 */
	@Override
	public void create(String... args) {
		JuegoDTO site = new JuegoDTO();
		site.setNombreJuego(args[0]);
		site.setTipoDejuego(args[1]);
		site.setPresupuestoDelJuego(Double.parseDouble(args[2]));

		listOfJuego.add(site);
		writeDataSerializable();
	}

	/**
	 * Añade un nuevo juego a la lista de juegos y escribe los datos en un archivo
	 * serializado.
	 *
	 * @param o El objeto que se va a añadir a la lista de juegos. Debe ser de tipo
	 *          JuegoDTO.
	 * @throws ClassCastException si el objeto no es de tipo JuegoDTO.
	 */
	@Override
	public void create(Object o) {
		listOfJuego.add((JuegoDTO) o);
		writeDataSerializable();
	}

	/**
	 * Lee y devuelve una representación de cadena de todos los juegos en la lista.
	 *
	 * @return Una cadena que representa todos los juegos en la lista. Cada juego se
	 *         representa en una nueva línea con su índice en la lista seguido de
	 *         '->' y su representación de cadena.
	 */
	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfJuego.forEach(site -> {
			Sb.append(index + "->" + (site.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	/**
	 * Actualiza el presupuesto del juego en el índice especificado con el nuevo
	 * argumento proporcionado y escribe los datos en un archivo serializado.
	 *
	 * @param index El índice del juego en la lista que se va a actualizar.
	 * @param args  El nuevo argumento para el juego. args[0] es el presupuesto del
	 *              juego.
	 * @return Verdadero si el juego se actualizó con éxito, falso si el índice es
	 *         inválido.
	 * @throws NumberFormatException si args[0] no puede ser convertido a un número.
	 */
	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfJuego.size()) {
			return false;
		} else {
			listOfJuego.get(index).setPresupuestoDelJuego(Double.parseDouble(args[0]));
			writeDataSerializable();
			return true;
		}
	}

	/**
	 * Elimina el juego en el índice especificado de la lista de juegos y escribe
	 * los datos en un archivo serializado.
	 *
	 * @param index El índice del juego en la lista que se va a eliminar.
	 * @return Verdadero si el juego se eliminó con éxito, falso si el índice es
	 *         inválido.
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfJuego.size()) {
			return false;
		} else {
			listOfJuego.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	/**
	 * Elimina el juego especificado de la lista de juegos y escribe los datos en un
	 * archivo serializado.
	 *
	 * @param o El juego que se va a eliminar de la lista. Debe ser de tipo
	 *          JuegoDTO.
	 * @return Verdadero si el juego se eliminó con éxito, falso si el juego no se
	 *         encontró en la lista.
	 * @throws ClassCastException si el objeto no es de tipo JuegoDTO.
	 */
	@Override
	public boolean delete(Object o) {
		JuegoDTO toDelete = (JuegoDTO) o;
		if (listOfJuego.contains(toDelete)) {
			listOfJuego.remove(toDelete);
			writeDataSerializable();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Esta función utiliza el método serializableOpenAndWriteFile de la clase
	 * FileHandler para escribir los datos del juego en un archivo.
	 */
	public void writeDataSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfJuego);
	}

	/**
	 * @return Devuelve la lista de juegos.
	 */
	public ArrayList<JuegoDTO> getListOfJuego() {
		return listOfJuego;
	}

	/**
	 * @param listOfJuego La lista de juegos a establecer.
	 */
	public void setListOfJuego(ArrayList<JuegoDTO> listOfJuego) {
		this.listOfJuego = listOfJuego;
	}

	/**
	 * @return Devuelve el índice.
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index El índice a establecer.
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * @return Devuelve el nombre del archivo serializado.
	 */
	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}

	/**
	 * @return Devuelve verdadero si la lista de juegos no está vacía, de lo
	 *         contrario devuelve falso.
	 */
	public boolean juegoExiste() {
		if (!listOfJuego.isEmpty()) {

			return true;
		} else {
			return false;
		}

	}

}
