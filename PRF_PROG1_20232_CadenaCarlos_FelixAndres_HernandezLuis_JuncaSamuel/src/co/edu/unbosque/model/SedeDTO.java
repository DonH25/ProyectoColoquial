package co.edu.unbosque.model;

public class SedeDTO {

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
		return "Direccion De La Sede : " + direccion + ", Barrio de la sede :" + barrio + ", Localidad de la sede : " + localidad + ", numero de Empleados :"
				+ numEmpleados + "\n";
	}
	
}
