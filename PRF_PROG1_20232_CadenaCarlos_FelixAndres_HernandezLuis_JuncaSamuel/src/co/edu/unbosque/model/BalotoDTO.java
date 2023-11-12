package co.edu.unbosque.model;

import java.io.Serializable;

public class BalotoDTO extends JuegoDTO implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -9020637693354983586L;
private int digito1;
private int digito2;
private int digito3;
private int digito4;
private int digito5;
private int digito6;
public BalotoDTO() {
	// TODO Auto-generated constructor stub
}
public BalotoDTO(int digito1, int digito2, int digito3, int digito4, int digito5, int digito6) {
	super();
	this.digito1 = digito1;
	this.digito2 = digito2;
	this.digito3 = digito3;
	this.digito4 = digito4;
	this.digito5 = digito5;
	this.digito6 = digito6;
}

public BalotoDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego, int digito1, int digito2,
		int digito3, int digito4, int digito5, int digito6) {
	super(nombreJuego, tipoDejuego, presupuestoDelJuego);
	this.digito1 = digito1;
	this.digito2 = digito2;
	this.digito3 = digito3;
	this.digito4 = digito4;
	this.digito5 = digito5;
	this.digito6 = digito6;
}

public BalotoDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
		String tipoDejuego, double presupuestoDelJuego, int digito1, int digito2, int digito3, int digito4, int digito5,
		int digito6) {
	super(direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego, presupuestoDelJuego);
	this.digito1 = digito1;
	this.digito2 = digito2;
	this.digito3 = digito3;
	this.digito4 = digito4;
	this.digito5 = digito5;
	this.digito6 = digito6;
}

public BalotoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
		String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego,
		int digito1, int digito2, int digito3, int digito4, int digito5, int digito6) {
	super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego,
			presupuestoDelJuego);
	this.digito1 = digito1;
	this.digito2 = digito2;
	this.digito3 = digito3;
	this.digito4 = digito4;
	this.digito5 = digito5;
	this.digito6 = digito6;
}

public BalotoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
		double presupuestoDelJuego, int digito1, int digito2, int digito3, int digito4, int digito5, int digito6) {
	super(nombre, numeroDeSedes, presupuestoTotal, nombreJuego, tipoDejuego, presupuestoDelJuego);
	this.digito1 = digito1;
	this.digito2 = digito2;
	this.digito3 = digito3;
	this.digito4 = digito4;
	this.digito5 = digito5;
	this.digito6 = digito6;
}

public BalotoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
		String localidad, long numEmpleados, int digito1, int digito2, int digito3, int digito4, int digito5,
		int digito6) {
	super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
	this.digito1 = digito1;
	this.digito2 = digito2;
	this.digito3 = digito3;
	this.digito4 = digito4;
	this.digito5 = digito5;
	this.digito6 = digito6;
}

public BalotoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, int digito1, int digito2, int digito3,
		int digito4, int digito5, int digito6) {
	super(nombre, numeroDeSedes, presupuestoTotal);
	this.digito1 = digito1;
	this.digito2 = digito2;
	this.digito3 = digito3;
	this.digito4 = digito4;
	this.digito5 = digito5;
	this.digito6 = digito6;
}

public BalotoDTO(String direccion, String barrio, String localidad, long numEmpleados, int digito1, int digito2,
		int digito3, int digito4, int digito5, int digito6) {
	super(direccion, barrio, localidad, numEmpleados);
	this.digito1 = digito1;
	this.digito2 = digito2;
	this.digito3 = digito3;
	this.digito4 = digito4;
	this.digito5 = digito5;
	this.digito6 = digito6;
}

public BalotoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String nombreJuego, String tipoDejuego,
		double presupuestoDelJuego) {
	super(nombre, numeroDeSedes, presupuestoTotal, nombreJuego, tipoDejuego, presupuestoDelJuego);
	// TODO Auto-generated constructor stub
}
public BalotoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
		String localidad, long numEmpleados, String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
	super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego,
			presupuestoDelJuego);
	// TODO Auto-generated constructor stub
}
public BalotoDTO(String nombre, int numeroDeSedes, double presupuestoTotal, String direccion, String barrio,
		String localidad, long numEmpleados) {
	super(nombre, numeroDeSedes, presupuestoTotal, direccion, barrio, localidad, numEmpleados);
	// TODO Auto-generated constructor stub
}
public BalotoDTO(String nombre, int numeroDeSedes, double presupuestoTotal) {
	super(nombre, numeroDeSedes, presupuestoTotal);
	// TODO Auto-generated constructor stub
}
public BalotoDTO(String nombreJuego, String tipoDejuego, double presupuestoDelJuego) {
	super(nombreJuego, tipoDejuego, presupuestoDelJuego);
	// TODO Auto-generated constructor stub
}
public BalotoDTO(String direccion, String barrio, String localidad, long numEmpleados, String nombreJuego,
		String tipoDejuego, double presupuestoDelJuego) {
	super(direccion, barrio, localidad, numEmpleados, nombreJuego, tipoDejuego, presupuestoDelJuego);
	// TODO Auto-generated constructor stub
}
public BalotoDTO(String direccion, String barrio, String localidad, long numEmpleados) {
	super(direccion, barrio, localidad, numEmpleados);
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
@Override
public String toString() {
	return "BalotoDTO [digito1=" + digito1 + ", digito2=" + digito2 + ", digito3=" + digito3 + ", digito4=" + digito4
			+ ", digito5=" + digito5 + ", digito6=" + digito6 + "]";
}


}
