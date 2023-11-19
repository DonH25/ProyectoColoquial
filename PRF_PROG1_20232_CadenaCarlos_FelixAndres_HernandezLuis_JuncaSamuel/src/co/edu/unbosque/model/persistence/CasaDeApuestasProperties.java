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
	
	public CasaDeApuestasProperties(String nombre, String sedes, String presupuestoTotal, String file,
			Properties prop) {
		super();
		this.nombre = nombre;
		this.sedes = sedes;
		this.presupuestoTotal = presupuestoTotal;
		this.file = file;
		this.prop = prop;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSedes() {
		return sedes;
	}

	public void setSedes(String sedes) {
		this.sedes = sedes;
	}

	public String getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(String presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
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
