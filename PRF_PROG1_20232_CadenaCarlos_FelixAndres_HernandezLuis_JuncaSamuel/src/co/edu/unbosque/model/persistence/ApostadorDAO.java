package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ApostadorDTO;

/**
 * Clase que representa un DAO (Data Access Object) para gestionar la
 * persistencia de datos de sedes de casas de apuestas. Implementa la interfaz
 * CRUDOperation para realizar operaciones de creación, lectura, actualización y
 * eliminación de datos de sedes de casas de apuestas.
 * 
 * @see CRUDOperation
 */
public class ApostadorDAO implements CRUDOperation {
	ArrayList<ApostadorDTO> listOfApostadores;
	final String SERIAL_FILENAME = "apostador.dat";
	int index = 0;

	/**
	 * Constructor de ApostadorDAO que inicializa la lista de sedes de
	 * casas de apuestas.
	 */
	public ApostadorDAO() {
		listOfApostadores = new ArrayList<ApostadorDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<ApostadorDTO> temp2 = (ArrayList<ApostadorDTO>) temp;
				listOfApostadores = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de apostadores.");
			}
		} else {
			listOfApostadores = new ArrayList<>();
		}
	}

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

	@Override
	public void create(Object o) {
		listOfApostadores.add((ApostadorDTO) o);
		writeDataSerializable();
	}

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
