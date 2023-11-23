package co.edu.unbosque.util;

public class ExcepcionNumerosNegativos extends ExcepcionNumeroLoteria {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7168260952560790087L;

	public ExcepcionNumerosNegativos() {
		super("El numero ingresado no es valido para este servicio");
	}

	public ExcepcionNumerosNegativos(String mensaje) {
		super(mensaje);
	}
}
