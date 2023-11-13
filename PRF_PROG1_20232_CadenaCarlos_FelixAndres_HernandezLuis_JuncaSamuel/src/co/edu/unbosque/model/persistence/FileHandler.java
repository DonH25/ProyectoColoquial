
/**
 * La clase FileHandler proporciona métodos para manejar operaciones de archivos,
 * incluyendo serialización (lectura y escritura de objetos) y gestión de archivos de propiedades.
 */
package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.List;
import java.util.Properties;

import co.edu.unbosque.model.CasaDeApuestasDTO;

public class FileHandler {

	// Flujo de entrada para deserialización
	private static FileInputStream fis;
	private static ObjectInputStream ois;

	// Flujo de salida para serialización
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;

	// Archivo de propiedades
	private static Properties propFile;

	/**
	 * Constructor predeterminado para la clase FileHandler.
	 */
	public FileHandler() {

	}

	/**
	 * Lee un archivo serializado y devuelve su contenido como un objeto.
	 *
	 * @param fileName El nombre del archivo serializado.
	 * @return El objeto deserializado leído desde el archivo.
	 */
	public static Object serializableOpenAndReadFile(String fileName) {
		try {
			fis = new FileInputStream(new File("src/co/edu/unbosque/model/persistence/" + fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Archivo serializado no encontrado, creándolo ahora.");
			File temp = new File("src/co/edu/unbosque/model/persistence/" + fileName);
			try {
				temp.createNewFile();
				fis = new FileInputStream(new File("src/co/edu/unbosque/model/persistence/" + fileName));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

		Object content = null;

		try {
			ois = new ObjectInputStream(fis);
			content = ois.readObject();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return content;
	}

	/**
	 * Escribe un objeto en un archivo serializado.
	 *
	 * @param fileName El nombre del archivo serializado.
	 * @param content  El objeto que se serializará y escribirá en el archivo.
	 */
	public static void serializableOpenAndWriteFile(String fileName, Object content) {
		try {
			fos = new FileOutputStream(new File("src/co/edu/unbosque/model/persistence/" + fileName));
		} catch (FileNotFoundException e) {
			File temp = new File("src/co/edu/unbosque/model/persistence/" + fileName);
			try {
				fos = new FileOutputStream(temp);
			} catch (FileNotFoundException e1) {
				System.out.println("Problemas al crear o buscar el archivo serializado (escritura).");
				e1.printStackTrace();
			}
		}

		try {
			oos = new ObjectOutputStream(fos);
			oos.writeObject(content);
			oos.close();
		} catch (IOException e) {
			System.out.println("Problema al abrir el archivo serializado (escritura).");
		}
	}

	/**
	 * Escribe una lista de objetos CasaDeApuestasDTO en un archivo de propiedades.
	 *
	 * @param fileName El nombre del archivo de propiedades.
	 * @param casas    La lista de objetos CasaDeApuestasDTO que se escribirán en el
	 *                 archivo.
	 */
	public static void propertiesOpenAndWriteFile(String fileName, List<CasaDeApuestasDTO> casas) {
		FileOutputStream fos = null;
		Properties propFile = new Properties();

		try {
			fos = new FileOutputStream(new File("src/co/edu/unbosque/model/persistence/" + fileName));

			for (CasaDeApuestasDTO casa : casas) {
				propFile.setProperty("NombreDeCasaDeAouestas", casa.getNombre());
				propFile.setProperty("NumeroDeSedes", String.valueOf(casa.getNumeroDeSedes()));
				propFile.setProperty("PresupuestoTotal", String.valueOf(casa.getPresupuestoTotal()));
			}

			propFile.store(fos, "Archivo de propiedades");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Problemas al crear o buscar el archivo config.properties (escritura).");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Lee un archivo de propiedades y devuelve su contenido como un objeto
	 * Properties.
	 *
	 * @param fileName El nombre del archivo de propiedades.
	 * @return El objeto Properties leído desde el archivo.
	 */
	public static Properties propertiesOpenAndReadFile(String fileName) {
		Properties properties = new Properties();
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("src/co/edu/unbosque/model/persistence/" + fileName);
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Problemas al leer el archivo " + fileName);
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return properties;
	}
}
