package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCrearCasaApuestas extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -97942622027646067L;
	private JButton botonRegistrarCasa;
	private JTextField nombreCasaDeApuestas, sedesCasaDeApuestas, presupuestoCasaDeApuestas;
	private JLabel indicacionesCasaApuestas, indicacionesSedes, indicacionesPresupuesto, textoIndicaciones1,
			textoIndicaciones2, textoIndicaciones3, textoIndicaciones4, fondo;

	public VentanaCrearCasaApuestas() {
		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		nombreCasaDeApuestas = new JTextField();
		nombreCasaDeApuestas.setBounds(40, 130, 350, 30);

		indicacionesCasaApuestas = new JLabel();
		indicacionesCasaApuestas.setBounds(40, 110, 300, 25);
		indicacionesCasaApuestas.setText("Ingresar en el espacio de abajo el nombre de la casa de apuestas. ");
		indicacionesCasaApuestas.setForeground(Color.WHITE);

		indicacionesSedes = new JLabel();
		indicacionesSedes.setBounds(740, 110, 500, 25);
		indicacionesSedes
				.setText("Ingresar en el espacio de abajo La cantidad de sedes que tiene La Casa de Apuestas  ");
		indicacionesSedes.setForeground(Color.WHITE);

		sedesCasaDeApuestas = new JTextField();
		sedesCasaDeApuestas.setBounds(740, 130, 350, 30);

		indicacionesPresupuesto = new JLabel();
		indicacionesPresupuesto.setBounds(440, 270, 500, 25);
		indicacionesPresupuesto
				.setText("Ingresar en el espacio de abajo el presupuesto total que tiene la casa de apuestas : ");
		indicacionesPresupuesto.setForeground(Color.WHITE);

		presupuestoCasaDeApuestas = new JTextField();
		presupuestoCasaDeApuestas.setBounds(440, 300, 350, 25);

		textoIndicaciones1 = new JLabel();
		textoIndicaciones1.setBounds(0, 470, 400, 25);
		textoIndicaciones1.setText("Antes de Registrar su casa de apuestas lea las sigiuentes indicaciones: ");
		textoIndicaciones1.setForeground(Color.WHITE);

		textoIndicaciones2 = new JLabel();
		textoIndicaciones2.setBounds(0, 500, 900, 25);
		textoIndicaciones2.setText(
				"1 : Asegurese de revisar todas las especificaciones de su casa de apuestas , ya que despues de esto los cambios no se pueden sobreescribir ");
		textoIndicaciones2.setForeground(Color.WHITE);

		textoIndicaciones3 = new JLabel();
		textoIndicaciones3.setBounds(0, 530, 940, 25);
		textoIndicaciones3.setText(
				"2 : Asegurese de no colocar un numero decimal en la seccion de registrar las sedes sin puntos ni comas ya que eso puede causar que el programa tenga problemas ");
		textoIndicaciones3.setForeground(Color.WHITE);

		textoIndicaciones4 = new JLabel();
		textoIndicaciones4.setBounds(0, 560, 800, 25);
		textoIndicaciones4.setText(
				"3: Colocar el presupuesto total sin puntos ni comas ya que eso puede causar que el programa tenga problemas ");
		textoIndicaciones4.setForeground(Color.WHITE);

		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp;
		temp = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen);

		botonRegistrarCasa = new JButton();
		botonRegistrarCasa.setBounds(1000, 450, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/registrarBoton.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonRegistrarCasa.setIcon(imagen1);

		add(indicacionesCasaApuestas);
		add(nombreCasaDeApuestas);
		add(indicacionesSedes);
		add(sedesCasaDeApuestas);
		add(indicacionesPresupuesto);
		add(presupuestoCasaDeApuestas);
		add(botonRegistrarCasa);
		add(textoIndicaciones1);
		add(textoIndicaciones2);
		add(textoIndicaciones3);
		add(textoIndicaciones4);

		add(fondo);
	}

	public JButton getBotonRegistrarCasa() {
		return botonRegistrarCasa;
	}

	public void setBotonRegistrarCasa(JButton botonRegistrarCasa) {
		this.botonRegistrarCasa = botonRegistrarCasa;
	}

	public JTextField getNombreCasaDeApuestas() {
		return nombreCasaDeApuestas;
	}

	public void setNombreCasaDeApuestas(JTextField nombreCasaDeApuestas) {
		this.nombreCasaDeApuestas = nombreCasaDeApuestas;
	}

	public JTextField getSedesCasaDeApuestas() {
		return sedesCasaDeApuestas;
	}

	public void setSedesCasaDeApuestas(JTextField sedesCasaDeApuestas) {
		this.sedesCasaDeApuestas = sedesCasaDeApuestas;
	}

	public JTextField getPresupuestoCasaDeApuestas() {
		return presupuestoCasaDeApuestas;
	}

	public void setPresupuestoCasaDeApuestas(JTextField presupuestoCasaDeApuestas) {
		this.presupuestoCasaDeApuestas = presupuestoCasaDeApuestas;
	}

	public JLabel getIndicacionesCasaApuestas() {
		return indicacionesCasaApuestas;
	}

	public void setIndicacionesCasaApuestas(JLabel indicacionesCasaApuestas) {
		this.indicacionesCasaApuestas = indicacionesCasaApuestas;
	}

	public JLabel getIndicacionesSedes() {
		return indicacionesSedes;
	}

	public void setIndicacionesSedes(JLabel indicacionesSedes) {
		this.indicacionesSedes = indicacionesSedes;
	}

	public JLabel getIndicacionesPresupuesto() {
		return indicacionesPresupuesto;
	}

	public void setIndicacionesPresupuesto(JLabel indicacionesPresupuesto) {
		this.indicacionesPresupuesto = indicacionesPresupuesto;
	}

	public JLabel getTextoIndicaciones1() {
		return textoIndicaciones1;
	}

	public void setTextoIndicaciones1(JLabel textoIndicaciones1) {
		this.textoIndicaciones1 = textoIndicaciones1;
	}

	public JLabel getTextoIndicaciones2() {
		return textoIndicaciones2;
	}

	public void setTextoIndicaciones2(JLabel textoIndicaciones2) {
		this.textoIndicaciones2 = textoIndicaciones2;
	}

	public JLabel getTextoIndicaciones3() {
		return textoIndicaciones3;
	}

	public void setTextoIndicaciones3(JLabel textoIndicaciones3) {
		this.textoIndicaciones3 = textoIndicaciones3;
	}

	public JLabel getTextoIndicaciones4() {
		return textoIndicaciones4;
	}

	public void setTextoIndicaciones4(JLabel textoIndicaciones4) {
		this.textoIndicaciones4 = textoIndicaciones4;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}
	
}