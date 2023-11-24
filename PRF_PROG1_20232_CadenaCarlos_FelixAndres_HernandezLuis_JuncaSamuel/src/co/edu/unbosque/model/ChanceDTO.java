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

	public ChanceDTO(int digito1, int digito2, int digito3, int digito4, double valorDeLaApuesta, String loteria) {
		super();
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
		this.valorDeLaApuesta = valorDeLaApuesta;
		this.loteria = loteria;
	}

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

	public ChanceDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		// TODO Auto-generated constructor stub
	}

	public String getLoteria() {
		return loteria;
	}

	public void setLoteria(String loteria) {
		this.loteria = loteria;
	}

	public int getDigito1() {
		return digito1;
	}

	public void setDigito1(int digito1) {
		this.digito1 = digito1;
	}

	public int getDigito2() {
		return digito2;
	}

	public void setDigito2(int digito2) {
		this.digito2 = digito2;
	}

	public int getDigito3() {
		return digito3;
	}

	public void setDigito3(int digito3) {
		this.digito3 = digito3;
	}

	public int getDigito4() {
		return digito4;
	}

	public void setDigito4(int digito4) {
		this.digito4 = digito4;
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
		return "ChanceDTO [digito1=" + digito1 + ", digito2=" + digito2 + ", digito3=" + digito3 + ", digito4="
				+ digito4 + "]";
	}

}
