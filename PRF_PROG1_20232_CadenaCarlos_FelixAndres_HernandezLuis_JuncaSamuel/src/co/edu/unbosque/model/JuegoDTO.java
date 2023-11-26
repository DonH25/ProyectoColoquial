package co.edu.unbosque.model;

import java.io.Serializable;

public class JuegoDTO extends SedeDTO implements Serializable {

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
	/**
	 * Constructor de la clase JuegoDTO para inicializar un juego con su información básica.
	 *
	 * @param nombreJuego       Nombre del juego.
	 * @param tipoDejuego       Tipo de juego.
	 * @param presupuestoDelJuego Presupuesto del juego.
	 */
	public JuegoDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super();
		this.nombreJuego = nombreJuego;
		this.tipoDejuego = tipoDejuego;
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	/**
	 * Constructor de la clase JuegoDTO para inicializar un juego con información detallada y heredada de un establecimiento.
	 *
	 * @param direccion          Dirección del establecimiento del juego.
	 * @param barrio             Barrio del establecimiento del juego.
	 * @param localidad          Localidad del establecimiento del juego.
	 * @param numEmpleados       Número de empleados del establecimiento del juego.
	 * @param nombreJuego        Nombre del juego.
	 * @param tipoDejuego        Tipo de juego.
	 * @param presupuestoDelJuego Presupuesto del juego.
	 */
	public JuegoDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
			String tipoDejuego, double presupuestoDelJuego) {
		super(direccion, barrio, localidad, numEmpleados);
		this.nombreJuego = nombreJuego;
		this.tipoDejuego = tipoDejuego;
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	/**
	 * Constructor de la clase JuegoDTO para inicializar un juego con información detallada de la casa de apuestas y del juego.
	 *
	 * @param nombre             Nombre de la casa de apuestas.
	 * @param numeroDeSedes      Número de sedes de la casa de apuestas.
	 * @param presupuestoTotal   Presupuesto total de la casa de apuestas.
	 * @param direccion          Dirección del establecimiento del juego.
	 * @param barrio             Barrio del establecimiento del juego.
	 * @param localidad          Localidad del establecimiento del juego.
	 * @param numEmpleados       Número de empleados del establecimiento del juego.
	 * @param nombreJuego        Nombre del juego.
	 * @param tipoDejuego        Tipo de juego.
	 * @param presupuestoDelJuego Presupuesto del juego.
	 */
	public JuegoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
		this.nombreJuego = nombreJuego;
		this.tipoDejuego = tipoDejuego;
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	/**
	 * Constructor de la clase JuegoDTO para inicializar un juego con información básica de la casa de apuestas y del juego.
	 *
	 * @param nombre             Nombre de la casa de apuestas.
	 * @param numeroDeSedes      Número de sedes de la casa de apuestas.
	 * @param presupuestoTotal   Presupuesto total de la casa de apuestas.
	 * @param nombreJuego        Nombre del juego.
	 * @param tipoDejuego        Tipo de juego.
	 * @param presupuestoDelJuego Presupuesto del juego.
	 */
	public JuegoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
			double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		this.nombreJuego = nombreJuego;
		this.tipoDejuego = tipoDejuego;
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	/**
	 * Constructor de la clase JuegoDTO para inicializar un juego con información detallada heredada de la casa de apuestas.
	 *
	 * @param nombre          Nombre de la casa de apuestas.
	 * @param numeroDeSedes   Número de sedes de la casa de apuestas.
	 * @param presupuestoTotal Presupuesto total de la casa de apuestas.
	 * @param direccion       Dirección del establecimiento del juego.
	 * @param barrio          Barrio del establecimiento del juego.
	 * @param localidad       Localidad del establecimiento del juego.
	 * @param numEmpleados    Número de empleados del establecimiento del juego.
	 */
	public JuegoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de la clase JuegoDTO para inicializar un juego con información básica de la casa de apuestas.
	 *
	 * @param nombre          Nombre de la casa de apuestas.
	 * @param numeroDeSedes   Número de sedes de la casa de apuestas.
	 * @param presupuestoTotal Presupuesto total de la casa de apuestas.
	 */
	public JuegoDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de la clase JuegoDTO para inicializar un juego con información detallada del establecimiento del juego.
	 *
	 * @param direccion  Dirección del establecimiento del juego.
	 * @param barrio     Barrio del establecimiento del juego.
	 * @param localidad  Localidad del establecimiento del juego.
	 * @param numEmpleados Número de empleados del establecimiento del juego.
	 */
	public JuegoDTO(String direccion, String barrio, String localidad, long numEmpleados) {
		super(direccion, barrio, localidad, numEmpleados);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Obtiene el nombre del juego.
	 *
	 * @return El nombre del juego.
	 */
	public String getNombreJuego() {
		return nombreJuego;
	}
	/**
	 * Establece el nombre del juego.
	 *
	 * @param nombreJuego El nombre del juego a establecer.
	 */
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	/**
	 * Obtiene el tipo de juego.
	 *
	 * @return El tipo de juego.
	 */
	
	public String getTipoDejuego() {
		return tipoDejuego;
	}
	/**
	 * Establece el tipo de juego.
	 *
	 * @param tipoDejuego El tipo de juego a establecer.
	 */
	public void setTipoDejuego(String tipoDejuego) {
		this.tipoDejuego = tipoDejuego;
	}
	/**
	 * Obtiene el presupuesto del juego.
	 *
	 * @return El presupuesto del juego.
	 */
	public double getPresupuestoDelJuego() {
		return presupuestoDelJuego;
	}
	/**
	 * Establece el presupuesto del juego.
	 *
	 * @param presupuestoDelJuego El presupuesto del juego a establecer.
	 */
	public void setPresupuestoDelJuego(double presupuestoDelJuego) {
		this.presupuestoDelJuego = presupuestoDelJuego;
	}
	/**
	 * Obtiene el valor de serialVersionUID.
	 *
	 * @return El valor de serialVersionUID.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * Genera una representación en forma de cadena (string) de la información del juego.
	 *
	 * @return Una cadena que contiene información detallada del juego.
	 */
	@Override
	public String toString() {
		return " [nombre del juego=" + nombreJuego + ", tipoDejuego=" + tipoDejuego + ", presupuestoDelJuego="
				+ presupuestoDelJuego + "\n";
	}

}
