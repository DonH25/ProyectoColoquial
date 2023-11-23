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

public class VentanaMostrarApostador extends JFrame {
	private static final long serialVersionUID = 8015307293827484642L;
	private JLabel indicacionesMostrar, fondo;
	private JTextArea salidaTos;
	private JScrollPane scroll;
	private JButton mostrarApostador, regresar;

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
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/regresar.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		regresar.setIcon(imagen11);

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

}
