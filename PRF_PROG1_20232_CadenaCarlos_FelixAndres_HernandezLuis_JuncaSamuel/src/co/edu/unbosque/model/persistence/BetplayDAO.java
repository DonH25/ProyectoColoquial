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
		site.setPartido1Resultado(args[0]);
		site.setPartido2Resultado(args[1]);
		site.setPartido3Resultado(args[2]);
		site.setPartido4Resultado(args[3]);
		site.setPartido5Resultado(args[4]);
		site.setPartido6Resultado(args[5]);
		site.setPartido7Resultado(args[6]);
		site.setPartido8Resultado(args[7]);
		site.setPartido9Resultado(args[8]);
		site.setPartido10Resultado(args[9]);
		site.setPartido11Resultado(args[10]);
		site.setPartido12Resultado(args[11]);
		site.setPartido13Resultado(args[12]);
		site.setPartido14Resultado(args[13]);

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
				listOfBetplays.get(index).setPartido1Resultado(args[0]);
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfBetplays.get(index).setPartido2Resultado(args[1]);
			}
			if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
				listOfBetplays.get(index).setPartido3Resultado(args[2]);
			}
			if (!args[3].isBlank() || !args[3].isEmpty() || args[3] != null) {
				listOfBetplays.get(index).setPartido4Resultado(args[3]);
			}
			if (!args[4].isBlank() || !args[4].isEmpty() || args[4] != null) {
				listOfBetplays.get(index).setPartido5Resultado(args[4]);
			}
			if (!args[5].isBlank() || !args[5].isEmpty() || args[5] != null) {
				listOfBetplays.get(index).setPartido6Resultado(args[5]);
			}
			if (!args[6].isBlank() || !args[6].isEmpty() || args[6] != null) {
				listOfBetplays.get(index).setPartido7Resultado(args[6]);
			}
			if (!args[7].isBlank() || !args[7].isEmpty() || args[7] != null) {
				listOfBetplays.get(index).setPartido8Resultado(args[7]);
			}
			if (!args[8].isBlank() || !args[8].isEmpty() || args[8] != null) {
				listOfBetplays.get(index).setPartido9Resultado(args[8]);
			}
			if (!args[9].isBlank() || !args[9].isEmpty() || args[9] != null) {
				listOfBetplays.get(index).setPartido10Resultado(args[9]);
			}
			if (!args[10].isBlank() || !args[10].isEmpty() || args[10] != null) {
				listOfBetplays.get(index).setPartido11Resultado(args[10]);
			}
			if (!args[11].isBlank() || !args[11].isEmpty() || args[11] != null) {
				listOfBetplays.get(index).setPartido12Resultado(args[11]);
			}
			if (!args[12].isBlank() || !args[12].isEmpty() || args[12] != null) {
				listOfBetplays.get(index).setPartido13Resultado(args[12]);
			}
			if (!args[12].isBlank() || !args[12].isEmpty() || args[12] != null) {
				listOfBetplays.get(index).setPartido14Resultado(args[12]);
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
