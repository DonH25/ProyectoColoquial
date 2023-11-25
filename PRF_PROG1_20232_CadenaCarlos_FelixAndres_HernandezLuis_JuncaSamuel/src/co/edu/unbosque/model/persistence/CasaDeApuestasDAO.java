package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CasaDeApuestasDTO;

/**
 * Clase que representa un DAO (Data Access Object) para gestionar la
 * persistencia de datos de casas de apuestas. Implementa la interfaz
 * CRUDOperation para realizar operaciones de creación, lectura, actualización y
 * eliminación de datos de casas de apuestas.
 *
 * @see CRUDOperation
 */

public class CasaDeApuestasDAO implements CRUDOperation {
	ArrayList<CasaDeApuestasDTO> listOfCasa;
	int index = 0;
	CasaDeApuestasProperties prop;

	/**
	 * Constructor por defecto para CasaDeApuestasDAO. Inicializa las propiedades de
	 * la casa de apuestas y la lista de casas de apuestas.
	 */

	public CasaDeApuestasDAO() {
		prop = new CasaDeApuestasProperties();
		listOfCasa = new ArrayList<CasaDeApuestasDTO>();
	}

	/**
	 * Crea una nueva casa de apuestas y la añade a la lista de casas de apuestas.
	 * También escribe las propiedades de la nueva casa de apuestas.
	 *
	 * @param args Los argumentos utilizados para crear la nueva casa de apuestas.
	 *             args[0] es el nombre de la casa de apuestas. args[1] es el número
	 *             de sedes de la casa de apuestas. args[2] es el presupuesto total
	 *             de la casa de apuestas.
	 * @throws NumberFormatException si args[1] o args[2] no pueden ser convertidos
	 *                               a un número.
	 */
	@Override
	public void create(String... args) {
		CasaDeApuestasDTO casas = new CasaDeApuestasDTO();
		casas.setNombre(args[0]);
		casas.setNumeroDeSedes(Integer.parseInt(args[1]));
		casas.setPresupuestoTotal(Double.parseDouble(args[2]));
		listOfCasa.add(casas);
		prop.escribirProperties(args[0], args[1], args[2]);
	}

	/**
	 * Añade una nueva casa de apuestas a la lista de casas de apuestas.
	 *
	 * @param o El objeto que se va a añadir a la lista de casas de apuestas. Debe
	 *          ser de tipo CasaDeApuestasDTO.
	 * @throws ClassCastException si el objeto no es de tipo CasaDeApuestasDTO.
	 */
	@Override
	public void create(Object o) {
		listOfCasa.add((CasaDeApuestasDTO) o);
	}

	/**
	 * Lee y devuelve una representación de cadena de todas las casas de apuestas en
	 * la lista.
	 *
	 * @return Una cadena que representa todas las casas de apuestas en la lista.
	 *         Cada casa de apuestas se representa en una nueva línea con su índice
	 *         en la lista seguido de '->' y su representación de cadena.
	 */
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

	/**
	 * Actualiza la casa de apuestas en el índice especificado con los nuevos
	 * argumentos proporcionados.
	 *
	 * @param index El índice de la casa de apuestas en la lista que se va a
	 *              actualizar.
	 * @param args  Los nuevos argumentos para la casa de apuestas. args[0] es el
	 *              nuevo nombre de la casa de apuestas. args[1] es el nuevo número
	 *              de sedes de la casa de apuestas. args[2] es el nuevo presupuesto
	 *              total de la casa de apuestas.
	 * @return Verdadero si la casa de apuestas se actualizó con éxito, falso si el
	 *         índice es inválido.
	 * @throws NumberFormatException si args[1] o args[2] no pueden ser convertidos
	 *                               a un número.
	 */
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

	/**
	 * Comprueba si existen casas de apuestas en la lista.
	 *
	 * @return Verdadero si la lista de casas de apuestas no está vacía, falso en
	 *         caso contrario.
	 */

	public boolean casaExiste() {
		if (!listOfCasa.isEmpty()) {

			return true;
		} else {
			return false;
		}

	}

	/**
	 * Carga las propiedades de la casa de apuestas desde un archivo de propiedades
	 * y crea una nueva casa de apuestas con estas propiedades.
	 */
	public void cargarPropertiesDeLaCasa() {
		prop.inicializarProperties();
		CasaDeApuestasDTO casa = new CasaDeApuestasDTO();
		casa.setNombre(prop.getNombre());
		casa.setNumeroDeSedes(Integer.parseInt(prop.getSedes()));
		casa.setPresupuestoTotal(Integer.parseInt(prop.getPresupuestoTotal()));

	}

	/**
	 * Obtiene la lista de casas de apuestas.
	 *
	 * @return La lista de casas de apuestas.
	 */
	public ArrayList<CasaDeApuestasDTO> getListOfCasa() {
		return listOfCasa;
	}

	/**
	 * Establece la lista de casas de apuestas.
	 *
	 * @param listOfCasa La nueva lista de casas de apuestas.
	 */
	public void setListOfCasa(ArrayList<CasaDeApuestasDTO> listOfCasa) {
		this.listOfCasa = listOfCasa;
	}

	/**
	 * Obtiene el índice actual.
	 *
	 * @return El índice actual.
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Establece el índice actual.
	 *
	 * @param index El nuevo índice.
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Elimina la casa de apuestas en el índice especificado.
	 *
	 * @param index El índice de la casa de apuestas en la lista que se va a
	 *              eliminar.
	 * @return Verdadero si la casa de apuestas se eliminó con éxito, falso si el
	 *         índice es inválido.
	 */
	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Elimina la casa de apuestas especificada de la lista.
	 *
	 * @param o La casa de apuestas que se va a eliminar de la lista. Debe ser de
	 *          tipo CasaDeApuestasDTO.
	 * @return Verdadero si la casa de apuestas se eliminó con éxito, falso si la
	 *         casa de apuestas no se encontró en la lista.
	 * @throws ClassCastException si el objeto no es de tipo CasaDeApuestasDTO.
	 */
	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
}
