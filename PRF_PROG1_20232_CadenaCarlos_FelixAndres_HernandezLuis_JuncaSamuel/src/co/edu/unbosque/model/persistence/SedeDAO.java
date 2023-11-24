package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.SedeDTO;

/**
 * La clase SedeDAO implementa la interfaz CRUDOperation y gestiona las
 * operaciones de la lista de sedes.
 */
public class SedeDAO implements CRUDOperation {
	ArrayList<SedeDTO> listOfSedes;
	final String SERIAL_FILENAME = "sedes.dat";
	int index = 0;

	/**
	 * Constructor de la clase SedeDAO. Inicializa la lista de sedes y lee los datos
	 * de un archivo serializado si existe.
	 */
	public SedeDAO() {
		listOfSedes = new ArrayList<SedeDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<SedeDTO> temp2 = (ArrayList<SedeDTO>) temp;
				listOfSedes = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de las sedes.");
			}
		} else {
			listOfSedes = new ArrayList<>();
		}
	}

	/**
	 * Crea una nueva instancia de SedeDTO con los argumentos proporcionados y la
	 * añade a la lista de sedes.
	 * 
	 * @param args Los argumentos para crear la nueva instancia de SedeDTO.
	 */
	@Override
	public void create(String... args) {
		SedeDTO site = new SedeDTO();

		site.setLocalidad(args[0]);
		site.setNumEmpleados(Long.parseLong(args[1]));

		listOfSedes.add(site);
		writeDataSerializable();
	}

	/**
	 * Añade un objeto a la lista de sedes y escribe los datos en un archivo
	 * serializado.
	 * 
	 * @param o El objeto a añadir a la lista de sedes.
	 */
	@Override
	public void create(Object o) {
		listOfSedes.add((SedeDTO) o);
		writeDataSerializable();
	}

	/**
	 * Lee y devuelve una representación de cadena de la lista de sedes.
	 * 
	 * @return Una representación de cadena de la lista de sedes.
	 */
	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfSedes.forEach(site -> {
			Sb.append(index + "->" + (site.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	/**
	 * Actualiza la información de la sede con la localidad especificada con los
	 * argumentos proporcionados.
	 * 
	 * @param index El índice de la sede a actualizar.
	 * @param args  Los nuevos valores para actualizar la sede.
	 * @return Devuelve verdadero si la actualización fue exitosa, de lo contrario
	 *         devuelve falso.
	 */
	@Override
	public boolean update(int index, String... args) {
		if (args[0] == null || args[0].isBlank()) {
			return false;
		}

		for (SedeDTO sede : listOfSedes) {
			if (sede.getLocalidad().equals(args[0])) {
				if (args.length > 0 && !args[0].isBlank() && !args[0].isEmpty()) {
					sede.setLocalidad(args[0]);
				}

				if (args.length > 1 && !args[1].isBlank() && !args[1].isEmpty()) {
					try {
						long numEmpleados = Long.parseLong(args[1]);
						sede.setNumEmpleados(numEmpleados);
					} catch (NumberFormatException e) {
						// Manejar la excepción si la conversión a Long falla
						e.printStackTrace();
					}
				}

				writeDataSerializable();
				return true;
			}
		}

		return false; // No se encontró la sede con la localidad especificada
	}

	/**
	 * Elimina la sede en el índice especificado.
	 * 
	 * @param index El índice de la sede a eliminar.
	 * @return Devuelve verdadero si la eliminación fue exitosa, de lo contrario
	 *         devuelve falso.
	 */
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfSedes.size()) {
			return false;
		} else {
			listOfSedes.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	/**
	 * Elimina la sede especificada.
	 * 
	 * @param o La sede a eliminar.
	 * @return Devuelve verdadero si la eliminación fue exitosa, de lo contrario
	 *         devuelve falso.
	 */
	@Override
	public boolean delete(Object o) {
		SedeDTO toDelete = (SedeDTO) o;
		if (listOfSedes.contains(toDelete)) {
			listOfSedes.remove(toDelete);
			writeDataSerializable();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Actualiza la información de la sede con la localidad especificada con los
	 * argumentos proporcionados.
	 * 
	 * @param args Los nuevos valores para actualizar la sede.
	 * @return Devuelve verdadero si la actualización fue exitosa, de lo contrario
	 *         devuelve falso.
	 */
	public boolean updateByLocalidad(String... args) {
		if (args == null || args.length < 2 || args[0] == null || args[0].isBlank()) {
			return false;
		} else {
			for (SedeDTO sede : listOfSedes) {
				if (sede.getLocalidad().equals(args[0])) {
					if (!args[0].isBlank() && !args[0].isEmpty()) {
						sede.setLocalidad(args[0]);
					}

					if (!args[1].isBlank() && !args[1].isEmpty()) {
						sede.setLocalidad(args[1]);
					}
					if (!args[2].isBlank() && !args[2].isEmpty()) {
						sede.setNumEmpleados(Integer.parseInt(args[2]));
					}
				}
			}
			writeDataSerializable();
			return true;
		}
	}

	/**
	 * Escribe los datos de la lista de sedes en un archivo serializado.
	 */
	public void writeDataSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfSedes);
	}

	/**
	 * @return Devuelve la lista de sedes.
	 */
	public ArrayList<SedeDTO> getListOfSedes() {
		return listOfSedes;
	}

	/**
	 * @param listOfSedes La lista de sedes a establecer.
	 */
	public void setListOfSedes(ArrayList<SedeDTO> listOfSedes) {
		this.listOfSedes = listOfSedes;
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

}
