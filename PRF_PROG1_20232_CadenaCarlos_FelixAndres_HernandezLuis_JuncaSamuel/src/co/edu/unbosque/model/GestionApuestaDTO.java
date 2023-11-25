package co.edu.unbosque.model;

import java.io.Serializable;

public class GestionApuestaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2267041633087171285L;
	private String nameSede;
	private long numDeCedula;
	private String diaDeLaApuesta; // toca colocar una exepcion para los dias que no sean de la semana

	public GestionApuestaDTO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de la clase GestionApuestaDTO para información básica de la apuesta.
	 *
	 * @param nameSede        Nombre de la sede.
	 * @param numDeCedula     Número de cédula del apostador.
	 * @param diaDeLaApuesta  Día en que se realiza la apuesta.
	 */
	public GestionApuestaDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super();
		this.nameSede = nameSede;
		this.numDeCedula = numDeCedula;
		this.diaDeLaApuesta = diaDeLaApuesta;
	}
	/**
	 * Obtiene el nombre de la sede asociada a la gestión de la apuesta.
	 *
	 * @return El nombre de la sede.
	 */
	public String getNameSede() {
		return nameSede;
	}
	/**
	 * Establece el nombre de la sede asociada a la gestión de la apuesta.
	 *
	 * @param nameSede El nombre de la sede a establecer.
	 */
	public void setNameSede(String nameSede) {
		this.nameSede = nameSede;
	}
	/**
	 * Obtiene el número de cédula asociado a la gestión de la apuesta.
	 *
	 * @return El número de cédula del apostador.
	 */
	public long getNumDeCedula() {
		return numDeCedula;
	}
	/**
	 * Establece el número de cédula asociado a la gestión de la apuesta.
	 *
	 * @param numDeCedula El número de cédula del apostador a establecer.
	 */
	public void setNumDeCedula(long numDeCedula) {
		this.numDeCedula = numDeCedula;
	}
	/**
	 * Obtiene el día en que se realizó la apuesta.
	 *
	 * @return El día de la apuesta.
	 */
	public String getDiaDeLaApuesta() {
		return diaDeLaApuesta;
	}
	/**
	 * Establece el día en que se realizó la apuesta.
	 *
	 * @param diaDeLaApuesta El día de la apuesta a establecer.
	 */
	public void setDiaDeLaApuesta(String diaDeLaApuesta) {
		this.diaDeLaApuesta = diaDeLaApuesta;
	}
	/**
	 * Obtiene el valor del serialVersionUID.
	 *
	 * @return El valor de serialVersionUID.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * Genera una representación en forma de cadena (string) de la información de la gestión de la apuesta.
	 *
	 * @return Una cadena que contiene información detallada de la gestión de la apuesta.
	 */
	@Override
	public String toString() {
		return "GestionApuestaDTO [nameSede=" + nameSede + ", numDeCedula=" + numDeCedula + ", diaDeLaApuesta="
				+ diaDeLaApuesta + "]";
	}

}
