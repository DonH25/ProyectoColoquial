package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	private JLabel fondo, indicacionCampo;
	private JTextArea campoConsulta;
	private JScrollPane scroll;
	private JButton consultar;

	public VentanaApuestaPorCliente() {
		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		indicacionCampo = new JLabel("Aca Abajo se mostrara la consulta del usuario Seleccionado");
		indicacionCampo.setBounds(300, 270, 300, 20);
		indicacionCampo.setForeground(Color.white);
		campoConsulta = new JTextArea();
		campoConsulta.setBounds(300, 0, 600, 300);
		campoConsulta.setBackground(Color.LIGHT_GRAY);
		scroll = new JScrollPane(campoConsulta);
		scroll.setBounds(300, 300, 900, 300);

		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen1);

		consultar = new JButton();
		consultar.setBounds(1000, 50, 200, 200);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/consultar.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		consultar.setIcon(imagen11);

		add(indicacionCampo);

		add(scroll);
		add(consultar);

		add(fondo);

	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JLabel getIndicacionCampo() {
		return indicacionCampo;
	}

	public void setIndicacionCampo(JLabel indicacionCampo) {
		this.indicacionCampo = indicacionCampo;
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

	public JButton getConsultar() {
		return consultar;
	}

	public void setConsultar(JButton consultar) {
		this.consultar = consultar;
	}

}
