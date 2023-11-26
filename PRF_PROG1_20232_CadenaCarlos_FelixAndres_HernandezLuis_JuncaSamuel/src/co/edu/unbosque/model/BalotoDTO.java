package co.edu.unbosque.model;

import java.io.Serializable;

public class BalotoDTO extends GestionApuestaDTO implements Serializable {

	private static final long serialVersionUID = -9020637693354983586L;
	private int digito1;
	private int digito2;
	private int digito3;
	private int digito4;
	private int digito5;
	private int digito6;
	private double valorDeLaApuesta;

	public BalotoDTO() {
		// TODO Auto-generated constructor stub
	}

	public BalotoDTO(int digito1, int digito2, int digito3, int digito4, int digito5, int digito6,
			double valorDeLaApuesta) {
		super();
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.digito3 = digito3;
		this.digito4 = digito4;
		this.digito5 = digito5;
		this.digito6 = digito6;
		this.valorDeLaApuesta = valorDeLaApuesta;
	}

	public BalotoDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
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

	public int getDigito5() {
		return digito5;
	}

	public void setDigito5(int digito5) {
		this.digito5 = digito5;
	}

	public int getDigito6() {
		return digito6;
	}

	public void setDigito6(int digito6) {
		this.digito6 = digito6;
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
		return super.toString() + "  primer digito de la apuesta=" + digito1 + ", segundo digito de la apuesta ="
				+ digito2 + ", tercer digito de la apuesta =" + digito3 + ", cuarto digito de la apuesta=" + digito4
				+ ", quinto digito de la apuesta=" + digito5 + ", sexto digito de la apuesta=" + digito6
				+ "ValorDeLaApuesta:" + valorDeLaApuesta + "\n";
	}

}
