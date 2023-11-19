package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPresupuesto extends JFrame {
	private JButton botonRegistrarPresupuesto;
	private JTextField balotoPresupuesto, betplayPresupuesto, superastroPresupuesto, chancePresupuesto,
			loteriaPresupuesto;
	private JLabel indicacionesBaloto, indicacionesBetplay, indicacionesSuperastro, indicacionesChance,
			indicacionesLoteria, textoIndicaciones1, textoIndicaciones2, textoIndicaciones3, textoIndicaciones4, fondo;

	public VentanaPresupuesto() {
		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		balotoPresupuesto = new JTextField();
		balotoPresupuesto.setBounds(40, 130, 350, 30);

		indicacionesBaloto = new JLabel();
		indicacionesBaloto.setBounds(40, 110, 300, 25);
		indicacionesBaloto.setText("Ingresar en el espacio de abajo el presupuesto del aloto. ");
		indicacionesBaloto.setForeground(Color.WHITE);

		indicacionesChance = new JLabel();
		indicacionesChance.setBounds(740, 110, 500, 25);
		indicacionesChance.setText("Ingresar en el espacio de abajo el presupuesto del Chance  ");
		indicacionesChance.setForeground(Color.WHITE);

		chancePresupuesto = new JTextField();
		chancePresupuesto.setBounds(740, 130, 350, 30);

		indicacionesBetplay = new JLabel();
		indicacionesBetplay.setBounds(40, 270, 500, 25);
		indicacionesBetplay.setText("Ingresar en el espacio de abajo el presupuesto del Betplay: ");
		indicacionesBetplay.setForeground(Color.WHITE);

		betplayPresupuesto = new JTextField();
		betplayPresupuesto.setBounds(40, 300, 350, 25);

		indicacionesSuperastro = new JLabel();
		indicacionesSuperastro.setBounds(40, 400, 500, 25);
		indicacionesSuperastro.setText("Ingresar en el espacio de abajo el presupuesto del Superastro:");
		indicacionesSuperastro.setForeground(Color.WHITE);

		superastroPresupuesto = new JTextField();
		superastroPresupuesto.setBounds(40, 430, 350, 25);

		indicacionesLoteria = new JLabel();
		indicacionesLoteria.setBounds(740, 370, 500, 25);
		indicacionesLoteria.setText("Ingresar en el espacio de abajo el presupuesto De la loteria : ");
		indicacionesLoteria.setForeground(Color.WHITE);

		loteriaPresupuesto = new JTextField();
		loteriaPresupuesto.setBounds(740, 400, 350, 25);

		textoIndicaciones1 = new JLabel();
		textoIndicaciones1.setBounds(0, 470, 400, 25);
		textoIndicaciones1.setText("Antes de Registrar sus presupuestos lea las sigiuentes indicaciones: ");
		textoIndicaciones1.setForeground(Color.WHITE);

		textoIndicaciones2 = new JLabel();
		textoIndicaciones2.setBounds(0, 500, 900, 25);
		textoIndicaciones2.setText(
				"1 : Asegurese de revisar todas las especificaciones de presupuestos , ya que despues de esto los cambios no se pueden sobreescribir ");
		textoIndicaciones2.setForeground(Color.WHITE);

		textoIndicaciones3 = new JLabel();
		textoIndicaciones3.setBounds(0, 530, 940, 25);
		textoIndicaciones3.setText(
				"2 : Asegurese que los presupuestos sean totalmente realistas a el presupuesto total previamente ingresado ");
		textoIndicaciones3.setForeground(Color.WHITE);

		textoIndicaciones4 = new JLabel();
		textoIndicaciones4.setBounds(0, 560, 800, 25);
		textoIndicaciones4.setText(
				"3: Colocar el presupuesto sin puntos ni comas ya que eso  causara que el programa tenga problemas ");
		textoIndicaciones4.setForeground(Color.WHITE);

		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp;
		temp = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen);

		botonRegistrarPresupuesto = new JButton();
		botonRegistrarPresupuesto.setBounds(1000, 450, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/registrarPresupuesto.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonRegistrarPresupuesto.setIcon(imagen1);

		add(indicacionesBaloto);
		add(balotoPresupuesto);

		add(indicacionesChance);
		add(chancePresupuesto);

		add(indicacionesBetplay);
		add(betplayPresupuesto);

		add(indicacionesLoteria);
		add(loteriaPresupuesto);

		add(indicacionesSuperastro);
		add(superastroPresupuesto);

		add(botonRegistrarPresupuesto);
		add(textoIndicaciones1);
		add(textoIndicaciones2);
		add(textoIndicaciones3);
		add(textoIndicaciones4);

		add(fondo);
	}

	public JButton getBotonRegistrarPresupuesto() {
		return botonRegistrarPresupuesto;
	}

	public void setBotonRegistrarPresupuesto(JButton botonRegistrarPresupuesto) {
		this.botonRegistrarPresupuesto = botonRegistrarPresupuesto;
	}

	public JTextField getBalotoPresupuesto() {
		return balotoPresupuesto;
	}

	public void setBalotoPresupuesto(JTextField balotoPresupuesto) {
		this.balotoPresupuesto = balotoPresupuesto;
	}

	public JTextField getBetplayPresupuesto() {
		return betplayPresupuesto;
	}

	public void setBetplayPresupuesto(JTextField betplayPresupuesto) {
		this.betplayPresupuesto = betplayPresupuesto;
	}

	public JTextField getSuperastroPresupuesto() {
		return superastroPresupuesto;
	}

	public void setSuperastroPresupuesto(JTextField superastroPresupuesto) {
		this.superastroPresupuesto = superastroPresupuesto;
	}

	public JTextField getChancePresupuesto() {
		return chancePresupuesto;
	}

	public void setChancePresupuesto(JTextField chancePresupuesto) {
		this.chancePresupuesto = chancePresupuesto;
	}

	public JTextField getLoteriaPresupuesto() {
		return loteriaPresupuesto;
	}

	public void setLoteriaPresupuesto(JTextField loteriaPresupuesto) {
		this.loteriaPresupuesto = loteriaPresupuesto;
	}

	public JLabel getIndicacionesBaloto() {
		return indicacionesBaloto;
	}

	public void setIndicacionesBaloto(JLabel indicacionesBaloto) {
		this.indicacionesBaloto = indicacionesBaloto;
	}

	public JLabel getIndicacionesBetplay() {
		return indicacionesBetplay;
	}

	public void setIndicacionesBetplay(JLabel indicacionesBetplay) {
		this.indicacionesBetplay = indicacionesBetplay;
	}

	public JLabel getIndicacionesSuperastro() {
		return indicacionesSuperastro;
	}

	public void setIndicacionesSuperastro(JLabel indicacionesSuperastro) {
		this.indicacionesSuperastro = indicacionesSuperastro;
	}

	public JLabel getIndicacionesChance() {
		return indicacionesChance;
	}

	public void setIndicacionesChance(JLabel indicacionesChance) {
		this.indicacionesChance = indicacionesChance;
	}

	public JLabel getIndicacionesLoteria() {
		return indicacionesLoteria;
	}

	public void setIndicacionesLoteria(JLabel indicacionesLoteria) {
		this.indicacionesLoteria = indicacionesLoteria;
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