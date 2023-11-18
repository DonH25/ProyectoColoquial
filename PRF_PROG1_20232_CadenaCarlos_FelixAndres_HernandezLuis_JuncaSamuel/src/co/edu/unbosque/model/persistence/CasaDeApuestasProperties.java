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
	private Properties properties;

	public CasaDeApuestasProperties() {
		properties = new Properties();
		file = "src/co/edu/unbosque/model/persistence/config.properties";
	}

	public int escribirProperties(String nombre, String sedes, String presupuestoTotal) {
		try {
			properties.setProperty("Nombre Casa De Apuestas: ", nombre);
			properties.setProperty("Cantidad de sedes de la Casa: ", sedes);
			properties.setProperty("presupuesto Total de la Casa: ", presupuestoTotal);
			properties.store(new FileOutputStream(file), null);
		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}

	public int modificarProperties(String nombre, String sedes, String presupuestoTotal) {
		try {
			properties.load(new FileInputStream(file));
			properties.setProperty("Nombre Casa De Apuestas: ", nombre);
			properties.setProperty("Cantidad de sedes de la Casa: ", sedes);
			properties.setProperty("presupuesto Total de la Casa: ", presupuestoTotal);
			properties.store(new FileOutputStream(file), null);
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
			properties.load(new FileInputStream(file));
			properties.setProperty("Nombre Casa De Apuestas: ", nombre);
			properties.setProperty("Cantidad de sedes de la Casa: ", sedes);
			properties.setProperty("presupuesto Total de la Casa: ", presupuestoTotal);
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
