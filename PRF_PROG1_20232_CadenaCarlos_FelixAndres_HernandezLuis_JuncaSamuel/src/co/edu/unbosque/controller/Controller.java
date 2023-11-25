package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.ApostadorDTO;
import co.edu.unbosque.model.CasaDeApuestasDTO;
import co.edu.unbosque.model.SedeDTO;
import co.edu.unbosque.model.SuperastroDTO;
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
import co.edu.unbosque.view.VentanaApostador;
import co.edu.unbosque.view.VentanaBaloto;
import co.edu.unbosque.view.VentanaBetPlay;
import co.edu.unbosque.view.VentanaChance;
import co.edu.unbosque.view.VentanaCrearCasaApuestas;
import co.edu.unbosque.view.VentanaCrearSedes;
import co.edu.unbosque.view.VentanaDeConsultas;
import co.edu.unbosque.view.VentanaElimApos;
import co.edu.unbosque.view.VentanaLoteria;
import co.edu.unbosque.view.VentanaMenuSeleccion;
import co.edu.unbosque.view.VentanaMostrarApostador;
import co.edu.unbosque.view.VentanaPresupuesto;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaSeleccionApostadores;
import co.edu.unbosque.view.VentanaSeleccionarApuesta;
import co.edu.unbosque.view.VentanaSuperastro;

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
	VentanaApostador vapo;
	VentanaSeleccionApostadores vsapo;
	VentanaElimApos velimApos;
	VentanaMostrarApostador vemos;
	VentanaSeleccionarApuesta vapu;
	VentanaSuperastro veSup;
	VentanaChance veChan;
	VentanaLoteria veLo;
	VentanaBaloto valo;
	VentanaBetPlay vet;
	VentanaDeConsultas veCon;

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
		vapo = new VentanaApostador();
		vsapo = new VentanaSeleccionApostadores();
		velimApos = new VentanaElimApos();
		vemos = new VentanaMostrarApostador();
		veChan = new VentanaChance();
		apostDao = new ApostadorDAO();
		vapu = new VentanaSeleccionarApuesta();
		veSup = new VentanaSuperastro();
		veLo = new VentanaLoteria();
		superDao = new SuperastroDAO();
		loteDao = new LoteriaDAO();
		chanDao = new ChanceDAO();
		balotDao = new BalotoDAO();
		valo = new VentanaBaloto();
		vet = new VentanaBetPlay();
		veCon = new VentanaDeConsultas();
		betDao = new BetplayDAO();
		ruta1 = new File("src/co/edu/unbosque/model/persistence/config.properties");
		ruta2 = new File("src/co/edu/unbosque/model/persistence/juegos.dat");
		ruta3 = new File("src/co/edu/unbosque/model/persistence/sedes.dat");
		agregarLectores();
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
			vcca.setVisible(true);
			vp.setVisible(false);
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
						int optionResult = JOptionPane.showConfirmDialog(vcca, "¿Está seguro de los datos ingresados? ",
								"Confirmación", JOptionPane.YES_NO_OPTION);

						if (optionResult == JOptionPane.YES_OPTION) {
							try {
								caDao.create(nombre, cantidadSedes, presupuestoTotal);
								prop.inicializarProperties();
								JOptionPane.showMessageDialog(vcca, "Datos ingresados exitosamente");
								vpre.setVisible(true);
								vcca.setVisible(false);
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
							vsed.setVisible(true);
							vpre.setVisible(false);
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
			prop.inicializarProperties();
			if (sedeDao.getListOfSedes().size() == Integer.parseInt(prop.getSedes())) {
				vms.setVisible(true);
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
				vcca.setVisible(true);
				vms.setVisible(false);
				vcca.getBotonModificarCasa().setVisible(true);
				vcca.getBotonRegistrarCasa().setVisible(false);

			} else {
				int opcion1 = JOptionPane.showConfirmDialog(vpre, "¿Desea modificar los presupuestos de los juegos?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (opcion1 == JOptionPane.YES_OPTION) {

					vpre.setVisible(true);
					vms.setVisible(false);
					vpre.getBotonRegistrarPresupuesto().setVisible(false);
					vpre.getBotonModificarPresupuesto().setVisible(true);
				} else {
					int opcion12 = JOptionPane.showConfirmDialog(vpre, "¿Desea modificar Las sedes?", "Confirmación",
							JOptionPane.YES_NO_OPTION);
					if (opcion12 == JOptionPane.YES_OPTION) {
						vsed.setVisible(true);
						vsed.getModificarSede().setVisible(true);
						vsed.getRegistrarSede().setVisible(false);
						vsed.getIndicacionesLocalidadModificar().setVisible(true);
						vsed.getLocalidadModificar().setVisible(true);
						vsed.getRegresar().setVisible(true);
						vms.setVisible(false);

						;
						JOptionPane.showMessageDialog(vsed,
								"Para modificar las sedes , se modificara en cuestion de la localidad de la sede");
					} else {
						JOptionPane.showMessageDialog(vms, "No se Modifico absolutamente nada");
					}
				}
			}
			break;
		}
		case "btnModifSed": {
			String localidadAModificar = vsed.getLocalidadModificar().getText();
			String nuevaLocalidad = vsed.getLocalidadSede().getText();
			String nuevosEmpleados = vsed.getNumEmpleados().getText();

			if (localidadAModificar.isEmpty() || nuevaLocalidad.isEmpty() || nuevosEmpleados.isEmpty()) {
				JOptionPane.showMessageDialog(vsed, "Por favor, completar los cuadros");
			} else {
				try {
					int numEmpleados = Integer.parseInt(nuevosEmpleados);
					revisarNumeroNegativo(numEmpleados);

					int opcion111 = JOptionPane.showConfirmDialog(vpre, "¿Desea Modificar la sede?", "Confirmar",
							JOptionPane.YES_NO_OPTION);

					if (opcion111 == JOptionPane.YES_OPTION) {
						if (sedeDao.updateByLocalidad(localidadAModificar, nuevaLocalidad, nuevosEmpleados)) {
							JOptionPane.showMessageDialog(vsed, "Sede modificada exitosamente");
						} else {
							JOptionPane.showMessageDialog(vsed, "No se encontró la sede con la localidad especificada");
						}
					} else {
						vsed.getLocalidadSede().setText("");
						vsed.getNumEmpleados().setText("");
					}
				} catch (ExcepcionPresupuestoTotal e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(vpre,
							"Por favor, no existen números negativos posibles en esta elección");
				}
			}
			break;
		}
		case "btnModifPresupuesto": {
			if (vpre.getBalotoPresupuesto().getText().isBlank() && vpre.getBetplayPresupuesto().getText().isBlank()
					&& vpre.getSuperastroPresupuesto().getText().isBlank()
					&& vpre.getChancePresupuesto().getText().isBlank()
					&& vpre.getLoteriaPresupuesto().getText().isBlank()) {
				JOptionPane.showMessageDialog(vpre, "Complete todos los campos");
			} else {
				boolean temp1 = true;

				String[] juegos = { vpre.getBalotoPresupuesto().getText(), vpre.getBetplayPresupuesto().getText(),
						vpre.getSuperastroPresupuesto().getText(), vpre.getChancePresupuesto().getText(),
						vpre.getLoteriaPresupuesto().getText() };

				for (String presupuesto : juegos) {
					if (presupuesto == null || presupuesto.isBlank()) {
						temp1 = false;
						JOptionPane.showMessageDialog(vpre, "Debe ingresar valores válidos.");
						break; // Terminar el bucle si encuentra un valor no válido
					}

					try {
						Double.parseDouble(presupuesto);
					} catch (NumberFormatException ex) {
						ex.printStackTrace();
						temp1 = false;
						JOptionPane.showMessageDialog(vpre, "Debe ingresar valores válidos.");
						break; // Terminar el bucle si encuentra un valor no válido
					}
				}

				if (temp1) {
					caDao.cargarPropertiesDeLaCasa();

					double tmp1 = Double.parseDouble(vpre.getLoteriaPresupuesto().getText());
					double tmp2 = Double.parseDouble(vpre.getBalotoPresupuesto().getText());
					double tmp3 = Double.parseDouble(vpre.getBetplayPresupuesto().getText());
					double tmp4 = Double.parseDouble(vpre.getChancePresupuesto().getText());
					double tmp5 = Double.parseDouble(vpre.getSuperastroPresupuesto().getText());

					double sumPresupuesto = tmp1 + tmp2 + tmp3 + tmp4 + tmp5;
					prop.inicializarProperties();
					if (sumPresupuesto <= Double.parseDouble(prop.getPresupuestoTotal())) {
						jueDao.update(0, vpre.getBalotoPresupuesto().getText());
						jueDao.update(1, vpre.getChancePresupuesto().getText());
						jueDao.update(2, vpre.getBetplayPresupuesto().getText());
						jueDao.update(3, vpre.getLoteriaPresupuesto().getText());
						jueDao.update(4, vpre.getSuperastroPresupuesto().getText());

						int option = JOptionPane.showConfirmDialog(vpre, "¿Los datos ingresados son correctos?",
								"Confirmación", JOptionPane.YES_NO_OPTION);

						if (option == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(vpre, "Datos ingresados");
							vms.setVisible(true);
							vpre.setVisible(false);
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
		case "btnnModifCasa": {
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
						int optionResult = JOptionPane.showConfirmDialog(vcca, "¿Está seguro de los datos ingresados? ",
								"Confirmación", JOptionPane.YES_NO_OPTION);

						if (optionResult == JOptionPane.YES_OPTION) {
							try {
								caDao.update(0, nombre, cantidadSedes, presupuestoTotal);
								prop.inicializarProperties();
								JOptionPane.showMessageDialog(vcca, "Datos ingresados exitosamente");
								vpre.setVisible(true);
								vcca.setVisible(false);
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
		case "btnApos": {
			vsapo.setVisible(true);
			vms.setVisible(false);
			break;

		}
		case "btnRegresarSeleccion": {
			vms.setVisible(true);
			vsapo.setVisible(false);
			break;
		}
		case "btnRegresarMostrar": {
			vms.setVisible(true);
			vemos.setVisible(false);
			break;
		}
		case "btnCrearApo": {
			vapo.getModificarApostador().setVisible(false);
			vapo.getIndicacionesModif().setVisible(false);
			vapo.getCampoModif().setVisible(false);
			vapo.setVisible(true);
			vsapo.setVisible(false);
			break;
		}
		case "btnModifApostSel": {
			vapo.setVisible(true);
			vapo.getModificarApostador().setVisible(true);
			vapo.getCrearApostador().setVisible(false);
			vapo.getIndicacionesModif().setVisible(true);
			vapo.getCampoModif().setVisible(true);
			vsapo.setVisible(false);

			break;
		}

		case "btnCrearApos": {
			String nombre = vapo.getCampoNombre().getText();
			String cedula = vapo.getCampoCedula().getText();
			String sedes = vapo.getCampoSede().getText();
			String direccion = vapo.getCampoDireccion().getText();
			String celular = vapo.getCampoCelular().getText();
			String anon = vapo.getCampoAnio().getText();

			if (nombre.isBlank() || cedula.isBlank() || sedes.isBlank() || direccion.isBlank() || celular.isBlank()
					|| anon.isBlank()) {
				JOptionPane.showMessageDialog(vapo, "Uno o más campos están vacíos, por favor, rellénelos");
				int confirmacion2 = JOptionPane.showConfirmDialog(vapo, "Desea seguir actualizando", "Confirmación",
						JOptionPane.YES_NO_OPTION);
				if (confirmacion2 == JOptionPane.NO_OPTION) {
					vsapo.setVisible(true);
					vapo.setVisible(false);
				}
			} else {
				// Verificar si la localidad de la sede existe exactamente
				boolean localidadExiste = sedeDao.getListOfSedes().stream()
						.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sedes));

				int anioTemp = Integer.parseInt(anon);
				if (anioTemp > 2005) {
					JOptionPane.showMessageDialog(vapo, "El cliente es menor de edad , no puede apostar...");
				} else if (anioTemp < 1900) {
					JOptionPane.showMessageDialog(vapo,
							"El cliente tiene mas de 123 años , imposible que el cliente sea la persona mas vieja del mundo...");
					break;
				} else

				if (!localidadExiste) {
					JOptionPane.showMessageDialog(vapo, "No se puede crear en una sede inexistente");
					int confirmacion2 = JOptionPane.showConfirmDialog(vapo, "Desea seguir actualizando", "Confirmación",
							JOptionPane.YES_NO_OPTION);
					if (confirmacion2 == JOptionPane.NO_OPTION) {
						vsapo.setVisible(true);
						vapo.setVisible(false);
					}
				} else {
					apostDao.create(nombre, cedula, sedes, direccion, celular, anon);
					JOptionPane.showMessageDialog(vapo, "Apostador creado exitosamente");
					int confirmacion2 = JOptionPane.showConfirmDialog(vapo, "Desea seguir Creando apostadores ",
							"Confirmación", JOptionPane.YES_NO_OPTION);
					if (confirmacion2 == JOptionPane.NO_OPTION) {
						vsapo.setVisible(true);
						vapo.setVisible(false);
					}
				}
			}
			break;

		}

		case "btnModifApos": {
			String nombre = vapo.getCampoNombre().getText();
			String cedula = vapo.getCampoCedula().getText();
			String sedes = vapo.getCampoSede().getText();
			String direccion = vapo.getCampoDireccion().getText();
			String celular = vapo.getCampoCelular().getText();
			String anon = vapo.getCampoAnio().getText();

			if (nombre == "" || cedula == "" || sedes == "" || direccion == "" || celular == "" || anon == ""
					|| vapo.getCampoModif().getText() == "") {
				JOptionPane.showMessageDialog(vapo, "Uno o más campos están vacíos, por favor, rellénelos");
				int anioTemp = Integer.parseInt(anon);
				if (anioTemp > 2005) {
					JOptionPane.showMessageDialog(vapo, "El cliente es menor de edad , no puede apostar...");
					vsapo.setVisible(true);
					vapo.setVisible(false);
					break;
				}

			} else {
				boolean localidadExiste = sedeDao.getListOfSedes().stream()
						.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sedes));

				if (!localidadExiste) {
					JOptionPane.showMessageDialog(vapo, "No se puede actualizar en una sede inexistente");
				} else {
					ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
					int anioTemp = Integer.parseInt(anon);
					if (anioTemp > 2005) {
						JOptionPane.showMessageDialog(vapo, "El cliente es menor de edad , no puede apostar...");
						break;
					} else if (anioTemp < 1900) {
						JOptionPane.showMessageDialog(vapo,
								"El cliente tiene mas de 123 años , imposible que el cliente sea la persona mas vieja del mundo...");
						break;
					} else {

						int index = Integer.parseInt(vapo.getCampoModif().getText());

						if (index >= 0 && index < apostadores.size()) {
							ApostadorDTO apostadorExistente = apostadores.get(index);
							int confirmacion = JOptionPane.showConfirmDialog(vapo,
									"En la posición " + index + ", el nombre del apostador es "
											+ apostadorExistente.getNombre() + ". ¿Desea cambiarlo?",
									"Confirmación", JOptionPane.YES_NO_OPTION);

							if (confirmacion == JOptionPane.YES_OPTION) {
								apostDao.update(index, nombre, cedula, sedes, direccion, celular, anon);
								JOptionPane.showMessageDialog(vapo, "Apostador actualizado exitosamente");
								int confirmacion2 = JOptionPane.showConfirmDialog(vapo, "Desea seguir actualizando",
										"Confirmación", JOptionPane.YES_NO_OPTION);
								if (confirmacion2 == JOptionPane.NO_OPTION) {
									vsapo.setVisible(true);
									vapo.setVisible(false);
									break;
								}
							} else {
								JOptionPane.showMessageDialog(vapo, "Operación cancelada por el usuario");
								int confirmacion2 = JOptionPane.showConfirmDialog(vapo, "Desea seguir actualizando",
										"Confirmación", JOptionPane.YES_NO_OPTION);
								if (confirmacion2 == JOptionPane.NO_OPTION) {
									vsapo.setVisible(true);
									vapo.setVisible(false);
									break;
								}
							}
						} else {
							JOptionPane.showMessageDialog(vapo, "La posición del apostador es inválida");
							int confirmacion2 = JOptionPane.showConfirmDialog(vapo, "Desea seguir actualizando",
									"Confirmación", JOptionPane.YES_NO_OPTION);
							if (confirmacion2 == JOptionPane.NO_OPTION) {
								vsapo.setVisible(true);
								vapo.setVisible(false);
								break;
							}

						}
					}
				}

				break;
			}
		}
		case "btnSelElim": {
			velimApos.setVisible(true);
			vsapo.setVisible(false);
			break;
		}
		case "btnELimApost": {
			String index = velimApos.getIndex().getText();
			int index1 = Integer.parseInt(index);
			ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
			if (index1 >= 0 && index1 < apostadores.size()) {
				ApostadorDTO apostadorExistente = apostadores.get(index1);
				int confirmacion = JOptionPane.showConfirmDialog(vapo,
						"En la posición " + index1 + ", el nombre del apostador es " + apostadorExistente.getNombre()
								+ ". ¿Desea eliminar este apostador del sistema?",
						"Confirmación", JOptionPane.YES_NO_OPTION);

				if (confirmacion == JOptionPane.YES_OPTION) {
					apostDao.delete(index1);
					JOptionPane.showMessageDialog(vapo, "Apostador Eliminado del sistema exitosamente");
					int confirmacion2 = JOptionPane.showConfirmDialog(vapo, "Desea seguir actualizando", "Confirmación",
							JOptionPane.YES_NO_OPTION);
					if (confirmacion2 == JOptionPane.NO_OPTION) {
						vsapo.setVisible(true);
						velimApos.setVisible(false);
						break;
					}
				} else {
					JOptionPane.showMessageDialog(vapo, "Operación cancelada por el usuario");
					int confirmacion2 = JOptionPane.showConfirmDialog(vapo, "Desea seguir Borrando apostador",
							"Confirmación", JOptionPane.YES_NO_OPTION);
					if (confirmacion2 == JOptionPane.NO_OPTION) {
						vsapo.setVisible(true);
						velimApos.setVisible(false);
						break;
					}
				}
			}
			break;
		}
		case "btnSelMostrar": {
			vsapo.setVisible(true);
			vemos.setVisible(true);
			break;
		}
		case "btnMostrar": {
			vemos.getSalidaTos().setText(apostDao.read());
			break;
		}
		case "btnApues": {
			vapu.setVisible(true);
			vms.setVisible(false);
			break;
		}
		case "vapuReg": {
			vms.setVisible(true);
			vapu.setVisible(false);
			break;
		}
		case "btnSuper": {
			int confirmacion = JOptionPane.showConfirmDialog(vapu, " ¿Desea Crear una Apuesta  ?", "Confirmación",
					JOptionPane.YES_NO_OPTION);
			if (confirmacion == JOptionPane.YES_OPTION) {
				veSup.setVisible(true);
				veSup.getModificar().setVisible(false);
				veSup.getApost().setVisible(true);
				vapu.setVisible(false);
				break;
			} else {
				int confirmacion1 = JOptionPane.showConfirmDialog(vapu, " ¿Desea modificar una Apuesta  ?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (confirmacion1 == JOptionPane.YES_OPTION) {
					veSup.setVisible(true);
					veSup.getModificar().setVisible(true);
					veSup.getApost().setVisible(false);
					vapu.setVisible(false);
					break;
				}

			}
		}

		case "btnChance": {
			veChan.setVisible(true);
			vapu.setVisible(false);
			break;
		}
		case "btnApostarSuperastro": {
			String index = veSup.getIndex().getText();
			String dig1 = veSup.getCampoDig1().getText();
			String dig2 = veSup.getCampoDig2().getText();
			String dig3 = veSup.getCampoDig3().getText();
			String dig4 = veSup.getCampoDig4().getText();
			String zod = veSup.getCampoZodiac().getText();
			String val = veSup.getCampoValue().getText();
			String cedul = veSup.getCampoCedula().getText();
			String dia = veSup.getCampoDia().getText();
			String sed = veSup.getCampoSede().getText();
			if (index.isBlank() || dig1.isBlank() || dig2.isBlank() || dig3.isBlank() || dig4.isBlank() || zod.isBlank()
					|| val.isBlank() || cedul.isBlank() || dia.isBlank() || sed.isBlank()) {
				JOptionPane.showMessageDialog(veSup, "Uno o mas espacios estan vacios");
			}
			int index1 = Integer.parseInt(index);
			ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
			if (index1 >= 0 && index1 < apostadores.size()) {
				ApostadorDTO apostadorExistente = apostadores.get(index1);
				int confirmacion = JOptionPane.showConfirmDialog(
						vapo, "En la posición " + index1 + ", el nombre del apostador es "
								+ apostadorExistente.getNombre() + ". ¿Desea Apostar con este apostador ?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (confirmacion == JOptionPane.YES_OPTION) {
					boolean localidadExiste = sedeDao.getListOfSedes().stream()
							.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sed));

					if (localidadExiste) {
						// Validar cédula
						if (veSup.getCampoCedula().getText().equals(Long.toString(apostadorExistente.getCedula()))) {
							// Validar día
							if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes")
									|| dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves")
									|| dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado")
									|| dia.equalsIgnoreCase("domingo")) {
								// Validar signo del zodiaco
								if (zod.equalsIgnoreCase("aries") || zod.equalsIgnoreCase("tauro")
										|| zod.equalsIgnoreCase("geminis") || zod.equalsIgnoreCase("cancer")
										|| zod.equalsIgnoreCase("leo") || zod.equalsIgnoreCase("virgo")
										|| zod.equalsIgnoreCase("libra") || zod.equalsIgnoreCase("escorpio")
										|| zod.equalsIgnoreCase("sagitario") || zod.equalsIgnoreCase("capricornio")
										|| zod.equalsIgnoreCase("acuario") || zod.equalsIgnoreCase("piscis")) {
									// Todas las validaciones pasaron, puedes proceder con la apuesta
									superDao.create(dig1, dig2, dig3, dig4, val, zod, cedul, sed, dia);
									JOptionPane.showMessageDialog(veSup,
											apostadorExistente.getNombre() + " Apostó Exitosamente en Superastro");
									JOptionPane.showMessageDialog(veSup,
											"Recibo Generado:" + "\n" + "Nombre del apostador:"
													+ apostadorExistente.getNombre() + "\n" + "Numero de cedula :"
													+ cedul + "\n" + "Numero que aposto" + dig1 + dig2 + dig3 + dig4
													+ "Serie" + "\n" + "\n Signo del zodiaco :" + zod + "\n"
													+ " Sede en la que aposto :" + sed + "\n" + " Dia de hoy :" + dia
													+ "\n Valor de la apuesta realizada: " + val);
								} else {
									JOptionPane.showMessageDialog(veSup, "Signo del zodiaco no válido.");
								}
							} else {
								JOptionPane.showMessageDialog(veSup, "Día de la semana no válido.");
							}
						} else {
							JOptionPane.showMessageDialog(veSup,
									"La cédula ingresada no coincide con la cédula del apostador.");
						}
					} else {
						JOptionPane.showMessageDialog(veSup, "No existe la sede");
					}
				}

				break;
			} else {
				JOptionPane.showMessageDialog(veSup, "No existe este índice ");
			}
		}
//		case "btnModificarSuperastro": {
//			String index = veSup.getIndex().getText();
//			String dig1 = veSup.getCampoDig1().getText();
//			String dig2 = veSup.getCampoDig2().getText();
//			String dig3 = veSup.getCampoDig3().getText();
//			String dig4 = veSup.getCampoDig4().getText();
//			String zod = veSup.getCampoZodiac().getText();
//			String val = veSup.getCampoValue().getText();
//			String cedul = veSup.getCampoCedula().getText();
//			String dia = veSup.getCampoDia().getText();
//			String sed = veSup.getCampoSede().getText();
//			if (index.isBlank() || dig1.isBlank() || dig2.isBlank() || dig3.isBlank() || dig4.isBlank() || zod.isBlank()
//					|| val.isBlank() || cedul.isBlank() || dia.isBlank() || sed.isBlank()) {
//				JOptionPane.showMessageDialog(veSup, "Uno o mas espacios estan vacios");
//			}
//			int index1 = Integer.parseInt(index);
//			ArrayList<SuperastroDTO> superastros = superDao.getListOfSuperastro();
//			if (index1 >= 0 && index1 < superastros.size()) {
//				SuperastroDTO superastroExistente = superastros.get(index1);
//				int confirmacion = JOptionPane.showConfirmDialog(vapo,
//						"En la posición " + index1 + ", La cedula del apostador es "
//								+ superastroExistente.getNumDeCedula() + " y aposto los siguientes numeros"
//								+ superastroExistente.getDigito1() + superastroExistente.getDigito2()
//								+ superastroExistente.getDigito3() + superastroExistente.getDigito4()
//								+ " Con el siguiente signo del zodiaco" + superastroExistente.getZodiacoSigno()
//								+ "Desea modificarlo?" + "Confirmación",
//						JOptionPane.YES_NO_OPTION);
//				if (confirmacion == JOptionPane.YES_OPTION) {
//					boolean localidadExiste = sedeDao.getListOfSedes().stream()
//							.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sed));
//
//					if (localidadExiste) {
//						// Validar cédula
//						if (veSup.getCampoCedula().getText().equals(Long.toString(apostadorExistente.getCedula()))) {
//							// Validar día
//							if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes")
//									|| dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves")
//									|| dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado")
//									|| dia.equalsIgnoreCase("domingo")) {
//								// Validar signo del zodiaco
//								if (zod.equalsIgnoreCase("aries") || zod.equalsIgnoreCase("tauro")
//										|| zod.equalsIgnoreCase("geminis") || zod.equalsIgnoreCase("cancer")
//										|| zod.equalsIgnoreCase("leo") || zod.equalsIgnoreCase("virgo")
//										|| zod.equalsIgnoreCase("libra") || zod.equalsIgnoreCase("escorpio")
//										|| zod.equalsIgnoreCase("sagitario") || zod.equalsIgnoreCase("capricornio")
//										|| zod.equalsIgnoreCase("acuario") || zod.equalsIgnoreCase("piscis")) {
//									// Todas las validaciones pasaron, puedes proceder con la apuesta
//									int indice = Integer.parseInt(index);
//									superDao.update(indice, dig1, dig2, dig3, dig4, val, zod, cedul, sed, dia);
//									JOptionPane.showMessageDialog(veSup,
//											apostadorExistente.getNombre() + " Apostó Exitosamente en Superastro");
//									JOptionPane.showMessageDialog(veSup,
//											"Recibo Generado:" + "\n" + "Nombre del apostador:"
//													+ apostadorExistente.getNombre() + "\n" + "Numero de cedula :"
//													+ cedul + "\n" + "Numero que aposto" + dig1 + dig2 + dig3 + dig4
//													+ "Serie" + "\n" + "\n Signo del zodiaco :" + zod + "\n"
//													+ " Sede en la que aposto :" + sed + "\n" + " Dia de hoy :" + dia
//													+ "\n Valor de la apuesta realizada: " + val);
//								} else {
//									JOptionPane.showMessageDialog(veSup, "Signo del zodiaco no válido.");
//								}
//							} else {
//								JOptionPane.showMessageDialog(veSup, "Día de la semana no válido.");
//							}
//						} else {
//							JOptionPane.showMessageDialog(veSup,
//									"La cédula ingresada no coincide con la cédula del apostador.");
//						}
//					} else {
//						JOptionPane.showMessageDialog(veSup, "No existe la sede");
//					}
//				}
//
//				break;
//			} else {
//				JOptionPane.showMessageDialog(veSup, "No existe este índice ");
//			}
//
//		}
		case "btnRegresarSuper": {
			vapu.setVisible(true);
			veSup.setVisible(false);
			break;
		}
		case "btnRegresarChan": {
			vapu.setVisible(true);
			veChan.setVisible(false);
			break;
		}
		case "btnApostChanche": {
			String index = veChan.getIndex().getText();
			String dig1 = veChan.getCampoDig1().getText();
			String dig2 = veChan.getCampoDig2().getText();
			String dig3 = veChan.getCampoDig3().getText();
			String dig4 = veChan.getCampoDig4().getText();
			String lot = veChan.getCampoLote().getText();
			String val = veChan.getCampoValue().getText();
			String cedul = veChan.getCampoCedula().getText();
			String dia = veChan.getCampoDia().getText();
			String sed = veChan.getCampoSede().getText();
			if (index.isBlank() || dig1.isBlank() || dig2.isBlank() || dig3.isBlank() || dig4.isBlank() || lot.isBlank()
					|| val.isBlank() || cedul.isBlank() || dia.isBlank() || sed.isBlank()) {
				JOptionPane.showMessageDialog(veChan, "Uno o mas espacios estan vacios");
			}
			int index1 = Integer.parseInt(index);
			ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
			if (index1 >= 0 && index1 < apostadores.size()) {
				ApostadorDTO apostadorExistente = apostadores.get(index1);
				int confirmacion = JOptionPane.showConfirmDialog(
						vapo, "En la posición " + index1 + ", el nombre del apostador es "
								+ apostadorExistente.getNombre() + ". ¿Desea Apostar con este apostador ?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (confirmacion == JOptionPane.YES_OPTION) {
					boolean localidadExiste = sedeDao.getListOfSedes().stream()
							.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sed));

					if (localidadExiste) {
						// Validar cédula
						if (veChan.getCampoCedula().getText().equals(Long.toString(apostadorExistente.getCedula()))) {
							// Validar día
							if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes")
									|| dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves")
									|| dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado")
									|| dia.equalsIgnoreCase("domingo")) {
								// Validar Loterias
								if (!lot.equalsIgnoreCase("Loteria de cucuta")
										|| !lot.equalsIgnoreCase("loteria de boyaca")
										|| !lot.equalsIgnoreCase("loteria de cundinamarca")) {
									// Todas las validaciones pasaron, puedes proceder con la apuesta
									chanDao.create(dig1, dig2, dig3, dig4, val, lot, cedul, sed, dia);
									JOptionPane.showMessageDialog(veChan, apostadorExistente.getNombre()
											+ " Apostó Exitosamente en  el Chance de " + lot);
									JOptionPane.showMessageDialog(veChan,
											"Recibo Generado:" + "\n" + "Nombre del apostador:"
													+ apostadorExistente.getNombre() + "\n" + "Numero de cedula :"
													+ cedul + "\n" + "Numero que aposto" + dig1 + dig2 + dig3 + dig4
													+ "Serie" + "\n" + "\n Loteria en la que aposto:" + lot + "\n"
													+ " Sede en la que aposto :" + sed + "\n" + " Dia de hoy :" + dia
													+ "\n Valor de la apuesta realizada: " + val);
								} else {
									JOptionPane.showMessageDialog(veChan, "No existe esa loteria ");
								}
							} else {
								JOptionPane.showMessageDialog(veChan, "Día de la semana no válido.");
							}
						} else {
							JOptionPane.showMessageDialog(veChan,
									"La cédula ingresada no coincide con la cédula del apostador.");
						}
					} else {
						JOptionPane.showMessageDialog(veChan, "No existe la sede");
					}
				}

				break;
			} else {
				JOptionPane.showMessageDialog(veChan, "No existe este índice ");
			}

			break;

		}
		case "selLote": {
			veLo.setVisible(true);
			vapu.setVisible(false);
			break;
		}
		case "btnApuLoteria": {
			String index = veLo.getIndex().getText();
			String dig1 = veLo.getCampoDig1().getText();
			String dig2 = veLo.getCampoDig2().getText();
			String dig3 = veLo.getCampoDig3().getText();
			String dig4 = veLo.getCampoDig4().getText();
			String ser1 = veLo.getCampoSerie1().getText();
			String ser2 = veLo.getCampoSerie2().getText();
			String ser3 = veLo.getCampoSerie3().getText();
			String lot = veLo.getCampoLote().getText();
			String val = veLo.getCampoValue().getText();
			String cedul = veLo.getCampoCedula().getText();
			String dia = veLo.getCampoDia().getText();
			String sed = veLo.getCampoSede().getText();
			if (index.isBlank() || dig1.isBlank() || dig2.isBlank() || dig3.isBlank() || dig4.isBlank() || lot.isBlank()
					|| val.isBlank() || cedul.isBlank() || dia.isBlank() || sed.isBlank()) {
				JOptionPane.showMessageDialog(veLo, "Uno o mas espacios estan vacios");
			}
			int index1 = Integer.parseInt(index);
			ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
			if (index1 >= 0 && index1 < apostadores.size()) {
				ApostadorDTO apostadorExistente = apostadores.get(index1);
				int confirmacion = JOptionPane.showConfirmDialog(
						veLo, "En la posición " + index1 + ", el nombre del apostador es "
								+ apostadorExistente.getNombre() + ". ¿Desea Apostar con este apostador ?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (confirmacion == JOptionPane.YES_OPTION) {
					boolean localidadExiste = sedeDao.getListOfSedes().stream()
							.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sed));

					if (localidadExiste) {
						// Validar cédula
						if (veLo.getCampoCedula().getText().equals(Long.toString(apostadorExistente.getCedula()))) {
							// Validar día
							if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes")
									|| dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves")
									|| dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado")
									|| dia.equalsIgnoreCase("domingo")) {
								// Validar Loterias
								if (!lot.equalsIgnoreCase("Loteria de cucuta")
										|| !lot.equalsIgnoreCase("loteria de boyaca")
										|| !lot.equalsIgnoreCase("loteria de cundinamarca")) {
									// Todas las validaciones pasaron, puedes proceder con la apuesta
									loteDao.create(dig1, dig2, dig3, dig4, ser1, ser2, ser3, val, lot, cedul, sed, dia);
									JOptionPane.showMessageDialog(veLo,
											apostadorExistente.getNombre() + " Apostó Exitosamente en  la " + lot);
									JOptionPane.showMessageDialog(veLo,
											"Recibo Generado:" + "\n" + "Nombre del apostador:"
													+ apostadorExistente.getNombre() + "\n" + "Numero de cedula :"
													+ cedul + "\n" + "Numero que aposto" + dig1 + dig2 + dig3 + dig4
													+ "Serie" + ser1 + ser2 + ser3 + "\n" + " Sede en la que aposto :"
													+ sed + "\n" + " Dia de hoy :" + dia
													+ "\n Valor de la apuesta realizada: " + val);
								} else {
									JOptionPane.showMessageDialog(veLo, "No existe esa loteria ");
								}
							} else {
								JOptionPane.showMessageDialog(veLo, "Día de la semana no válido.");
							}
						} else {
							JOptionPane.showMessageDialog(veLo,
									"La cédula ingresada no coincide con la cédula del apostador.");
						}
					} else {
						JOptionPane.showMessageDialog(veLo, "No existe la sede");
					}
				}

				break;
			} else {
				JOptionPane.showMessageDialog(veChan, "No existe este índice ");
			}

			break;

		}
		case "btnRegresarlote": {
			vapu.setVisible(true);
			veLo.setVisible(false);
			break;
		}
		case "selBalo": {
			valo.setVisible(true);
			vapu.setVisible(false);
			break;
		}

		case "btnBaloApost": {
			String index = valo.getIndex().getText();
			String dig1 = valo.getCampoDig1().getText();
			String dig2 = valo.getCampoDig2().getText();
			String dig3 = valo.getCampoDig3().getText();
			String dig4 = valo.getCampoDig4().getText();
			String dig5 = valo.getCampoDig5().getText();
			String dig6 = valo.getCampoDig6().getText();
			String val = valo.getCampoValue().getText();
			String cedul = valo.getCampoCedula().getText();
			String dia = valo.getCampoDia().getText();
			String sed = valo.getCampoSede().getText();
			if (index.isBlank() || dig1.isBlank() || dig2.isBlank() || dig3.isBlank() || dig4.isBlank()
					|| dig5.isBlank() || val.isBlank() || dig6.isBlank() || cedul.isBlank() || dia.isBlank()
					|| sed.isBlank()) {
				JOptionPane.showMessageDialog(valo, "Uno o mas espacios estan vacios");
			}
			int index1 = Integer.parseInt(index);
			ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
			if (index1 >= 0 && index1 < apostadores.size()) {
				ApostadorDTO apostadorExistente = apostadores.get(index1);
				int confirmacion = JOptionPane.showConfirmDialog(
						valo, "En la posición " + index1 + ", el nombre del apostador es "
								+ apostadorExistente.getNombre() + ". ¿Desea Apostar con este apostador ?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (confirmacion == JOptionPane.YES_OPTION) {
					boolean localidadExiste = sedeDao.getListOfSedes().stream()
							.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sed));

					if (localidadExiste) {
						if (valo.getCampoCedula().getText().equals(Long.toString(apostadorExistente.getCedula()))) {
							// Validar día
							if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes")
									|| dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves")
									|| dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado")
									|| dia.equalsIgnoreCase("domingo")) {

								// Todas las validaciones pasaron, puedes proceder con la apuesta
								balotDao.create(dig1, dig2, dig3, dig4, dig5, dig6, val, cedul, sed, dia);
								JOptionPane.showMessageDialog(valo,
										apostadorExistente.getNombre() + " Apostó Exitosamente en el baloto ");
								JOptionPane.showMessageDialog(valo, "Recibo Generado:" + "\n" + "Nombre del apostador:"
										+ apostadorExistente.getNombre() + "\n" + "Numero de cedula :" + cedul + "\n"
										+ "Numero que aposto" + dig1 + "," + dig2 + "," + dig3 + "," + dig4 + "," + dig5
										+ "," + dig6 + "," + "\n" + " Sede en la que aposto :" + sed + "\n"
										+ " Dia de hoy :" + dia + "\n Valor de la apuesta realizada: " + val);

							}
						} else {
							JOptionPane.showMessageDialog(valo, "Día de la semana no válido.");
						}
					} else {
						JOptionPane.showMessageDialog(valo,
								"La cédula ingresada no coincide con la cédula del apostador.");
					}
				} else {

				}
			} else {
				JOptionPane.showMessageDialog(valo, "indice no encontrado");
			}

			break;
		}
		case "selBet": {
			vet.setVisible(true);
			vapu.setVisible(false);
			break;
		}
		case "btnBetApost": {
			String index = vet.getIndex().getText();
			String resul1 = vet.getAguilasDoradasDim().getSelectedItem().toString();
			String resul2 = vet.getCatarColombia().getSelectedItem().toString();
			String resul3 = vet.getOnceCaldasRealMadrid().getSelectedItem().toString();
			String resul4 = vet.getCityChelsea().getSelectedItem().toString();
			String resul5 = vet.getCrystalPalaceBrigthon().getSelectedItem().toString();
			String resul6 = vet.getCucutaDeportivobarsa().getSelectedItem().toString();
			String resul7 = vet.getDormundtBayern().getSelectedItem().toString();
			String resul8 = vet.getFortalezaLaEquidad().getSelectedItem().toString();
			String resul9 = vet.getGironaArsenal().getSelectedItem().toString();
			String resul10 = vet.getJaguaresEnvigado().getSelectedItem().toString();
			String resul11 = vet.getLeverkusenEverton().getSelectedItem().toString();
			String resul12 = vet.getMillosManchesterU().getSelectedItem().toString();
			String resul13 = vet.getSantaFeNacional().getSelectedItem().toString();
			String resul14 = vet.getShaktarAlNassr().getSelectedItem().toString();
			String val = vet.getCampoValue().getText();
			String cedul = vet.getCampoCedula().getText();
			String dia = vet.getCampoDia().getText();
			String sed = vet.getCampoSede().getText();
			if (index.isBlank() || resul1.isBlank() || resul2.isBlank() || resul3.isBlank() || resul4.isBlank()
					|| resul5.isBlank() || resul6.isBlank() || resul7.isBlank() || resul8.isBlank() || resul9.isBlank()
					|| resul10.isBlank() || resul11.isBlank() || resul12.isBlank() || resul13.isBlank()
					|| resul14.isBlank() || val.isBlank() || cedul.isBlank() || dia.isBlank() || sed.isBlank()) {
			}

			int index1 = Integer.parseInt(index);
			ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
			if (index1 >= 0 && index1 < apostadores.size()) {
				ApostadorDTO apostadorExistente = apostadores.get(index1);
				int confirmacion = JOptionPane.showConfirmDialog(
						vet, "En la posición " + index1 + ", el nombre del apostador es "
								+ apostadorExistente.getNombre() + ". ¿Desea Apostar con este apostador ?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (confirmacion == JOptionPane.YES_OPTION) {
					boolean localidadExiste = sedeDao.getListOfSedes().stream()
							.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sed));

					if (localidadExiste) {
						if (vet.getCampoCedula().getText().equals(Long.toString(apostadorExistente.getCedula()))) {
							// Validar día
							if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes")
									|| dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves")
									|| dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado")
									|| dia.equalsIgnoreCase("domingo")) {

								// Todas las validaciones pasaron, puedes proceder con la apuesta
								betDao.create(resul1, resul2, resul3, resul4, resul5, resul6, resul7, resul8, resul9,
										resul10, resul11, resul12, resul13, resul14, val, cedul, sed, dia);
								JOptionPane.showMessageDialog(vet,
										apostadorExistente.getNombre() + " Apostó Exitosamente en el betplay ");
								JOptionPane.showMessageDialog(vet,
										"Recibo Generado:" + "\n" + "Nombre del apostador:"
												+ apostadorExistente.getNombre() + "\n" + "Numero de cedula :" + cedul
												+ "\n" + " Sede en la que aposto :" + sed + "\n" + " Dia de hoy :" + dia
												+ "\n Valor de la apuesta realizada: " + val);

							}
						} else {
							JOptionPane.showMessageDialog(valo, "Día de la semana no válido.");
						}
					} else {
						JOptionPane.showMessageDialog(valo,
								"La cédula ingresada no coincide con la cédula del apostador.");
					}
				} else {

				}
			} else {
				JOptionPane.showMessageDialog(valo, "indice no encontrado");
			}

			break;
		}
		case "selConsul": {
			veCon.setVisible(true);
			vms.setVisible(false);
			break;

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
		vcca.getBotonModificarCasa().addActionListener(this);
		vcca.getBotonModificarCasa().setActionCommand("btnnModifCasa");
		vpre.getBotonRegistrarPresupuesto().addActionListener(this);
		vpre.getBotonRegistrarPresupuesto().setActionCommand("btnRegistPresup");
		vpre.getBotonModificarPresupuesto().addActionListener(this);
		vpre.getBotonModificarPresupuesto().setActionCommand("btnModifPresupuesto");
		vsed.getRegistrarSede().addActionListener(this);
		vsed.getRegistrarSede().setActionCommand("btnRegistSed");
		vsed.getModificarSede().addActionListener(this);
		vsed.getModificarSede().setActionCommand("btnModifSed");
		vms.getBotonParametros().addActionListener(this);
		vms.getBotonParametros().setActionCommand("btnPara");
		vms.getBotonApostador().addActionListener(this);
		vms.getBotonApostador().setActionCommand("btnApos");
		vms.getBotonApostar().addActionListener(this);
		vms.getBotonApostar().setActionCommand("btnApues");
		vms.getBotonConsultas().addActionListener(this);
		vms.getBotonConsultas().setActionCommand("selConsul");
		vapo.getCrearApostador().addActionListener(this);
		vapo.getCrearApostador().setActionCommand("btnCrearApos");
		vapo.getModificarApostador().addActionListener(this);
		vapo.getModificarApostador().setActionCommand("btnModifApos");
		vsapo.getBotonCrear().addActionListener(this);
		vsapo.getBotonCrear().setActionCommand("btnCrearApo");
		vsapo.getBotonActualizar().addActionListener(this);
		vsapo.getBotonActualizar().setActionCommand("btnModifApostSel");
		vsapo.getBotonEliminar().addActionListener(this);
		vsapo.getBotonEliminar().setActionCommand("btnSelElim");
		vsapo.getBotonMostrar().addActionListener(this);
		vsapo.getBotonMostrar().setActionCommand("btnSelMostrar");
		vsapo.getBotonRegresar().addActionListener(this);
		vsapo.getBotonRegresar().setActionCommand("btnRegresarSeleccion");
		velimApos.getEliminar().addActionListener(this);
		velimApos.getEliminar().setActionCommand("btnELimApost");
		vemos.getMostrarApostador().addActionListener(this);
		vemos.getMostrarApostador().setActionCommand("btnMostrar");
		vemos.getRegresar().addActionListener(this);
		vemos.getRegresar().setActionCommand("btnRegresarMostrar");
		vapu.getRegresar().addActionListener(this);
		vapu.getRegresar().setActionCommand("vapuReg");
		vapu.getSuperastro().addActionListener(this);
		vapu.getSuperastro().setActionCommand("btnSuper");
		vapu.getChance().addActionListener(this);
		vapu.getChance().setActionCommand("btnChance");
		vapu.getLoteria().addActionListener(this);
		vapu.getLoteria().setActionCommand("selLote");
		vapu.getBaloto().addActionListener(this);
		vapu.getBaloto().setActionCommand("selBalo");
		vapu.getBetPlay().addActionListener(this);
		vapu.getBetPlay().setActionCommand("selBet");
		veSup.getApost().addActionListener(this);
		veSup.getApost().setActionCommand("btnApostarSuperastro");
		veSup.getModificar().addActionListener(this);
		veSup.getModificar().setActionCommand("btnModificarSuperastro");
		veChan.getApost().addActionListener(this);
		veChan.getApost().setActionCommand("btnApostChanche");
		veSup.getRegresar().addActionListener(this);
		veSup.getRegresar().setActionCommand("btnRegresarSuper");
		veChan.getRegresar().addActionListener(this);
		veChan.getRegresar().setActionCommand("btnRegresarChan");
		veLo.getApost().addActionListener(this);
		veLo.getApost().setActionCommand("btnApuLoteria");
		veLo.getRegresar().addActionListener(this);
		veLo.getRegresar().setActionCommand("btnRegresarlote");
		valo.getApost().addActionListener(this);
		valo.getApost().setActionCommand("btnBaloApost");
		vet.getApost().addActionListener(this);
		vet.getApost().setActionCommand("btnBetApost");

	}

}
