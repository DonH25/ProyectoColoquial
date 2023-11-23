package co.edu.unbosque.model;

import java.io.Serializable;

public class BetplayDTO extends GestionApuestaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8763564016326743498L;
	private String equipoLocal;
	private int marcadorLocal;
	private String equipoVisitante;
	private int marcadorVisitante;
	private double valorDeLaApuesta;

	public BetplayDTO() {
		// TODO Auto-generated constructor stub
	}

	public BetplayDTO(String equipoLocal, int marcadorLocal, String equipoVisitante, int marcadorVisitante,
			double valorDeLaApuesta) {
		super();
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	

	public BetplayDTO(String nameSede, long numDeCedula, String diaDeLaApuesta, String equipoLocal, int marcadorLocal,
			String equipoVisitante, int marcadorVisitante, double valorDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		this.equipoLocal = equipoLocal;
		this.marcadorLocal = marcadorLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcadorVisitante = marcadorVisitante;
		this.valorDeLaApuesta = valorDeLaApuesta;
	}
	
	

	public BetplayDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		// TODO Auto-generated constructor stub
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public int getMarcadorLocal() {
		return marcadorLocal;
	}

	public void setMarcadorLocal(int marcadorLocal) {
		this.marcadorLocal = marcadorLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getMarcadorVisitante() {
		return marcadorVisitante;
	}

	public void setMarcadorVisitante(int marcadorVisitante) {
		this.marcadorVisitante = marcadorVisitante;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public double getValorDeLaApuesta() {
		return valorDeLaApuesta;
	}

	public void setValorDeLaApuesta(double valorDeLaApuesta) {
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	@Override
	public String toString() {
		return "BetplayDTO [equipoLocal=" + equipoLocal + ", marcadorLocal=" + marcadorLocal + ", equipoVisitante="
				+ equipoVisitante + ", marcadorVisitante=" + marcadorVisitante + valorDeLaApuesta + "]";
	}

}
