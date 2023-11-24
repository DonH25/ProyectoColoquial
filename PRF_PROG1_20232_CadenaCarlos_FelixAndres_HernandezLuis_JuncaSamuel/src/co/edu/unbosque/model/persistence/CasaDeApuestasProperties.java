package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * La clase CasaDeApuestasProperties maneja las propiedades de una casa de
 * apuestas.
 */
public class CasaDeApuestasProperties {

	private String nombre;
	private String sedes;
	private String presupuestoTotal;
	private String file;
	private Properties prop;

	/**
	 * Constructor por defecto para CasaDeApuestasProperties. Inicializa las
	 * propiedades y establece el archivo de propiedades.
	 */
	public CasaDeApuestasProperties() {
		prop = new Properties();
		file = "src/co/edu/unbosque/model/persistence/config.properties";
	}

	/**
	 * Constructor para CasaDeApuestasProperties.
	 *
	 * @param nombre           El nombre de la casa de apuestas.
	 * @param sedes            El número de sedes de la casa de apuestas.
	 * @param presupuestoTotal El presupuesto total de la casa de apuestas.
	 * @param file             La ruta del archivo de propiedades.
	 * @param prop             Las propiedades de la casa de apuestas.
	 */
	public CasaDeApuestasProperties(String nombre, String sedes, String presupuestoTotal, String file,
			Properties prop) {
		super();
		this.nombre = nombre;
		this.sedes = sedes;
		this.presupuestoTotal = presupuestoTotal;
		this.file = file;
		this.prop = prop;
	}

	/**
	 * Obtiene el nombre de la casa de apuestas.
	 *
	 * @return El nombre de la casa de apuestas.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la casa de apuestas.
	 *
	 * @param nombre El nuevo nombre de la casa de apuestas.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el número de sedes de la casa de apuestas.
	 *
	 * @return El número de sedes de la casa de apuestas.
	 */
	public String getSedes() {
		return sedes;
	}

	/**
	 * Establece el número de sedes de la casa de apuestas.
	 *
	 * @param sedes El nuevo número de sedes de la casa de apuestas.
	 */
	public void setSedes(String sedes) {
		this.sedes = sedes;
	}

	/**
	 * Obtiene el presupuesto total de la casa de apuestas.
	 *
	 * @return El presupuesto total de la casa de apuestas.
	 */
	public String getPresupuestoTotal() {
		return presupuestoTotal;
	}

	/**
	 * Establece el presupuesto total de la casa de apuestas.
	 *
	 * @param presupuestoTotal El nuevo presupuesto total de la casa de apuestas.
	 */
	public void setPresupuestoTotal(String presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	/**
	 * Obtiene la ruta del archivo de propiedades.
	 *
	 * @return La ruta del archivo de propiedades.
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Establece la ruta del archivo de propiedades.
	 *
	 * @param file La nueva ruta del archivo de propiedades.
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * Obtiene las propiedades de la casa de apuestas.
	 *
	 * @return Las propiedades de la casa de apuestas.
	 */
	public Properties getProp() {
		return prop;
	}

	/**
	 * Establece las propiedades de la casa de apuestas.
	 *
	 * @param prop Las nuevas propiedades de la casa de apuestas.
	 */
	public void setProp(Properties prop) {
		this.prop = prop;
	}

	/**
	 * Escribe las propiedades de la casa de apuestas en un archivo de propiedades.
	 *
	 * @param nombre           El nombre de la casa de apuestas.
	 * @param sedes            El número de sedes de la casa de apuestas.
	 * @param presupuestoTotal El presupuesto total de la casa de apuestas.
	 * @return 0 si las propiedades se escribieron con éxito, -1 si ocurrió una
	 *         excepción.
	 */
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

	/**
	 * Modifica las propiedades de la casa de apuestas en un archivo de propiedades
	 * existente.
	 *
	 * @param nombre           El nuevo nombre de la casa de apuestas.
	 * @param sedes            El nuevo número de sedes de la casa de apuestas.
	 * @param presupuestoTotal El nuevo presupuesto total de la casa de apuestas.
	 * @return 0 si las propiedades se modificaron con éxito, -1 si ocurrió una
	 *         excepción.
	 */
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

	/**
	 * Inicializa las propiedades de la casa de apuestas desde un archivo de
	 * propiedades existente.
	 *
	 * @return 0 si las propiedades se inicializaron con éxito, -1 si ocurrió una
	 *         excepción.
	 */
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
