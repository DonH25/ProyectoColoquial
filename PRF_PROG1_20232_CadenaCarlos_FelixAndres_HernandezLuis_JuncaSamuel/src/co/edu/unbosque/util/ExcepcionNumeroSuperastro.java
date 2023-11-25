package co.edu.unbosque.util;

/**
 * Esta clase es una excepción personalizada que se lanza cuando el número
 * ingresado no está entre 1 y 9.
 */
public class ExcepcionNumeroSuperastro extends Exception {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -3325545040916175137L;

	/**
	 * Este es un constructor sin argumentos que crea una nueva excepción con el
	 * mensaje predeterminado "El número ingresado no está entre 1 y 9".
	 */
	public ExcepcionNumeroSuperastro() {
		super("El numero ingresado es mayor no esta entre 1 y 9");
	}

	/**
	 * Este es un constructor que crea una nueva excepción con un mensaje
	 * personalizado.
	 * 
	 * @param mensaje El mensaje personalizado que se mostrará cuando se lance la
	 *                excepción.
	 */
	public ExcepcionNumeroSuperastro(String mensaje) {
		super(mensaje);
	}
}
