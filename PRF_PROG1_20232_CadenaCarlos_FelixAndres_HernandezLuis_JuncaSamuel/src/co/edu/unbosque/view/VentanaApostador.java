package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaApostador extends JFrame {
	private static final long serialVersionUID = 8015307293827484642L;
	private JTextField campoNombre, campoCedula, campoSede, campoDireccion, campoCelular, campoAnio, campoModif;
	private JLabel indicacionesNombre, indicacionesCedula, indicacionesSede, indicacionesDireccion, indicacionesCelular,
			indicacionesAnioNacimiento, indicacionesModif, fondo;

	private JButton crearApostador, modificarApostador;

	public VentanaApostador() {
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

		indicacionesNombre = new JLabel("Inserte en el espacio de abajo el nombre del cliente");
		indicacionesNombre.setBounds(0, 70, 500, 20);
		indicacionesNombre.setForeground(Color.white);
		campoNombre = new JTextField();
		campoNombre.setBounds(0, 100, 300, 20);

		indicacionesCedula = new JLabel(
				"Inserte en el espacio de abajo La cedula del cliente (sin puntos)(ni espacios)");
		indicacionesCedula.setBounds(0, 170, 500, 20);
		indicacionesCedula.setForeground(Color.white);
		campoCedula = new JTextField();
		campoCedula.setBounds(0, 200, 300, 20);

		indicacionesSede = new JLabel("Inserte en el espacio de abajo la sede en la que apostara el cliente");
		indicacionesSede.setBounds(0, 270, 500, 20);
		indicacionesSede.setForeground(Color.white);
		campoSede = new JTextField();
		campoSede.setBounds(0, 300, 300, 20);

		indicacionesDireccion = new JLabel("Inserte en el espacio de abajo La direccion del apostador");
		indicacionesDireccion.setBounds(600, 70, 500, 20);
		indicacionesDireccion.setForeground(Color.white);
		campoDireccion = new JTextField();
		campoDireccion.setBounds(600, 100, 300, 20);

		indicacionesCelular = new JLabel(
				"Inserte en el espacio de abajo el numero de celular del cliente( sin espacios)(ni puntos)");
		indicacionesCelular.setBounds(600, 170, 500, 20);
		indicacionesCelular.setForeground(Color.white);
		campoCelular = new JTextField();
		campoCelular.setBounds(600, 200, 300, 20);

		indicacionesAnioNacimiento = new JLabel("Inserte en el espacio de abajo el año de nacimiento del apostador");
		indicacionesAnioNacimiento.setBounds(600, 270, 500, 20);
		indicacionesAnioNacimiento.setForeground(Color.white);
		campoAnio = new JTextField();
		campoAnio.setBounds(600, 300, 300, 20);

		indicacionesModif = new JLabel(
				"Inserte en el espacio de abajo la posicion del apostador que desea modificar (comienza a contar desde 0) ");
		indicacionesModif.setBounds(600, 370, 700, 20);
		indicacionesModif.setForeground(Color.white);
		indicacionesModif.setVisible(false);
		campoModif = new JTextField();
		campoModif.setBounds(600, 400, 400, 20);
		campoModif.setVisible(false);

		crearApostador = new JButton();
		crearApostador.setBounds(1000, 450, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/crearApostador.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		crearApostador.setIcon(imagen1);

		modificarApostador = new JButton();
		modificarApostador.setBounds(1000, 450, 200, 200);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/botonActualizarApostador.jpg").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		modificarApostador.setIcon(imagen11);
		modificarApostador.setVisible(false);

		add(campoNombre);
		add(indicacionesNombre);
		add(campoCedula);
		add(indicacionesCedula);
		add(campoSede);
		add(indicacionesSede);
		add(campoDireccion);
		add(indicacionesDireccion);
		add(campoCelular);
		add(indicacionesCelular);
		add(campoAnio);
		add(indicacionesAnioNacimiento);
		add(crearApostador);
		add(modificarApostador);
		add(campoModif);
		add(indicacionesModif);
		add(fondo);
	}

	public JTextField getCampoNombre() {
		return campoNombre;
	}

	public void setCampoNombre(JTextField campoNombre) {
		this.campoNombre = campoNombre;
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

	public JTextField getCampoDireccion() {
		return campoDireccion;
	}

	public void setCampoDireccion(JTextField campoDireccion) {
		this.campoDireccion = campoDireccion;
	}

	public JTextField getCampoCelular() {
		return campoCelular;
	}

	public void setCampoCelular(JTextField campoCelular) {
		this.campoCelular = campoCelular;
	}

	public JTextField getCampoAnio() {
		return campoAnio;
	}

	public void setCampoAnio(JTextField campoAnio) {
		this.campoAnio = campoAnio;
	}

	public JLabel getIndicacionesNombre() {
		return indicacionesNombre;
	}

	public void setIndicacionesNombre(JLabel indicacionesNombre) {
		this.indicacionesNombre = indicacionesNombre;
	}

	public JLabel getIndicacionesCedula() {
		return indicacionesCedula;
	}

	public void setIndicacionesCedula(JLabel indicacionesCedula) {
		this.indicacionesCedula = indicacionesCedula;
	}

	public JLabel getIndicacionesSede() {
		return indicacionesSede;
	}

	public void setIndicacionesSede(JLabel indicacionesSede) {
		this.indicacionesSede = indicacionesSede;
	}

	public JLabel getIndicacionesDireccion() {
		return indicacionesDireccion;
	}

	public void setIndicacionesDireccion(JLabel indicacionesDireccion) {
		this.indicacionesDireccion = indicacionesDireccion;
	}

	public JLabel getIndicacionesCelular() {
		return indicacionesCelular;
	}

	public void setIndicacionesCelular(JLabel indicacionesCelular) {
		this.indicacionesCelular = indicacionesCelular;
	}

	public JLabel getIndicacionesAnioNacimiento() {
		return indicacionesAnioNacimiento;
	}

	public void setIndicacionesAnioNacimiento(JLabel indicacionesAnioNacimiento) {
		this.indicacionesAnioNacimiento = indicacionesAnioNacimiento;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getCrearApostador() {
		return crearApostador;
	}

	public void setCrearApostador(JButton crearApostador) {
		this.crearApostador = crearApostador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getModificarApostador() {
		return modificarApostador;
	}

	public void setModificarApostador(JButton modificarApostador) {
		this.modificarApostador = modificarApostador;
	}

	public JTextField getCampoModif() {
		return campoModif;
	}

	public void setCampoModif(JTextField campoModif) {
		this.campoModif = campoModif;
	}

	public JLabel getIndicacionesModif() {
		return indicacionesModif;
	}

	public void setIndicacionesModif(JLabel indicacionesModif) {
		this.indicacionesModif = indicacionesModif;
	}

}
