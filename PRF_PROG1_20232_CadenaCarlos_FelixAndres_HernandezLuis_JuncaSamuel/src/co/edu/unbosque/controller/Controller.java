package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.ApostadorDAO;
import co.edu.unbosque.model.persistence.CasaDeApuestasDAO;
import co.edu.unbosque.model.persistence.CasaDeApuestasProperties;
import co.edu.unbosque.model.persistence.GestionApuestaDAO;
import co.edu.unbosque.model.persistence.JuegoDAO;
import co.edu.unbosque.model.persistence.SedeDAO;
import co.edu.unbosque.view.Console;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {
	private Console con;
	CasaDeApuestasDAO caDao;
	JuegoDAO jueDao;
	ApostadorDAO apostDao;
	SedeDAO sedeDao;
	GestionApuestaDAO gestApuDao;
	CasaDeApuestasProperties prop;
	VentanaPrincipal vp;

	public Controller() {
		con = new Console();
		caDao = new CasaDeApuestasDAO();
		jueDao = new JuegoDAO();
		prop = new CasaDeApuestasProperties();
		vp = new VentanaPrincipal();
		agregarLectores();
	}

	public void runPruebaPorConsola() {
		while (true) {
			con.printWithNewLine("Seleccione la opcion que quiere realizar ");
			con.printWithNewLine("1: Modulo 1");
			con.printWithNewLine("2: Modulo 2");
			con.printWithNewLine("3: Modulo 3");
			con.printWithNewLine("4: Modulo 4");
			con.printWithNewLine("5: Modulo 5");
			con.printWithNewLine("6: Salir");
			int dec = con.readInt();
			con.quemarLinea();
			switch (dec) {
			case 1: {
				cicloModulo1: while (true) {
					con.printWithNewLine("Bienvenido al modulo de parametrizacion de la casa");
					con.printWithNewLine("1: Crear los datos de la casa de apuestas");
					con.printWithNewLine("2: Modificar los datos de la casa de apuestas ");
					con.printWithNewLine("3: Modificar los datos de los presupuestos de la casa de apuestas ");
					con.printWithNewLine("4: Salir ");
					con.printWithNewLine("5: Leer (prueba)");
					int option = con.readInt();
					con.quemarLinea();
					switch (option) {
					case 1: {
						if (caDao.casaExiste()) {
							con.printWithNewLine("La casa de apuestas ya existe , no es necesario crearla");
							break;
						} else {
							con.printWithNewLine("Insertar nombre de la casa de apuestas");
							String nombre = con.readWholeLine();
							con.printWithNewLine("Insertar el numero de sedes de la casa de apuestas ");
							String sedes = con.readWholeLine();
							con.printWithNewLine("Insertar el presupuesto total de la casa de apuestas ");
							String preTotal = con.readWholeLine();
							caDao.create(nombre, sedes, preTotal);
							if (jueDao.juegoExiste()) {
								con.printWithNewLine("Los Juegos ya estan configurados ");
								break;
							} else {
								
								con.printWithNewLine("Ahora se van a crear los juegos de la casa de apuestas");
								con.printWithNewLine("Juego#1 Baloto");
								String juego1name = "Baloto";
								String juego1tipo = "Loteria";
								con.printWithNewLine("Inserte el presupuesto del juego");
								String presu1 = con.readWholeLine();
								jueDao.create(juego1name, juego1tipo, presu1);
								con.printWithNewLine("Juego#2 Loteria");
								String juego2name = "Loteria";
								String juego2tipo = "Loteria";
								con.printWithNewLine("Inserte el presupuesto del juego");
								String presu2 = con.readWholeLine();
								jueDao.create(juego2name, juego2tipo, presu2);
								con.printWithNewLine("Juego#3 Chance");
								String juego3name = "Chance";
								String juego3tipo = "Chance";
								con.printWithNewLine("Inserte el presupuesto del juego");
								String presu3 = con.readWholeLine();
								jueDao.create(juego3name, juego3tipo, presu3);
								con.printWithNewLine("Juego#4 Superastro");
								String juego4name = "Superastro";
								String juego4tipo = "Loteria";
								con.printWithNewLine("Inserte el presupuesto del juego");
								String presu4 = con.readWholeLine();
								jueDao.create(juego4name, juego4tipo, presu4);
								con.printWithNewLine("Juego#5 Betplay");
								String juego5name = "Betplay";
								String juego5tipo = "Deportivo";
								con.printWithNewLine("Inserte el presupuesto del juego");
								String presu5 = con.readWholeLine();
								jueDao.create(juego5name, juego5tipo, presu5);
								prop.inicializarProperties();
								break;
							}

						}
					}
					case 2: {
						int pos = 0;
						con.printWithNewLine("Insertar nuevo nombre de la casa de apuestas");
						String Newnombre = con.readWholeLine();
						con.printWithNewLine("Insertar el nuevo numero de sedes de la casa de apuestas ");
						String Newsedes = con.readWholeLine();
						con.printWithNewLine("Insertar el nuevo presupuesto total de la casa de apuestas ");
						String NewpreTotal = con.readWholeLine();
						caDao.update(pos, Newnombre, Newsedes, NewpreTotal);
						break;
					}
					case 3: {
						con.printWithNewLine(
								"Inserte la posicion del juego a actualizar (0 = baloto,1:loteria2:chance3:superastro4: betplay");
						int pos = con.readInt();
						con.quemarLinea();
						con.printWithNewLine("Inserte el presupuesto actualizado");
						String pres = con.readWholeLine();
						jueDao.update(pos, pres);
						break;
					}
					case 4: {
						break cicloModulo1;

					}
					case 5: {
						con.printWithNewLine(caDao.read());
						con.printWithNewLine(jueDao.read());
						break;
					}
					default:
						con.printWithNewLine("noks");
					}

				}
			}
				break;

			case 2:
				con.printWithNewLine("case 2 de prueba");
				break;

			case 3:
				cicloModulo3: while (true) {

					con.printWithNewLine("Bienvenido al modulo de gestion de los apostadores");

					con.printWithNewLine("1: crear perfil de apostador");

					con.printWithNewLine("2: leer los datos de los apostadores");

					con.printWithNewLine("3: actualizar los datos del apostador");

					con.printWithNewLine("4: borrar al apostador");

					con.printWithNewLine("5: salir");
					int option = con.readInt();
					con.quemarLinea();
					switch (option) {
					case 1: {
						con.printWithNewLine("ingrese su nombre de apostador");
						String nombreApost = con.readWholeLine();
						con.printWithNewLine("ingrese su cedula (solo seran admitidos mayores de edad)");
						String numCedula = con.readWholeLine();
						con.printWithNewLine("ingrese la sede en la cual se encuentra jugando");
						String numSede = con.readWholeLine();
						con.printWithNewLine("digite la direccion en la que reside");
						String direccion = con.readWholeLine();
						con.printWithNewLine("digite su numero de telefono");
						String numCelular = con.readWholeLine();
						con.printWithNewLine("Inserte el año en el que usted (o el apostador) nacio");
						int anioNaci = con.readInt();
						if (anioNaci > 2005) {
							con.printWithNewLine(
									"Usted es menor de edad , no puede apostar segun la ley 643 del 2001 expedida por coljuegos");
							break;
						} else if (anioNaci < 1900) {
							con.printWithNewLine("Es imposible,la persona mas longeva actualmente vive 122 años");
							break;
						} else {
							String anio = Integer.toString(anioNaci);
							apostDao.create(nombreApost, numCedula, numSede, direccion, numCelular, anio);
							con.printWithNewLine("perfil de apostador creado");
							con.quemarLinea();

							break;
						}
					}

					case 2: {

						con.printWithNewLine(apostDao.read());
						break;

					}

					case 3: {

						con.printWithNewLine(
								" Inserte la posicion del perfil de apostador a acualizar (empezando desde 0)");
						int index = Integer.parseInt(con.readWholeLine());
						con.printWithNewLine("ingrese su nuevo nombre de apostador");
						String newNombreApost = con.readWholeLine();
						con.printWithNewLine("ingrese su nueva cedula (solo seran admitidos mayores de edad)");
						String newnNumCedula = con.readWholeLine();
						con.printWithNewLine("ingrese la nueva cede en la cual se encuentra jugando");
						String newNumCede = con.readWholeLine();
						con.printWithNewLine("digite la nueva dirreccion en la que recide");
						String newDireccion = con.readWholeLine();
						con.printWithNewLine("digite su nuevo numero de telefono");
						String newNumCelular = con.readWholeLine();
						con.printWithNewLine("Inserte el nuevo año en el que usted (o el apostador) nacio");
						int anioNaci = con.readInt();
						if (anioNaci > 2005) {
							con.printWithNewLine(
									"Usted es menor de edad , no puede apostar segun la ley 643 del 2001 expedida por coljuegos");
							break;
						} else if (anioNaci < 1900) {
							con.printWithNewLine("Es imposible,la persona mas longeva actualmente  vive 122 años");
							break;
						} else {
							boolean doneUpdate = apostDao.update(index, newNombreApost, newnNumCedula, newNumCede,
									newDireccion, newNumCelular);
							if (doneUpdate) {
								con.printWithNewLine("perfil de apostador actualizado");
							} else {
								con.printWithNewLine("Error al actualizar");
							}
							break;

						}
					}
					case 4:

						con.printWithNewLine(
								"digite la posicion del perfil de apostador a eliminar (empezando desde 0):");
						int index = Integer.parseInt(con.readWholeLine());

						if (apostDao.delete(index)) {
							con.printWithNewLine("perfil de apostador borrado");
						} else {
							con.printWithNewLine("Error al borrar el perfil de apostador");
						}

						break;

					case 5: {
						break cicloModulo3;

					}
					default:
						con.printWithNewLine("noks ");
						break;
					}
				}
			case 4:
				System.out.println("case 4 de prueba gg");

				break;

			case 5:

				cicloModulo5: while (true) {

					con.printWithNewLine("Bienvenido al modulo de consultas porfavor elija una opcion");

					con.printWithNewLine("1: listado de clietes por las sedes sede");

					con.printWithNewLine("2: ver el valor total de apuestas reaizadas por los clientes");

					con.printWithNewLine("3: mostrar los detalles de las apuestas realizadas por cliente");

					con.printWithNewLine("4: mostrar los detalles de las apuestas realizadas por sede");

					con.printWithNewLine("5: mostrar el total de las inversiones hechas por sede ");

					con.printWithNewLine("6: mostrar el total de las inversiones hechas por juego ");
					int option = con.readInt();
					con.quemarLinea();
					switch (option) {

					case 1:

						con.printWithNewLine(sedeDao.read());
						break;

					case 2:

						con.printWithNewLine(gestApuDao.read());
						break;

					case 3:

						break;

					case 4:

						con.printWithNewLine(apostDao.read());
						break;

					case 5:

						con.printWithNewLine(sedeDao.read());

						break;

					}
				}
			}
		}
	}

	public void run() {
		vp.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "ing": {
			
			break;
		}
		case "sal": {
			JOptionPane.showMessageDialog(vp, "Gracias Por usar el programa");
			vp.dispose();
			break;
		}
		}

	}

	public void agregarLectores() {
		vp.getPanel().getBotonIng().addActionListener(this);
		vp.getPanel().getBotonIng().setActionCommand("ing");
		vp.getPanel().getBotonSalir().addActionListener(this);
		vp.getPanel().getBotonSalir().setActionCommand("sal");

	}

}
