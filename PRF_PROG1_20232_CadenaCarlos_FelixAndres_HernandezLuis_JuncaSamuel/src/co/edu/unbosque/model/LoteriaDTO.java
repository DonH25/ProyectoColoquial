package co.edu.unbosque.model;

import java.io.Serializable;

public class LoteriaDTO extends JuegoDTO implements Serializable {
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

	public LoteriaDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego, String nombreLoteria,
			int digito1, int digito2, int digito3, int digito4, int serieDig1, int serieDig2, int serieDig3,
			double valorDeLaApuesta) {
		super(nombreJuego, tipoDejuego, presupuestoDelJuego);
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

	public LoteriaDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
			String tipoDejuego, double presupuestoDelJuego, String nombreLoteria, int digito1, int digito2, int digito3,
			int digito4, int serieDig1, int serieDig2, int serieDig3, double valorDeLaApuesta) {
		super(direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego, presupuestoDelJuego);
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

	public LoteriaDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego,
			String nombreLoteria, int digito1, int digito2, int digito3, int digito4, int serieDig1, int serieDig2,
			int serieDig3, double valorDeLaApuesta) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados, nombreJuego,
				tipoDejuego, presupuestoDelJuego);
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

	public LoteriaDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
			double presupuestoDelJuego, String nombreLoteria, int digito1, int digito2, int digito3, int digito4,
			int serieDig1, int serieDig2, int serieDig3, double valorDeLaApuesta) {
		super(nombre, numeroDeSedes, presupuestoTotal, nombreJuego, tipoDejuego, presupuestoDelJuego);
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

	public LoteriaDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String nombreLoteria, int digito1, int digito2, int digito3,
			int digito4, int serieDig1, int serieDig2, int serieDig3, double valorDeLaApuesta) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
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

	public LoteriaDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreLoteria, int digito1,
			int digito2, int digito3, int digito4, int serieDig1, int serieDig2, int serieDig3,
			double valorDeLaApuesta) {
		super(nombre, numeroDeSedes, presupuestoTotal);
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

	public LoteriaDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreLoteria,
			int digito1, int digito2, int digito3, int digito4, int serieDig1, int serieDig2, int serieDig3,
			double valorDeLaApuesta) {
		super(direccion, barrio, localidad, numEmpleados);
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

	public LoteriaDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
			double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal, nombreJuego, tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}

	public LoteriaDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados, nombreJuego,
				tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}

	public LoteriaDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
			String localidad, long numEmpleados) {
		super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
		// TODO Auto-generated constructor stub
	}

	public LoteriaDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
		super(nombre, numeroDeSedes, presupuestoTotal);
		// TODO Auto-generated constructor stub
	}

	public LoteriaDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
		super(nombreJuego, tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}

	public LoteriaDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
			String tipoDejuego, double presupuestoDelJuego) {
		super(direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego, presupuestoDelJuego);
		// TODO Auto-generated constructor stub
	}

	public LoteriaDTO(String direccion, String barrio, String localidad, long numEmpleados) {
		super(direccion, barrio, localidad, numEmpleados);
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
		return "LoteriaDTO [nombreLoteria=" + nombreLoteria + ", digito1=" + digito1 + ", digito2=" + digito2
				+ ", digito3=" + digito3 + ", digito4=" + digito4 + ", serieDig1=" + serieDig1 + ", serieDig2="
				+ serieDig2 + ", serieDig3=" + serieDig3 + "]";
	}

}