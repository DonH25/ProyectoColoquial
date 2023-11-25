
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Esta clase es una extensión personalizada de JPanel que representa un panel
 * principal. Contiene dos botones: BotonIngresar y BotonSalirProgama.
 */
public class PanelPrincipal extends JPanel {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -8972730769329944908L;
	/**
	 * Botón para ingresar.
	 */
	private BotonIngresar botonIng;
	/**
	 * Botón para salir del programa.
	 */
	private BotonSalirProgama botonSalir;

	/**
	 * Constructor que inicializa los botones y configura el panel.
	 */
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

	/**
	 * Obtiene el botón de ingreso.
	 * 
	 * @return El botón de ingreso.
	 */
	public BotonIngresar getBotonIng() {
		return botonIng;
	}

	/**
	 * Establece el botón de ingreso.
	 * 
	 * @param botonIng El botón de ingreso.
	 */

	public void setBotonIng(BotonIngresar botonIng) {
		this.botonIng = botonIng;
	}

	/**
	 * Obtiene el botón de salida del programa.
	 * 
	 * @return El botón de salida del programa.
	 */
	public BotonSalirProgama getBotonSalir() {
		return botonSalir;
	}

	/**
	 * Establece el botón de salida del programa.
	 * 
	 * @param botonSalir El botón de salida del programa.
	 */
	public void setBotonSalir(BotonSalirProgama botonSalir) {
		this.botonSalir = botonSalir;
	}

}
