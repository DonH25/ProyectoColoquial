package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.SuperastroDTO;

import co.edu.unbosque.model.SuperastroDTO;

/**
 * Clase que representa un DAO (Data Access Object) para gestionar la
 * persistencia de datos de sedes de casas de apuestas. Implementa la interfaz
 * CRUDOperation para realizar operaciones de creación, lectura, actualización y
 * eliminación de datos de sedes de casas de apuestas.
 * 
 * @see CRUDOperation
 */
public class SuperastroDAO implements CRUDOperation {
	ArrayList<SuperastroDTO> listOfSuperastro;
	final String SERIAL_FILENAME = "apuestas-superastro.dat";
	int index = 0;

	/**
	 * Constructor de SuperastroDAO que inicializa la lista de los superastros de
	 * casas de apuestas.
	 */
	public SuperastroDAO() {
		listOfSuperastro = new ArrayList<SuperastroDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<SuperastroDTO> temp2 = (ArrayList<SuperastroDTO>) temp;
				listOfSuperastro = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de superastros.");
			}
		} else {
			listOfSuperastro = new ArrayList<>();
		}
	}

	@Override
	public void create(String... args) {
		SuperastroDTO site = new SuperastroDTO();
		site.setDigito1(Integer.parseInt(args[0]));
		site.setDigito2(Integer.parseInt(args[1]));
		site.setDigito3(Integer.parseInt(args[2]));
		site.setDigito4(Integer.parseInt(args[3]));
		site.setValorDeLaApuesta(Double.parseDouble(args[4]));
		site.setZodiacoSigno(args[5]);
		site.setNumDeCedula(Long.parseLong(args[6]));
		site.setNameSede(args[7]);
		site.setDiaDeLaApuesta(args[8]);

		listOfSuperastro.add(site);
		writeDataSerializable();
	}

	@Override
	public void create(Object o) {
		listOfSuperastro.add((SuperastroDTO) o);
		writeDataSerializable();
	}

	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfSuperastro.forEach(site -> {
			Sb.append(index + "->" + (site.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfSuperastro.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
			    listOfSuperastro.get(index).setDigito1(Integer.parseInt(args[0]));
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
			    listOfSuperastro.get(index).setDigito2(Integer.parseInt(args[1]));
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
			    listOfSuperastro.get(index).setDigito3(Integer.parseInt(args[2]));
			}
			if (!args[3].isBlank() || !args[3].isEmpty() || args[3] != null) {
			    listOfSuperastro.get(index).setDigito4(Integer.parseInt(args[3]));
			}
			if (!args[4].isBlank() || !args[4].isEmpty() || args[4] != null) {
			    listOfSuperastro.get(index).setValorDeLaApuesta(Double.parseDouble(args[4]));
			}
			if (!args[5].isBlank() || !args[5].isEmpty() || args[5] != null) {
			    listOfSuperastro.get(index).setZodiacoSigno(args[5]);
			}
			if (!args[6].isBlank() || !args[6].isEmpty() || args[6] != null) {
			    listOfSuperastro.get(index).setNumDeCedula(Long.parseLong(args[6]));
			}
			if (!args[7].isBlank() || !args[7].isEmpty() || args[7] != null) {
			    listOfSuperastro.get(index).setNameSede(args[7]);
			}
			if (!args[8].isBlank() || !args[8].isEmpty() || args[8] != null) {
			    listOfSuperastro.get(index).setDiaDeLaApuesta(args[8]);
			}

		}
		writeDataSerializable();
		return true;
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfSuperastro.size()) {
			return false;
		} else {
			listOfSuperastro.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(Object o) {
		SuperastroDTO toDelete = (SuperastroDTO) o;
		if (listOfSuperastro.contains(toDelete)) {
			listOfSuperastro.remove(toDelete);
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
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfSuperastro);
	}

	/**
	 * Obtiene la lista de sedes de casas de apuestas.
	 *
	 * @return Lista de sedes de casas de apuestas.
	 */
	public ArrayList<SuperastroDTO> getListOfSuperastro() {
		return listOfSuperastro;
	}

	/**
	 * Establece la lista de sedes de casas de apuestas.
	 *
	 * @param listOfLocations Lista de sedes de casas de apuestas.
	 */
	public void setListOfSuperastro(ArrayList<SuperastroDTO> listOfSuperastro) {
		this.listOfSuperastro = listOfSuperastro;
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
