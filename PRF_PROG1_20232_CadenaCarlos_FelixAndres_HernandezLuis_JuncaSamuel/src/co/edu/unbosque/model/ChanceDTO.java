package co.edu.unbosque.model;

import java.io.Serializable;

public class ChanceDTO extends GestionApuestaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6664159118448864908L;
	private int digito1;
	private int digito2;
	private int digito3;
	private int digito4;
	private double valorDeLaApuesta;
	private String loteria;

	public ChanceDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de la clase ChanceDTO que inicializa los campos de apuesta.
	 *
	 * @param digito1          Primer dígito de la apuesta.
	 * @param digito2          Segundo dígito de la apuesta.
	 * @param digito3          Tercer dígito de la apuesta.
	 * @param digito4          Cuarto dígito de la apuesta.
	 * @param valorDeLaApuesta Valor de la apuesta realizada.
	 * @param loteria          Nombre de la lotería asociada a la apuesta.
	 */
	public ChanceDTO(int digito1, int digito2, int digito3, int digito4, double valorDeLaApuesta, String loteria) {
		super();
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
		this.valorDeLaApuesta = valorDeLaApuesta;
		this.loteria = loteria;
	}

	/**
	 * Constructor de la clase ChanceDTO para una apuesta específica.
	 *
	 * @param nameSede         Nombre de la sede.
	 * @param numDeCedula      Número de cédula del apostador.
	 * @param diaDeLaApuesta   Día en que se realiza la apuesta.
	 * @param digito1          Primer dígito de la apuesta.
	 * @param digito2          Segundo dígito de la apuesta.
	 * @param digito3          Tercer dígito de la apuesta.
	 * @param digito4          Cuarto dígito de la apuesta.
	 * @param valorDeLaApuesta Valor de la apuesta realizada.
	 * @param loteria          Nombre de la lotería asociada a la apuesta.
	 */
	public ChanceDTO(String nameSede, long numDeCedula, String diaDeLaApuesta, int digito1, int digito2, int digito3,
			int digito4, double valorDeLaApuesta, String loteria) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
		this.valorDeLaApuesta = valorDeLaApuesta;
		this.loteria = loteria;
	}

	/**
	 * Constructor de la clase ChanceDTO para información básica de apuesta.
	 *
	 * @param nameSede       Nombre de la sede.
	 * @param numDeCedula    Número de cédula del apostador.
	 * @param diaDeLaApuesta Día en que se realiza la apuesta.
	 */
	public ChanceDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Devuelve el nombre de la lotería asociada a la apuesta.
	 *
	 * @return El nombre de la lotería.
	 */
	public String getLoteria() {
		return loteria;
	}

	/**
	 * Establece el nombre de la lotería asociada a la apuesta.
	 *
	 * @param loteria El nombre de la lotería a establecer.
	 */
	public void setLoteria(String loteria) {
		this.loteria = loteria;
	}

	/**
	 * Obtiene el valor del primer dígito de la apuesta.
	 *
	 * @return El valor del primer dígito.
	 */
	public int getDigito1() {
		return digito1;
	}

	/**
	 * Establece el valor del primer dígito de la apuesta.
	 *
	 * @param digito1 El valor del primer dígito a establecer.
	 */
	public void setDigito1(int digito1) {
		this.digito1 = digito1;
	}

	/**
	 * Obtiene el valor del segundo dígito de la apuesta.
	 *
	 * @return El valor del segundo dígito.
	 */
	public int getDigito2() {
		return digito2;
	}

	/**
	 * Establece el valor del segundo dígito de la apuesta.
	 *
	 * @param digito2 El valor del segundo dígito a establecer.
	 */
	public void setDigito2(int digito2) {
		this.digito2 = digito2;
	}

	/**
	 * Obtiene el valor del tercer dígito de la apuesta.
	 *
	 * @return El valor del tercer dígito.
	 */
	public int getDigito3() {
		return digito3;
	}

	/**
	 * Establece el valor del tercer dígito de la apuesta.
	 *
	 * @param digito3 El valor del tercer dígito a establecer.
	 */
	public void setDigito3(int digito3) {
		this.digito3 = digito3;
	}

	/**
	 * Obtiene el valor del cuarto dígito de la apuesta.
	 *
	 * @return El valor del cuarto dígito.
	 */
	public int getDigito4() {
		return digito4;
	}

	/**
	 * Establece el valor del cuarto dígito de la apuesta.
	 *
	 * @param digito4 El valor del cuarto dígito a establecer.
	 */
	public void setDigito4(int digito4) {
		this.digito4 = digito4;
	}

	/**
	 * Obtiene el valor de serialVersionUID.
	 *
	 * @return El valor de serialVersionUID.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Obtiene el valor de la apuesta realizada.
	 *
	 * @return El valor de la apuesta.
	 */
	public double getValorDeLaApuesta() {
		return valorDeLaApuesta;
	}

	/**
	 * Establece el valor de la apuesta realizada.
	 *
	 * @param valorDeLaApuesta El valor de la apuesta a establecer.
	 */
	public void setValorDeLaApuesta(double valorDeLaApuesta) {
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	/**
	 * Genera una representación en forma de cadena (string) de la información de la
	 * apuesta.
	 *
	 * @return Una cadena que contiene información detallada de la apuesta.
	 */
	@Override
	public String toString() {
		return super.toString() + " [primer digito de la apuesta=" + digito1 + ", segundo digito de la apuesta="
				+ digito2 + ", tercer digito de la apuesta=" + digito3 + ", cuarto digito de la apuesta=" + digito4
				+ "ValorDeLaApuesta:" + valorDeLaApuesta + "\n";
	}

}
