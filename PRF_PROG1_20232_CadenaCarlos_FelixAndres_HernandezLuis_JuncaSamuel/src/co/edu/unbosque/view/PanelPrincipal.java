
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8972730769329944908L;
	private BotonIngresar botonIng;
	private BotonSalirProgama botonSalir;

	public PanelPrincipal() {
		botonSalir = new BotonSalirProgama();
		botonIng = new BotonIngresar();
		
		setBounds(0, 450, 1280, 720);
		setBackground(Color.white);
		setLayout(new FlowLayout());

		Image temp;
		temp = new ImageIcon("src/imagenes/ingresar.png").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(500, 200, Image.SCALE_SMOOTH));
		botonIng.setIcon(imagen);

		Image temp2;
		temp2 = new ImageIcon("src/imagenes/salir.png").getImage();
		ImageIcon imagen2;
		imagen2 = new ImageIcon(temp2.getScaledInstance(500, 200, Image.SCALE_SMOOTH));
		botonSalir.setIcon(imagen2);

		add(botonIng);
		add(botonSalir);

	}

	public BotonIngresar getBotonIng() {
		return botonIng;
	}

	public void setBotonIng(BotonIngresar botonIng) {
		this.botonIng = botonIng;
	}

	public BotonSalirProgama getBotonSalir() {
		return botonSalir;
	}

	public void setBotonSalir(BotonSalirProgama botonSalir) {
		this.botonSalir = botonSalir;
	}

}
