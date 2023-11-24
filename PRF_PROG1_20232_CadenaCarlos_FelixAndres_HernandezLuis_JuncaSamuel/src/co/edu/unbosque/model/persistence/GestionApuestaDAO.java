
package co.edu.unbosque.model.persistence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import co.edu.unbosque.model.GestionApuestaDTO;

/**
 * Clase que representa un DAO (Data Access Object) para gestionar la
 * persistencia de datos de apuestas. Implementa la interfaz CRUDOperation para
 * realizar operaciones de creación, lectura, actualización y eliminación de
 * datos de apuestas.
 * 
 * @see CRUDOperation
 */
public class GestionApuestaDAO implements CRUDOperation {
	private ArrayList<GestionApuestaDTO> listOfGestionApuesta;
	final String SERIAL_FILENAME = "apuesta.dat";

	int index = 0;

	/**
	 * Constructor por defecto para GestionApuestaDAO. Inicializa la lista de
	 * gestión de apuestas. Si existe un archivo serializado con datos de gestión de
	 * apuestas, los carga en la lista. Si el archivo no contiene una lista de
	 * gestión de apuestas o no existe, se crea una nueva lista vacía.
	 */
	public GestionApuestaDAO() {
		listOfGestionApuesta = new ArrayList<GestionApuestaDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<GestionApuestaDTO> temp2 = (ArrayList<GestionApuestaDTO>) temp;
				listOfGestionApuesta = temp2;
			} else {
				System.out
						.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de la Gestion de apuesta.");
			}
		} else {
			listOfGestionApuesta = new ArrayList<>();
		}
	}

	/**
	 * Crea una nueva gestión de apuestas y la añade a la lista de gestión de
	 * apuestas. También escribe los datos en un archivo serializado.
	 *
	 * @param args Los argumentos utilizados para crear la nueva gestión de
	 *             apuestas. args[0] es el nombre de la sede. args[1] es el número
	 *             de cédula. args[2] es el día de la apuesta.
	 * @throws NumberFormatException si args[1] no puede ser convertido a un número.
	 */
	@Override
	public void create(String... args) {
		GestionApuestaDTO bet = new GestionApuestaDTO();
		bet.setNameSede(args[0]);
		bet.setNumDeCedula(Long.parseLong(args[1]));
		bet.setDiaDeLaApuesta(args[2]);

		listOfGestionApuesta.add(bet);
		writeDataSerializable();
	}

	/**
	 * Añade una nueva gestión de apuestas a la lista de gestión de apuestas y
	 * escribe los datos en un archivo serializado.
	 *
	 * @param o El objeto que se va a añadir a la lista de gestión de apuestas. Debe
	 *          ser de tipo GestionApuestaDTO.
	 * @throws ClassCastException si el objeto no es de tipo GestionApuestaDTO.
	 */
	@Override
	public void create(Object o) {
		listOfGestionApuesta.add((GestionApuestaDTO) o);
		writeDataSerializable();
	}

	/**
	 * Lee y devuelve una representación de cadena de todas las gestiones de
	 * apuestas en la lista.
	 *
	 * @return Una cadena que representa todas las gestiones de apuestas en la
	 *         lista. Cada gestión de apuestas se representa en una nueva línea con
	 *         su índice en la lista seguido de '->' y su representación de cadena.
	 */
	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfGestionApuesta.forEach(bet -> {
			Sb.append(index + "->" + (bet.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	/**
	 * Actualiza la gestión de apuestas en el índice especificado con los nuevos
	 * argumentos proporcionados y escribe los datos en un archivo serializado.
	 *
	 * @param index El índice de la gestión de apuestas en la lista que se va a
	 *              actualizar.
	 * @param args  Los nuevos argumentos para la gestión de apuestas. args[0] es el
	 *              nombre de la sede. args[1] es el número de cédula. args[2] es el
	 *              día de la apuesta.
	 * @return Verdadero si la gestión de apuestas se actualizó con éxito, falso si
	 *         el índice es inválido.
	 * @throws NumberFormatException si args[1] no puede ser convertido a un número.
	 */
	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfGestionApuesta.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
				listOfGestionApuesta.get(index).setNameSede(args[0]);
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfGestionApuesta.get(index).setNumDeCedula(Long.parseLong(args[1]));
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfGestionApuesta.get(index).setDiaDeLaApuesta(args[2]);
			}

		}
		writeDataSerializable();
		return true;
	}

	/**
	 * Elimina la gestión de apuestas en el índice especificado de la lista de
	 * gestión de apuestas y escribe los datos en un archivo serializado.
	 *
	 * @param index El índice de la gestión de apuestas en la lista que se va a
	 *              eliminar.
	 * @return Verdadero si la gestión de apuestas se eliminó con éxito, falso si el
	 *         índice es inválido.
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfGestionApuesta.size()) {
			return false;
		} else {
			listOfGestionApuesta.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	/**
	 * Elimina la gestión de apuestas especificada de la lista de gestión de
	 * apuestas y escribe los datos en un archivo serializado.
	 *
	 * @param o La gestión de apuestas que se va a eliminar de la lista. Debe ser de
	 *          tipo GestionApuestaDTO.
	 * @return Verdadero si la gestión de apuestas se eliminó con éxito, falso si la
	 *         gestión de apuestas no se encontró en la lista.
	 * @throws ClassCastException si el objeto no es de tipo GestionApuestaDTO.
	 */
	@Override
	public boolean delete(Object o) {
		GestionApuestaDTO toDelete = (GestionApuestaDTO) o;
		if (listOfGestionApuesta.contains(toDelete)) {
			listOfGestionApuesta.remove(toDelete);
			writeDataSerializable();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método que obtiene el día de la semana a partir de una fecha en formato de
	 * cadena.
	 *
	 * @param fechaString Cadena que representa la fecha en formato "yyyy-MM-dd".
	 * @return Nombre del día de la semana o "Fecha no válida" en caso de error.
	 */
	public static String obtenerDiaSemana(String fechaString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date fecha = sdf.parse(fechaString);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(fecha);

			int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

			String[] diasSemana = { "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" };

			return diasSemana[diaSemana - 1];
		} catch (ParseException e) {
			return "Fecha no válida";
		}
	}

	/**
	 * Escribe los datos de la lista de apuestas en un archivo serializado.
	 */
	public void writeDataSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfGestionApuesta);
	}

	/**
	 * Obtiene la lista de gestión de apuestas.
	 *
	 * @return La lista de gestión de apuestas.
	 */
	public ArrayList<GestionApuestaDTO> getListOfGestionApuesta() {
		return listOfGestionApuesta;
	}

	/**
	 * Establece la lista de gestión de apuestas.
	 *
	 * @param listOfGestionApuesta La nueva lista de gestión de apuestas.
	 */
	public void setListOfGestionApuesta(ArrayList<GestionApuestaDTO> listOfGestionApuesta) {
		this.listOfGestionApuesta = listOfGestionApuesta;
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