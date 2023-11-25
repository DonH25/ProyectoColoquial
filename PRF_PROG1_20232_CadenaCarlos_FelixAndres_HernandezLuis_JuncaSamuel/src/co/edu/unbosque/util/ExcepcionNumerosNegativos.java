package co.edu.unbosque.util;

/**
 * Esta clase es una excepción personalizada que se lanza cuando se ingresa un
 * número negativo en la lotería. Extiende a la clase ExcepcionNumeroLoteria.
 */
public class ExcepcionNumerosNegativos extends ExcepcionNumeroLoteria {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -7168260952560790087L;

	/**
	 * Este es un constructor sin argumentos que crea una nueva excepción con el
	 * mensaje predeterminado "El número ingresado no es válido para este servicio".
	 */
	public ExcepcionNumerosNegativos() {
		super("El numero ingresado no es valido para este servicio");
	}

	/**
	 * Este es un constructor que crea una nueva excepción con un mensaje
	 * personalizado.
	 * 
	 * @param mensaje El mensaje personalizado que se mostrará cuando se lance la
	 *                excepción.
	 */
	public ExcepcionNumerosNegativos(String mensaje) {
		super(mensaje);
	}
}
