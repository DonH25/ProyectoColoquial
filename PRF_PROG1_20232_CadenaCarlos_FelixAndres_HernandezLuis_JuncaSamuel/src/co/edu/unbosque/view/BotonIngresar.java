package co.edu.unbosque.view;

import javax.swing.JButton;

/**
 * Esta clase es una extensión personalizada de JButton que configura el botón
 * para ser transparente.
 */
public class BotonIngresar extends JButton {
	/**
	 * Este es un número de serie único que identifica la versión de la clase que se
	 * ha serializado. Este número de serie se utiliza durante la deserialización
	 * para verificar que el remitente y el receptor de un objeto serializado
	 * mantienen una consistencia de carga.
	 */
	/**
		 * 
		 */
	private static final long serialVersionUID = 5307431997483914395L;

	/**
	 * Este es un constructor sin argumentos que crea un nuevo botón con ciertas
	 * propiedades establecidas. Establece el botón para ser opaco, no llena el área
	 * de contenido y no pinta el borde.
	 */
	public BotonIngresar() {
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
	}
}
