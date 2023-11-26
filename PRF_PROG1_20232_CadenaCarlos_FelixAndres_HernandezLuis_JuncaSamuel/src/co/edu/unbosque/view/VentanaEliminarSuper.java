package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaEliminarSuper extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -239078517114262893L;
	private JButton eliminar, regresar;
	private JTextField index;
	private JLabel indicElim, fondo;

	public VentanaEliminarSuper() {
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
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		regresar.setIcon(imagen11);

		add(index);
		add(indicElim);
		add(eliminar);
		add(regresar);
		add(fondo);
	}

}