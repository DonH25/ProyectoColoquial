package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.BalotoDTO;

/**
 * Clase que representa un DAO (Data Access Object) para gestionar la
 * persistencia de datos de sedes de casas de apuestas. Implementa la interfaz
 * CRUDOperation para realizar operaciones de creación, lectura, actualización y
 * eliminación de datos de sedes de casas de apuestas.
 * 
 * @see CRUDOperation
 */
public class BalotoDAO implements CRUDOperation {
	ArrayList<BalotoDTO> listOfBalotos;
	final String SERIAL_FILENAME = "apuestas-baloto.dat";
	int index = 0;

	/**
	 * Constructor de BalotoDAO que inicializa la lista de sedes de casas de
	 * apuestas.
	 */
	public BalotoDAO() {
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
		listOfBalotos.add(site);
		writeDataSerializable();
	}

	@Override
	public void create(Object o) {
		listOfBalotos.add((BalotoDTO) o);
		writeDataSerializable();
	}

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
	 * Obtiene la lista de sedes de casas de apuestas.
	 *
	 * @return Lista de sedes de casas de apuestas.
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