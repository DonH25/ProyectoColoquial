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
	private static final long serialVersionUID = 8223489687354336560L;
	private JTextField index, campoDig1, campoDig2, campoDig3, campoDig4, campoSerie, campoValue, campoLote;
	private JButton apost, regresar;
	private JLabel fondo, indicacionIndex, indicacionDig1, indicacionDig2, indicacionDig3, indicacionDig4,
			indicacionZodiac, indicacionValue, indicacionLote;

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

		indicacionZodiac = new JLabel("Por favor inserte La serie de la apuesta ");
		indicacionZodiac.setBounds(100, 250, 300, 30);
		indicacionZodiac.setForeground(Color.white);

		campoSerie = new JTextField();
		campoSerie.setBounds(100, 280, 300, 30);

		indicacionValue = new JLabel("Inserte el valor de su apuesta");
		indicacionValue.setBounds(100, 350, 300, 20);
		indicacionValue.setForeground(Color.white);

		campoValue = new JTextField();
		campoValue.setBounds(100, 380, 300, 20);

		campoLote = new JTextField();
		campoLote.setBounds(100, 480, 300, 20);

		indicacionLote = new JLabel("Inserte la loteria que usted quiere apostar");
		indicacionLote.setBounds(100, 450, 300, 20);
		indicacionLote.setForeground(Color.white);

		apost = new JButton();
		apost.setBounds(700, 250, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/apostar.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		apost.setIcon(imagen1);

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
		add(campoSerie);
		add(campoValue);
		add(index);
		add(indicacionIndex);
		add(indicacionDig1);
		add(indicacionDig2);
		add(indicacionDig3);
		add(indicacionDig4);
		add(indicacionZodiac);
		add(indicacionValue);
		add(indicacionLote);
		add(apost);
		add(regresar);
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

	public JLabel getIndicacionZodiac() {
		return indicacionZodiac;
	}

	public void setIndicacionZodiac(JLabel indicacionZodiac) {
		this.indicacionZodiac = indicacionZodiac;
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

	public JTextField getCampoSerie() {
		return campoSerie;
	}

	public void setCampoSerie(JTextField campoSerie) {
		this.campoSerie = campoSerie;
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
	
	

}
