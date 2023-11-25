package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Esta clase representa una ventana de BetPlay en la interfaz gráfica. Extiende
 * a JFrame, por lo que hereda todos los métodos y atributos de un JFrame.
 */

public class VentanaBetPlay extends JFrame {

	/**
	 * serialVersionUID es un identificador de versión para la serialización. Es
	 * necesario para garantizar que durante la deserialización el cargador de
	 * clases cargue la misma clase que fue serializada.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -2463672132347869093L;
	private JLabel fondo;
	private JComboBox<String> millosManchesterU, onceCaldasRealMadrid, cucutaDeportivobarsa, santaFeNacional,
			fortalezaLaEquidad, shaktarAlNassr, cityChelsea, catarColombia, dormundtBayern, aguilasDoradasDim,
			jaguaresEnvigado, crystalPalaceBrigthon, leverkusenEverton, gironaArsenal;
	private JLabel millosManchesterUtxt, onceCaldasRealMadridtxt, cucutaDeportivobarsatxt, santaFeNacionaltxt,
			fortalezaLaEquidadtxt, shaktarAlNassrtxt, cityChelseatxt, catarColombiatxt, dormundtBayerntxt,
			aguilasDoradasDimtxt, jaguaresEnvigadotxt, crystalPalaceBrigthontxt, leverkusenEvertontxt, gironaArsenaltxt,
			indicacionCedula, indicacionCedula2, indicacionseguridadSede, indicacionSeguridadDia, indicacionIndex,
			valortxt;
	/**
	 * Los siguientes son campos de texto para recoger la entrada del usuario.
	 */
	JTextField index, campoValue, campoCedula, campoSede, campoDia;
	/**
	 * Los siguientes son botones para realizar acciones como apostar, modificar,
	 * eliminar y navegar.
	 */
	private JButton apost, botonModificar, botonEliminar, flecha;

