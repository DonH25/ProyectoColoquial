package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaSeleccionarApuesta extends JFrame {

	private static final long serialVersionUID = -6566342782896788402L;
	private JButton betPlay, superastro, loteria, chance, baloto, regresar;
	private JLabel indicacionApuesta, fondo;

	public VentanaSeleccionarApuesta() {
		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		indicacionApuesta = new JLabel();
		indicacionApuesta.setBounds(230, 50, 800, 30);
		indicacionApuesta.setText("Por favor presione en el Logo de la apuesta que quiere realizar");
		indicacionApuesta.setFont(new Font("Arial", Font.ITALIC, 28));
		indicacionApuesta.setForeground(Color.white);

		betPlay = new JButton();
		betPlay.setBounds(213, 100, 200, 200);
		Image temp;
		temp = new ImageIcon("src/imagenes/Betplay.jpg").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		betPlay.setIcon(imagen);

		superastro = new JButton();
		superastro.setBounds(513, 100, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/superastro.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		superastro.setIcon(imagen1);

		baloto = new JButton();
		baloto.setBounds(813, 100, 200, 200);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/Baloto.jpeg").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		baloto.setIcon(imagen11);

		loteria = new JButton();
		loteria.setBounds(313, 400, 200, 200);
		Image temp111;
		temp111 = new ImageIcon("src/imagenes/loteria.png").getImage();
		ImageIcon imagen111;
		imagen111 = new ImageIcon(temp111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		loteria.setIcon(imagen111);

		chance = new JButton();
		chance.setBounds(713, 400, 200, 200);
		Image temp1111;
		temp1111 = new ImageIcon("src/imagenes/chance.png").getImage();
		ImageIcon imagen1111;
		imagen1111 = new ImageIcon(temp1111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		chance.setIcon(imagen1111);

		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp2;
		temp2 = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen2;
		imagen2 = new ImageIcon(temp2.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen2);

		regresar = new JButton();
		regresar.setBounds(0, 0, 100, 100);
		Image temp11111;
		temp11111 = new ImageIcon("src/imagenes/regresar.png").getImage();
		ImageIcon imagen11111;
		imagen11111 = new ImageIcon(temp11111.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		regresar.setIcon(imagen11111);
		regresar.setOpaque(false);
		regresar.setContentAreaFilled(false);
		regresar.setBorderPainted(false);

		add(indicacionApuesta);
		add(betPlay);
		add(superastro);
		add(baloto);
		add(loteria);
		add(chance);
		add(regresar);
		add(fondo);

	}

	public JButton getBetPlay() {
		return betPlay;
	}

	public void setBetPlay(JButton betPlay) {
		this.betPlay = betPlay;
	}

	public JButton getSuperastro() {
		return superastro;
	}

	public void setSuperastro(JButton superastro) {
		this.superastro = superastro;
	}

	public JButton getLoteria() {
		return loteria;
	}

	public void setLoteria(JButton loteria) {
		this.loteria = loteria;
	}

	public JButton getChance() {
		return chance;
	}

	public void setChance(JButton chance) {
		this.chance = chance;
	}

	public JButton getBaloto() {
		return baloto;
	}

	public void setBaloto(JButton baloto) {
		this.baloto = baloto;
	}

	public JLabel getIndicacionApuesta() {
		return indicacionApuesta;
	}

	public void setIndicacionApuesta(JLabel indicacionApuesta) {
		this.indicacionApuesta = indicacionApuesta;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getRegresar() {
		return regresar;
	}

	public void setRegresar(JButton regresar) {
		this.regresar = regresar;
	}
	

}
