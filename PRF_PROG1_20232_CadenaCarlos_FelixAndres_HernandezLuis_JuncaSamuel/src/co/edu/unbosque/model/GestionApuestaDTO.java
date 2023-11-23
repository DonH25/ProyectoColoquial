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

	public GestionApuestaDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super();
		this.nameSede = nameSede;
		this.numDeCedula = numDeCedula;
		this.diaDeLaApuesta = diaDeLaApuesta;
	}

	public String getNameSede() {
		return nameSede;
	}

	public void setNameSede(String nameSede) {
		this.nameSede = nameSede;
	}

	public long getNumDeCedula() {
		return numDeCedula;
	}

	public void setNumDeCedula(long numDeCedula) {
		this.numDeCedula = numDeCedula;
	}

	public String getDiaDeLaApuesta() {
		return diaDeLaApuesta;
	}

	public void setDiaDeLaApuesta(String diaDeLaApuesta) {
		this.diaDeLaApuesta = diaDeLaApuesta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "GestionApuestaDTO [nameSede=" + nameSede + ", numDeCedula=" + numDeCedula + ", diaDeLaApuesta="
				+ diaDeLaApuesta + "]";
	}

}
