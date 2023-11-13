package co.edu.unbosque.model;

import java.io.Serializable;

public class ChanceDTO extends JuegoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6664159118448864908L;
	private int digito1;
	private int digito2;
	private int digito3;
	private int digito4;
	public ChanceDTO() {
		// TODO Auto-generated constructor stub
	}
	public ChanceDTO(int digito1, int digito2, int digito3, int digito4) {
		super();
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
	}
	public ChanceDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego, int digito1, int digito2,
			int digito3, int digito4) {
		super(nombreJuego, tipoDejuego, presupuestoDelJuego);
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
	}
	public ChanceDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
			String tipoDejuego, double presupuestoDelJuego, int digito1, int digito2, int digito3, int digito4) {
		super(direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego, presupuestoDelJuego);
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
	}
	public ChanceDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego,
			int digito1, int digito2, int digito3, int digito4) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados, nombreJuego,
				tipoDejuego, presupuestoDelJuego);
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
	}
	public ChanceDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
			double presupuestoDelJuego, int digito1, int digito2, int digito3, int digito4) {
		super(nombre, numeroDeSedes, presupuestoTotal, nombreJuego, tipoDejuego, presupuestoDelJuego);
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
	}
	public ChanceDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, int digito1, int digito2, int digito3, int digito4) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
	}
	public ChanceDTO(String nombre, int numeroDeSedes, double presupuestoTotal, int digito1, int digito2, int digito3,
			int digito4) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
	}
	public ChanceDTO(String direccion, String barrio, String localidad, long numEmpleados, int digito1, int digito2,
			int digito3, int digito4) {
		super(direccion, barrio, localidad, numEmpleados);
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
	}
	public ChanceDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
			double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal, nombreJuego, tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}
	public ChanceDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego,
				presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}
	public ChanceDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
		// TODO Auto-generated constructor stub
	}
	public ChanceDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		// TODO Auto-generated constructor stub
	}
	public ChanceDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super(nombreJuego, tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}
	public ChanceDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
			String tipoDejuego, double presupuestoDelJuego) {
		super(direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}
	public ChanceDTO(String direccion, String barrio, String localidad, long numEmpleados) {
		super(direccion, barrio, localidad, numEmpleados);
		// TODO Auto-generated constructor stub
	}
	public int getDigito1() {
		return digito1;
	}
	public void setDigito1(int digito1) {
		this.digito1 = digito1;
	}
	public int getDigito2() {
		return digito2;
	}
	public void setDigito2(int digito2) {
		this.digito2 = digito2;
	}
	public int getDigito3() {
		return digito3;
	}
	public void setDigito3(int digito3) {
		this.digito3 = digito3;
	}
	public int getDigito4() {
		return digito4;
	}
	public void setDigito4(int digito4) {
		this.digito4 = digito4;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ChanceDTO [digito1=" + digito1 + ", digito2=" + digito2 + ", digito3=" + digito3 + ", digito4="
				+ digito4 + "]";
	}
	

}
