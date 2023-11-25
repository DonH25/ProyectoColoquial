package co.edu.unbosque.util;

/**
 * Esta clase es una excepción personalizada que se lanza cuando una persona es
 * menor de edad.
 */
public class ExcepcionMayoriaEdad extends Exception {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 633124310049204807L;

	/**
	 * Este es un constructor sin argumentos que crea una nueva excepción con el
	 * mensaje predeterminado "Es menor de edad, no puede apostar".
	 */
	public ExcepcionMayoriaEdad() {
		super("Es menor de edad, no puede apostar");
	}

	/**
	 * Este es un constructor que crea una nueva excepción con un mensaje
	 * personalizado.
	 * 
	 * @param mensaje El mensaje personalizado que se mostrará cuando se lance la
	 *                excepción.
	 */
	public ExcepcionMayoriaEdad(String mensaje) {
		super(mensaje);
	}
}
