package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CasaDeApuestasDTO;

public class CasaDeApuestasDAO implements CRUDOperation {
	ArrayList<CasaDeApuestasDTO> listOfCasa;
	int index = 0;
	CasaDeApuestasProperties prop;

	public CasaDeApuestasDAO() {
		prop = new CasaDeApuestasProperties();
		listOfCasa = new ArrayList<CasaDeApuestasDTO>();
	}

	@Override
	public void create(String... args) {
		CasaDeApuestasDTO casas = new CasaDeApuestasDTO();
		casas.setNombre(args[0]);
		casas.setNumeroDeSedes(Integer.parseInt(args[1]));
		casas.setPresupuestoTotal(Double.parseDouble(args[2]));
		listOfCasa.add(casas);
		prop.escribirProperties(args[0], args[1], args[2]);
	}

	@Override
	public void create(Object o) {
		listOfCasa.add((CasaDeApuestasDTO) o);
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
		prop.modificarProperties(args[0], args[1], args[2]);
		return true;
	}

	public boolean casaExiste() {
		if (!listOfCasa.isEmpty()) {

			return true;
		} else {
			return false;
		}

	}

	public void cargarPropertiesDeLaCasa() {
		prop.inicializarProperties();
		CasaDeApuestasDTO casa = new CasaDeApuestasDTO();
		casa.setNombre(prop.getNombre());
		casa.setNumeroDeSedes(Integer.parseInt(prop.getSedes()));
		casa.setPresupuestoTotal(Integer.parseInt(prop.getPresupuestoTotal()));

	}

	public ArrayList<CasaDeApuestasDTO> getListOfCasa() {
		return listOfCasa;
	}

	public void setListOfCasa(ArrayList<CasaDeApuestasDTO> listOfCasa) {
		this.listOfCasa = listOfCasa;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
}
