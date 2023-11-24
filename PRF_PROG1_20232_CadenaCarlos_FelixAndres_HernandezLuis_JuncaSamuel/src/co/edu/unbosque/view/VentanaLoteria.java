package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaLoteria extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3614924828858164662L;
	private JTextField index, campoDig1, campoDig2, campoDig3, campoDig4, campoValue, campoLote, campoCedula, campoSede,
			campoDia, campoSerie1, campoSerie2, campoSerie3;
	private JButton apost, regresar, modificar;
	private JLabel fondo, indicacionIndex, indicacionDig1, indicacionDig2, indicacionDig3, indicacionDig4,
			indicacionSerie1, indicacionSerie2, indicacionSerie3, indicacionValue, indicacionLote, indicacionLote1,
			indicacionLote2, indicacionLote3, indicacionCedula, indicacionCedula2, indicacionseguridadSede,
			indicacionSeguridadDia;

	public VentanaLoteria() {
		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		indicacionIndex = new JLabel(
				"Inserte la posicion de la persona que quiere apostar(comienza a contar desde 0) ");
		indicacionIndex.setBounds(100, 70, 500, 30);
		indicacionIndex.setForeground(Color.white);

		index = new JTextField();
		index.setBounds(100, 100, 300, 30);

		campoDig1 = new JTextField();
		campoDig1.setBounds(100, 200, 30, 30);

		indicacionDig1 = new JLabel("Dig1");
		indicacionDig1.setBounds(100, 170, 30, 30);
		indicacionDig1.setForeground(Color.white);

		campoDig2 = new JTextField();
		campoDig2.setBounds(130, 200, 30, 30);

		indicacionDig2 = new JLabel("Dig2");
		indicacionDig2.setBounds(130, 170, 30, 30);
		indicacionDig2.setForeground(Color.white);

		campoDig3 = new JTextField();
		campoDig3.setBounds(160, 200, 30, 30);

		indicacionDig3 = new JLabel("Dig3");
		indicacionDig3.setBounds(160, 170, 30, 30);
		indicacionDig3.setForeground(Color.white);

		campoDig4 = new JTextField();
		campoDig4.setBounds(190, 200, 30, 30);

		indicacionDig4 = new JLabel("Dig4");
		indicacionDig4.setBounds(190, 170, 30, 30);
		indicacionDig4.setForeground(Color.white);

		campoSerie1 = new JTextField();
		campoSerie1.setBounds(220, 200, 30, 30);

		indicacionSerie1 = new JLabel("serie1");
		indicacionSerie1.setBounds(220, 170, 30, 30);

		campoSerie2 = new JTextField();
		campoSerie2.setBounds(250, 200, 30, 30);

		indicacionSerie2 = new JLabel("serie2");
		indicacionSerie2.setBounds(250, 170, 30, 30);

		campoSerie3 = new JTextField();
		campoSerie3.setBounds(280, 200, 30, 30);

		indicacionSerie3 = new JLabel("serie3");
		indicacionSerie3.setBounds(280, 170, 30, 30);

		indicacionValue = new JLabel("Inserte el valor de su apuesta");
		indicacionValue.setBounds(100, 250, 300, 20);
		indicacionValue.setForeground(Color.white);

		campoValue = new JTextField();
		campoValue.setBounds(100, 280, 300, 20);

		campoLote = new JTextField();
		campoLote.setBounds(100, 480, 300, 20);

		indicacionLote = new JLabel("Inserte la loteria que usted quiere apostar");
		indicacionLote.setBounds(100, 400, 300, 20);
		indicacionLote.setForeground(Color.white);
		indicacionLote1 = new JLabel("1: Loteria De Cucuta");
		indicacionLote1.setBounds(100, 420, 300, 20);
		indicacionLote1.setForeground(Color.white);
		indicacionLote2 = new JLabel("2: Loteria De Boyaca");
		indicacionLote2.setBounds(100, 440, 300, 20);
		indicacionLote2.setForeground(Color.white);
		indicacionLote3 = new JLabel("3: Loteria de Cundinamarca");
		indicacionLote3.setBounds(100, 460, 300, 20);
		indicacionLote3.setForeground(Color.white);

		campoCedula = new JTextField();
		campoCedula.setBounds(100, 580, 300, 20);

		indicacionCedula = new JLabel("Para comprobar que el usuario ingresado es el correcto ");
		indicacionCedula.setBounds(100, 530, 340, 20);
		indicacionCedula.setForeground(Color.white);

		indicacionCedula2 = new JLabel("inserte el numero de cedula del Usuario De Nuevo");
		indicacionCedula2.setBounds(100, 550, 300, 20);
		indicacionCedula2.setForeground(Color.white);

		campoSede = new JTextField();
		campoSede.setBounds(500, 160, 200, 20);

		indicacionseguridadSede = new JLabel("por seguridad ingrese la sede que aposto");
		indicacionseguridadSede.setBounds(500, 130, 250, 20);
		indicacionseguridadSede.setForeground(Color.white);

		campoDia = new JTextField();
		campoDia.setBounds(500, 230, 200, 20);

		indicacionSeguridadDia = new JLabel("por seguridad ingrese El dia de hoy (lunes a domingo)");
		indicacionSeguridadDia.setBounds(500, 200, 340, 20);
		indicacionSeguridadDia.setForeground(Color.white);

		apost = new JButton();
		apost.setBounds(700, 250, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/apostar.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		apost.setIcon(imagen1);

		modificar = new JButton();
		modificar.setBounds(800, 250, 200, 200);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/modificarApuesta.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		modificar.setIcon(imagen11);
		modificar.setVisible(false);

		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp;
		temp = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen);

		regresar = new JButton();
		regresar.setBounds(0, 0, 100, 100);
		Image temp11111;
		temp11111 = new ImageIcon("src/imagenes/regresar.png").getImage();
		ImageIcon imagen11111;
		imagen11111 = new ImageIcon(temp11111.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		regresar.setIcon(imagen11111);
		regresar.setOpaque(false);
		regresar.setContentAreaFilled(false);
		regresar.setBorderPainted(false);

		add(campoDig1);
		add(campoDig2);
		add(campoDig3);
		add(campoDig4);
		add(campoLote);
		add(campoValue);
		add(campoCedula);
		add(campoDia);
		add(campoSede);
		add(campoLote);
		add(campoSerie1);
		add(campoSerie2);
		add(campoSerie3);
		add(indicacionSerie1);
		add(indicacionSerie2);
		add(indicacionSerie3);
		add(index);
		add(indicacionIndex);
		add(indicacionDig1);
		add(indicacionDig2);
		add(indicacionDig3);
		add(indicacionDig4);
		add(indicacionValue);
		add(indicacionLote);
		add(indicacionLote1);
		add(indicacionLote2);
		add(indicacionLote3);
		add(indicacionSeguridadDia);
		add(indicacionseguridadSede);
		add(indicacionCedula);
		add(indicacionCedula2);
		add(apost);
		add(regresar);
		add(modificar);
		add(fondo);

	}

	public JTextField getCedula() {
		return index;
	}

	public void setCedula(JTextField cedula) {
		this.index = cedula;
	}

	public JTextField getCampoDig1() {
		return campoDig1;
	}

	public void setCampoDig1(JTextField campoDig1) {
		this.campoDig1 = campoDig1;
	}

	public JTextField getCampoDig2() {
		return campoDig2;
	}

	public void setCampoDig2(JTextField campoDig2) {
		this.campoDig2 = campoDig2;
	}

	public JTextField getCampoDig3() {
		return campoDig3;
	}

	public void setCampoDig3(JTextField campoDig3) {
		this.campoDig3 = campoDig3;
	}

	public JTextField getCampoDig4() {
		return campoDig4;
	}

	public void setCampoDig4(JTextField campoDig4) {
		this.campoDig4 = campoDig4;
	}

	public JTextField getCampoValue() {
		return campoValue;
	}

	public void setCampoValue(JTextField campoValue) {
		this.campoValue = campoValue;
	}

	public JButton getApost() {
		return apost;
	}

	public void setApost(JButton apost) {
		this.apost = apost;
	}

	public JButton getRegresar() {
		return regresar;
	}

	public void setRegresar(JButton regresar) {
		this.regresar = regresar;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JLabel getIndicacionCedula() {
		return indicacionIndex;
	}

	public void setIndicacionCedula(JLabel indicacionCedula) {
		this.indicacionIndex = indicacionCedula;
	}

	public JLabel getIndicacionDig1() {
		return indicacionDig1;
	}

	public void setIndicacionDig1(JLabel indicacionDig1) {
		this.indicacionDig1 = indicacionDig1;
	}

	public JLabel getIndicacionDig2() {
		return indicacionDig2;
	}

	public void setIndicacionDig2(JLabel indicacionDig2) {
		this.indicacionDig2 = indicacionDig2;
	}

	public JLabel getIndicacionDig3() {
		return indicacionDig3;
	}

	public void setIndicacionDig3(JLabel indicacionDig3) {
		this.indicacionDig3 = indicacionDig3;
	}

	public JLabel getIndicacionDig4() {
		return indicacionDig4;
	}

	public void setIndicacionDig4(JLabel indicacionDig4) {
		this.indicacionDig4 = indicacionDig4;
	}

	public JLabel getIndicacionValue() {
		return indicacionValue;
	}

	public void setIndicacionValue(JLabel indicacionValue) {
		this.indicacionValue = indicacionValue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTextField getIndex() {
		return index;
	}

	public void setIndex(JTextField index) {
		this.index = index;
	}

	public JLabel getIndicacionIndex() {
		return indicacionIndex;
	}

	public void setIndicacionIndex(JLabel indicacionIndex) {
		this.indicacionIndex = indicacionIndex;
	}

	public JTextField getCampoLote() {
		return campoLote;
	}

	public void setCampoLote(JTextField campoLote) {
		this.campoLote = campoLote;
	}

	public JLabel getIndicacionLote() {
		return indicacionLote;
	}

	public void setIndicacionLote(JLabel indicacionLote) {
		this.indicacionLote = indicacionLote;
	}

	public JTextField getCampoCedula() {
		return campoCedula;
	}

	public void setCampoCedula(JTextField campoCedula) {
		this.campoCedula = campoCedula;
	}

	public JTextField getCampoSede() {
		return campoSede;
	}

	public void setCampoSede(JTextField campoSede) {
		this.campoSede = campoSede;
	}

	public JTextField getCampoDia() {
		return campoDia;
	}

	public void setCampoDia(JTextField campoDia) {
		this.campoDia = campoDia;
	}

	public JLabel getIndicacionLote1() {
		return indicacionLote1;
	}

	public void setIndicacionLote1(JLabel indicacionLote1) {
		this.indicacionLote1 = indicacionLote1;
	}

	public JLabel getIndicacionLote2() {
		return indicacionLote2;
	}

	public void setIndicacionLote2(JLabel indicacionLote2) {
		this.indicacionLote2 = indicacionLote2;
	}

	public JLabel getIndicacionLote3() {
		return indicacionLote3;
	}

	public void setIndicacionLote3(JLabel indicacionLote3) {
		this.indicacionLote3 = indicacionLote3;
	}

	public JLabel getIndicacionCedula2() {
		return indicacionCedula2;
	}

	public void setIndicacionCedula2(JLabel indicacionCedula2) {
		this.indicacionCedula2 = indicacionCedula2;
	}

	public JLabel getIndicacionseguridadSede() {
		return indicacionseguridadSede;
	}

	public void setIndicacionseguridadSede(JLabel indicacionseguridadSede) {
		this.indicacionseguridadSede = indicacionseguridadSede;
	}

	public JLabel getIndicacionSeguridadDia() {
		return indicacionSeguridadDia;
	}

	public void setIndicacionSeguridadDia(JLabel indicacionSeguridadDia) {
		this.indicacionSeguridadDia = indicacionSeguridadDia;
	}

	public JTextField getCampoSerie1() {
		return campoSerie1;
	}

	public void setCampoSerie1(JTextField campoSerie1) {
		this.campoSerie1 = campoSerie1;
	}

	public JTextField getCampoSerie2() {
		return campoSerie2;
	}

	public void setCampoSerie2(JTextField campoSerie2) {
		this.campoSerie2 = campoSerie2;
	}

	public JTextField getCampoSerie3() {
		return campoSerie3;
	}

	public void setCampoSerie3(JTextField campoSerie3) {
		this.campoSerie3 = campoSerie3;
	}

	public JLabel getIndicacionSerie1() {
		return indicacionSerie1;
	}

	public void setIndicacionSerie1(JLabel indicacionSerie1) {
		this.indicacionSerie1 = indicacionSerie1;
	}

	public JLabel getIndicacionSerie2() {
		return indicacionSerie2;
	}

	public void setIndicacionSerie2(JLabel indicacionSerie2) {
		this.indicacionSerie2 = indicacionSerie2;
	}

	public JLabel getIndicacionSerie3() {
		return indicacionSerie3;
	}

	public void setIndicacionSerie3(JLabel indicacionSerie3) {
		this.indicacionSerie3 = indicacionSerie3;
	}

	public JButton getModificar() {
		return modificar;
	}

	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}

}
