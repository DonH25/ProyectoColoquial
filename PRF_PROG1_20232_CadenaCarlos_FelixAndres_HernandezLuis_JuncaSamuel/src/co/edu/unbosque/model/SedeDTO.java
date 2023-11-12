package co.edu.unbosque.model;

import java.io.Serializable;

public class SedeDTO extends CasaDeApuestasDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7746285034070948749L;
	private String direccion;
	private String barrio;
	private String localidad;
	private long numEmpleados;

	public SedeDTO() {
		// TODO Auto-generated constructor stub
	}

	public SedeDTO(String direccion, String barrio, String localidad, long numEmpleados) {
		super();
		this.direccion = direccion;
		this.barrio = barrio;
		this.localidad = localidad;
		this.numEmpleados = numEmpleados;
	}

	public SedeDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		this.direccion = direccion;
		this.barrio = barrio;
		this.localidad = localidad;
		this.numEmpleados = numEmpleados;
	}

	public SedeDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		// TODO Auto-generated constructor stub
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public long getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(long numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	@Override
	public String toString() {
		return "Direccion De La Sede : " + direccion + ", Barrio de la sede :" + barrio + ", Localidad de la sede : "
				+ localidad + ", numero de Empleados :" + numEmpleados + "\n";
	}

}
