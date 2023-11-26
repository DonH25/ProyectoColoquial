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

/**
 * Esta clase representa una ventana para mostrar un apostador en la interfaz
 * gráfica. Extiende a JFrame, por lo que hereda todos los métodos y atributos
 * de un JFrame.
 */
public class VentanaMostrarApostador extends JFrame {
	/**
	 * serialVersionUID es un identificador de versión para la serialización. Es
	 * necesario para garantizar que durante la deserialización el cargador de
	 * clases cargue la misma clase que fue serializada.
	 */
	private static final long serialVersionUID = 8015307293827484642L;
	/**
	 * Los siguientes son etiquetas para indicar al usuario qué información se debe
	 * ingresar en los campos de texto correspondientes.
	 */
	private JLabel indicacionesMostrar, fondo;

	/**
	 * Este es un área de texto para mostrar la salida.
	 */
	private JTextArea salidaTos;
	/**
	 * Este es un panel de desplazamiento para el área de texto.
	 */
	private JScrollPane scroll;
	/**
	 * Los siguientes son botones para realizar acciones como mostrar un apostador y
	 * regresar.
	 */
	private JButton mostrarApostador, regresar;

	/**
	 * Este es el constructor de la clase VentanaMostrarApostador. Inicializa la
	 * ventana y todos sus componentes.
	 */
	public VentanaMostrarApostador() {
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

		indicacionesMostrar = new JLabel("Presione el boton  para MOSTRAR todos los apostadores");
		indicacionesMostrar.setBounds(0, 400, 520, 20);
		indicacionesMostrar.setForeground(Color.white);

		salidaTos = new JTextArea();
		salidaTos.setBounds(300, 0, 600, 300);
		salidaTos.setBackground(Color.LIGHT_GRAY);
		scroll = new JScrollPane(salidaTos);
		scroll.setBounds(300, 0, 600, 300);
		mostrarApostador = new JButton();
		mostrarApostador.setBounds(1000, 450, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/botonActualizarApostador.jpg").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		mostrarApostador.setIcon(imagen1);

		regresar = new JButton();
		regresar.setBounds(0, 0, 100, 100);
		Image temp111111;
		temp111111 = new ImageIcon("src/imagenes/regresar.png").getImage();
		ImageIcon imagen11111111;
		imagen11111111 = new ImageIcon(temp111111.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		regresar.setIcon(imagen11111111);
		regresar.setOpaque(false);
		regresar.setContentAreaFilled(false);
		regresar.setBorderPainted(false);

		add(mostrarApostador);
		add(indicacionesMostrar);
		add(regresar);
		add(scroll);
		add(fondo);
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getCrearApostador() {
		return mostrarApostador;
	}

	public void setCrearApostador(JButton crearApostador) {
		this.mostrarApostador = crearApostador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getMostrarApostador() {
		return mostrarApostador;
	}

	public void setMostrarApostador(JButton mostrarApostador) {
		this.mostrarApostador = mostrarApostador;
	}

	public JButton getRegresar() {
		return regresar;
	}

	public void setRegresar(JButton regresar) {
		this.regresar = regresar;
	}

	public JLabel getIndicacionesMostrar() {
		return indicacionesMostrar;
	}

	public void setIndicacionesMostrar(JLabel indicacionesMostrar) {
		this.indicacionesMostrar = indicacionesMostrar;
	}

	public JTextArea getSalidaTos() {
		return salidaTos;
	}

	public void setSalidaTos(JTextArea salidaTos) {
		this.salidaTos = salidaTos;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}
	

}
