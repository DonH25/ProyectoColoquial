package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaMenuSeleccion extends JFrame {
	private static final long serialVersionUID = 3739897725046173250L;
	private JLabel fondo;
	private JButton botonParametros, botonApostador, botonConsultas, botonSalir;

	public VentanaMenuSeleccion() {

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

		botonParametros = new JButton();
		botonParametros.setBounds(120, 70, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/modificarparaLogo.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonParametros.setIcon(imagen1);

		botonApostador = new JButton();
		botonApostador.setBounds(900, 70, 200, 200);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/moduloConsultas.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonApostador.setIcon(imagen11);

		botonConsultas = new JButton();
		botonConsultas.setBounds(120, 400, 200, 200);
		Image temp111;
		temp111 = new ImageIcon("src/imagenes/moduloConsultas.png").getImage();
		ImageIcon imagen111;
		imagen111 = new ImageIcon(temp111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonConsultas.setIcon(imagen111);

		botonSalir = new JButton();
		botonSalir.setBounds(900, 400, 200, 200);
		Image temp1111;
		temp1111 = new ImageIcon("src/imagenes/exitProgram.png").getImage();
		ImageIcon imagen1111;
		imagen1111 = new ImageIcon(temp1111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonSalir.setIcon(imagen1111);

		add(botonSalir);
		add(botonParametros);
		add(botonApostador);
		add(botonConsultas);
		add(fondo);
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getBotonParametros() {
		return botonParametros;
	}

	public void setBotonParametros(JButton botonParametros) {
		this.botonParametros = botonParametros;
	}

	public JButton getBotonApostador() {
		return botonApostador;
	}

	public void setBotonApostador(JButton botonApostador) {
		this.botonApostador = botonApostador;
	}

	public JButton getBotonConsultas() {
		return botonConsultas;
	}

	public void setBotonConsultas(JButton botonConsultas) {
		this.botonConsultas = botonConsultas;
	}

	public JButton getBotonSalir() {
		return botonSalir;
	}

	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
