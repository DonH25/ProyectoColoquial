package co.edu.unbosque.util;

/**
 * Esta clase es una excepción personalizada que se lanza cuando se ingresa un
 * número negativo.
 */
public class ExepcionNumeroBaloto extends Exception {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 8054691573285942108L;

	/**
	 * Este es un constructor sin argumentos que crea una nueva excepción con el
	 * mensaje predeterminado "No puede ingresar un número negativo, intente de
	 * nuevo.".
	 */
	public ExepcionNumeroBaloto() {
		super("No puede ingresar un numero negativo,intente de nuevo.");
	}

	/**
	 * Este es un constructor que crea una nueva excepción con un mensaje
	 * personalizado.
	 * 
	 * @param mensaje El mensaje personalizado que se mostrará cuando se lance la
	 *                excepción.
	 */
	public ExepcionNumeroBaloto(String mensaje) {
		super(mensaje);
	}
}
