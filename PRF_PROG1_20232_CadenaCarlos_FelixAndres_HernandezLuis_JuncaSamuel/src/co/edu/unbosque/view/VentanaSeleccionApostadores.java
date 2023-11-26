
package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * VentanaSeleccionApostadores es una subclase de JFrame que representa una
 * ventana de selección de apostadores en la aplicación. Esta clase se encarga
 * de inicializar y configurar la ventana de selección de apostadores,
 * incluyendo su tamaño, posición, diseño, y operación de cierre. También se
 * encarga de la creación y configuración de varios botones que representan
 * diferentes acciones que un usuario puede realizar con los apostadores.
 */
public class VentanaSeleccionApostadores extends JFrame {
	/**
	 * serialVersionUID es un identificador de versión para la serialización. Este
	 * identificador se utiliza durante la deserialización para verificar que el
	 * emisor y el receptor de un objeto serializado mantienen una compatibilidad de
	 * versión.
	 */
	private static final long serialVersionUID = -6534808995204108233L;

	/**
	 * fondo es un JLabel que puede ser utilizado para mostrar un fondo en la
	 * ventana.
	 */
	private JLabel fondo;

	/**
	 * botonCrear es un JButton que representa la acción de crear un nuevo
	 * apostador. Este botón se configura con una imagen que representa visualmente
	 * la acción de crear.
	 */
	private JButton botonCrear, botonMostrar, botonActualizar, botonEliminar, botonRegresar;

	/**
	 * Constructor de VentanaSeleccionApostadores. Inicializa los componentes de la
	 * ventana y establece sus propiedades. El constructor se encarga de crear los
	 * objetos para los botones y configurar sus propiedades, como su tamaño,
	 * posición y, en algunos casos, su imagen. También configura las propiedades de
	 * la ventana, como su tamaño, posición, diseño y operación de cierre.
	 */
	public VentanaSeleccionApostadores() {
		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		botonCrear = new JButton();
		botonCrear.setBounds(120, 70, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/crearApostador.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonCrear.setIcon(imagen1);

		botonActualizar = new JButton();
		botonActualizar.setBounds(900, 70, 200, 200);
		Image temp1111;
		temp1111 = new ImageIcon("src/imagenes/botonActualizarApostador.jpg").getImage();
		ImageIcon imagen1111;
		imagen1111 = new ImageIcon(temp1111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonActualizar.setIcon(imagen1111);

		botonMostrar = new JButton("");
		botonMostrar.setBounds(120, 400, 200, 200);
		Image temp11111;
		temp11111 = new ImageIcon("src/imagenes/mostrarApostador.png").getImage();
		ImageIcon imagen11111;
		imagen11111 = new ImageIcon(temp11111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonMostrar.setIcon(imagen11111);

		botonEliminar = new JButton();
		botonEliminar.setBounds(900, 400, 200, 200);
		Image temp11111111;
		temp11111111 = new ImageIcon("src/imagenes/elimApostador.jpg").getImage();
		ImageIcon imagen11111111;
		imagen11111111 = new ImageIcon(temp11111111.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		botonEliminar.setIcon(imagen11111111);
		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp;
		temp = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen);

		botonRegresar = new JButton();
		botonRegresar.setBounds(0, 0, 100, 100);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/regresar.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		botonRegresar.setIcon(imagen11);

		add(botonEliminar);
		add(botonCrear);
		add(botonActualizar);
		add(botonMostrar);
		add(botonRegresar);
		add(fondo);

	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JButton getBotonCrear() {
		return botonCrear;
	}

	public void setBotonCrear(JButton botonCrear) {
		this.botonCrear = botonCrear;
	}

	public JButton getBotonMostrar() {
		return botonMostrar;
	}

	public void setBotonMostrar(JButton botonMostrar) {
		this.botonMostrar = botonMostrar;
	}

	public JButton getBotonActualizar() {
		return botonActualizar;
	}

	public void setBotonActualizar(JButton botonActualizar) {
		this.botonActualizar = botonActualizar;
	}

	public JButton getBotonEliminar() {
		return botonEliminar;
	}

	public void setBotonEliminar(JButton botonEliminar) {
		this.botonEliminar = botonEliminar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getBotonRegresar() {
		return botonRegresar;
	}

	public void setBotonRegresar(JButton botonRegresar) {
		this.botonRegresar = botonRegresar;
	}

}
