package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.JuegoDTO;

public class JuegoDAO implements CRUDOperation {

	/**
	 * Clase que representa un DAO (Data Access Object) para gestionar la
	 * persistencia de datos de sedes de casas de apuestas. Implementa la interfaz
	 * CRUDOperation para realizar operaciones de creación, lectura, actualización y
	 * eliminación de datos de sedes de casas de apuestas.
	 * 
	 * @see CRUDOperation
	 */
	ArrayList<JuegoDTO> listOfJuego;
	final String SERIAL_FILENAME = "juegos.dat";
	int index = 0;

	/**
	 * Constructor de JuegoDTO que inicializa la lista de sedes de casas de
	 * apuestas.
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

	@Override
	public void create(String... args) {
		JuegoDTO site = new JuegoDTO();
		site.setNombreJuego(args[0]);
		site.setTipoDejuego(args[1]);
		site.setPresupuestoDelJuego(Double.parseDouble(args[2]));

		listOfJuego.add(site);
		writeDataSerializable();
	}

	@Override
	public void create(Object o) {
		listOfJuego.add((JuegoDTO) o);
		writeDataSerializable();
	}

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

	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfJuego.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
				listOfJuego.get(index).setNombreJuego(args[0]);
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfJuego.get(index).setTipoDejuego(args[1]);
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfJuego.get(index).setPresupuestoDelJuego(Double.parseDouble(args[2]));
			}
		}
		writeDataSerializable();
		return true;
	}

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
	 * Escribe los datos de la lista de sedes de casas de apuestas en un archivo
	 * serializado.
	 */
	public void writeDataSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfJuego);
	}

	/**
	 * Obtiene la lista de sedes de casas de apuestas.
	 *
	 * @return Lista de sedes de casas de apuestas.
	 */
	public ArrayList<JuegoDTO> getListOfLocations() {
		return listOfJuego;
	}

	/**
	 * Establece la lista de sedes de casas de apuestas.
	 *
	 * @param listOfLocations Lista de sedes de casas de apuestas.
	 */
	public void setListOfLocations(ArrayList<JuegoDTO> listOfBalotos) {
		this.listOfJuego = listOfBalotos;
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
