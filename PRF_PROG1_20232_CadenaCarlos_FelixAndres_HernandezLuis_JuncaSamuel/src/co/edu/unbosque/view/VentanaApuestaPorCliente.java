package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaApuestaPorCliente extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3499359286690579416L;
	private JTextField index, campoCedula;
	private JLabel fondo, indicacionIndex, indicacionIndex1, indicacionCampo, indicacionCedula;
	private JTextArea campoConsulta;
	private JScrollPane scroll;

	public VentanaApuestaPorCliente() {
		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		index = new JTextField();
		index.setBounds(100, 100, 200, 20);

		indicacionIndex = new JLabel("Inserte La posicion Del cliente");
		indicacionIndex.setBounds(100, 80, 200, 20);
		indicacionIndex.setForeground(Color.white);

		indicacionIndex1 = new JLabel("Que desea saber sus Apuestas/Recibos");
		indicacionIndex1.setBounds(100, 60, 200, 20);
		indicacionIndex1.setForeground(Color.white);

		indicacionCampo = new JLabel("Aca Abajo se mostrara la consulta del usuario Seleccionado");
		indicacionCampo.setBounds(300, 270, 300, 20);
		indicacionCampo.setForeground(Color.white);

		campoConsulta = new JTextArea();
		campoConsulta.setBackground(Color.LIGHT_GRAY);
		campoConsulta.setEditable(false);

		campoCedula = new JTextField();
		campoCedula.setBounds(100, 180, 300, 20);

		indicacionCedula = new JLabel("Para comprobar que el usuario ingresado es el correcto ");
		indicacionCedula.setBounds(100, 160, 340, 20);
		indicacionCedula.setForeground(Color.white);

		scroll = new JScrollPane(campoConsulta);
		scroll.setBounds(300, 300, 600, 300);

		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen1);

		add(campoCedula);
		add(index);
		add(indicacionCampo);
		add(indicacionIndex);
		add(indicacionIndex1);
		add(indicacionCedula);
		add(campoConsulta);
		add(scroll);
		add(fondo);

	}

	public JTextField getIndex() {
		return index;
	}

	public void setIndex(JTextField index) {
		this.index = index;
	}

	public JTextField getCampoCedula() {
		return campoCedula;
	}

	public void setCampoCedula(JTextField campoCedula) {
		this.campoCedula = campoCedula;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JLabel getIndicacionIndex() {
		return indicacionIndex;
	}

	public void setIndicacionIndex(JLabel indicacionIndex) {
		this.indicacionIndex = indicacionIndex;
	}

	public JLabel getIndicacionIndex1() {
		return indicacionIndex1;
	}

	public void setIndicacionIndex1(JLabel indicacionIndex1) {
		this.indicacionIndex1 = indicacionIndex1;
	}

	public JLabel getIndicacionCampo() {
		return indicacionCampo;
	}

	public void setIndicacionCampo(JLabel indicacionCampo) {
		this.indicacionCampo = indicacionCampo;
	}

	public JLabel getIndicacionCedula() {
		return indicacionCedula;
	}

	public void setIndicacionCedula(JLabel indicacionCedula) {
		this.indicacionCedula = indicacionCedula;
	}

	public JTextArea getCampoConsulta() {
		return campoConsulta;
	}

	public void setCampoConsulta(JTextArea campoConsulta) {
		this.campoConsulta = campoConsulta;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
