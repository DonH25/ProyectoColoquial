package co.edu.unbosque.view;

import java.awt.Image;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaBetPlay extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2463672132347869093L;
	private JLabel fondo;
	private JComboBox<String> santafeMillonarios, nacionalMedellin, americaCali, juniorUnion, cucutaBucaramanga,
			pereiraOnce, aguilasEnvigado, patriotasChico, tolimaHuila, barcelonaMadrid, arsenalChelsea, unitedCity,
			liverpoolEverton, bayernBorussia;
	private JLabel santafeMillonariosTxt, nacionalMedellinTxt, americaCaliTxt, juniorUnionTxt, cucutaBucaramangaTxt,
			pereiraOnceTxt, aguilasEnvigadoTxt, patriotasChicoTxt, tolimaHuilaTxt, barcelonaMadridTxt,
			arsenalChelseaTxt, unitedCityTxt, liverpoolEvertonTxt, bayernBorussiaTxt;
	private TextField pDiaApuesta, pValorApuesta;
	private JLabel diaApuestaTxt, valorApuestaTxt;
	private JButton botonApostar, botonModificar, botonEliminar, flecha;

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

		santafeMillonariosTxt = new JLabel();
		santafeMillonariosTxt.setBounds(10, 110, 400, 25);
		santafeMillonariosTxt.setText("                                 SantaFé vs Millonarios");
		santafeMillonarios = new JComboBox<>();
		santafeMillonarios.setBounds(10, 130, 350, 30);
		santafeMillonarios.addItem("Gana Local (SantaFé)");
		santafeMillonarios.addItem("Gana Visitante (Millonarios)");
		santafeMillonarios.addItem("Empate");

		nacionalMedellinTxt = new JLabel();
		nacionalMedellinTxt.setBounds(10, 180, 400, 25);
		nacionalMedellinTxt.setText("                                   Nacional vs Medellin");
		nacionalMedellin = new JComboBox<>();
		nacionalMedellin.setBounds(10, 200, 350, 30);
		nacionalMedellin.addItem("Gana Local(Nacional)");
		nacionalMedellin.addItem("Gana Visitante (Medellin)");
		nacionalMedellin.addItem("Empate");

		americaCaliTxt = new JLabel();
		americaCaliTxt.setBounds(10, 250, 400, 25);
		americaCaliTxt.setText("                                  América de Cali vs Cali");
		americaCali = new JComboBox<>();
		americaCali.setBounds(10, 270, 350, 30);
		americaCali.addItem("Gana Local (América)");
		americaCali.addItem("Gana Visitante (Cali)");
		americaCali.addItem("Empate");

		juniorUnionTxt = new JLabel();
		juniorUnionTxt.setBounds(10, 320, 400, 25);
		juniorUnionTxt.setText("                                 Junior vs Unión Magdalena");
		juniorUnion = new JComboBox<>();
		juniorUnion.setBounds(10, 340, 350, 30);
		juniorUnion.addItem("Gana Local (Junior)");
		juniorUnion.addItem("Gana Visitante(Unión Magdalena)");
		juniorUnion.addItem("Empate");

		cucutaBucaramangaTxt = new JLabel();
		cucutaBucaramangaTxt.setBounds(10, 390, 400, 25);
		cucutaBucaramangaTxt.setText("                               Cúcuta vs Bucaramanga");
		cucutaBucaramanga = new JComboBox<>();
		cucutaBucaramanga.setBounds(10, 410, 350, 30);
		cucutaBucaramanga.addItem("Gana Local (Cúcuta)");
		cucutaBucaramanga.addItem("Gana Visitante (Bucaramanga)");
		cucutaBucaramanga.addItem("Empate");

		pereiraOnceTxt = new JLabel();
		pereiraOnceTxt.setBounds(10, 460, 400, 25);
		pereiraOnceTxt.setText("                                  Pereira vs Once Caldas");
		pereiraOnce = new JComboBox<>();
		pereiraOnce.setBounds(10, 480, 350, 30);
		pereiraOnce.addItem("Gana Local (Pereira)");
		pereiraOnce.addItem("Gana Visitante (Once Caldas)");
		pereiraOnce.addItem("Empate");

		aguilasEnvigadoTxt = new JLabel();
		aguilasEnvigadoTxt.setBounds(10, 530, 400, 25);
		aguilasEnvigadoTxt.setText("                              Aguilas Doradas vs Envigado");
		aguilasEnvigado = new JComboBox<>();
		aguilasEnvigado.setBounds(10, 550, 350, 30);
		aguilasEnvigado.addItem("Gana Local (Aguilas Doradas)");
		aguilasEnvigado.addItem("Gana Visitante (Envigado");
		aguilasEnvigado.addItem("Empate");

		patriotasChicoTxt = new JLabel();
		patriotasChicoTxt.setBounds(400, 110, 400, 25);
		patriotasChicoTxt.setText("                                     Patriotas vs Boyacá Chico");
		patriotasChico = new JComboBox<>();
		patriotasChico.setBounds(400, 130, 350, 30);
		patriotasChico.addItem("Gana Local (Patriotas)");
		patriotasChico.addItem("Gana Visitante (Boyacá Chico)");
		patriotasChico.addItem("Empate");

		tolimaHuilaTxt = new JLabel();
		tolimaHuilaTxt.setBounds(400, 180, 400, 25);
		tolimaHuilaTxt.setText("                                    Tolima vs Huila");
		tolimaHuila = new JComboBox<>();
		tolimaHuila.setBounds(400, 200, 350, 30);
		tolimaHuila.addItem("Gana Local (Tolima)");
		tolimaHuila.addItem("Gana Visitante (Huila)");
		tolimaHuila.addItem("Empate");

		barcelonaMadridTxt = new JLabel();
		barcelonaMadridTxt.setBounds(400, 250, 400, 25);
		barcelonaMadridTxt.setText("                                   FC Barcelona vs Real Madrid ");
		barcelonaMadrid = new JComboBox<>();
		barcelonaMadrid.setBounds(400, 270, 350, 30);
		barcelonaMadrid.addItem("Gana Local (Barcelona)");
		barcelonaMadrid.addItem("Gana Visitante (Real Madrid)");
		barcelonaMadrid.addItem("Empate");

		arsenalChelseaTxt = new JLabel();
		arsenalChelseaTxt.setBounds(400, 320, 400, 25);
		arsenalChelseaTxt.setText("                                     Arsenal vs Chelsea");
		arsenalChelsea = new JComboBox<>();
		arsenalChelsea.setBounds(400, 340, 350, 30);
		arsenalChelsea.addItem("Gana Local (Arsenal)");
		arsenalChelsea.addItem("Gana Visitante (Chelsea)");
		arsenalChelsea.addItem("Empate");

		unitedCityTxt = new JLabel();
		unitedCityTxt.setBounds(400, 390, 400, 25);
		unitedCityTxt.setText("                                  Man.United vs Man.City  ");
		unitedCity = new JComboBox<>();
		unitedCity.setBounds(400, 410, 350, 30);
		unitedCity.addItem("Gana Local (City)");
		unitedCity.addItem("Gana Visitante (United");
		unitedCity.addItem("Empate");

		liverpoolEvertonTxt = new JLabel();
		liverpoolEvertonTxt.setBounds(400, 460, 400, 25);
		liverpoolEvertonTxt.setText("                                   Liverpool vs Evertoon");
		liverpoolEverton = new JComboBox<>();
		liverpoolEverton.setBounds(400, 480, 350, 30);
		liverpoolEverton.addItem("Gana Local (Liverpool)");
		liverpoolEverton.addItem("Gana Visitante (Everton)");
		liverpoolEverton.addItem("Empate");

		bayernBorussiaTxt = new JLabel();
		bayernBorussiaTxt.setBounds(400, 530, 400, 25);
		bayernBorussiaTxt.setText("                       Bayern Munchen vs Borussia Dortmund");
		bayernBorussia = new JComboBox<>();
		bayernBorussia.setBounds(400, 550, 350, 30);
		bayernBorussia.addItem("Gana Local (Bayern)");
		bayernBorussia.addItem("Gana Visitante (Borussia)");
		bayernBorussia.addItem("Empate");

		pDiaApuesta = new TextField();
		diaApuestaTxt = new JLabel();
		diaApuestaTxt.setBounds(775, 110, 250, 25);
		diaApuestaTxt.setText("Ingrese el dia de la apuesta:");
		pDiaApuesta.setBounds(775, 130, 260, 30);

		pValorApuesta = new TextField();
		valorApuestaTxt = new JLabel();
		valorApuestaTxt.setBounds(775, 290, 250, 25);
		valorApuestaTxt.setText("Ingrese el valor de la apuestas:");
		pValorApuesta.setBounds(775, 310, 260, 30);

		botonApostar = new JButton(new ImageIcon("src/images/RealizarApuestaBTN.png"));
		botonApostar.setBounds(775, 425, 280, 180);
		botonApostar.setOpaque(false);
		botonApostar.setContentAreaFilled(false);
		botonApostar.setBorderPainted(false);
		botonApostar.setVisible(false);

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
		add(pDiaApuesta);
		add(diaApuestaTxt);
		add(pValorApuesta);
		add(valorApuestaTxt);
		add(bayernBorussia);
		add(bayernBorussiaTxt);
		add(liverpoolEverton);
		add(liverpoolEvertonTxt);
		add(unitedCity);
		add(unitedCityTxt);
		add(arsenalChelsea);
		add(arsenalChelseaTxt);
		add(barcelonaMadrid);
		add(barcelonaMadridTxt);
		add(tolimaHuila);
		add(tolimaHuilaTxt);
		add(patriotasChico);
		add(patriotasChicoTxt);
		add(aguilasEnvigado);
		add(aguilasEnvigadoTxt);
		add(pereiraOnce);
		add(pereiraOnceTxt);
		add(cucutaBucaramanga);
		add(cucutaBucaramangaTxt);
		add(juniorUnion);
		add(juniorUnionTxt);
		add(americaCali);
		add(americaCaliTxt);
		add(nacionalMedellin);
		add(nacionalMedellinTxt);
		add(santafeMillonarios);
		add(santafeMillonariosTxt);
		add(botonApostar);
		add(botonEliminar);
		add(botonModificar);
		add(fondo);

	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JComboBox<String> getSantafeMillonarios() {
		return santafeMillonarios;
	}

	public void setSantafeMillonarios(JComboBox<String> santafeMillonarios) {
		this.santafeMillonarios = santafeMillonarios;
	}

	public JComboBox<String> getNacionalMedellin() {
		return nacionalMedellin;
	}

	public void setNacionalMedellin(JComboBox<String> nacionalMedellin) {
		this.nacionalMedellin = nacionalMedellin;
	}

	public JComboBox<String> getAmericaCali() {
		return americaCali;
	}

	public void setAmericaCali(JComboBox<String> americaCali) {
		this.americaCali = americaCali;
	}

	public JComboBox<String> getJuniorUnion() {
		return juniorUnion;
	}

	public void setJuniorUnion(JComboBox<String> juniorUnion) {
		this.juniorUnion = juniorUnion;
	}

	public JComboBox<String> getCucutaBucaramanga() {
		return cucutaBucaramanga;
	}

	public void setCucutaBucaramanga(JComboBox<String> cucutaBucaramanga) {
		this.cucutaBucaramanga = cucutaBucaramanga;
	}

	public JComboBox<String> getPereiraOnce() {
		return pereiraOnce;
	}

	public void setPereiraOnce(JComboBox<String> pereiraOnce) {
		this.pereiraOnce = pereiraOnce;
	}

	public JComboBox<String> getAguilasEnvigado() {
		return aguilasEnvigado;
	}

	public void setAguilasEnvigado(JComboBox<String> aguilasEnvigado) {
		this.aguilasEnvigado = aguilasEnvigado;
	}

	public JComboBox<String> getPatriotasChico() {
		return patriotasChico;
	}

	public void setPatriotasChico(JComboBox<String> patriotasChico) {
		this.patriotasChico = patriotasChico;
	}

	public JComboBox<String> getTolimaHuila() {
		return tolimaHuila;
	}

	public void setTolimaHuila(JComboBox<String> tolimaHuila) {
		this.tolimaHuila = tolimaHuila;
	}

	public JComboBox<String> getBarcelonaMadrid() {
		return barcelonaMadrid;
	}

	public void setBarcelonaMadrid(JComboBox<String> barcelonaMadrid) {
		this.barcelonaMadrid = barcelonaMadrid;
	}

	public JComboBox<String> getArsenalChelsea() {
		return arsenalChelsea;
	}

	public void setArsenalChelsea(JComboBox<String> arsenalChelsea) {
		this.arsenalChelsea = arsenalChelsea;
	}

	public JComboBox<String> getUnitedCity() {
		return unitedCity;
	}

	public void setUnitedCity(JComboBox<String> unitedCity) {
		this.unitedCity = unitedCity;
	}

	public JComboBox<String> getLiverpoolEverton() {
		return liverpoolEverton;
	}

	public void setLiverpoolEverton(JComboBox<String> liverpoolEverton) {
		this.liverpoolEverton = liverpoolEverton;
	}

	public JComboBox<String> getBayernBorussia() {
		return bayernBorussia;
	}

	public void setBayernBorussia(JComboBox<String> bayernBorussia) {
		this.bayernBorussia = bayernBorussia;
	}

	public JLabel getSantafeMillonariosTxt() {
		return santafeMillonariosTxt;
	}

	public void setSantafeMillonariosTxt(JLabel santafeMillonariosTxt) {
		this.santafeMillonariosTxt = santafeMillonariosTxt;
	}

	public JLabel getNacionalMedellinTxt() {
		return nacionalMedellinTxt;
	}

	public void setNacionalMedellinTxt(JLabel nacionalMedellinTxt) {
		this.nacionalMedellinTxt = nacionalMedellinTxt;
	}

	public JLabel getAmericaCaliTxt() {
		return americaCaliTxt;
	}

	public void setAmericaCaliTxt(JLabel americaCaliTxt) {
		this.americaCaliTxt = americaCaliTxt;
	}

	public JLabel getJuniorUnionTxt() {
		return juniorUnionTxt;
	}

	public void setJuniorUnionTxt(JLabel juniorUnionTxt) {
		this.juniorUnionTxt = juniorUnionTxt;
	}

	public JLabel getCucutaBucaramangaTxt() {
		return cucutaBucaramangaTxt;
	}

	public void setCucutaBucaramangaTxt(JLabel cucutaBucaramangaTxt) {
		this.cucutaBucaramangaTxt = cucutaBucaramangaTxt;
	}

	public JLabel getPereiraOnceTxt() {
		return pereiraOnceTxt;
	}

	public void setPereiraOnceTxt(JLabel pereiraOnceTxt) {
		this.pereiraOnceTxt = pereiraOnceTxt;
	}

	public JLabel getAguilasEnvigadoTxt() {
		return aguilasEnvigadoTxt;
	}

	public void setAguilasEnvigadoTxt(JLabel aguilasEnvigadoTxt) {
		this.aguilasEnvigadoTxt = aguilasEnvigadoTxt;
	}

	public JLabel getPatriotasChicoTxt() {
		return patriotasChicoTxt;
	}

	public void setPatriotasChicoTxt(JLabel patriotasChicoTxt) {
		this.patriotasChicoTxt = patriotasChicoTxt;
	}

	public JLabel getTolimaHuilaTxt() {
		return tolimaHuilaTxt;
	}

	public void setTolimaHuilaTxt(JLabel tolimaHuilaTxt) {
		this.tolimaHuilaTxt = tolimaHuilaTxt;
	}

	public JLabel getBarcelonaMadridTxt() {
		return barcelonaMadridTxt;
	}

	public void setBarcelonaMadridTxt(JLabel barcelonaMadridTxt) {
		this.barcelonaMadridTxt = barcelonaMadridTxt;
	}

	public JLabel getArsenalChelseaTxt() {
		return arsenalChelseaTxt;
	}

	public void setArsenalChelseaTxt(JLabel arsenalChelseaTxt) {
		this.arsenalChelseaTxt = arsenalChelseaTxt;
	}

	public JLabel getUnitedCityTxt() {
		return unitedCityTxt;
	}

	public void setUnitedCityTxt(JLabel unitedCityTxt) {
		this.unitedCityTxt = unitedCityTxt;
	}

	public JLabel getLiverpoolEvertonTxt() {
		return liverpoolEvertonTxt;
	}

	public void setLiverpoolEvertonTxt(JLabel liverpoolEvertonTxt) {
		this.liverpoolEvertonTxt = liverpoolEvertonTxt;
	}

	public JLabel getBayernBorussiaTxt() {
		return bayernBorussiaTxt;
	}

	public void setBayernBorussiaTxt(JLabel bayernBorussiaTxt) {
		this.bayernBorussiaTxt = bayernBorussiaTxt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TextField getpDiaApuesta() {
		return pDiaApuesta;
	}

	public void setpDiaApuesta(TextField pDiaApuesta) {
		this.pDiaApuesta = pDiaApuesta;
	}

	public TextField getpValorApuesta() {
		return pValorApuesta;
	}

	public void setpValorApuesta(TextField pValorApuesta) {
		this.pValorApuesta = pValorApuesta;
	}

	public JLabel getDiaApuestaTxt() {
		return diaApuestaTxt;
	}

	public void setDiaApuestaTxt(JLabel diaApuestaTxt) {
		this.diaApuestaTxt = diaApuestaTxt;
	}

	public JLabel getValorApuestaTxt() {
		return valorApuestaTxt;
	}

	public void setValorApuestaTxt(JLabel valorApuestaTxt) {
		this.valorApuestaTxt = valorApuestaTxt;
	}

	public JButton getBotonApostar() {
		return botonApostar;
	}

	public void setBotonApostar(JButton botonApostar) {
		this.botonApostar = botonApostar;
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

}