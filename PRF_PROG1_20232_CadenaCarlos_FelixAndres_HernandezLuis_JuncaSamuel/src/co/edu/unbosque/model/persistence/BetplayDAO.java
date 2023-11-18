package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.BetplayDTO;

public class BetplayDAO implements CRUDOperation {
	ArrayList<BetplayDTO> listOfBetplays;
	final String SERIAL_FILENAME = "apuestas-betplay.dat";
	int index = 0;

	/**
	 * Constructor de BetplayDAO que inicializa la lista de sedes de casas de
	 * apuestas.
	 */
	public BetplayDAO() {
		listOfBetplays = new ArrayList<BetplayDTO>();

		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

			if (temp instanceof ArrayList<?>) {
				ArrayList<BetplayDTO> temp2 = (ArrayList<BetplayDTO>) temp;
				listOfBetplays = temp2;
			} else {
				System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de los betplays.");
			}
		} else {
			listOfBetplays = new ArrayList<>();
		}
	}

	@Override
	public void create(String... args) {
		BetplayDTO site = new BetplayDTO();
		site.setEquipoLocal(args[0]);
		site.setMarcadorLocal(Integer.parseInt(args[2]));
		site.setEquipoVisitante(args[3]);
		site.setMarcadorVisitante(Integer.parseInt(args[4]));

		listOfBetplays.add(site);
		writeDataSerializable();
	}

	@Override
	public void create(Object o) {
		listOfBetplays.add((BetplayDTO) o);
		writeDataSerializable();
	}

	@Override
	public String read() {
		index = 0;
		StringBuilder Sb = new StringBuilder();
		listOfBetplays.forEach(site -> {
			Sb.append(index + "->" + (site.toString() + "\n"));
			index++;
		});
		return Sb.toString();
	}

	@Override
	public boolean update(int index, String... args) {
		if (index < 0 || index >= listOfBetplays.size()) {
			return false;
		} else {
			if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
				listOfBetplays.get(index).setEquipoLocal(args[0]);
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfBetplays.get(index).setMarcadorLocal(Integer.parseInt(args[1]));
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfBetplays.get(index).setEquipoVisitante(args[2]);
			}
			if (!args[3].isBlank() || !args[3].isEmpty() || args[3] != null) {
				listOfBetplays.get(index).setMarcadorVisitante(Integer.parseInt(args[3]));
			}
		}
		writeDataSerializable();
		return true;
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listOfBetplays.size()) {
			return false;
		} else {
			listOfBetplays.remove(index);
			writeDataSerializable();
			return true;
		}
	}

	@Override
	public boolean delete(Object o) {
		BetplayDTO toDelete = (BetplayDTO) o;
		if (listOfBetplays.contains(toDelete)) {
			listOfBetplays.remove(toDelete);
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
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfBetplays);
	}

	/**
	 * Obtiene la lista de sedes de casas de apuestas.
	 *
	 * @return Lista de sedes de casas de apuestas.
	 */
	public ArrayList<BetplayDTO> getListOfBetplays() {
		return listOfBetplays;
	}

	/**
	 * Establece la lista de sedes de casas de apuestas.
	 *
	 * @param listOfLocations Lista de sedes de casas de apuestas.
	 */
	public void setListOfBetplays(ArrayList<BetplayDTO> listOfBetplays) {
		this.listOfBetplays = listOfBetplays;
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
