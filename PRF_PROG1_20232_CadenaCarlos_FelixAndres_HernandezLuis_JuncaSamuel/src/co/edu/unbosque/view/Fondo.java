package co.edu.unbosque.view;

import javax.swing.JLabel;

/**
 * Esta clase es una extensión personalizada de JLabel que representa un fondo.
 */
public class Fondo extends JLabel {

	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -6327910140769325176L;

	/**
	 * Este es un constructor sin argumentos que crea un nuevo fondo con ciertas
	 * propiedades establecidas. Establece el tamaño y la posición del fondo.
	 */
	public Fondo() {
		setBounds(0, 0, 1280, 720);
	}

}
