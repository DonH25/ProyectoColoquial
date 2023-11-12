package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

	private static Scanner fileReader;
	private static PrintWriter fileWriter;
	private static File myFile;

	public FileHandler() {
		// TODO Auto-generated constructor stub
	}

	public static String openAndReadFile(String url) {
		myFile = new File("src/co/edu/unbosque/model/persistence/" + url);
		String contenido = "";
		try {
			if (!myFile.exists()) {
				myFile.createNewFile();
			}

			fileReader = new Scanner(myFile);
			while (fileReader.hasNext()) {

				contenido += fileReader.nextLine() + "\n";
			}
			fileReader.close();

		} catch (IOException e) {
			System.out.println("Problema al crear el archivo, revise problemas de acceso.");
		}
		return contenido;
	}

	public static void openAndWriteFile(String url, String contentToWrite) {
		myFile = new File("src/co/edu/unbosque/model/persistence/" + url);
		myFile.delete();
		try {
			if (!myFile.exists()) {
				myFile.createNewFile();
			}
			fileWriter = new PrintWriter(myFile);
			fileWriter.write(contentToWrite);
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Problema al crear el archivo, revise problemas de acceso.");
		}
	}

}
