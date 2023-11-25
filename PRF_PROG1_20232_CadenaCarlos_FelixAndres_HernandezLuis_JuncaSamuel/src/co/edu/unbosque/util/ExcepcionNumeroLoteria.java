package co.edu.unbosque.util;

/**
 * Esta clase es una excepción personalizada que se lanza cuando se ingresa más
 * de un número en la lotería.
 */
public class ExcepcionNumeroLoteria extends Exception {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 5181463260844559727L;

	/**
	 * Este es un constructor sin argumentos que crea una nueva excepción con el
	 * mensaje predeterminado "se ha ingresado más de un número".
	 */
	public ExcepcionNumeroLoteria() {
		super("se ha ingrersado mas de un numero");
	}

	/**
	 * Este es un constructor que crea una nueva excepción con un mensaje
	 * personalizado.
	 * 
	 * @param mensaje El mensaje personalizado que se mostrará cuando se lance la
	 *                excepción.
	 */
	public ExcepcionNumeroLoteria(String mensaje) {
		super(mensaje);
	}
}
