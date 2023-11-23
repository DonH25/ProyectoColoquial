
package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaSeleccionApostadores extends JFrame {
	private static final long serialVersionUID = -6534808995204108233L;
	private JLabel fondo;
	private JButton botonCrear, botonMostrar, botonActualizar, botonEliminar, botonRegresar;

	public VentanaSeleccionApostadores() {
		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		botonCrear = new JButton();
		botonCrear.setBounds(120, 70, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/crearApostador.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonCrear.setIcon(imagen1);

		botonActualizar = new JButton("aCRTUALIZAR");
		botonActualizar.setBounds(900, 70, 200, 200);
//		Image temp11;
//		temp11 = new ImageIcon("src/imagenes/crearApostador.png").getImage();
//		ImageIcon imagen11;
//		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
//		botonActualizar.setIcon(imagen11);

		botonMostrar = new JButton("BOTON MOSTRAR");
		botonMostrar.setBounds(120, 400, 200, 200);
//		Image temp111;
//		temp111 = new ImageIcon("src/imagenes/moduloConsultas.png").getImage();
//		ImageIcon imagen111;
//		imagen111 = new ImageIcon(temp111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
//		botonMostrar.setIcon(imagen111);

		botonEliminar = new JButton("BTON ELIMINAR");
		botonEliminar.setBounds(900, 400, 200, 200);
//		Image temp1111;
//		temp1111 = new ImageIcon("src/imagenes/exitProgram.png").getImage();
//		ImageIcon imagen1111;
//		imagen1111 = new ImageIcon(temp1111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
//		botonEliminar.setIcon(imagen1111);
		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp;
		temp = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen);

		botonRegresar = new JButton();
		botonRegresar.setBounds(0, 0, 100, 100);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/regresar.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		botonRegresar.setIcon(imagen11);

		add(botonEliminar);
		add(botonCrear);
		add(botonActualizar);
		add(botonMostrar);
		add(botonRegresar);
		add(fondo);

	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getBotonCrear() {
		return botonCrear;
	}

	public void setBotonCrear(JButton botonCrear) {
		this.botonCrear = botonCrear;
	}

	public JButton getBotonMostrar() {
		return botonMostrar;
	}

	public void setBotonMostrar(JButton botonMostrar) {
		this.botonMostrar = botonMostrar;
	}

	public JButton getBotonActualizar() {
		return botonActualizar;
	}

	public void setBotonActualizar(JButton botonActualizar) {
		this.botonActualizar = botonActualizar;
	}

	public JButton getBotonEliminar() {
		return botonEliminar;
	}

	public void setBotonEliminar(JButton botonEliminar) {
		this.botonEliminar = botonEliminar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getBotonRegresar() {
		return botonRegresar;
	}

	public void setBotonRegresar(JButton botonRegresar) {
		this.botonRegresar = botonRegresar;
	}

}
