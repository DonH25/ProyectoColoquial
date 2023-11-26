package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Esta clase representa una ventana para eliminar apostadores en la interfaz
 * gráfica. Extiende a JFrame, por lo que hereda todos los métodos y atributos
 * de un JFrame.
 */
public class VentanaElimApos extends JFrame {

	/**
	 * serialVersionUID es un identificador de versión para la serialización. Es
	 * necesario para garantizar que durante la deserialización el cargador de
	 * clases cargue la misma clase que fue serializada.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -5456546445987406628L;
	/**
	 * Los siguientes son botones para realizar acciones como eliminar y regresar.
	 */
	private JButton eliminar, regresar;
	/**
	 * Este es un campo de texto para recoger la entrada del usuario.
	 */
	private JTextField index;
	/**
	 * Los siguientes son etiquetas para indicar al usuario qué información se debe
	 * ingresar en los campos de texto correspondientes.
	 */
	private JLabel indicElim, fondo;

	/**
	 * Este es el constructor de la clase VentanaElimApos. Inicializa la ventana y
	 * todos sus componentes.
	 */
	public VentanaElimApos() {
		setBounds(150, 0, 500, 500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		indicElim = new JLabel("Inserte la posicion para eliminar (empieza a contar desde 0)");
		indicElim.setBounds(0, 50, 520, 20);
		indicElim.setForeground(Color.white);

		index = new JTextField();
		index.setBounds(0, 80, 500, 20);

		eliminar = new JButton();
		eliminar.setBounds(0, 300, 180, 180);
		Image temp;
		temp = new ImageIcon("src/imagenes/elimApostador.JPG").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(180, 180, Image.SCALE_SMOOTH));
		eliminar.setIcon(imagen);

		fondo = new JLabel();
		fondo.setBounds(0, 0, 500, 500);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(500, 500, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen1);

		regresar = new JButton();
		regresar.setBounds(0, 0, 50, 50);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/regresar.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		regresar.setIcon(imagen11);

		add(index);
		add(indicElim);
		add(eliminar);
		add(regresar);
		add(fondo);

	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JTextField getIndex() {
		return index;
	}

	public void setIndex(JTextField index) {
		this.index = index;
	}

	public JLabel getIndicElim() {
		return indicElim;
	}

	public void setIndicElim(JLabel indicElim) {
		this.indicElim = indicElim;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getRegresar() {
		return regresar;
	}

	public void setRegresar(JButton regresar) {
		this.regresar = regresar;
	}

}
