package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.LoteriaDTO;

public class LoteriaDAO implements CRUDOperation {

	/**
	 * Clase que representa un DAO (Data Access Object) para gestionar la
	 * persistencia de datos de sedes de casas de apuestas. Implementa la interfaz
	 * CRUDOperation para realizar operaciones de creación, lectura, actualización y
	 * eliminación de datos de sedes de casas de apuestas.
	 * 
	 * @see CRUDOperation
	 */
		ArrayList<LoteriaDTO> listOfLoteria;
		final String SERIAL_FILENAME = "casadeapuestas.dat";
		int index = 0;

		/**
		 * Constructor de SedeCasaDeApuestasDAO que inicializa la lista de sedes de
		 * casas de apuestas.
		 */
		public LoteriaDAO() {
			listOfLoteria = new ArrayList<LoteriaDTO>();

			if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
				Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);

				if (temp instanceof ArrayList<?>) {
					ArrayList<LoteriaDTO> temp2 = (ArrayList<LoteriaDTO>) temp;
					listOfLoteria = temp2;
				} else {
					System.out.println("El archivo " + SERIAL_FILENAME + " no contiene una lista de balotos.");
				}
			} else {
				listOfLoteria = new ArrayList<>();
			}
		}

		@Override
		public void create(String... args) {
			LoteriaDTO site = new LoteriaDTO();
			site.setNombreLoteria(args[0]);
			site.setDigito1(Integer.parseInt(args[1]));
			site.setDigito2(Integer.parseInt(args[2]));
			site.setDigito3(Integer.parseInt(args[3]));
			site.setDigito4(Integer.parseInt(args[4]));
			site.setSerieDig1(Integer.parseInt(args[5]));
			site.setSerieDig2(Integer.parseInt(args[6]));
			site.setSerieDig3(Integer.parseInt(args[7]));

			listOfLoteria.add(site);
			writeDataSerializable();
		}

		@Override
		public void create(Object o) {
			listOfLoteria.add((LoteriaDTO) o);
			writeDataSerializable();
		}

		@Override
		public String read() {
			index = 0;
			StringBuilder Sb = new StringBuilder();
			listOfLoteria.forEach(site -> {
				Sb.append(index + "->" + (site.toString() + "\n"));
				index++;
			});
			return Sb.toString();
		}

		@Override
		public boolean update(int index, String... args) {
			if (index < 0 || index >= listOfLoteria.size()) {
				return false;
			} else {
				if (!args[0].isBlank() || !args[0].isEmpty() || args[0] != null) {
					listOfLoteria.get(index).setNombreLoteria(args[0]);
				}
				if (!args[1].isBlank() || !args[1].isEmpty() || args[1] != null) {
					listOfLoteria.get(index).setDigito1(Integer.parseInt(args[1]));
				}
				if (!args[2].isBlank() || !args[2].isEmpty() || args[2] != null) {
					listOfLoteria.get(index).setDigito2(Integer.parseInt(args[2]));
				}
				if (!args[3].isBlank() || !args[3].isEmpty() || args[3] != null) {
					listOfLoteria.get(index).setDigito3(Integer.parseInt(args[3]));
				}
				if (!args[4].isBlank() || !args[4].isEmpty() || args[4] != null) {
					listOfLoteria.get(index).setDigito4(Integer.parseInt(args[4]));
				}
				if (!args[5].isBlank() || !args[5].isEmpty() || args[5] != null) {
					listOfLoteria.get(index).setSerieDig1(Integer.parseInt(args[5]));
				}
				if (!args[6].isBlank() || !args[6].isEmpty() || args[6] != null) {
					listOfLoteria.get(index).setSerieDig2(Integer.parseInt(args[6]));
				}
				if (!args[7].isBlank() || !args[7].isEmpty() || args[7] != null) {
					listOfLoteria.get(index).setSerieDig3(Integer.parseInt(args[7]));
				}
			}
			writeDataSerializable();
			return true;
		}

		@Override
		public boolean delete(int index) {
			if (index < 0 || index >= listOfLoteria.size()) {
				return false;
			} else {
				listOfLoteria.remove(index);
				writeDataSerializable();
				return true;
			}
		}

		@Override
		public boolean delete(Object o) {
			LoteriaDTO toDelete = (LoteriaDTO) o;
			if (listOfLoteria.contains(toDelete)) {
				listOfLoteria.remove(toDelete);
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
			FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, listOfLoteria);
		}

		/**
		 * Obtiene la lista de sedes de casas de apuestas.
		 *
		 * @return Lista de sedes de casas de apuestas.
		 */
		public ArrayList<LoteriaDTO> getListOfLocations() {
			return listOfLoteria;
		}

		/**
		 * Establece la lista de sedes de casas de apuestas.
		 *
		 * @param listOfLocations Lista de sedes de casas de apuestas.
		 */
		public void setListOfLocations(ArrayList<LoteriaDTO> listOfBalotos) {
			this.listOfLoteria = listOfBalotos;
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
