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

public class VentanaClienteSede extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3499359286690579416L;
	private JLabel fondo, indicacionCampo;
	private JTextArea campoConsulta;
	private JScrollPane scroll;
	private JButton consultarPorCliente, consultarPorSede, regresar;

	public VentanaClienteSede() {
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

		consultarPorCliente = new JButton();
		consultarPorCliente.setBounds(1000, 50, 200, 200);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/consultarPorCliente.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		consultarPorCliente.setIcon(imagen11);
		consultarPorCliente.setVisible(false);

		consultarPorSede = new JButton();
		consultarPorSede.setBounds(1000, 50, 200, 200);
		Image temp111;
		temp111 = new ImageIcon("src/imagenes/consultarPorSedee.png").getImage();
		ImageIcon imagen111;
		imagen111 = new ImageIcon(temp111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		consultarPorSede.setIcon(imagen111);
		consultarPorSede.setVisible(false);

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

		add(indicacionCampo);

		add(scroll);
		add(consultarPorCliente);
		add(consultarPorSede);
		add(regresar);
		add(fondo);

	}

	public JLabel getFondo() {
		return fondo;
	}

	public JButton getRegresar() {
		return regresar;
	}

	public void setRegresar(JButton regresar) {
		this.regresar = regresar;
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

	public JButton getConsultarPorCliente() {
		return consultarPorCliente;
	}

	public void setConsultarPorCliente(JButton consultarPorCliente) {
		this.consultarPorCliente = consultarPorCliente;
	}

	public JButton getConsultarPorSede() {
		return consultarPorSede;
	}

	public void setConsultarPorSede(JButton consultarPorSede) {
		this.consultarPorSede = consultarPorSede;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
