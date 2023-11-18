package co.edu.unbosque.util;

public class ExcepcionNumeroSede extends ExcepcionNumeroLoteria{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5541281041907136403L;

	public ExcepcionNumeroSede() {
		super("El numero ingresado no es valido para este servicio");
	}
	
	public ExcepcionNumeroSede(String mensaje) {
		super(mensaje);
	}
}
