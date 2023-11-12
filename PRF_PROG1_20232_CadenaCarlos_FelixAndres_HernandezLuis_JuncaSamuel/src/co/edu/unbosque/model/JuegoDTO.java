package co.edu.unbosque.model;

import java.io.Serializable;

public class JuegoDTO extends SedeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4663134442682867443L;
	private String nombreJuego;
	private String tipoDejuego;
	private double presupuestoDelJuego;
	public JuegoDTO() {
		// TODO Auto-generated constructor stub
	}
	public JuegoDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super();
		this.nombreJuego = nombreJuego;
		this.tipoDejuego = tipoDejuego;
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	public JuegoDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
			String tipoDejuego, double presupuestoDelJuego) {
		super(direccion, barrio, localidad, numEmpleados);
		this.nombreJuego = nombreJuego;
		this.tipoDejuego = tipoDejuego;
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	public JuegoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
		this.nombreJuego = nombreJuego;
		this.tipoDejuego = tipoDejuego;
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	public JuegoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
			double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		this.nombreJuego = nombreJuego;
		this.tipoDejuego = tipoDejuego;
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	public JuegoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
		// TODO Auto-generated constructor stub
	}
	public JuegoDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		// TODO Auto-generated constructor stub
	}
	public JuegoDTO(String direccion, String barrio, String localidad, long numEmpleados) {
		super(direccion, barrio, localidad, numEmpleados);
		// TODO Auto-generated constructor stub
	}
	public String getNombreJuego() {
		return nombreJuego;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	public String getTipoDejuego() {
		return tipoDejuego;
	}
	public void setTipoDejuego(String tipoDejuego) {
		this.tipoDejuego = tipoDejuego;
	}
	public double getPresupuestoDelJuego() {
		return presupuestoDelJuego;
	}
	public void setPresupuestoDelJuego(double presupuestoDelJuego) {
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "JuegoDTO [nombreJuego=" + nombreJuego + ", tipoDejuego=" + tipoDejuego + ", presupuestoDelJuego="
				+ presupuestoDelJuego + "]";
	}
	

}
