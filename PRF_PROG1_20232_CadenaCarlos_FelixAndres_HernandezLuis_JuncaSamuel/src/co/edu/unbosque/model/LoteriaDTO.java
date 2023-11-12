package co.edu.unbosque.model;

public class LoteriaDTO {
private String nombreLoteria;
private int digito1;
private int digito2;
private int digito3;
private int digito4;
private int serie;
public LoteriaDTO() {
	// TODO Auto-generated constructor stub
}
public LoteriaDTO(String nombreLoteria, int digito1, int digito2, int digito3, int digito4, int serie) {
	super();
	this.nombreLoteria = nombreLoteria;
	this.digito1 = digito1;
	this.digito2 = digito2;
	this.digito3 = digito3;
	this.digito4 = digito4;
	this.serie = serie;
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
public int getSerie() {
	return serie;
}
public void setSerie(int serie) {
	this.serie = serie;
}
@Override
public String toString() {
	return "nombre de la Loteria=" + nombreLoteria + ", digito1=" + digito1 + ", digito2=" + digito2 + ", digito3="
			+ digito3 + ", digito4=" + digito4 + ", serie=" + serie + "\n";
}

}
