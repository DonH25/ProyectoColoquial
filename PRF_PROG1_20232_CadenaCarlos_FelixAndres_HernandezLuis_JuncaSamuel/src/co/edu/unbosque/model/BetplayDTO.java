package co.edu.unbosque.model;

import java.io.Serializable;

public class BetplayDTO extends JuegoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8763564016326743498L;
	private String equipoLocal;
	private int marcadorLocal;
	private String equipoVisitante;
	private int marcadorVisitante;
	public BetplayDTO() {
		// TODO Auto-generated constructor stub
	}
	public BetplayDTO(String equipoLocal, int marcadorLocal, String equipoVisitante, int marcadorVisitante) {
		super();
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
	}
	public BetplayDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego, String equipoLocal,
			int marcadorLocal, String equipoVisitante, int marcadorVisitante) {
		super(nombreJuego, tipoDejuego, presupuestoDelJuego);
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
	}
	public BetplayDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
			String tipoDejuego, double presupuestoDelJuego, String equipoLocal, int marcadorLocal,
			String equipoVisitante, int marcadorVisitante) {
		super(direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego, presupuestoDelJuego);
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
	}
	public BetplayDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego,
			String equipoLocal, int marcadorLocal, String equipoVisitante, int marcadorVisitante) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados, nombreJuego,
				tipoDejuego, presupuestoDelJuego);
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
	}
	public BetplayDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
			double presupuestoDelJuego, String equipoLocal, int marcadorLocal, String equipoVisitante,
			int marcadorVisitante) {
		super(nombre, numeroDeSedes, presupuestoTotal, nombreJuego, tipoDejuego, presupuestoDelJuego);
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
	}
	public BetplayDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String equipoLocal, int marcadorLocal, String equipoVisitante,
			int marcadorVisitante) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
	}
	public BetplayDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String equipoLocal, int marcadorLocal,
			String equipoVisitante, int marcadorVisitante) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
	}
	public BetplayDTO(String direccion, String barrio, String localidad, long numEmpleados, String equipoLocal,
			int marcadorLocal, String equipoVisitante, int marcadorVisitante) {
		super(direccion, barrio, localidad, numEmpleados);
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
	}
	
	public BetplayDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
			double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal, nombreJuego, tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}
	public BetplayDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego,
				presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}
	public BetplayDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
		// TODO Auto-generated constructor stub
	}
	public BetplayDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		// TODO Auto-generated constructor stub
	}
	public BetplayDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super(nombreJuego, tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}
	public BetplayDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
			String tipoDejuego, double presupuestoDelJuego) {
		super(direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}
	public BetplayDTO(String direccion, String barrio, String localidad, long numEmpleados) {
		super(direccion, barrio, localidad, numEmpleados);
		// TODO Auto-generated constructor stub
	}
	public String getEquipoLocal() {
		return equipoLocal;
	}
	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public int getMarcadorLocal() {
		return marcadorLocal;
	}
	public void setMarcadorLocal(int marcadorLocal) {
		this.marcadorLocal = marcadorLocal;
	}
	public String getEquipoVisitante() {
		return equipoVisitante;
	}
	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	public int getMarcadorVisitante() {
		return marcadorVisitante;
	}
	public void setMarcadorVisitante(int marcadorVisitante) {
		this.marcadorVisitante = marcadorVisitante;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "BetplayDTO [equipoLocal=" + equipoLocal + ", marcadorLocal=" + marcadorLocal + ", equipoVisitante="
				+ equipoVisitante + ", marcadorVisitante=" + marcadorVisitante + "]";
	}
	
	
	
	
}
