package co.edu.unbosque.view;

import javax.swing.JLabel;

/**
 * Esta clase es una extensión personalizada de JLabel que representa un logo.
 */
public class LogoRoyal extends JLabel {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -2876116455712413226L;

	/**
	 * Este es un constructor sin argumentos que crea un nuevo logo con ciertas
	 * propiedades establecidas. Establece el tamaño y la posición del logo.
	 */
	public LogoRoyal() {
		setBounds(500, 0, 800, 200);
	}

}
