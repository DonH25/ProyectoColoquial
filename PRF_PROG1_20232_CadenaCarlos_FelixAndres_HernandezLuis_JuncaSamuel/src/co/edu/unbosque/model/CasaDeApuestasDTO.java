package co.edu.unbosque.model;

import java.io.Serializable;

public class CasaDeApuestasDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4698655269197423988L;
	private String nombre;
	private int numeroDeSedes;
	private double presupuestoTotal;
	public CasaDeApuestasDTO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de la clase CasaDeApuestasDTO.
	 *
	 * @param nombre            Nombre de la casa de apuestas.
	 * @param numeroDeSedes     Número de sedes de la casa de apuestas.
	 * @param presupuestoTotal  Presupuesto total de la casa de apuestas.
	 */
	public CasaDeApuestasDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
		super();
		this.nombre = nombre;
		this.numeroDeSedes = numeroDeSedes;
		this.presupuestoTotal = presupuestoTotal;
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
	 * @param nombre El nombre a establecer para la casa de apuestas.
	 */
	/**
	 * Obtiene el número de sedes de la casa de apuestas.
	 *
	 * @return El número de sedes de la casa de apuestas.
	 */
	/**
	 * Establece el número de sedes de la casa de apuestas.
	 *
	 * @param numeroDeSedes El número de sedes a establecer para la casa de apuestas.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtiene el presupuesto total de la casa de apuestas.
	 *
	 * @return El presupuesto total de la casa de apuestas.
	 */
	public int getNumeroDeSedes() {
		return numeroDeSedes;
	}
	/**
	 * Establece el presupuesto total de la casa de apuestas.
	 *
	 * @param presupuestoTotal El presupuesto total a establecer para la casa de apuestas.
	 */
	public void setNumeroDeSedes(int numeroDeSedes) {
		this.numeroDeSedes = numeroDeSedes;
	}
	/**
	 * Obtiene el serialVersionUID.
	 *
	 * @return El valor de serialVersionUID.
	 */
	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}
	/**
	 * Genera una representación en forma de cadena (string) de la casa de apuestas.
	 *
	 * @return Una representación en cadena que contiene el nombre, número de sedes y presupuesto total de la casa de apuestas.
	 */
	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * Devuelve una representación en forma de cadena de la casa de apuestas.
	 *
	 * @return Una cadena que contiene información sobre el nombre, número de sedes y presupuesto total de la casa de apuestas.
	 */
	@Override
	public String toString() {
		return "nombre de la casa =" + nombre + ", numeroDeSedes=" + numeroDeSedes + ", presupuestoTotal="
				+ presupuestoTotal + "\n";
	}
	
	

}
