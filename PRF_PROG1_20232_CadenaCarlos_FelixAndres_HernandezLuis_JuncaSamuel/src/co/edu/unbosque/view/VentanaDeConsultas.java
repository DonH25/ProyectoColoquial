package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Esta clase representa una ventana de consultas en la interfaz gráfica.
 * Extiende a JFrame, por lo que hereda todos los métodos y atributos de un
 * JFrame.
 */
public class VentanaDeConsultas extends JFrame {
	/**
	 * serialVersionUID es un identificador de versión para la serialización. Es
	 * necesario para garantizar que durante la deserialización el cargador de
	 * clases cargue la misma clase que fue serializada.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -8604676120792617421L;
	/**
	 * Los siguientes son etiquetas para mostrar el fondo y el logo.
	 */
	private JLabel fondo, logo;
	/**
	 * Los siguientes son botones para realizar acciones como consultar clientes por
	 * sede, valor total de apuestas por cliente, apuestas por cliente, salir y
	 * apuestas por sedes y tipo.
	 */
	private JButton clientesSede, valorTotalapuestasCliente, apuestasPorCliente, botonSalir, apuestasSedesYTipo,
			regresar;

	/**
	 * Los siguientes son etiquetas para mostrar el fondo y el logo.
	 */
	public VentanaDeConsultas() {
		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp;
		temp = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen);

		clientesSede = new JButton();
		clientesSede.setBounds(120, 70, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/clientesPorSede.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		clientesSede.setIcon(imagen1);

		valorTotalapuestasCliente = new JButton();
		valorTotalapuestasCliente.setBounds(900, 70, 200, 200);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/ApuestasPorCliente.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		valorTotalapuestasCliente.setIcon(imagen11);

		apuestasPorCliente = new JButton();
		apuestasPorCliente.setBounds(120, 400, 200, 200);
		Image temp111;
		temp111 = new ImageIcon("src/imagenes/detallesApuesta.png").getImage();
		ImageIcon imagen111;
		imagen111 = new ImageIcon(temp111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		apuestasPorCliente.setIcon(imagen111);

		botonSalir = new JButton();
		botonSalir.setBounds(900, 400, 200, 200);
		Image temp1111;
		temp1111 = new ImageIcon("src/imagenes/exitProgram.png").getImage();
		ImageIcon imagen1111;
		imagen1111 = new ImageIcon(temp1111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonSalir.setIcon(imagen1111);

		apuestasSedesYTipo = new JButton();
		apuestasSedesYTipo.setBounds(525, 400, 200, 200);
		Image temp11111;
		temp11111 = new ImageIcon("src/imagenes/ApuestasPorSedeyJuego.png").getImage();
		ImageIcon imagen11111;
		imagen11111 = new ImageIcon(temp11111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		apuestasSedesYTipo.setIcon(imagen11111);

		logo = new JLabel();
		logo.setBounds(450, 0, 350, 350);
		Image temp1111111;
		temp1111111 = new ImageIcon("src/imagenes/coloquiales.png").getImage();
		ImageIcon imagen1111111;
		imagen1111111 = new ImageIcon(temp1111111.getScaledInstance(350, 350, Image.SCALE_SMOOTH));
		logo.setIcon(imagen1111111);

		regresar = new JButton();
		regresar.setBounds(0, 0, 100, 100);
		Image temp11111111;
		temp11111111 = new ImageIcon("src/imagenes/regresar.png").getImage();
		ImageIcon imagen11111111;
		imagen11111111 = new ImageIcon(temp11111111.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		regresar.setIcon(imagen11111111);
		regresar.setOpaque(false);
		regresar.setContentAreaFilled(false);
		regresar.setBorderPainted(false);

		add(botonSalir);
		add(apuestasSedesYTipo);
		add(valorTotalapuestasCliente);
		add(apuestasPorCliente);
		add(valorTotalapuestasCliente);
		add(clientesSede);
		add(logo);
		add(regresar);
		add(fondo);
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JButton getClientesSede() {
		return clientesSede;
	}

	public void setClientesSede(JButton clientesSede) {
		this.clientesSede = clientesSede;
	}

	public JButton getValorTotalapuestasCliente() {
		return valorTotalapuestasCliente;
	}

	public void setValorTotalapuestasCliente(JButton valorTotalapuestasCliente) {
		this.valorTotalapuestasCliente = valorTotalapuestasCliente;
	}

	public JButton getApuestasPorCliente() {
		return apuestasPorCliente;
	}

	public void setApuestasPorCliente(JButton apuestasPorCliente) {
		this.apuestasPorCliente = apuestasPorCliente;
	}

	public JButton getBotonSalir() {
		return botonSalir;
	}

	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;
	}

	public JButton getApuestasSedesYTipo() {
		return apuestasSedesYTipo;
	}

	public void setApuestasSedesYTipo(JButton apuestasSedesYTipo) {
		this.apuestasSedesYTipo = apuestasSedesYTipo;
	}

	public JButton getRegresar() {
		return regresar;
	}

	public void setRegresar(JButton regresar) {
		this.regresar = regresar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
