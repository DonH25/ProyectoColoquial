package co.edu.unbosque.model;

import java.io.Serializable;

public class SedeDTO extends CasaDeApuestasDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7746285034070948749L;

	private String localidad;
	private long numEmpleados;

	public SedeDTO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Clase que representa una Sede con información sobre dirección, barrio, localidad y número de empleados.
	 */
	public SedeDTO(String direccion, String barrio, String localidad, long numEmpleados) {
		super();

		this.localidad = localidad;
		this.numEmpleados = numEmpleados;
	}
	/**
     * Constructor que inicializa una Sede con información de dirección, barrio, localidad y número de empleados.
     *
     * @param direccion     La dirección de la sede.
     * @param barrio        El barrio de la sede.
     * @param localidad     La localidad de la sede.
     * @param numEmpleados  El número de empleados en la sede.
     */
	public SedeDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados) {
		super(nombre, numeroDeSedes, presupuestoTotal);

		this.localidad = localidad;
		this.numEmpleados = numEmpleados;
	}
	/**
     * Constructor que inicializa una Sede con información detallada.
     *
     * @param nombre             El nombre de la sede.
     * @param numeroDeSedes      El número de sedes.
     * @param presupuestoTotal   El presupuesto total.
     * @param direccion          La dirección de la sede.
     * @param barrio             El barrio de la sede.
     * @param localidad          La localidad de la sede.
     * @param numEmpleados       El número de empleados en la sede.
     */
	public SedeDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		// TODO Auto-generated constructor stub
	}
	/**
     * Constructor que inicializa una Sede con información básica.
     *
     * @param nombre            El nombre de la sede.
     * @param numeroDeSedes     El número de sedes.
     * @param presupuestoTotal  El presupuesto total.
     */
	public String getLocalidad() {
		return localidad;
	}
	/**
     * Obtiene la localidad de la sede.
     *
     * @return La localidad de la sede.
     */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	/**
     * Establece la localidad de la sede.
     *
     * @param localidad La localidad de la sede a establecer.
     */
	public long getNumEmpleados() {
		return numEmpleados;
	}
	/**
     * Obtiene el número de empleados en la sede.
     *
     * @return El número de empleados en la sede.
     */
	public void setNumEmpleados(long numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	/**
     * Establece el número de empleados en la sede.
     *
     * @param numEmpleados El número de empleados en la sede a establecer.
     */
	@Override
	public String toString() {
		return ", Localidad de la sede : " + localidad + ", numero de Empleados :" + numEmpleados + "\n";
	}

}
