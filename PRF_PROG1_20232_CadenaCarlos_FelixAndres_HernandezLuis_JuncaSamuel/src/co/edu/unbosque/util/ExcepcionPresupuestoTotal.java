package co.edu.unbosque.util;

/**
 * Esta clase es una excepción personalizada que se lanza cuando el número
 * ingresado es negativo.
 */
public class ExcepcionPresupuestoTotal extends Exception {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 2237996661988735039L;

	/**
	 * Este es un constructor sin argumentos que crea una nueva excepción con el
	 * mensaje predeterminado "El número ingresado es negativo".
	 */
	public ExcepcionPresupuestoTotal() {
		super("El numero ingresado es negativo");
	}

	/**
	 * Este es un constructor que crea una nueva excepción con un mensaje
	 * personalizado.
	 * 
	 * @param mensaje El mensaje personalizado que se mostrará cuando se lance la
	 *                excepción.
	 */
	public ExcepcionPresupuestoTotal(String mensaje) {
		super(mensaje);
	}
}
