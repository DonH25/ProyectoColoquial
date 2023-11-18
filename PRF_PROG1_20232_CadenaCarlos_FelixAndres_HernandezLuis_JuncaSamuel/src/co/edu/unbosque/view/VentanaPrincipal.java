package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	private LogoRoyal logo;
	private Fondo fondo;
	private PanelPrincipal panel;

	public VentanaPrincipal() {
		logo = new LogoRoyal();
		fondo = new Fondo();
		panel = new PanelPrincipal();

		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setTitle("Royal Fun Bet");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Image temp;
		temp = new ImageIcon("src/imagenes/Royal.jpeg").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		logo.setIcon(imagen1);

		Image temp2;
		temp2 = new ImageIcon("src/imagenes/wall.jpg").getImage();
		ImageIcon imagen2;
		imagen2 = new ImageIcon(temp2.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen2);

		add(logo);
		add(fondo);
		add(panel);

	}

}
