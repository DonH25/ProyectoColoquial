package co.edu.unbosque.model;

import java.io.Serializable;

public class SuperastroDTO extends GestionApuestaDTO implements Serializable {

	/**
	 * 
	 */
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

	public SuperastroDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		// TODO Auto-generated constructor stub
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

	public String getZodiacoSigno() {
		return zodiacoSigno;
	}

	public void setZodiacoSigno(String zodiacoSigno) {
		this.zodiacoSigno = zodiacoSigno;
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
		return super.toString() + "digito1: " + digito1 + ", digito2: " + digito2 + ", digito3: " + digito3
				+ ", digito4:" + digito4 + ", Signo Del Zodiaco:" + zodiacoSigno + "]";
	}

}
