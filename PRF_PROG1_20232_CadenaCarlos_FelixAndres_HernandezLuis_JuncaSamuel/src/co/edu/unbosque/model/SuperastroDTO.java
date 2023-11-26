package co.edu.unbosque.model;

import java.io.Serializable;

public class SuperastroDTO extends GestionApuestaDTO implements Serializable {

	private static final long serialVersionUID = 1943086879865559410L;
	private int digito1;
	private int digito2;
	private int digito3;
	private int digito4;
	private String zodiacoSigno;
	private double valorDeLaApuesta;

	public SuperastroDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de la clase SuperastroDTO que inicializa una instancia de
	 * Superastro con información específica.
	 *
	 * @param digito1          El primer dígito del juego Superastro.
	 * @param digito2          El segundo dígito del juego Superastro.
	 * @param digito3          El tercer dígito del juego Superastro.
	 * @param digito4          El cuarto dígito del juego Superastro.
	 * @param zodiacoSigno     El signo del zodiaco asociado al juego Superastro.
	 * @param valorDeLaApuesta El valor de la apuesta en el juego Superastro.
	 */
	public SuperastroDTO(int digito1, int digito2, int digito3, int digito4, String zodiacoSigno,
			double valorDeLaApuesta) {
		super();
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
		this.zodiacoSigno = zodiacoSigno;
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	/**
	 * Constructor de la clase SuperastroDTO que inicializa una instancia de
	 * Superastro con información específica y detalles de la apuesta.
	 *
	 * @param nameSede         El nombre de la sede asociada al juego Superastro.
	 * @param numDeCedula      El número de cédula asociado al juego Superastro.
	 * @param diaDeLaApuesta   El día de la apuesta del juego Superastro.
	 * @param digito1          El primer dígito del juego Superastro.
	 * @param digito2          El segundo dígito del juego Superastro.
	 * @param digito3          El tercer dígito del juego Superastro.
	 * @param digito4          El cuarto dígito del juego Superastro.
	 * @param zodiacoSigno     El signo del zodiaco asociado al juego Superastro.
	 * @param valorDeLaApuesta El valor de la apuesta en el juego Superastro.
	 */
	public SuperastroDTO(String nameSede, long numDeCedula, String diaDeLaApuesta, int digito1, int digito2,
			int digito3, int digito4, String zodiacoSigno, double valorDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
		this.zodiacoSigno = zodiacoSigno;
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	/**
	 * Constructor de SuperastroDTO que inicializa una instancia de Superastro con
	 * información específica de la sede, cédula y día de apuesta.
	 *
	 * @param nameSede       El nombre de la sede asociada al juego Superastro.
	 * @param numDeCedula    El número de cédula asociado al juego Superastro.
	 * @param diaDeLaApuesta El día de la apuesta del juego Superastro.
	 */
	public SuperastroDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtiene el primer dígito del juego Superastro.
	 *
	 * @return El primer dígito del juego Superastro.
	 */
	public int getDigito1() {
		return digito1;
	}

	/**
	 * Establece el primer dígito del juego Superastro.
	 *
	 * @param digito1 El primer dígito del juego Superastro a establecer.
	 */
	public void setDigito1(int digito1) {
		this.digito1 = digito1;
	}

	/**
	 * Obtiene el valor del serialVersionUID.
	 *
	 * @return El valor del serialVersionUID.
	 */
	public int getDigito2() {
		return digito2;
	}

	/**
	 * Obtiene el valor de la apuesta en el juego Superastro.
	 *
	 * @return El valor de la apuesta en el juego Superastro.
	 */
	public void setDigito2(int digito2) {
		this.digito2 = digito2;
	}

	/**
	 * Establece el valor de la apuesta en el juego Superastro.
	 *
	 * @param valorDeLaApuesta El valor de la apuesta en el juego Superastro a
	 *                         establecer.
	 */
	public int getDigito3() {
		return digito3;
	}

	/**
	 * Establece el tercer dígito del juego Superastro.
	 *
	 * @param digito3 El tercer dígito del juego Superastro a establecer.
	 */
	public void setDigito3(int digito3) {
		this.digito3 = digito3;
	}

	/**
	 * Obtiene el valor del cuarto dígito del juego Superastro.
	 *
	 * @return El valor del cuarto dígito del juego Superastro.
	 */
	public int getDigito4() {
		return digito4;
	}

	/**
	 * Establece el valor del cuarto dígito del juego Superastro.
	 *
	 * @param digito4 El cuarto dígito del juego Superastro a establecer.
	 */
	public void setDigito4(int digito4) {
		this.digito4 = digito4;
	}

	/**
	 * Obtiene el signo del zodiaco asociado al juego Superastro.
	 *
	 * @return El signo del zodiaco asociado al juego Superastro.
	 */
	public String getZodiacoSigno() {
		return zodiacoSigno;
	}

	/**
	 * Establece el signo del zodiaco asociado al juego Superastro.
	 *
	 * @param zodiacoSigno El signo del zodiaco asociado al juego Superastro a
	 *                     establecer.
	 */
	public void setZodiacoSigno(String zodiacoSigno) {
		this.zodiacoSigno = zodiacoSigno;
	}

	/**
	 * Obtiene el valor del serialVersionUID.
	 *
	 * @return El valor del serialVersionUID.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Obtiene el valor de la apuesta en el juego Superastro.
	 *
	 * @return El valor de la apuesta en el juego Superastro.
	 */
	public double getValorDeLaApuesta() {
		return valorDeLaApuesta;
	}

	/**
	 * Establece el valor de la apuesta en el juego Superastro.
	 *
	 * @param valorDeLaApuesta El valor de la apuesta en el juego Superastro a
	 *                         establecer.
	 */
	public void setValorDeLaApuesta(double valorDeLaApuesta) {
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	/**
	 * Genera una representación en forma de cadena (string) de la información del
	 * juego Superastro.
	 *
	 * @return Una cadena que contiene detalles específicos del juego Superastro.
	 */
	@Override
	public String toString() {
		return super.toString() + "primer digito de la apuesta: " + digito1 + ", segundo digito de la apuesta: "
				+ digito2 + ", tercer digito de la apuesta: " + digito3 + ", cuarto digito de la apuesta:" + digito4
				+ ", Signo Del Zodiaco:" + zodiacoSigno + "ValorDeLaApuesta:" + valorDeLaApuesta + "\n";
	}

}