	/**
	 * Este es el constructor de la clase VentanaBetPlay. Inicializa la ventana y
	 * todos sus componentes.
	 */
	public VentanaBetPlay() {
		// TODO Auto-generated constructor stub

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
		aguilasDoradasDimtxt = new JLabel();
		aguilasDoradasDimtxt.setBounds(10, 0, 200, 25);
		aguilasDoradasDimtxt.setText("Aguilas Doradas vs DIM");
		aguilasDoradasDimtxt.setForeground(Color.white);
		aguilasDoradasDim = new JComboBox<>();
		aguilasDoradasDim.setBounds(10, 30, 250, 30);
		aguilasDoradasDim.addItem("Gana Local (AguilasDoradas)");
		aguilasDoradasDim.addItem("Gana Visitante (DIM)");
		aguilasDoradasDim.addItem("Empate");

		catarColombiatxt = new JLabel();
		catarColombiatxt.setBounds(300, 0, 200, 25);
		catarColombiatxt.setText("Catar vs Colombia");
		catarColombiatxt.setForeground(Color.white);
		catarColombia = new JComboBox<>();
		catarColombia.setBounds(300, 30, 200, 30);
		catarColombia.addItem("Gana Local(Catar)");
		catarColombia.addItem("Gana Visitante (Colombia)");
		catarColombia.addItem("Empate");

		cityChelseatxt = new JLabel();
		cityChelseatxt.setBounds(600, 0, 200, 25);
		cityChelseatxt.setText("Manchester City vs Chelsea");
		cityChelseatxt.setForeground(Color.white);
		cityChelsea = new JComboBox<>();
		cityChelsea.setBounds(600, 30, 200, 30);
		cityChelsea.addItem("Gana Local (Manchester)");
		cityChelsea.addItem("Gana Visitante (Chelsea)");
		cityChelsea.addItem("Empate");

		crystalPalaceBrigthontxt = new JLabel();
		crystalPalaceBrigthontxt.setBounds(900, 0, 200, 25);
		crystalPalaceBrigthontxt.setText("Crystal Palace vs Brigthon");
		crystalPalaceBrigthontxt.setForeground(Color.white);
		crystalPalaceBrigthon = new JComboBox<>();
		crystalPalaceBrigthon.setBounds(900, 30, 200, 30);
		crystalPalaceBrigthon.addItem("Gana Local (Crystal Palace)");
		crystalPalaceBrigthon.addItem("Gana Visitante(Brigthon)");
		crystalPalaceBrigthon.addItem("Empate");

		cucutaDeportivobarsatxt = new JLabel();
		cucutaDeportivobarsatxt.setBounds(10, 200, 200, 25);
		cucutaDeportivobarsatxt.setText("Cúcuta vs Barcelona");
		cucutaDeportivobarsatxt.setForeground(Color.white);
		cucutaDeportivobarsa = new JComboBox<>();
		cucutaDeportivobarsa.setBounds(10, 230, 200, 30);
		cucutaDeportivobarsa.addItem("Gana Local (Cúcuta)");
		cucutaDeportivobarsa.addItem("Gana Visitante (Barcelona)");
		cucutaDeportivobarsa.addItem("Empate");

		dormundtBayerntxt = new JLabel();
		dormundtBayerntxt.setBounds(300, 200, 200, 25);
		dormundtBayerntxt.setText("Borussia Dormundt vs Bayern Munchen");
		dormundtBayerntxt.setForeground(Color.white);
		dormundtBayern = new JComboBox<>();
		dormundtBayern.setBounds(300, 230, 200, 30);
		dormundtBayern.addItem("Gana Local (Dormundt)");
		dormundtBayern.addItem("Gana Visitante (Bayern Munchen)");
		dormundtBayern.addItem("Empate");

		// Column 3
		fortalezaLaEquidadtxt = new JLabel();
		fortalezaLaEquidadtxt.setBounds(600, 200, 200, 25);
		fortalezaLaEquidadtxt.setText("Fotaleza vs Equidad");
		fortalezaLaEquidadtxt.setForeground(Color.white);
		fortalezaLaEquidad = new JComboBox<>();
		fortalezaLaEquidad.setBounds(600, 230, 200, 30);
		fortalezaLaEquidad.addItem("Gana Local (Fortaleza)");
		fortalezaLaEquidad.addItem("Gana Visitante (Equidad)");
		fortalezaLaEquidad.addItem("Empate");

		gironaArsenaltxt = new JLabel();
		gironaArsenaltxt.setBounds(900, 200, 200, 25);
		gironaArsenaltxt.setText("Girona VS Arsenal");
		gironaArsenaltxt.setForeground(Color.white);
		gironaArsenal = new JComboBox<>();
		gironaArsenal.setBounds(900, 230, 200, 30);
		gironaArsenal.addItem("Gana Local (Girona)");
		gironaArsenal.addItem("Gana Visitante (Arsenal)");
		gironaArsenal.addItem("Empate");

		jaguaresEnvigadotxt = new JLabel();
		jaguaresEnvigadotxt.setBounds(10, 400, 200, 25);
		jaguaresEnvigadotxt.setText("Jaguares vs Envigado");
		jaguaresEnvigadotxt.setForeground(Color.white);
		jaguaresEnvigado = new JComboBox<>();
		jaguaresEnvigado.setBounds(10, 430, 200, 30);
		jaguaresEnvigado.addItem("Gana Local (Jaguares)");
		jaguaresEnvigado.addItem("Gana Visitante (Envigado)");
		jaguaresEnvigado.addItem("Empate");

		// Column 4
		leverkusenEvertontxt = new JLabel();
		leverkusenEvertontxt.setBounds(300, 400, 200, 25);
		leverkusenEvertontxt.setText("Leverkusen vs Everton");
		leverkusenEvertontxt.setForeground(Color.white);
		leverkusenEverton = new JComboBox<>();
		leverkusenEverton.setBounds(300, 430, 200, 30);
		leverkusenEverton.addItem("Gana Local (Leverkusen)");
		leverkusenEverton.addItem("Gana Visitante (Everton)");
		leverkusenEverton.addItem("Empate");

		millosManchesterUtxt = new JLabel();
		millosManchesterUtxt.setBounds(600, 400, 200, 25);
		millosManchesterUtxt.setText("Millonarios vs Manchester United");
		millosManchesterUtxt.setForeground(Color.white);
		millosManchesterU = new JComboBox<>();
		millosManchesterU.setBounds(600, 430, 200, 30);
		millosManchesterU.addItem("Gana Local (Millonarios)");
		millosManchesterU.addItem("Gana Visitante (United)");
		millosManchesterU.addItem("Empate");

		onceCaldasRealMadridtxt = new JLabel();
		onceCaldasRealMadridtxt.setBounds(900, 400, 200, 25);
		onceCaldasRealMadridtxt.setText("Once Caldas Vs Real Madrid");
		onceCaldasRealMadridtxt.setForeground(Color.white);
		onceCaldasRealMadrid = new JComboBox<>();
		onceCaldasRealMadrid.setBounds(900, 430, 200, 30);
		onceCaldasRealMadrid.addItem("Gana Local (Once Caldas)");
		onceCaldasRealMadrid.addItem("Gana Visitante (Real Madrid)");
		onceCaldasRealMadrid.addItem("Empate");

		santaFeNacionaltxt = new JLabel();
		santaFeNacionaltxt.setBounds(10, 600, 200, 25);
		santaFeNacionaltxt.setText("Santa Fe vs Nacional");
		santaFeNacionaltxt.setForeground(Color.white);
		santaFeNacional = new JComboBox<>();
		santaFeNacional.setBounds(10, 630, 200, 30);
		santaFeNacional.addItem("Gana Local (Santa Fe)");
		santaFeNacional.addItem("Gana Visitante (Nacional)");
		santaFeNacional.addItem("Empate");

		shaktarAlNassrtxt = new JLabel();
		shaktarAlNassrtxt.setBounds(300, 600, 200, 25);
		shaktarAlNassrtxt.setText("Shaktar Vs AL Nassr");
		shaktarAlNassrtxt.setForeground(Color.white);
		shaktarAlNassr = new JComboBox<>();
		shaktarAlNassr.setBounds(300, 630, 200, 30);
		shaktarAlNassr.addItem("Gana Local (Shaktar)");
		shaktarAlNassr.addItem("Gana Visitante (Al Nassr)");
		shaktarAlNassr.addItem("Empate");

		campoCedula = new JTextField();
		campoCedula.setBounds(500, 510, 300, 20);

		indicacionCedula = new JLabel("Para comprobar que el usuario ingresado es el correcto ");
		indicacionCedula.setBounds(500, 470, 340, 20);
		indicacionCedula.setForeground(Color.white);

		indicacionCedula2 = new JLabel("inserte el numero de cedula del Usuario De Nuevo");
		indicacionCedula2.setBounds(500, 490, 300, 20);
		indicacionCedula2.setForeground(Color.white);

		campoSede = new JTextField();
		campoSede.setBounds(900, 500, 200, 20);

		indicacionseguridadSede = new JLabel("por seguridad ingrese la sede que aposto");
		indicacionseguridadSede.setBounds(900, 470, 250, 20);
		indicacionseguridadSede.setForeground(Color.white);

		campoDia = new JTextField();
		campoDia.setBounds(500, 570, 200, 20);

		indicacionSeguridadDia = new JLabel("por seguridad ingrese El dia de hoy (lunes a domingo)");
		indicacionSeguridadDia.setBounds(500, 550, 340, 20);
		indicacionSeguridadDia.setForeground(Color.white);

		indicacionIndex = new JLabel(
				"Inserte la posicion de la persona que quiere apostar(comienza a contar desde 0) ");
		indicacionIndex.setBounds(900, 600, 500, 30);
		indicacionIndex.setForeground(Color.white);

		valortxt = new JLabel("Inserte valor de la apuesta");
		valortxt.setBounds(900, 530, 400, 20);
		valortxt.setForeground(Color.white);

		campoValue = new JTextField();
		campoValue.setBounds(900, 550, 500, 20);

		index = new JTextField();
		index.setBounds(900, 630, 300, 30);

		apost = new JButton();
		apost.setBounds(800, 590, 100, 100);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/apostar.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		apost.setIcon(imagen1);

		botonModificar = new JButton(new ImageIcon("src/images/ModificarApuestaBTN.png"));
		botonModificar.setBounds(775, 425, 280, 180);
		botonModificar.setOpaque(false);
		botonModificar.setContentAreaFilled(false);
		botonModificar.setBorderPainted(false);
		botonModificar.setVisible(false);

		botonEliminar = new JButton(new ImageIcon("src/images/EliminarApuestaBTN.png"));
		botonEliminar.setBounds(555, 425, 280, 180);
		botonEliminar.setOpaque(false);
		botonEliminar.setContentAreaFilled(false);
		botonEliminar.setBorderPainted(false);
		botonEliminar.setVisible(false);

		flecha = new JButton(new ImageIcon("src/images/FlechaR.png"));
		flecha.setBounds(5, 5, 75, 75);
		flecha.setOpaque(false);
		flecha.setContentAreaFilled(false);
		flecha.setBorderPainted(false);

		add(flecha);
		add(campoValue);
		add(valortxt);
		add(apost);
		add(shaktarAlNassr);
		add(shaktarAlNassrtxt);
		add(santaFeNacional);
		add(santaFeNacionaltxt);
		add(onceCaldasRealMadrid);
		add(onceCaldasRealMadridtxt);
		add(millosManchesterU);
		add(millosManchesterUtxt);
		add(leverkusenEverton);
		add(leverkusenEvertontxt);
		add(jaguaresEnvigado);
		add(jaguaresEnvigadotxt);
		add(aguilasDoradasDim);
		add(aguilasDoradasDimtxt);
		add(campoCedula);
		add(campoDia);
		add(campoSede);
		add(catarColombia);
		add(catarColombiatxt);
		add(cityChelsea);
		add(cityChelseatxt);
		add(crystalPalaceBrigthon);
		add(crystalPalaceBrigthontxt);
		add(cucutaDeportivobarsa);
		add(cucutaDeportivobarsatxt);
		add(dormundtBayern);
		add(dormundtBayerntxt);
		add(fortalezaLaEquidad);
		add(fortalezaLaEquidadtxt);
		add(gironaArsenal);
		add(gironaArsenaltxt);
		add(botonEliminar);
		add(botonModificar);
		add(indicacionSeguridadDia);
		add(indicacionseguridadSede);
		add(indicacionCedula);
		add(indicacionCedula2);
		add(index);
		add(indicacionIndex);
		add(fondo);

	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JComboBox<String> getMillosManchesterU() {
		return millosManchesterU;
	}

	public void setMillosManchesterU(JComboBox<String> millosManchesterU) {
		this.millosManchesterU = millosManchesterU;
	}

	public JComboBox<String> getOnceCaldasRealMadrid() {
		return onceCaldasRealMadrid;
	}

	public void setOnceCaldasRealMadrid(JComboBox<String> onceCaldasRealMadrid) {
		this.onceCaldasRealMadrid = onceCaldasRealMadrid;
	}

	public JComboBox<String> getCucutaDeportivobarsa() {
		return cucutaDeportivobarsa;
	}

	public void setCucutaDeportivobarsa(JComboBox<String> cucutaDeportivobarsa) {
		this.cucutaDeportivobarsa = cucutaDeportivobarsa;
	}

	public JComboBox<String> getSantaFeNacional() {
		return santaFeNacional;
	}

	public void setSantaFeNacional(JComboBox<String> santaFeNacional) {
		this.santaFeNacional = santaFeNacional;
	}

	public JComboBox<String> getFortalezaLaEquidad() {
		return fortalezaLaEquidad;
	}

	public void setFortalezaLaEquidad(JComboBox<String> fortalezaLaEquidad) {
		this.fortalezaLaEquidad = fortalezaLaEquidad;
	}

	public JComboBox<String> getShaktarAlNassr() {
		return shaktarAlNassr;
	}

	public void setShaktarAlNassr(JComboBox<String> shaktarAlNassr) {
		this.shaktarAlNassr = shaktarAlNassr;
	}

	public JComboBox<String> getCityChelsea() {
		return cityChelsea;
	}

	public void setCityChelsea(JComboBox<String> cityChelsea) {
		this.cityChelsea = cityChelsea;
	}

	public JComboBox<String> getCatarColombia() {
		return catarColombia;
	}

	public void setCatarColombia(JComboBox<String> catarColombia) {
		this.catarColombia = catarColombia;
	}

	public JComboBox<String> getDormundtBayern() {
		return dormundtBayern;
	}

	public void setDormundtBayern(JComboBox<String> dormundtBayern) {
		this.dormundtBayern = dormundtBayern;
	}

	public JComboBox<String> getAguilasDoradasDim() {
		return aguilasDoradasDim;
	}

	public void setAguilasDoradasDim(JComboBox<String> aguilasDoradasDim) {
		this.aguilasDoradasDim = aguilasDoradasDim;
	}

	public JComboBox<String> getJaguaresEnvigado() {
		return jaguaresEnvigado;
	}

	public void setJaguaresEnvigado(JComboBox<String> jaguaresEnvigado) {
		this.jaguaresEnvigado = jaguaresEnvigado;
	}

	public JComboBox<String> getCrystalPalaceBrigthon() {
		return crystalPalaceBrigthon;
	}

	public void setCrystalPalaceBrigthon(JComboBox<String> crystalPalaceBrigthon) {
		this.crystalPalaceBrigthon = crystalPalaceBrigthon;
	}

	public JComboBox<String> getLeverkusenEverton() {
		return leverkusenEverton;
	}

	public void setLeverkusenEverton(JComboBox<String> leverkusenEverton) {
		this.leverkusenEverton = leverkusenEverton;
	}

	public JComboBox<String> getGironaArsenal() {
		return gironaArsenal;
	}

	public void setGironaArsenal(JComboBox<String> gironaArsenal) {
		this.gironaArsenal = gironaArsenal;
	}

	public JLabel getMillosManchesterUtxt() {
		return millosManchesterUtxt;
	}

	public void setMillosManchesterUtxt(JLabel millosManchesterUtxt) {
		this.millosManchesterUtxt = millosManchesterUtxt;
	}

	public JLabel getOnceCaldasRealMadridtxt() {
		return onceCaldasRealMadridtxt;
	}

	public void setOnceCaldasRealMadridtxt(JLabel onceCaldasRealMadridtxt) {
		this.onceCaldasRealMadridtxt = onceCaldasRealMadridtxt;
	}

	public JLabel getCucutaDeportivobarsatxt() {
		return cucutaDeportivobarsatxt;
	}

	public void setCucutaDeportivobarsatxt(JLabel cucutaDeportivobarsatxt) {
		this.cucutaDeportivobarsatxt = cucutaDeportivobarsatxt;
	}

	public JLabel getSantaFeNacionaltxt() {
		return santaFeNacionaltxt;
	}

	public void setSantaFeNacionaltxt(JLabel santaFeNacionaltxt) {
		this.santaFeNacionaltxt = santaFeNacionaltxt;
	}

	public JLabel getFortalezaLaEquidadtxt() {
		return fortalezaLaEquidadtxt;
	}

	public void setFortalezaLaEquidadtxt(JLabel fortalezaLaEquidadtxt) {
		this.fortalezaLaEquidadtxt = fortalezaLaEquidadtxt;
	}

	public JLabel getShaktarAlNassrtxt() {
		return shaktarAlNassrtxt;
	}

	public void setShaktarAlNassrtxt(JLabel shaktarAlNassrtxt) {
		this.shaktarAlNassrtxt = shaktarAlNassrtxt;
	}

	public JLabel getCityChelseatxt() {
		return cityChelseatxt;
	}

	public void setCityChelseatxt(JLabel cityChelseatxt) {
		this.cityChelseatxt = cityChelseatxt;
	}

	public JLabel getCatarColombiatxt() {
		return catarColombiatxt;
	}

	public void setCatarColombiatxt(JLabel catarColombiatxt) {
		this.catarColombiatxt = catarColombiatxt;
	}

	public JLabel getDormundtBayerntxt() {
		return dormundtBayerntxt;
	}

	public void setDormundtBayerntxt(JLabel dormundtBayerntxt) {
		this.dormundtBayerntxt = dormundtBayerntxt;
	}

	public JLabel getAguilasDoradasDimtxt() {
		return aguilasDoradasDimtxt;
	}

	public void setAguilasDoradasDimtxt(JLabel aguilasDoradasDimtxt) {
		this.aguilasDoradasDimtxt = aguilasDoradasDimtxt;
	}

	public JLabel getJaguaresEnvigadotxt() {
		return jaguaresEnvigadotxt;
	}

	public void setJaguaresEnvigadotxt(JLabel jaguaresEnvigadotxt) {
		this.jaguaresEnvigadotxt = jaguaresEnvigadotxt;
	}

	public JLabel getCrystalPalaceBrigthontxt() {
		return crystalPalaceBrigthontxt;
	}

	public void setCrystalPalaceBrigthontxt(JLabel crystalPalaceBrigthontxt) {
		this.crystalPalaceBrigthontxt = crystalPalaceBrigthontxt;
	}

	public JLabel getLeverkusenEvertontxt() {
		return leverkusenEvertontxt;
	}

	public void setLeverkusenEvertontxt(JLabel leverkusenEvertontxt) {
		this.leverkusenEvertontxt = leverkusenEvertontxt;
	}

	public JLabel getGironaArsenaltxt() {
		return gironaArsenaltxt;
	}

	public void setGironaArsenaltxt(JLabel gironaArsenaltxt) {
		this.gironaArsenaltxt = gironaArsenaltxt;
	}

	public JLabel getIndicacionCedula() {
		return indicacionCedula;
	}

	public void setIndicacionCedula(JLabel indicacionCedula) {
		this.indicacionCedula = indicacionCedula;
	}

	public JLabel getIndicacionCedula2() {
		return indicacionCedula2;
	}

	public void setIndicacionCedula2(JLabel indicacionCedula2) {
		this.indicacionCedula2 = indicacionCedula2;
	}

	public JLabel getIndicacionseguridadSede() {
		return indicacionseguridadSede;
	}

	public void setIndicacionseguridadSede(JLabel indicacionseguridadSede) {
		this.indicacionseguridadSede = indicacionseguridadSede;
	}

	public JLabel getIndicacionSeguridadDia() {
		return indicacionSeguridadDia;
	}

	public void setIndicacionSeguridadDia(JLabel indicacionSeguridadDia) {
		this.indicacionSeguridadDia = indicacionSeguridadDia;
	}

	public JLabel getIndicacionIndex() {
		return indicacionIndex;
	}

	public void setIndicacionIndex(JLabel indicacionIndex) {
		this.indicacionIndex = indicacionIndex;
	}

	public JTextField getIndex() {
		return index;
	}

	public void setIndex(JTextField index) {
		this.index = index;
	}

	public JTextField getCampoValue() {
		return campoValue;
	}

	public void setCampoValue(JTextField campoValue) {
		this.campoValue = campoValue;
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

	public JTextField getCampoDia() {
		return campoDia;
	}

	public void setCampoDia(JTextField campoDia) {
		this.campoDia = campoDia;
	}

	public JButton getApost() {
		return apost;
	}

	public void setApost(JButton apost) {
		this.apost = apost;
	}

	public JButton getBotonModificar() {
		return botonModificar;
	}

	public void setBotonModificar(JButton botonModificar) {
		this.botonModificar = botonModificar;
	}

	public JButton getBotonEliminar() {
		return botonEliminar;
	}

	public void setBotonEliminar(JButton botonEliminar) {
		this.botonEliminar = botonEliminar;
	}

	public JButton getFlecha() {
		return flecha;
	}

	public void setFlecha(JButton flecha) {
		this.flecha = flecha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}