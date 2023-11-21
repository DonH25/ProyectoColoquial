package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.JuegoDTO;

public class JuegoDAO implements CRUDOperation {

	ArrayList<JuegoDTO> listOfJuego;
	final String SERIAL_FILENAME = "juegos.dat";
	int index = 0;

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
			listOfJuego.get(index).setPresupuestoDelJuego(Double.parseDouble(args[0]));
			writeDataSerializable();
			return true;
		}
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

	public void writeDataSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfJuego);
	}

	public ArrayList<JuegoDTO> getListOfJuego() {
		return listOfJuego;
	}

	public void setListOfJuego(ArrayList<JuegoDTO> listOfJuego) {
		this.listOfJuego = listOfJuego;
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

	public boolean juegoExiste() {
		if (!listOfJuego.isEmpty()) {

			return true;
		} else {
			return false;
		}

	}

}
