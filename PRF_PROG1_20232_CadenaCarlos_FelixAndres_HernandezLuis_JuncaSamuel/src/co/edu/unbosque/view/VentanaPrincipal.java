package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * VentanaPrincipal es una subclase de JFrame que representa la ventana
 * principal de la aplicación. Esta clase se encarga de inicializar y configurar
 * la ventana principal, incluyendo su tamaño, posición, diseño, título y
 * operación de cierre. También se encarga de la creación y configuración de
 * varios componentes de la interfaz de usuario, como el logo.
 */
public class VentanaPrincipal extends JFrame {
	/**
	 * serialVersionUID es un identificador de versión para la serialización. Este
	 * identificador se utiliza durante la deserialización para verificar que el
	 * emisor y el receptor de un objeto serializado mantienen una compatibilidad de
	 * versión.
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -7464437200510907013L;
	/**
	 * logo es un JLabel que representa el logo de la aplicación. Este logo se carga
	 * desde un archivo de imagen y se escala para ajustarse al tamaño del JLabel.
	 */
	private JLabel logo;
	/**
	 * fondo es un objeto Fondo que representa el fondo de la ventana. Este objeto
	 * se utiliza para personalizar el aspecto del fondo de la ventana.
	 */
	private Fondo fondo;
	/**
	 * panel es un objeto PanelPrincipal que representa el panel principal de la
	 * ventana. Este panel puede contener otros componentes de la interfaz de
	 * usuario y se utiliza como contenedor principal en la ventana.
	 */
	private PanelPrincipal panel;
	/**
	 * texto es un JLabel que puede ser utilizado para mostrar texto en la ventana.
	 * Este JLabel puede ser configurado para mostrar cualquier texto necesario en
	 * la interfaz de usuario.
	 */
	private JLabel texto;

	/**
	 * Constructor de VentanaPrincipal. Inicializa los componentes de la ventana y
	 * establece sus propiedades. El constructor se encarga de crear los objetos
	 * para el logo, el fondo y el panel principal. También configura las
	 * propiedades de la ventana, como su tamaño, posición, diseño, título y
	 * operación de cierre. Finalmente, carga una imagen desde un archivo, la escala
	 * para ajustarse al tamaño del JLabel del logo, y establece esta imagen como el
	 * icono del logo.
	 */
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
		add(panel);
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
