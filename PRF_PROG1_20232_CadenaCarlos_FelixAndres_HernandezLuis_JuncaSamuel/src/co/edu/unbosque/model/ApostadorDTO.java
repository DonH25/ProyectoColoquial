package co.edu.unbosque.model;

public class ApostadorDTO {

	private String nombre;
	private long cedula;
	private String sedeJuego;
	private String direccion;
	private long celular;
	private int anoN;

	public ApostadorDTO() {
		// TODO Auto-generated constructor stub
	}

	public ApostadorDTO(String nombre, long cedula, String sedeJuego, String direccion, long celular, int anoN) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.sedeJuego = sedeJuego;
		this.direccion = direccion;
		this.celular = celular;
		this.anoN = anoN;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public String getSedeJuego() {
		return sedeJuego;
	}

	public void setSedeJuego(String sedeJuego) {
		this.sedeJuego = sedeJuego;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public int getAnoN() {
		return anoN;
	}

	public void setAnoN(int anoN) {
		this.anoN = anoN;
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + "\n" + "Cedula:" + cedula + "\n" + "Sede en donde esta jugando:" + sedeJuego + "\n"
				+ "Direccion:" + direccion + "\n" + "Celular=" + celular + "\n" + "anio nacimiento:" + anoN;
	}

}
