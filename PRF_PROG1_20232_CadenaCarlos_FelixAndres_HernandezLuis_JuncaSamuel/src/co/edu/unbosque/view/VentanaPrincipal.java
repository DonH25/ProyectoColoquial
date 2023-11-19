package co.edu.unbosque.view;


import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7464437200510907013L;
	private JLabel logo;
	private Fondo fondo;
	private PanelPrincipal panel;
	private JLabel texto;

	public VentanaPrincipal() {
		logo = new JLabel();
		fondo = new Fondo();
		panel = new PanelPrincipal();

		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setTitle("Royal Fun Bet");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		logo.setBounds(450, 0, 350, 350);
		Image temp;
		temp = new ImageIcon("src/imagenes/coloquiales.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp.getScaledInstance(350, 350, Image.SCALE_SMOOTH));
		logo.setIcon(imagen1);

		fondo.setBounds(0, 0, 1280, 720);
		Image temp2;
		temp2 = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen2;
		imagen2 = new ImageIcon(temp2.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen2);

		texto = new JLabel();
		texto.setBounds(0, 550, 350, 350);
		Image temp3;
		temp3 = new ImageIcon("src/imagenes/coloquial.png").getImage();
		ImageIcon imagen3;
		imagen3 = new ImageIcon(temp3.getScaledInstance(555, 555, Image.SCALE_SMOOTH));
		texto.setIcon(imagen3);

		add(logo);
		add(fondo);
		add(panel);
		add(texto);

	}

	public Fondo getFondo() {
		return fondo;
	}

	public void setFondo(Fondo fondo) {
		this.fondo = fondo;
	}

	public PanelPrincipal getPanel() {
		return panel;
	}

	public void setPanel(PanelPrincipal panel) {
		this.panel = panel;
	}

}
