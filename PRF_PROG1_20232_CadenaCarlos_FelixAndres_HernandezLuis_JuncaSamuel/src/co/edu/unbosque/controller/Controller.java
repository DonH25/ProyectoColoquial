package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CasaDeApuestasDTO;
import co.edu.unbosque.model.persistence.ApostadorDAO;
import co.edu.unbosque.model.persistence.BalotoDAO;
import co.edu.unbosque.model.persistence.BetplayDAO;
import co.edu.unbosque.model.persistence.CasaDeApuestasDAO;

import co.edu.unbosque.model.persistence.CasaDeApuestasProperties;

import co.edu.unbosque.model.persistence.ChanceDAO;

import co.edu.unbosque.model.persistence.GestionApuestaDAO;
import co.edu.unbosque.model.persistence.JuegoDAO;
import co.edu.unbosque.model.persistence.LoteriaDAO;
import co.edu.unbosque.model.persistence.SedeDAO;
import co.edu.unbosque.model.persistence.SuperastroDAO;
import co.edu.unbosque.util.ExcepcionNumeroSede;
import co.edu.unbosque.util.ExcepcionPresupuestoTotal;
import co.edu.unbosque.view.Console;
import co.edu.unbosque.view.VentanaCrearCasaApuestas;
import co.edu.unbosque.view.VentanaCrearSedes;
import co.edu.unbosque.view.VentanaMenuSeleccion;
import co.edu.unbosque.view.VentanaPresupuesto;
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
	VentanaCrearCasaApuestas vcca;
	VentanaPresupuesto vpre;
	BalotoDAO balotDao;
	SuperastroDAO superDao;
	ChanceDAO chanDao;
	LoteriaDAO loteDao;
	BetplayDAO betDao;
	VentanaCrearSedes vsed;
	private File ruta1, ruta2, ruta3;
	VentanaMenuSeleccion vms;

	public Controller() {
		con = new Console();
		caDao = new CasaDeApuestasDAO();
		jueDao = new JuegoDAO();
		sedeDao = new SedeDAO();
		prop = new CasaDeApuestasProperties();
		vp = new VentanaPrincipal();
		vcca = new VentanaCrearCasaApuestas();
		vpre = new VentanaPresupuesto();
		vsed = new VentanaCrearSedes();
		vms = new VentanaMenuSeleccion();
		ruta1 = new File("src/co/edu/unbosque/model/persistence/config.properties");
		ruta2 = new File("src/co/edu/unbosque/model/persistence/juegos.dat");
		ruta3 = new File("src/co/edu/unbosque/model/persistence/sedes.dat");
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
						con.printWithNewLine("Modulo 1 Terminado :D");
						break;
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
				con.printWithNewLine(sedeDao.read());
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
						String newNumCedula = con.readWholeLine();
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
							boolean doneUpdate = apostDao.update(index, newNombreApost, newNumCedula, newNumCede,
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

				cicloModulo4: while (true) {

					con.printWithNewLine("Bienvenido al modulo de la gestion de apuestas porfavor elija una opcion");

					con.printWithNewLine("1: para crear una apuesta");
					con.printWithNewLine("2: para leer las apuestas");
					con.printWithNewLine("3: para  actualizar los datos de las apuestas");
					con.printWithNewLine("3: para  borrar alguna apuesta");

					int option = con.readInt();
					con.quemarLinea();
					switch (option) {

					case 1:
						menuJuegos: while (true) {
							con.printWithNewLine(
									"Por que clase de juego le gustara apostar, porfavor elija una opcion");

							con.printWithNewLine("1: baloto");
							con.printWithNewLine("2: superastro");
							con.printWithNewLine("3: loteria");
							con.printWithNewLine("4: betplay ");
							con.printWithNewLine("5: chance ");
							int option2 = con.readInt();
							con.quemarLinea();
							switch (option2) {

							case 1:
								con.printWithNewLine("bienvenido al baloto");

								con.printWithNewLine("ingrese el primer digito");
								String digitoBaloto1 = con.readWholeLine();
								con.printWithNewLine("ingrese el segundo digito");
								String digitoBaloto2 = con.readWholeLine();
								con.printWithNewLine("ingrese el tercer digito");
								String digitoBaloto3 = con.readWholeLine();
								con.printWithNewLine("digite el cuarto digito");
								String digitoBaloto4 = con.readWholeLine();
								con.printWithNewLine("digite el quinto digito ");
								String digitoBaloto5 = con.readWholeLine();
								con.printWithNewLine("digite el sexto digito");
								String digitoBaloto6 = con.readWholeLine();
								con.printWithNewLine("digite cuanto quisiera apostar en este juego");
								String valorDeLaApuestaBaloto = con.readWholeLine();
								balotDao.create(digitoBaloto1, digitoBaloto2, digitoBaloto3, digitoBaloto4,
										digitoBaloto5, digitoBaloto6, valorDeLaApuestaBaloto);

								// error revisar UwUn't

								con.printWithNewLine("Desea agregar mas juegos? (si/no)");
								String option3 = con.readWholeLine();
								if (option3.equalsIgnoreCase("si")) {
									con.quemarLinea();
									break menuJuegos;
								} else {
									con.printWithNewLine("Juego/s creado con éxito");
								}
								break;
							case 2:
								con.printWithNewLine("bienveido al superastro");

								con.printWithNewLine("ingrese el primer digito");
								String digitoSuper1 = con.readWholeLine();
								con.printWithNewLine("ingrese el segundo digito");
								String digitoSuper2 = con.readWholeLine();
								con.printWithNewLine("ingrese el tercer digito");
								String digitoSuper3 = con.readWholeLine();
								con.printWithNewLine("digite el cuarto digito");
								String digitoSuper4 = con.readWholeLine();
								con.printWithNewLine("digite algun signo del sodiaco"); // crear una exception que sepa
								// cuales son los unicos signos
								// del
								// sobaco
								String zodiacoSigno = con.readWholeLine();
								con.printWithNewLine("Inserte el año en el que usted (o el apostador) nacio");
								String valorDeLaApuestaSuper = con.readWholeLine();
								superDao.create(digitoSuper1, digitoSuper2, digitoSuper3, digitoSuper4, zodiacoSigno,
										valorDeLaApuestaSuper);
								con.printWithNewLine("Desea agregar mas juegos? (si/no)");
								String option4 = con.readWholeLine();
								if (option4.equalsIgnoreCase("si")) {
									con.quemarLinea();
									break menuJuegos;
								} else {
									con.printWithNewLine("Juego/s creado con éxito");
								}
								break;

							case 3:
								con.printWithNewLine("bienveido a la loteria");

								con.printWithNewLine("ingrese el primer digito");
								String digitoLoteria1 = con.readWholeLine();
								con.printWithNewLine("ingrese el segundo digito");
								String digitoLoteria2 = con.readWholeLine();
								con.printWithNewLine("ingrese el tercer digito");
								String digitoLoteria3 = con.readWholeLine();
								con.printWithNewLine("digite el cuarto digito");
								String digitoLoteria4 = con.readWholeLine();
								con.printWithNewLine("digite el primer numero de serie");
								String serieDig1 = con.readWholeLine();
								con.printWithNewLine("sigite el segundo digito de serie");
								String serieDig2 = con.readWholeLine();
								con.printWithNewLine("sigite el tercer digito de serie");
								String serieDig3 = con.readWholeLine();
								con.printWithNewLine("digite cuanto quisiera apostar en este juego");
								String valorDeLaApuestaLoteria = con.readWholeLine();
								loteDao.create(digitoLoteria1, digitoLoteria2, digitoLoteria3, digitoLoteria4,
										serieDig1, serieDig2, serieDig3, valorDeLaApuestaLoteria);

								con.printWithNewLine("Desea agregar mas juegos? (si/no)");
								String option5 = con.readWholeLine();

								if (option5.equalsIgnoreCase("si")) {
									con.quemarLinea();
									break menuJuegos;
								} else {
									con.printWithNewLine("Juego/s creado con éxito");
								}
								break;

							case 4:
								con.printWithNewLine("bievenido a betplay");

								con.printWithNewLine("ingrese el nombre del equipo local ");
								String nombreEquipoLocal = con.readWholeLine();
								con.printWithNewLine("digite el marcador del equipo local");
								String marcadorLocal = con.readWholeLine();
								con.printWithNewLine("ingrese el nombre del equipo visitante");
								String nombreEquipoVisitante = con.readWholeLine();
								con.printWithNewLine("digite el marcador del equipo visitante");
								String marcadorVisitante = con.readWholeLine();
								con.printWithNewLine("digite cuanto quisiera apostar en este juego");
								String valorDeLaApuestabetplay = con.readWholeLine();

								betDao.create(nombreEquipoLocal, marcadorLocal, nombreEquipoVisitante,
										marcadorVisitante, valorDeLaApuestabetplay);

								con.printWithNewLine("Desea agregar mas juegos? (si/no)");
								String option6 = con.readWholeLine();

								if (option6.equalsIgnoreCase("si")) {
									con.quemarLinea();
									break menuJuegos;
								} else {
									con.printWithNewLine("Juego/s creado con éxito");
								}
								break;

							case 5:

								con.printWithNewLine("bievenido a chance ");

								con.printWithNewLine("ingrese el primer digito");
								String digito1Chance = con.readWholeLine();
								con.printWithNewLine("ingrese el segundo digito");
								String digito2Chance = con.readWholeLine();
								con.printWithNewLine("digite el tercer digito");
								String digito3Chance = con.readWholeLine();
								con.printWithNewLine("digite el cuarto digito ");
								String digito4Chance = con.readWholeLine();
								con.printWithNewLine("digite cuanto quisiera apostar en este juego");
								String valorDeLaApuestaChance = con.readWholeLine();

								chanDao.create(digito1Chance, digito2Chance, digito3Chance, digito4Chance,
										valorDeLaApuestaChance);

								con.printWithNewLine("Desea agregar mas juegos? (si/no)");
								String option7 = con.readWholeLine();

								if (option7.equalsIgnoreCase("si")) {
									con.quemarLinea();
									break menuJuegos;
								} else {
									con.printWithNewLine("Juego/s creado con éxito");
								}

							}
							break cicloModulo4;

						}
					}
				}

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

					case 6:

						con.printWithNewLine(jueDao.read());

						break cicloModulo5;

					}
				}
			}
		}
	}

	public void run() {
		if (ruta1.exists() && ruta2.exists() && ruta3.exists()) {
			vms.setVisible(true);
		} else {
			vp.setVisible(true);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		// Seccion para Ingresar al programa
		case "ing": {
			vp.setVisible(false);
			vcca.setVisible(true);
			break;
		}

		// Seccion para salir del programa
		case "sal": {
			JOptionPane.showMessageDialog(vp, "Gracias Por usar el programa");
			vp.dispose();
			break;
		}

		// Seccion para el Boton de registro de Casa de apuestas
		case "btnnRegist": {
			String nombre = vcca.getNombreCasaDeApuestas().getText();
			String cantidadSedes = vcca.getSedesCasaDeApuestas().getText();
			String presupuestoTotal = vcca.getPresupuestoCasaDeApuestas().getText();

			try {
				// Validar que los campos no esten vacios
				if (!nombre.equals("") && !cantidadSedes.equals("") && !presupuestoTotal.equals("")) {
					boolean temporal = true;

					try {
						// Validar que la cantidad de sedes sea un número válido
						int sedes = Integer.parseInt(cantidadSedes);
						revisarNumeroSede(sedes);

						// Validar que el presupuesto total sea un número válido y no sea negativo
						double preTotal = Double.parseDouble(presupuestoTotal);
						revisarNumeroNegativo(preTotal);
					} catch (NumberFormatException ex) {
						ex.printStackTrace();
						temporal = false;
						JOptionPane.showMessageDialog(vcca, "Ingrese valores válidos por favor...");
					}

					if (temporal) {
						int optionResult = JOptionPane.showConfirmDialog(vcca,
								"¿Está seguro de los datos ingresados? Luego no se podrán cambiar.", "Confirmación",
								JOptionPane.YES_NO_OPTION);

						if (optionResult == JOptionPane.YES_OPTION) {
							try {
								caDao.create(nombre, cantidadSedes, presupuestoTotal);
								prop.inicializarProperties();
								JOptionPane.showMessageDialog(vcca, "Datos ingresados exitosamente");
								vcca.setVisible(false);
								vpre.setVisible(true);
							} catch (Exception e1) {
								e1.printStackTrace();
								JOptionPane.showMessageDialog(vcca, "Error al procesar los datos");
							}
						} else {
							vcca.getNombreCasaDeApuestas().setText("");
							vcca.getSedesCasaDeApuestas().setText("");
							vcca.getPresupuestoCasaDeApuestas().setText("");
						}
					}

				} else {
					JOptionPane.showMessageDialog(vcca, "Debe llenar todos los datos para crear la casa de apuestas");
				}
			} catch (ExcepcionNumeroSede e1) {
				JOptionPane.showMessageDialog(vcca, "El número de sedes debe estar entre 1 y 10 y ser un entero.");
			} catch (ExcepcionPresupuestoTotal e1) {
				JOptionPane.showMessageDialog(vcca,
						"El número ingresado es negativo para sedes o presupuesto, intente nuevamente.");
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(vcca, "Error inesperado: " + e1.getMessage());
			}
			break;
		}

		// Sección para el Boton de registro de presupuestos
		case "btnRegistPresup": {
			if (vpre.getBalotoPresupuesto().getText().equals("") && vpre.getBetplayPresupuesto().getText().equals("")
					&& vpre.getSuperastroPresupuesto().getText().equals("")
					&& vpre.getChancePresupuesto().getText().equals("")
					&& vpre.getLoteriaPresupuesto().getText().equals("")) {
				JOptionPane.showMessageDialog(vpre, "Complete todos los campos");
			} else {
				boolean temp1 = true;

				String[] juegos = { vpre.getBalotoPresupuesto().getText(), vpre.getBetplayPresupuesto().getText(),
						vpre.getSuperastroPresupuesto().getText(), vpre.getChancePresupuesto().getText(),
						vpre.getLoteriaPresupuesto().getText() };

				for (String presupuesto : juegos) {
					try {
						Double.parseDouble(presupuesto);

						// Verificar si el texto está vacío y actualizar temp1
						if (presupuesto.equals("")) {
							temp1 = false;
							JOptionPane.showMessageDialog(vpre, "Debe ingresar valores válidos.");
							break; // Terminar el bucle si encuentra un valor no válido
						}
					} catch (NumberFormatException ex) {
						ex.printStackTrace();
						temp1 = false;
						JOptionPane.showMessageDialog(vpre, "Debe ingresar valores válidos.");
						break; // Terminar el bucle si encuentra un valor no válido
					}
				}
				if (temp1 == true) {
					caDao.cargarPropertiesDeLaCasa();

					double tmp1 = Double.parseDouble(vpre.getLoteriaPresupuesto().getText());
					double tmp2 = Double.parseDouble(vpre.getBalotoPresupuesto().getText());
					double tmp3 = Double.parseDouble(vpre.getBetplayPresupuesto().getText());
					double tmp4 = Double.parseDouble(vpre.getChancePresupuesto().getText());
					double tmp5 = Double.parseDouble(vpre.getSuperastroPresupuesto().getText());

					double sumPresupuesto = tmp1 + tmp2 + tmp3 + tmp4 + tmp5;

					if (sumPresupuesto <= Double.parseDouble(vcca.getPresupuestoCasaDeApuestas().getText())) {
						jueDao.create("Baloto", "Loteria", vpre.getBalotoPresupuesto().getText());
						jueDao.create("Chance", "Chance", vpre.getChancePresupuesto().getText());
						jueDao.create("Betplay", "Deportivo", vpre.getBetplayPresupuesto().getText());
						jueDao.create("Loteria", "Loteria", vpre.getLoteriaPresupuesto().getText());
						jueDao.create("Superastro", "Loteria", vpre.getSuperastroPresupuesto().getText());

						int option = JOptionPane.showConfirmDialog(vpre, "¿Los datos ingresados son correctos?",
								"Confirmación", JOptionPane.YES_NO_OPTION);

						if (option == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(vpre, "Datos ingresados");
							vpre.setVisible(false);
							vsed.setVisible(true);
						} else {
							// Si el usuario presiona "No", borrar los cuadros de texto
							vpre.getLoteriaPresupuesto().setText("");
							vpre.getBalotoPresupuesto().setText("");
							vpre.getBetplayPresupuesto().setText("");
							vpre.getChancePresupuesto().setText("");
							vpre.getSuperastroPresupuesto().setText("");
						}
					} else {
						JOptionPane.showMessageDialog(vpre,
								"La suma de los presupuestos excede su presupuesto total, realice de nuevo la distribución del presupuesto");
					}

				}

			}

			break;
		}
		case "btnRegistSed": {
			String localidad = vsed.getLocalidadSede().getText();
			String empleados = vsed.getNumEmpleados().getText();

			// Verificar si ambos campos están vacíos
			if (localidad.equals("") && empleados.equals("")) {
				JOptionPane.showMessageDialog(vpre, "Por favor, completar los cuadros ");
			} else {
				try {
					// Intentar convertir la cantidad de empleados a un número entero
					int numEmpleados = Integer.parseInt(empleados);

					// Verificar si la cantidad de empleados es negativa
					revisarNumeroNegativo(numEmpleados);

					// Mostrar confirmación antes de crear la sede
					int opcion = JOptionPane.showConfirmDialog(vpre, "¿Desea crear la sede?", "Confirmar",
							JOptionPane.YES_NO_OPTION);

					if (opcion == JOptionPane.YES_OPTION) {
						// Crear la sede si se selecciona 'Si'
						sedeDao.create(localidad, empleados);
						JOptionPane.showMessageDialog(vsed, "Sede creada exitosamente");
					} else {
						// Vaciar los campos si se selecciona 'No'
						vsed.getLocalidadSede().setText("");
						vsed.getNumEmpleados().setText("");
					}
				} catch (ExcepcionPresupuestoTotal e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(vpre,
							"Por favor, no existen números negativos posibles en esta elección ");
				}
			}
			if (sedeDao.getListOfSedes().size() == Integer.parseInt(prop.getSedes())) {
				vsed.setVisible(false);

			} else {
				JOptionPane.showMessageDialog(vpre, "Las sedes estan incompletas, por favor creala nuevamente");
			}
			break;
		}
		case "btnPara": {
			int opcion = JOptionPane.showConfirmDialog(vpre, "¿Desea modificar la casa de apuestas?", "Confirmación",
					JOptionPane.YES_NO_OPTION);
			if (opcion == JOptionPane.YES_OPTION) {
				vms.setVisible(false);
				vcca.setVisible(true);

			} else {
				int opcion1 = JOptionPane.showConfirmDialog(vpre, "¿Desea modificar los presupuestos de los juegos?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (opcion1 == JOptionPane.YES_OPTION) {
					vpre.setVisible(true);
					vms.setVisible(false);
				} else {
					int opcion12 = JOptionPane.showConfirmDialog(vpre, "¿Desea modificar Las sedes?", "Confirmación",
							JOptionPane.YES_NO_OPTION);
					if (opcion12 == JOptionPane.YES_OPTION) {
						vms.setVisible(false);
						vsed.setVisible(true);
						vsed.getModificarSede().setVisible(true);
						vsed.getRegistrarSede().setVisible(false);
					} else {
						JOptionPane.showMessageDialog(vms, "No se Modifico absolutamente nada");
					}
				}
			}
			break;
		}
		case "btnModifSed": {
			String localidad = vsed.getLocalidadSede().getText();
			String empleados = vsed.getNumEmpleados().getText();

			// Verificar si ambos campos están vacíos
			if (localidad.equals("") && empleados.equals("")) {
				JOptionPane.showMessageDialog(vpre, "Por favor, completar los cuadros ");
			} else {
				try {
					// Intentar convertir la cantidad de empleados a un número entero
					int numEmpleados = Integer.parseInt(empleados);

					// Verificar si la cantidad de empleados es negativa
					revisarNumeroNegativo(numEmpleados);

					// Mostrar confirmación antes de crear la sede
					int opcion111 = JOptionPane.showConfirmDialog(vpre, "¿Desea Modificar la sede?", "Confirmar",
							JOptionPane.YES_NO_OPTION);

					if (opcion111 == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(vsed, "Sede creada exitosamente");
					} else {
						// Vaciar los campos si se selecciona 'No'
						vsed.getLocalidadSede().setText("");
						vsed.getNumEmpleados().setText("");
					}
				} catch (ExcepcionPresupuestoTotal e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(vpre,
							"Por favor, no existen números negativos posibles en esta elección ");
				}
			}
			if (sedeDao.getListOfSedes().size() == Integer.parseInt(prop.getSedes())) {
				vsed.setVisible(false);

			} else {
				JOptionPane.showMessageDialog(vpre, "Las sedes estan incompletas, por favor creala nuevamente");
			}

		}

		}
	}

	// Método para revisar que el número de sedes esté entre 1 y 10
	private void revisarNumeroSede(int sedes) throws ExcepcionNumeroSede {
		if (sedes < 1 || sedes > 10) {
			throw new ExcepcionNumeroSede();
		}
	}

	// Método para revisar que el número no sea negativo
	private void revisarNumeroNegativo(double numero) throws ExcepcionPresupuestoTotal {
		if (numero < 0) {
			throw new ExcepcionPresupuestoTotal();
		}
	}

	public void agregarLectores() {
		vp.getPanel().getBotonIng().addActionListener(this);
		vp.getPanel().getBotonIng().setActionCommand("ing");
		vp.getPanel().getBotonSalir().addActionListener(this);
		vp.getPanel().getBotonSalir().setActionCommand("sal");
		vcca.getBotonRegistrarCasa().addActionListener(this);
		vcca.getBotonRegistrarCasa().setActionCommand("btnnRegist");
		vpre.getBotonRegistrarPresupuesto().addActionListener(this);
		vpre.getBotonRegistrarPresupuesto().setActionCommand("btnRegistPresup");
		vsed.getRegistrarSede().addActionListener(this);
		vsed.getRegistrarSede().setActionCommand("btnRegistSed");
		vsed.getModificarSede().addActionListener(this);
		vsed.getModificarSede().setActionCommand("btnModifSed");
		vms.getBotonParametros().addActionListener(this);
		vms.getBotonParametros().setActionCommand("btnPara");

	}

}
