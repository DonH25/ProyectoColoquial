package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CasaDeApuestasProperties {

	private String nombre;
	private String sedes;
	private String presupuestoTotal;
	private String file;
	private Properties prop;

	public CasaDeApuestasProperties() {
		prop = new Properties();
		file = "src/co/edu/unbosque/model/persistence/config.properties";
	}

	public int escribirProperties(String nombre, String sedes, String presupuestoTotal) {
		try {
			prop.setProperty("NombreCasaDeApuestas", nombre);
			prop.setProperty("CantidadDeSedesDeLaCasa", sedes);
			prop.setProperty("presupuestoTotalCasa", presupuestoTotal);
			prop.store(new FileOutputStream(file), null);
		} catch (IOException ex) {
			ex.printStackTrace();
			return -1;
		}
		return 0;
	}

	public int modificarProperties(String nombre, String sedes, String presupuestoTotal) {
		try {
			prop.load(new FileInputStream(file));
			prop.setProperty("NombreCasaDeApuestas", nombre);
			prop.setProperty("CantidadDeSedesDeLaCasa", sedes);
			prop.setProperty("presupuestoTotalCasa", presupuestoTotal);
			prop.store(new FileOutputStream(file), null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

	public int inicializarProperties() {
		try {
			prop.load(new FileInputStream(file));
			nombre = prop.getProperty("NombreCasaDeApuestas", "");
			sedes = prop.getProperty("CantidadDeSedesDeLaCasa", "");
			presupuestoTotal = prop.getProperty("presupuestoTotalCasa", "");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
}
