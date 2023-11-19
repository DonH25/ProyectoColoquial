package co.edu.unbosque.util;

public class ExcepcionValorMinimoApuesta extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5643581818236200280L;

	public ExcepcionValorMinimoApuesta() {
		super("La apuesta debe tener un valor minimo de 20.000");
	}
	
	public ExcepcionValorMinimoApuesta(String mensaje) {
		super(mensaje);
	}
}
