package co.edu.unbosque.model;

import java.io.Serializable;

public class LoteriaDTO extends GestionApuestaDTO implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 6947106895031213599L;
	private String nombreLoteria;
	private int digito1;
	private int digito2;
	private int digito3;
	private int digito4;
	private int serieDig1;
	private int serieDig2;
	private int serieDig3;
	private double valorDeLaApuesta;

	public LoteriaDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de la clase LoteriaDTO para inicializar una instancia de lotería
	 * con información específica.
	 *
	 * @param nombreLoteria    Nombre de la lotería.
	 * @param digito1          Primer dígito de la apuesta.
	 * @param digito2          Segundo dígito de la apuesta.
	 * @param digito3          Tercer dígito de la apuesta.
	 * @param digito4          Cuarto dígito de la apuesta.
	 * @param serieDig1        Primer número de serie de la apuesta.
	 * @param serieDig2        Segundo número de serie de la apuesta.
	 * @param serieDig3        Tercer número de serie de la apuesta.
	 * @param valorDeLaApuesta Valor de la apuesta realizada.
	 */
	public LoteriaDTO(String nombreLoteria, int digito1, int digito2, int digito3, int digito4, int serieDig1,
			int serieDig2, int serieDig3, double valorDeLaApuesta) {
		super();
		this.nombreLoteria = nombreLoteria;
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
		this.serieDig1 = serieDig1;
		this.serieDig2 = serieDig2;
		this.serieDig3 = serieDig3;
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	/**
	 * Constructor de la clase LoteriaDTO para inicializar una instancia de lotería
	 * con información detallada y heredada de la gestión de la apuesta.
	 *
	 * @param nameSede         Nombre de la sede de la gestión de la apuesta.
	 * @param numDeCedula      Número de cédula asociado a la gestión de la apuesta.
	 * @param diaDeLaApuesta   Día en que se realiza la apuesta.
	 * @param nombreLoteria    Nombre de la lotería.
	 * @param digito1          Primer dígito de la apuesta.
	 * @param digito2          Segundo dígito de la apuesta.
	 * @param digito3          Tercer dígito de la apuesta.
	 * @param digito4          Cuarto dígito de la apuesta.
	 * @param serieDig1        Primer número de serie de la apuesta.
	 * @param serieDig2        Segundo número de serie de la apuesta.
	 * @param serieDig3        Tercer número de serie de la apuesta.
	 * @param valorDeLaApuesta Valor de la apuesta realizada.
	 */
	public LoteriaDTO(String nameSede, long numDeCedula, String diaDeLaApuesta, String nombreLoteria, int digito1,
			int digito2, int digito3, int digito4, int serieDig1, int serieDig2, int serieDig3,
			double valorDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		this.nombreLoteria = nombreLoteria;
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
		this.serieDig1 = serieDig1;
		this.serieDig2 = serieDig2;
		this.serieDig3 = serieDig3;
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	/**
	 * Constructor de la clase LoteriaDTO que inicializa una instancia de lotería
	 * con información básica de la gestión de la apuesta.
	 *
	 * @param nameSede       Nombre de la sede de la gestión de la apuesta.
	 * @param numDeCedula    Número de cédula asociado a la gestión de la apuesta.
	 * @param diaDeLaApuesta Día en que se realiza la apuesta.
	 */
	public LoteriaDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtiene el nombre de la lotería.
	 *
	 * @return El nombre de la lotería.
	 */
	public String getNombreLoteria() {
		return nombreLoteria;
	}

	/**
	 * Establece el nombre de la lotería.
	 *
	 * @param nombreLoteria El nombre de la lotería a establecer.
	 */
	public void setNombreLoteria(String nombreLoteria) {
		this.nombreLoteria = nombreLoteria;
	}
	// Métodos getters y setters para los demás campos

	/**
	 * Obtiene el valor de serialVersionUID.
	 *
	 * @return El valor de serialVersionUID.
	 */
	public int getDigito1() {
		return digito1;
	}

	/**
	 * Obtiene el valor de la apuesta.
	 *
	 * @return El valor de la apuesta.
	 */
	public void setDigito1(int digito1) {
		this.digito1 = digito1;
	}

	/**
	 * Establece el valor de la apuesta.
	 *
	 * @param valorDeLaApuesta El valor de la apuesta a establecer.
	 */
	public int getDigito2() {
		return digito2;
	}

	/**
	 * Establece el valor del segundo dígito de la apuesta.
	 *
	 * @param digito2 El valor del segundo dígito de la apuesta a establecer.
	 */
	public void setDigito2(int digito2) {
		this.digito2 = digito2;
	}

	/**
	 * Obtiene el valor del tercer dígito de la apuesta.
	 *
	 * @return El valor del tercer dígito de la apuesta.
	 */
	public int getDigito3() {
		return digito3;
	}

	/**
	 * Establece el valor del tercer dígito de la apuesta.
	 *
	 * @param digito3 El valor del tercer dígito de la apuesta a establecer.
	 */
	public void setDigito3(int digito3) {
		this.digito3 = digito3;
	}

	/**
	 * Obtiene el valor del cuarto dígito de la apuesta.
	 *
	 * @return El valor del cuarto dígito de la apuesta.
	 */
	public int getDigito4() {
		return digito4;
	}

	/**
	 * Establece el valor del cuarto dígito de la apuesta.
	 *
	 * @param digito4 El valor del cuarto dígito de la apuesta a establecer.
	 */
	public void setDigito4(int digito4) {
		this.digito4 = digito4;
	}

	/**
	 * Obtiene el primer número de serie de la apuesta.
	 *
	 * @return El primer número de serie de la apuesta.
	 */
	public int getSerieDig1() {
		return serieDig1;
	}

	/**
	 * Establece el primer número de serie de la apuesta.
	 *
	 * @param serieDig1 El primer número de serie de la apuesta a establecer.
	 */
	public void setSerieDig1(int serieDig1) {
		this.serieDig1 = serieDig1;
	}

	/**
	 * Obtiene el segundo número de serie de la apuesta.
	 *
	 * @return El segundo número de serie de la apuesta.
	 */
	public int getSerieDig2() {
		return serieDig2;
	}

	/**
	 * Establece el segundo número de serie de la apuesta.
	 *
	 * @param serieDig2 El segundo número de serie de la apuesta a establecer.
	 */
	public void setSerieDig2(int serieDig2) {
		this.serieDig2 = serieDig2;
	}

	/**
	 * Obtiene el tercer número de serie de la apuesta.
	 *
	 * @return El tercer número de serie de la apuesta.
	 */
	public int getSerieDig3() {
		return serieDig3;
	}

	/**
	 * Establece el tercer número de serie de la apuesta.
	 *
	 * @param serieDig3 El tercer número de serie de la apuesta a establecer.
	 */
	public void setSerieDig3(int serieDig3) {
		this.serieDig3 = serieDig3;
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
	 * Obtiene el valor de la apuesta.
	 *
	 * @return El valor de la apuesta.
	 */
	public double getValorDeLaApuesta() {
		return valorDeLaApuesta;
	}

	/**
	 * Establece el valor de la apuesta.
	 *
	 * @param valorDeLaApuesta El valor de la apuesta a establecer.
	 */
	public void setValorDeLaApuesta(double valorDeLaApuesta) {
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	/**
	 * Genera una representación en forma de cadena (string) de la información de la
	 * lotería.
	 *
	 * @return Una cadena que contiene información detallada de la lotería.
	 */
	@Override
	public String toString() {
		return super.toString() + " [nombreLoteria=" + nombreLoteria + ", primer digito de la apuesta=" + digito1
				+ ", segundo digito de la apuesta=" + digito2 + ", tercer digito de la puesta=" + digito3
				+ ", cuarto de la apuesta=" + digito4 + ", primer digito de la serie=" + serieDig1
				+ ", segundo digito de la serie=" + serieDig2 + ", tercer digito de la serie=" + serieDig3
				+ "ValorDeLaApuesta:" + valorDeLaApuesta + "\n";
	}

}