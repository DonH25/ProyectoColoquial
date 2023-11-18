package co.edu.unbosque.util;

public class ExcepcionMayoriaEdad extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 633124310049204807L;

	public ExcepcionMayoriaEdad() {
		super("Es menor de edad, no puede apostar");
	}
	
	public ExcepcionMayoriaEdad(String mensaje) {
		super(mensaje);
	}
}
