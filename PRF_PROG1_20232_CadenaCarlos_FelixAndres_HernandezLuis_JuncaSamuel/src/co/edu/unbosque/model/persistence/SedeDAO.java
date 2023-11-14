package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.SedeDTO;

/**
 * Clase que representa un DAO (Data Access Object) para gestionar la
 * persistencia de datos de sedes de casas de apuestas. Implementa la interfaz
 * CRUDOperation para realizar operaciones de creación, lectura, actualización y
 * eliminación de datos de sedes de casas de apuestas.
 * 
 * @see CRUDOperation
 */
public class SedeDAO implements CRUDOperation {
	ArrayList<SedeDTO> listOfSedes;
	final String SERIAL_FILENAME = "sedes.dat";
	int index = 0;

	/**
	 * Constructor de SedeDAO que inicializa la lista de sedes de
	 * casas de apuestas.
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

	@Override
	public void create(String... args) {
		SedeDTO site = new SedeDTO();
		site.setDireccion(args[0]);
		site.setBarrio(args[1]);
		site.setLocalidad(args[2]);
		site.setNumEmpleados(Long.parseLong(args[3]));

		listOfSedes.add(site);
		writeDataSerializable();
	}

	@Override
	public void create(Object o) {
		listOfSedes.add((SedeDTO) o);
		writeDataSerializable();
	}

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

	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfSedes.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
				listOfSedes.get(index).setDireccion(args[0]);
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfSedes.get(index).setBarrio(args[1]);
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfSedes.get(index).setLocalidad(args[2]);
			}
			if (!args[3].isBlank() || !args[3].isEmpty() || args[3] != null) {
				listOfSedes.get(index).setNumEmpleados(Long.parseLong(args[3]));
			}
		}
		writeDataSerializable();
		return true;
	}

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
	 * Escribe los datos de la lista de sedes de casas de apuestas en un archivo
	 * serializado.
	 */
	public void writeDataSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfSedes);
	}

	/**
	 * Obtiene la lista de sedes de casas de apuestas.
	 *
	 * @return Lista de sedes de casas de apuestas.
	 */
	public ArrayList<SedeDTO> getListOfLocations() {
		return listOfSedes;
	}

	/**
	 * Establece la lista de sedes de casas de apuestas.
	 *
	 * @param listOfLocations Lista de sedes de casas de apuestas.
	 */
	public void setListOfLocations(ArrayList<SedeDTO> listOfBalotos) {
		this.listOfSedes = listOfBalotos;
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
