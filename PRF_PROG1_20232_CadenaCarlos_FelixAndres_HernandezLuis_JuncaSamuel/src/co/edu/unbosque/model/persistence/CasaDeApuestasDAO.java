package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CasaDeApuestasDTO;

/**
 * Clase que representa un DAO (Data Access Object) para gestionar la
 * persistencia de datos de sedes de casas de apuestas. Implementa la interfaz
 * CRUDOperation para realizar operaciones de creación, lectura, actualización y
 * eliminación de datos de sedes de casas de apuestas.
 * 
 * @see CRUDOperation
 */
public class CasaDeApuestasDAO implements CRUDOperation {
	ArrayList<CasaDeApuestasDTO> listOfCasa;
	final String SERIAL_FILENAME = "casadeapuestas.dat";
	int index = 0;

	/**
	 * Constructor de SedeCasaDeApuestasDAO que inicializa la lista de sedes de
	 * casas de apuestas.
	 */
	public CasaDeApuestasDAO() {
		listOfCasa = new ArrayList<CasaDeApuestasDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<CasaDeApuestasDTO> temp2 = (ArrayList<CasaDeApuestasDTO>) temp;
				listOfCasa = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de balotos.");
			}
		} else {
			listOfCasa = new ArrayList<>();
		}
	}

	@Override
	public void create(String... args) {
		CasaDeApuestasDTO site = new CasaDeApuestasDTO();
		site.setNombre(args[0]);
		site.setNumeroDeSedes(Integer.parseInt(args[1]));
		site.setPresupuestoTotal(Double.parseDouble(args[2]));

		listOfCasa.add(site);
		writeDataSerializable();
	}

	@Override
	public void create(Object o) {
		listOfCasa.add((CasaDeApuestasDTO) o);
		writeDataSerializable();
	}

	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfCasa.forEach(site -> {
			Sb.append(index + "->" + (site.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfCasa.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
				listOfCasa.get(index).setNombre(args[0]);
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfCasa.get(index).setNumeroDeSedes(Integer.parseInt(args[1]));
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfCasa.get(index).setPresupuestoTotal(Double.parseDouble(args[2]));
			}
		}
		writeDataSerializable();
		return true;
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfCasa.size()) {
			return false;
		} else {
			listOfCasa.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(Object o) {
		CasaDeApuestasDTO toDelete = (CasaDeApuestasDTO) o;
		if (listOfCasa.contains(toDelete)) {
			listOfCasa.remove(toDelete);
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
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfCasa);
	}

	/**
	 * Obtiene la lista de sedes de casas de apuestas.
	 *
	 * @return Lista de sedes de casas de apuestas.
	 */
	public ArrayList<CasaDeApuestasDTO> getListOfLocations() {
		return listOfCasa;
	}

	/**
	 * Establece la lista de sedes de casas de apuestas.
	 *
	 * @param listOfLocations Lista de sedes de casas de apuestas.
	 */
	public void setListOfLocations(ArrayList<CasaDeApuestasDTO> listOfBalotos) {
		this.listOfCasa = listOfBalotos;
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
