package co.edu.unbosque.util;

public class ExepcionNumeroBaloto extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8054691573285942108L;

	public ExepcionNumeroBaloto() {
		super("No puede ingresar un numero negativo,intente de nuevo.");
	}
	
	public ExepcionNumeroBaloto(String mensaje) {
		super(mensaje);
	}
}
