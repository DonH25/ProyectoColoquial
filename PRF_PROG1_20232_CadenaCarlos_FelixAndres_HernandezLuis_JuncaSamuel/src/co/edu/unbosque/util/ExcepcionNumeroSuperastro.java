package co.edu.unbosque.util;

public class ExcepcionNumeroSuperastro extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3325545040916175137L;
	
	public ExcepcionNumeroSuperastro() {	
		super("El numero ingresado es mayor no esta entre 1 y 9");
	}
	
	public ExcepcionNumeroSuperastro(String mensaje) {
		super(mensaje);
	}
}
