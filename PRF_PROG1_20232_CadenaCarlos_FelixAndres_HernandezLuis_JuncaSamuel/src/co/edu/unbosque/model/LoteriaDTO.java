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

	public LoteriaDTO(String nameSede, long numDeCedula, String diaDeLaApuesta) {
		super(nameSede, numDeCedula, diaDeLaApuesta);
		// TODO Auto-generated constructor stub
	}

	public String getNombreLoteria() {
		return nombreLoteria;
	}

	public void setNombreLoteria(String nombreLoteria) {
		this.nombreLoteria = nombreLoteria;
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

	public int getSerieDig1() {
		return serieDig1;
	}

	public void setSerieDig1(int serieDig1) {
		this.serieDig1 = serieDig1;
	}

	public int getSerieDig2() {
		return serieDig2;
	}

	public void setSerieDig2(int serieDig2) {
		this.serieDig2 = serieDig2;
	}

	public int getSerieDig3() {
		return serieDig3;
	}

	public void setSerieDig3(int serieDig3) {
		this.serieDig3 = serieDig3;
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
		return super.toString() + "LoteriaDTO [nombreLoteria=" + nombreLoteria + ", digito1=" + digito1 + ", digito2="
				+ digito2 + ", digito3=" + digito3 + ", digito4=" + digito4 + ", serieDig1=" + serieDig1
				+ ", serieDig2=" + serieDig2 + ", serieDig3=" + serieDig3 + "ValorDeLaApuesta:" + valorDeLaApuesta
				+ "]";
	}

}