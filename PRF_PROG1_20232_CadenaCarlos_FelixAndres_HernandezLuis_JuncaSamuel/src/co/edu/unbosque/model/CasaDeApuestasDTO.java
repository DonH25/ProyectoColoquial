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
	public CasaDeApuestasDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
		super();
		this.nombre = nombre;
		this.numeroDeSedes = numeroDeSedes;
		this.presupuestoTotal = presupuestoTotal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroDeSedes() {
		return numeroDeSedes;
	}
	public void setNumeroDeSedes(int numeroDeSedes) {
		this.numeroDeSedes = numeroDeSedes;
	}
	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}
	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "nombre de la casa =" + nombre + ", numeroDeSedes=" + numeroDeSedes + ", presupuestoTotal="
				+ presupuestoTotal + "\n";
	}
	
	

}
