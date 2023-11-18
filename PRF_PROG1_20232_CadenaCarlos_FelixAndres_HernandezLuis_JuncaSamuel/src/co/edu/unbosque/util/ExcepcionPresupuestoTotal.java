package co.edu.unbosque.util;

public class ExcepcionPresupuestoTotal extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2237996661988735039L;

	public ExcepcionPresupuestoTotal() {
		super("El numero ingresado es negativo");
	}
	
	public ExcepcionPresupuestoTotal(String mensaje) {
		super(mensaje);
	}
}
