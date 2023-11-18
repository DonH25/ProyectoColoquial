package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CasaDeApuestasDTO;

public class CasaDeApuestasDAO implements CRUDOperation {
	ArrayList<CasaDeApuestasDTO> listOfCasa;
	final String SERIAL_FILENAME = "casadeapuestas.dat";
	int index = 0;

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
		CasaDeApuestasDTO casas = new CasaDeApuestasDTO();
		casas.setNombre(args[0]);
		casas.setNumeroDeSedes(Integer.parseInt(args[1]));
		casas.setPresupuestoTotal(Double.parseDouble(args[2]));

		listOfCasa.add(casas);
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

	public boolean casaExiste() {
		if (!listOfCasa.isEmpty()) {

			return true;
		} else {
			return false;
		}

	}

	public void writeDataSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfCasa);
	}

	public ArrayList<CasaDeApuestasDTO> getListOfLocations() {
		return listOfCasa;
	}

	public void setListOfLocations(ArrayList<CasaDeApuestasDTO> listOfBalotos) {
		this.listOfCasa = listOfBalotos;
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
