package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCrearSedes extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2958406166755371604L;
	private JTextField numEmpleados, localidadSede, localidadModificar;
	private JLabel indicacionesEmpleados, indicacionesLocalidad, indicacionesLocalidadModificar, fondo;
	private JButton registrarSede, modificarSede, regresar;

	public VentanaCrearSedes() {

		setBounds(150, 0, 1280, 720);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		indicacionesLocalidad = new JLabel();
		indicacionesLocalidad.setBounds(100, 110, 500, 25);
		indicacionesLocalidad.setText("Ingresar en el espacio de abajo La Localidad de esta sede   ");
		indicacionesLocalidad.setForeground(Color.WHITE);

		localidadSede = new JTextField();
		localidadSede.setBounds(100, 130, 350, 30);

		indicacionesLocalidadModificar = new JLabel();
		indicacionesLocalidadModificar.setBounds(100, 300, 500, 25);
		indicacionesLocalidadModificar.setText("Ingresar en el espacio de abajo La Localidad que desea modificar   ");
		indicacionesLocalidadModificar.setForeground(Color.WHITE);
		indicacionesLocalidadModificar.setVisible(false);

		localidadModificar = new JTextField();
		localidadModificar.setBounds(100, 330, 350, 30);
		localidadModificar.setVisible(false);

		indicacionesEmpleados = new JLabel();
		indicacionesEmpleados.setBounds(600, 110, 500, 25);
		indicacionesEmpleados.setText("Ingresar en el espacio de abajo el numero de empleados de esta sede; ");
		indicacionesEmpleados.setForeground(Color.WHITE);

		numEmpleados = new JTextField();
		numEmpleados.setBounds(600, 130, 350, 25);

		registrarSede = new JButton();
		registrarSede.setBounds(1000, 450, 200, 200);
		Image temp1;
		temp1 = new ImageIcon("src/imagenes/registrarSedes.png").getImage();
		ImageIcon imagen1;
		imagen1 = new ImageIcon(temp1.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		registrarSede.setIcon(imagen1);

		modificarSede = new JButton();
		modificarSede.setBounds(800, 450, 200, 200);
		Image temp11;
		temp11 = new ImageIcon("src/imagenes/modificarSedes.png").getImage();
		ImageIcon imagen11;
		imagen11 = new ImageIcon(temp11.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		modificarSede.setIcon(imagen11);
		modificarSede.setVisible(false);

		fondo = new JLabel();
		fondo.setBounds(0, 0, 1280, 720);
		Image temp;
		temp = new ImageIcon("src/imagenes/fondo.JPG").getImage();
		ImageIcon imagen;
		imagen = new ImageIcon(temp.getScaledInstance(1280, 720, Image.SCALE_SMOOTH));
		fondo.setIcon(imagen);

		regresar = new JButton();
		regresar.setBounds(0, 0, 50, 50);
		Image tempo;
		tempo = new ImageIcon("src/imagenes/regre.JPG").getImage();
		ImageIcon imageno;
		imageno = new ImageIcon(tempo.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		regresar.setVisible(false);
		regresar.setIcon(imageno);
		add(indicacionesLocalidad);
		add(indicacionesEmpleados);
		add(localidadSede);
		add(numEmpleados);
		add(registrarSede);
		add(modificarSede);
		add(indicacionesLocalidadModificar);
		add(localidadModificar);
		add(regresar);
		add(fondo);

	}

	public JTextField getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(JTextField numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	public JTextField getLocalidadSede() {
		return localidadSede;
	}

	public void setLocalidadSede(JTextField localidadSede) {
		this.localidadSede = localidadSede;
	}

	public JLabel getIndicacionesEmpleados() {
		return indicacionesEmpleados;
	}

	public void setIndicacionesEmpleados(JLabel indicacionesEmpleados) {
		this.indicacionesEmpleados = indicacionesEmpleados;
	}

	public JLabel getIndicacionesLocalidad() {
		return indicacionesLocalidad;
	}

	public void setIndicacionesLocalidad(JLabel indicacionesLocalidad) {
		this.indicacionesLocalidad = indicacionesLocalidad;
	}

	public JButton getRegistrarSede() {
		return registrarSede;
	}

	public void setRegistrarSede(JButton registrarSede) {
		this.registrarSede = registrarSede;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getModificarSede() {
		return modificarSede;
	}

	public void setModificarSede(JButton modificarSede) {
		this.modificarSede = modificarSede;
	}

	public JTextField getLocalidadModificar() {
		return localidadModificar;
	}

	public void setLocalidadModificar(JTextField localidadModificar) {
		this.localidadModificar = localidadModificar;
	}

	public JLabel getIndicacionesLocalidadModificar() {
		return indicacionesLocalidadModificar;
	}

	public void setIndicacionesLocalidadModificar(JLabel indicacionesLocalidadModificar) {
		this.indicacionesLocalidadModificar = indicacionesLocalidadModificar;
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
