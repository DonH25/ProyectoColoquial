package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.List;
import java.util.Properties;

import co.edu.unbosque.model.CasaDeApuestasDTO;

/**
 * La clase FileHandler ofrece métodos para gestionar operaciones de archivos,
 * incluyendo la serialización (lectura y escritura de objetos) y la
 * administración de archivos de propiedades.
 */
public class FileHandler {

	private static FileInputStream fis;
	private static ObjectInputStream ois;

	private static FileOutputStream fos;
	private static ObjectOutputStream oos;

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

}
