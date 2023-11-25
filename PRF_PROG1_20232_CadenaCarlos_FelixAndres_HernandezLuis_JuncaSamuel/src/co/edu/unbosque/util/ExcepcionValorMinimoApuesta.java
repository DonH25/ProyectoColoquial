package co.edu.unbosque.util;

/**
 * Esta clase es una excepción personalizada que se lanza cuando la apuesta es
 * menor al valor mínimo permitido.
 */
public class ExcepcionValorMinimoApuesta extends Exception {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -5643581818236200280L;

	/**
	 * Este es un constructor sin argumentos que crea una nueva excepción con el
	 * mensaje predeterminado "La apuesta debe tener un valor mínimo de 20.000".
	 */
	public ExcepcionValorMinimoApuesta() {
		super("La apuesta debe tener un valor minimo de 20.000");
	}

	/**
	 * Este es un constructor que crea una nueva excepción con un mensaje
	 * personalizado.
	 * 
	 * @param mensaje El mensaje personalizado que se mostrará cuando se lance la
	 *                excepción.
	 */
	public ExcepcionValorMinimoApuesta(String mensaje) {
		super(mensaje);
	}
}
