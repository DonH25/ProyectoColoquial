package co.edu.unbosque.model;

import java.io.Serializable;

public class BetplayDTO extends GestionApuestaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8763564016326743498L;
	private String partido1Resultado;
	private String partido2Resultado;
	private String partido3Resultado;
	private String partido4Resultado;
	private String partido5Resultado;
	private String partido6Resultado;
	private String partido7Resultado;
	private String partido8Resultado;
	private String partido9Resultado;
	private String partido10Resultado;
	private String partido11Resultado;
	private String partido12Resultado;
	private String partido13Resultado;
	private String partido14Resultado;
	private double valorDeLaApuesta;

	public BetplayDTO() {
		// TODO Auto-generated constructor stub
	}

	public BetplayDTO(String partido1Resultado, String partido2Resultado, String partido3Resultado,
			String partido4Resultado, String partido5Resultado, String partido6Resultado, String partido7Resultado,
			String partido8Resultado, String partido9Resultado, String partido10Resultado, String partido11Resultado,
			String partido12Resultado, String partido13Resultado, String partido14Resultado, double valorDeLaApuesta) {
		super();
		this.partido1Resultado = partido1Resultado;
		this.partido2Resultado = partido2Resultado;
		this.partido3Resultado = partido3Resultado;
		this.partido4Resultado = partido4Resultado;
		this.partido5Resultado = partido5Resultado;
		this.partido6Resultado = partido6Resultado;
		this.partido7Resultado = partido7Resultado;
		this.partido8Resultado = partido8Resultado;
		this.partido9Resultado = partido9Resultado;
		this.partido10Resultado = partido10Resultado;
		this.partido11Resultado = partido11Resultado;
		this.partido12Resultado = partido12Resultado;
		this.partido13Resultado = partido13Resultado;
		this.partido14Resultado = partido14Resultado;
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	public BetplayDTO(String nameSede, long numDeCedula, String diaDeLaApuesta, String partido1Resultado,
			String partido2Resultado, String partido3Resultado, String partido4Resultado, String partido5Resultado,
			String partido6Resultado, String partido7Resultado, String partido8Resultado, String partido9Resultado,
			String partido10Resultado, String partido11Resultado, String partido12Resultado, String partido13Resultado,
			String partido14Resultado, double valorDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		this.partido1Resultado = partido1Resultado;
		this.partido2Resultado = partido2Resultado;
		this.partido3Resultado = partido3Resultado;
		this.partido4Resultado = partido4Resultado;
		this.partido5Resultado = partido5Resultado;
		this.partido6Resultado = partido6Resultado;
		this.partido7Resultado = partido7Resultado;
		this.partido8Resultado = partido8Resultado;
		this.partido9Resultado = partido9Resultado;
		this.partido10Resultado = partido10Resultado;
		this.partido11Resultado = partido11Resultado;
		this.partido12Resultado = partido12Resultado;
		this.partido13Resultado = partido13Resultado;
		this.partido14Resultado = partido14Resultado;
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	public BetplayDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		// TODO Auto-generated constructor stub
	}

	public String getPartido1Resultado() {
		return partido1Resultado;
	}

	public void setPartido1Resultado(String partido1Resultado) {
		this.partido1Resultado = partido1Resultado;
	}

	public String getPartido2Resultado() {
		return partido2Resultado;
	}

	public void setPartido2Resultado(String partido2Resultado) {
		this.partido2Resultado = partido2Resultado;
	}

	public String getPartido3Resultado() {
		return partido3Resultado;
	}

	public void setPartido3Resultado(String partido3Resultado) {
		this.partido3Resultado = partido3Resultado;
	}

	public String getPartido4Resultado() {
		return partido4Resultado;
	}

	public void setPartido4Resultado(String partido4Resultado) {
		this.partido4Resultado = partido4Resultado;
	}

	public String getPartido5Resultado() {
		return partido5Resultado;
	}

	public void setPartido5Resultado(String partido5Resultado) {
		this.partido5Resultado = partido5Resultado;
	}

	public String getPartido6Resultado() {
		return partido6Resultado;
	}

	public void setPartido6Resultado(String partido6Resultado) {
		this.partido6Resultado = partido6Resultado;
	}

	public String getPartido7Resultado() {
		return partido7Resultado;
	}

	public void setPartido7Resultado(String partido7Resultado) {
		this.partido7Resultado = partido7Resultado;
	}

	public String getPartido8Resultado() {
		return partido8Resultado;
	}

	public void setPartido8Resultado(String partido8Resultado) {
		this.partido8Resultado = partido8Resultado;
	}

	public String getPartido9Resultado() {
		return partido9Resultado;
	}

	public void setPartido9Resultado(String partido9Resultado) {
		this.partido9Resultado = partido9Resultado;
	}

	public String getPartido10Resultado() {
		return partido10Resultado;
	}

	public void setPartido10Resultado(String partido10Resultado) {
		this.partido10Resultado = partido10Resultado;
	}

	public String getPartido11Resultado() {
		return partido11Resultado;
	}

	public void setPartido11Resultado(String partido11Resultado) {
		this.partido11Resultado = partido11Resultado;
	}

	public String getPartido12Resultado() {
		return partido12Resultado;
	}

	public void setPartido12Resultado(String partido12Resultado) {
		this.partido12Resultado = partido12Resultado;
	}

	public String getPartido13Resultado() {
		return partido13Resultado;
	}

	public void setPartido13Resultado(String partido13Resultado) {
		this.partido13Resultado = partido13Resultado;
	}

	public String getPartido14Resultado() {
		return partido14Resultado;
	}

	public void setPartido14Resultado(String partido14Resultado) {
		this.partido14Resultado = partido14Resultado;
	}

	public double getValorDeLaApuesta() {
		return valorDeLaApuesta;
	}

	public void setValorDeLaApuesta(double valorDeLaApuesta) {
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return super.toString() + "BetplayDTO [partido1Resultado=" + partido1Resultado + ", partido2Resultado="
				+ partido2Resultado + ", partido3Resultado=" + partido3Resultado + ", partido4Resultado="
				+ partido4Resultado + ", partido5Resultado=" + partido5Resultado + ", partido6Resultado="
				+ partido6Resultado + ", partido7Resultado=" + partido7Resultado + ", partido8Resultado="
				+ partido8Resultado + ", partido9Resultado=" + partido9Resultado + ", partido10Resultado="
				+ partido10Resultado + ", partido11Resultado=" + partido11Resultado + ", partido12Resultado="
				+ partido12Resultado + ", partido13Resultado=" + partido13Resultado + ", partido14Resultado="
				+ partido14Resultado + "ValorDeLaApuesta:" + valorDeLaApuesta + "]";
	}

}
