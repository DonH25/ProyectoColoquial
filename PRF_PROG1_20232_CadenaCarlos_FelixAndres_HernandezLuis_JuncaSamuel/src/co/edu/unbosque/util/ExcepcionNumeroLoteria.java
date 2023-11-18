package co.edu.unbosque.util;

public class ExcepcionNumeroLoteria extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5181463260844559727L;

	public ExcepcionNumeroLoteria() {
		super("se ha ingrersado mas de un numero");
	}
	
	public ExcepcionNumeroLoteria(String mensaje) {
		super(mensaje);
	}
}
