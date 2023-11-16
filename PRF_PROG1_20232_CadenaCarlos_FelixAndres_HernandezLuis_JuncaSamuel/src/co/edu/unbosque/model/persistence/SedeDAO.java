package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.SedeDTO;

public class SedeDAO implements CRUDOperation {
	ArrayList<SedeDTO> listOfSedes;
	final String SERIAL_FILENAME = "sedes.dat";
	int index = 0;

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

		site.setLocalidad(args[0]);
		site.setNumEmpleados(Long.parseLong(args[1]));

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
				listOfSedes.get(index).setLocalidad(args[0]);
			}
			if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
				listOfSedes.get(index).setNumEmpleados(Long.parseLong(args[1]));
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

	public void writeDataSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfSedes);
	}

	public ArrayList<SedeDTO> getListOfSedes() {
		return listOfSedes;
	}

	public void setListOfSedes(ArrayList<SedeDTO> listOfBalotos) {
		this.listOfSedes = listOfBalotos;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getSERIAL_FILENAME() {
		return SERIAL_FILENAME;
	}

}
