package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.ApostadorDTO;
import co.edu.unbosque.model.BalotoDTO;
import co.edu.unbosque.model.BetplayDTO;
import co.edu.unbosque.model.CasaDeApuestasDTO;
import co.edu.unbosque.model.ChanceDTO;
import co.edu.unbosque.model.LoteriaDTO;
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
import co.edu.unbosque.view.VentanaApuestaPorCliente;
import co.edu.unbosque.view.VentanaBaloto;
import co.edu.unbosque.view.VentanaBetPlay;
import co.edu.unbosque.view.VentanaChance;
import co.edu.unbosque.view.VentanaClienteSede;
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
import co.edu.unbosque.view.VentanaTipoSede;
import co.edu.unbosque.view.VentanaValorTotalApuestasCliente;

/**
 * Controller es una clase que implementa ActionListener y se encarga de manejar
 * las acciones de la interfaz de usuario. Esta clase contiene referencias a
 * varias ventanas de la aplicación, DAOs para interactuar con la base de datos,
 * y otros recursos necesarios para el funcionamiento de la aplicación.
 */
public class Controller implements ActionListener {
	/**
	 * con es una instancia de Console que puede ser utilizada para interactuar con
	 * la consola.
	 */
	private Console con;

	/**
	 * caDao, jueDao, apostDao, sedeDao, gestApuDao, balotDao, superDao, chanDao,
	 * loteDao, betDao son DAOs que se utilizan para llamar individualmente a cada
	 * clase y asignarle un nombre
	 */
	CasaDeApuestasDAO caDao;
	JuegoDAO jueDao;
	ApostadorDAO apostDao;
	SedeDAO sedeDao;
	GestionApuestaDAO gestApuDao;

	/**
	 * prop es una instancia de CasaDeApuestasProperties que se utiliza para manejar
	 * las propiedades de la casa de apuestas.
	 */
	CasaDeApuestasProperties prop;
	VentanaPrincipal vp;
	VentanaCrearCasaApuestas vcca;
	VentanaPresupuesto vpre;
	BalotoDAO balotDao;
	SuperastroDAO superDao;
	ChanceDAO chanDao;
	LoteriaDAO loteDao;
	BetplayDAO betDao;

	/**
	 * vp, vcca, vpre, vsed, vms, vapo, vsapo, velimApos, vemos, vapu, veSup,
	 * veChan, veLo, valo, vet, veCon son ventanas de la aplicación.
	 */
	VentanaCrearSedes vsed;

	/**
	 * ruta1, ruta2, ruta3 son archivos que representan las rutas a varios recursos
	 * necesarios para la aplicación.
	 */
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
	VentanaApuestaPorCliente veConClient;
	VentanaValorTotalApuestasCliente vetotal;
	VentanaClienteSede veClienSed;
	VentanaTipoSede vetise;

	/**
	 * Constructor de Controller. Inicializa los componentes del controlador y
	 * establece sus propiedades. El constructor se encarga de crear los objetos
	 * para las ventanas, los DAOs, y otros recursos necesarios, y configurar sus
	 * propiedades. También agrega los listeners a las ventanas.
	 */
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
		vetotal = new VentanaValorTotalApuestasCliente();
		veConClient = new VentanaApuestaPorCliente();
		veClienSed = new VentanaClienteSede();
		vetise = new VentanaTipoSede();
		betDao = new BetplayDAO();
		ruta1 = new File("src/co/edu/unbosque/model/persistence/config.properties");
		ruta2 = new File("src/co/edu/unbosque/model/persistence/juegos.dat");
		ruta3 = new File("src/co/edu/unbosque/model/persistence/sedes.dat");
		agregarLectores();
	}

	/**
	 * El método run se encarga de mostrar la ventana de menú de selección si los
	 * archivos de configuración existen, de lo contrario, muestra la ventana
	 * principal.
	 */
	public void run() {
		if (ruta1.exists() && ruta2.exists() && ruta3.exists()) {
			vms.setVisible(true);
			System.out.println(balotDao.read());
			System.out.println(loteDao.read());
			System.out.println(chanDao.read());
			System.out.println(betDao.read());
			System.out.println(superDao.read());

		} else {
			vp.setVisible(true);

		}

	}

	/**
	 * El método actionPerformed se encarga de manejar las acciones realizadas por
	 * el usuario en la interfaz de usuario. Este método se activa cuando el usuario
	 * interactúa con un componente de la interfaz de usuario que tiene un
	 * ActionListener asociado. Dependiendo del comando de acción del evento, este
	 * método realiza diferentes acciones, como ingresar al programa, salir del
	 * programa, o registrar una casa de apuestas.
	 *
	 * @param e es el evento de acción que se produce cuando el usuario interactúa
	 *          con un componente de la interfaz de usuario.
	 */
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

		/**
		 * Este caso maneja el evento del botón "btnRegistPresup" que se activa cuando
		 * el usuario intenta registrar un presupuesto.
		 * 
		 * Primero, verifica si todos los campos de texto del presupuesto están vacíos.
		 * Si es así, muestra un mensaje al usuario para que complete todos los campos.
		 * 
		 * Luego, intenta parsear cada presupuesto ingresado a un número double. Si
		 * alguno de los presupuestos no es un número válido (por ejemplo, si el usuario
		 * ingresó texto en lugar de números), muestra un mensaje de error y termina el
		 * bucle.
		 * 
		 * Si todos los presupuestos son números válidos, carga las propiedades de la
		 * casa de apuestas y calcula la suma de todos los presupuestos.
		 * 
		 * Si la suma de los presupuestos es menor o igual al presupuesto total de la
		 * casa de apuestas, crea registros para cada juego con su respectivo
		 * presupuesto.
		 * 
		 * Luego, muestra un cuadro de diálogo de confirmación al usuario para verificar
		 * si los datos ingresados son correctos. Si el usuario confirma, muestra un
		 * mensaje de que los datos fueron ingresados y cambia la visibilidad de las
		 * ventanas. Si el usuario no confirma, borra todos los campos de texto del
		 * presupuesto.
		 * 
		 * Si la suma de los presupuestos excede el presupuesto total de la casa de
		 * apuestas, muestra un mensaje al usuario indicando que debe redistribuir el
		 * presupuesto.
		 */
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

						int option = JOptionPane.showConfirmDialog(vpre, "¿Los datos ingresados son correctos?",
								"Confirmación", JOptionPane.YES_NO_OPTION);

						if (option == JOptionPane.YES_OPTION) {
							jueDao.create("Baloto", "Loteria", vpre.getBalotoPresupuesto().getText());
							jueDao.create("Chance", "Chance", vpre.getChancePresupuesto().getText());
							jueDao.create("Betplay", "Deportivo", vpre.getBetplayPresupuesto().getText());
							jueDao.create("Loteria", "Loteria", vpre.getLoteriaPresupuesto().getText());
							jueDao.create("Superastro", "Loteria", vpre.getSuperastroPresupuesto().getText());

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

		/**
		 * Este caso maneja el evento del botón "btnRegistSed" que se activa cuando el
		 * usuario intenta registrar una sede.
		 * 
		 * Primero, verifica si los campos de texto de la localidad y el número de
		 * empleados están vacíos. Si es así, muestra un mensaje al usuario para que
		 * complete los campos.
		 * 
		 * Luego, intenta convertir el número de empleados a un número entero. Si el
		 * número de empleados es un número negativo, muestra un mensaje de error.
		 * 
		 * Si el número de empleados es un número válido, muestra un cuadro de diálogo
		 * de confirmación al usuario para verificar si desea crear la sede. Si el
		 * usuario confirma, crea la sede y muestra un mensaje de que la sede fue creada
		 * exitosamente. Si el usuario no confirma, borra los campos de texto de la
		 * localidad y el número de empleados.
		 * 
		 * Finalmente, verifica si el número de sedes es igual al número de sedes en las
		 * propiedades. Si es así, cambia la visibilidad de las ventanas. Si no es así,
		 * muestra un mensaje al usuario indicando que las sedes están incompletas.
		 */
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
				JOptionPane.showMessageDialog(vpre,
						"Las sedes estan incompletas , debes crear otras mas para completarlaszde");
			}
			break;
		}

		/**
		 * Este caso maneja el evento del botón "btnPara" que se activa cuando el
		 * usuario intenta modificar la casa de apuestas, los presupuestos de los juegos
		 * o las sedes.
		 * 
		 * Primero, muestra un cuadro de diálogo de confirmación al usuario para
		 * verificar si desea modificar la casa de apuestas. Si el usuario confirma,
		 * cambia la visibilidad de las ventanas y muestra los botones correspondientes.
		 * 
		 * Si el usuario no confirma, muestra otro cuadro de diálogo de confirmación
		 * para verificar si desea modificar los presupuestos de los juegos. Si el
		 * usuario confirma, cambia la visibilidad de las ventanas y muestra los botones
		 * correspondientes.
		 * 
		 * Si el usuario no confirma, muestra otro cuadro de diálogo de confirmación
		 * para verificar si desea modificar las sedes. Si el usuario confirma, cambia
		 * la visibilidad de las ventanas, muestra los botones correspondientes y
		 * muestra un mensaje al usuario indicando que para modificar las sedes, se
		 * modificará en cuestión de la localidad de la sede.
		 * 
		 * Si el usuario no confirma, muestra un mensaje al usuario indicando que no se
		 * modificó nada.
		 */
		case "btnPara": {
			int opcion = JOptionPane.showConfirmDialog(vpre, "¿Desea modificar la casa de apuestas?", "Confirmación",
					JOptionPane.YES_NO_OPTION);
			if (opcion == JOptionPane.YES_OPTION) {
				vcca.setVisible(true);
				vms.setVisible(false);
				vcca.getBotonModificarCasa().setVisible(true);
				vcca.getBotonRegistrarCasa().setVisible(false);
				vcca.getRegresar().setVisible(true);

			} else {
				int opcion1 = JOptionPane.showConfirmDialog(vpre, "¿Desea modificar los presupuestos de los juegos?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (opcion1 == JOptionPane.YES_OPTION) {

					vpre.setVisible(true);
					vms.setVisible(false);
					vpre.getRegresar().setVisible(true);
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

		/**
		 * Este caso maneja el evento del botón "btnModifSed" que se activa cuando el
		 * usuario intenta modificar una sede.
		 * 
		 * Primero, verifica si los campos de texto de la localidad a modificar, la
		 * nueva localidad y el número de empleados están vacíos. Si es así, muestra un
		 * mensaje al usuario para que complete los campos.
		 * 
		 * Luego, intenta convertir el número de empleados a un número entero. Si el
		 * número de empleados es un número negativo, muestra un mensaje de error.
		 * 
		 * Si el número de empleados es un número válido, muestra un cuadro de diálogo
		 * de confirmación al usuario para verificar si desea modificar la sede. Si el
		 * usuario confirma, intenta actualizar la sede con la nueva localidad y el
		 * número de empleados. Si la sede se actualiza exitosamente, muestra un mensaje
		 * de que la sede fue modificada exitosamente. Si la sede no se encuentra,
		 * muestra un mensaje al usuario indicando que no se encontró la sede con la
		 * localidad especificada. Si el usuario no confirma, borra los campos de texto
		 * de la nueva localidad y el número de empleados.
		 */
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
		/**
		 * Este caso maneja el evento del botón "btnModifPresupuesto" que se activa
		 * cuando el usuario intenta modificar los presupuestos de los juegos.
		 * 
		 * Primero, verifica si todos los campos de texto del presupuesto están vacíos.
		 * Si es así, muestra un mensaje al usuario para que complete todos los campos.
		 * 
		 * Luego, intenta parsear cada presupuesto ingresado a un número double. Si
		 * alguno de los presupuestos no es un número válido (por ejemplo, si el usuario
		 * ingresó texto en lugar de números), muestra un mensaje de error y termina el
		 * bucle.
		 * 
		 * Si todos los presupuestos son números válidos, carga las propiedades de la
		 * casa de apuestas y calcula la suma de todos los presupuestos.
		 * 
		 * Si la suma de los presupuestos es menor o igual al presupuesto total de la
		 * casa de apuestas, actualiza los presupuestos de los juegos.
		 * 
		 * Luego, muestra un cuadro de diálogo de confirmación al usuario para verificar
		 * si los datos ingresados son correctos. Si el usuario confirma, muestra un
		 * mensaje de que los datos fueron ingresados y cambia la visibilidad de las
		 * ventanas. Si el usuario no confirma, borra todos los campos de texto del
		 * presupuesto.
		 */
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
		/**
		 * Este caso maneja el evento del botón "btnnModifCasa" que se activa cuando el
		 * usuario intenta modificar la casa de apuestas.
		 * 
		 * Primero, verifica si los campos de texto del nombre, la cantidad de sedes y
		 * el presupuesto total están vacíos. Si es así, muestra un mensaje al usuario
		 * para que complete los campos.
		 * 
		 * Luego, intenta convertir la cantidad de sedes y el presupuesto total a
		 * números. Si alguno de ellos no es un número válido o es un número negativo,
		 * muestra un mensaje de error.
		 * 
		 * Si la cantidad de sedes y el presupuesto total son números válidos, muestra
		 * un cuadro de diálogo de confirmación al usuario para verificar si desea
		 * modificar la casa de apuestas. Si el usuario confirma, intenta actualizar la
		 * casa de apuestas con el nuevo nombre, la cantidad de sedes y el presupuesto
		 * total. Si la casa de apuestas se actualiza exitosamente, muestra un mensaje
		 * de que los datos fueron ingresados exitosamente. Si ocurre un error al
		 * procesar los datos, muestra un mensaje de error. Si el usuario no confirma,
		 * borra los campos de texto del nombre, la cantidad de sedes y el presupuesto
		 * total.
		 */
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
		/**
		 * Este caso maneja el evento del botón "btnApos" que se activa cuando el
		 * usuario intenta ver las apuestas. Cambia la visibilidad de las ventanas.
		 */
		case "btnApos": {
			vsapo.setVisible(true);
			vms.setVisible(false);
			break;

		}
		/**
		 * Este caso maneja el evento del botón "btnRegresarSeleccion" que se activa
		 * cuando el usuario intenta regresar a la selección. Cambia la visibilidad de
		 * las ventanas.
		 */
		case "btnRegresarSeleccion": {
			vms.setVisible(true);
			vsapo.setVisible(false);
			break;
		}
		/**
		 * Este caso maneja el evento del botón "btnRegresarMostrar" que se activa
		 * cuando el usuario intenta regresar a mostrar. Cambia la visibilidad de las
		 * ventanas.
		 */
		case "btnRegresarMostrar": {
			vms.setVisible(true);
			vemos.setVisible(false);
			break;
		}
		/**
		 * Este caso maneja el evento del botón "btnCrearApo" que se activa cuando el
		 * usuario intenta crear una apuesta. Cambia la visibilidad de las ventanas y
		 * muestra los botones correspondientes.
		 */
		case "btnCrearApo": {
			vapo.getCrearApostador().setVisible(true);
			vapo.getModificarApostador().setVisible(false);
			vapo.getIndicacionesModif().setVisible(false);
			vapo.getCampoModif().setVisible(false);
			vapo.setVisible(true);
			vsapo.setVisible(false);
			break;
		}
		/**
		 * Este caso maneja el evento del botón "btnModifApostSel" que se activa cuando
		 * el usuario intenta modificar una apuesta seleccionada. Cambia la visibilidad
		 * de las ventanas y muestra los botones correspondientes.
		 */
		case "btnModifApostSel": {
			vapo.setVisible(true);
			vapo.getModificarApostador().setVisible(true);
			vapo.getCrearApostador().setVisible(false);
			vapo.getIndicacionesModif().setVisible(true);
			vapo.getCampoModif().setVisible(true);
			vsapo.setVisible(false);

			break;
		}

		/**
		 * Este caso maneja el evento del botón "btnCrearApos" que se activa cuando el
		 * usuario intenta crear un apostador.
		 * 
		 * Primero, verifica si los campos de texto del nombre, la cédula, la sede, la
		 * dirección, el celular y el año están vacíos. Si es así, muestra un mensaje al
		 * usuario para que complete los campos y pregunta si desea seguir actualizando.
		 * Si el usuario no desea seguir actualizando, cambia la visibilidad de las
		 * ventanas.
		 * 
		 * Luego, verifica si la localidad de la sede existe. Si no existe, muestra un
		 * mensaje al usuario indicando que no se puede crear en una sede inexistente y
		 * pregunta si desea seguir actualizando. Si el usuario no desea seguir
		 * actualizando, cambia la visibilidad de las ventanas.
		 * 
		 * Si la localidad de la sede existe, verifica si el año es válido. Si el año
		 * indica que el cliente es menor de edad o tiene más de 123 años, muestra un
		 * mensaje de error.
		 * 
		 * Si el año es válido, crea el apostador y muestra un mensaje de que el
		 * apostador fue creado exitosamente. Luego, pregunta si desea seguir creando
		 * apostadores. Si el usuario no desea seguir creando apostadores, cambia la
		 * visibilidad de las ventanas.
		 */
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

		/**
		 * Este caso maneja el evento del botón "btnModifApos" que se activa cuando el
		 * usuario intenta modificar un apostador.
		 * 
		 * Primero, verifica si los campos de texto del nombre, la cédula, la sede, la
		 * dirección, el celular, el año y el campo de modificación están vacíos. Si es
		 * así, muestra un mensaje al usuario para que complete los campos y pregunta si
		 * desea seguir actualizando. Si el usuario no desea seguir actualizando o si el
		 * año indica que el cliente es menor de edad, cambia la visibilidad de las
		 * ventanas.
		 * 
		 * Luego, verifica si la localidad de la sede existe. Si no existe, muestra un
		 * mensaje al usuario indicando que no se puede actualizar en una sede
		 * inexistente y pregunta si desea seguir actualizando. Si el usuario no desea
		 * seguir actualizando, cambia la visibilidad de las ventanas.
		 * 
		 * Si la localidad de la sede existe, verifica si el año es válido. Si el año
		 * indica que el cliente es menor de edad o tiene más de 123 años, muestra un
		 * mensaje de error.
		 * 
		 * Si el año es válido, obtiene el apostador en el índice especificado. Si el
		 * índice es válido, muestra un cuadro de diálogo de confirmación al usuario
		 * para verificar si desea cambiar el apostador. Si el usuario confirma,
		 * actualiza el apostador con el nuevo nombre, la cédula, la sede, la dirección,
		 * el celular y el año, y muestra un mensaje de que el apostador fue actualizado
		 * exitosamente. Si el usuario no confirma, muestra un mensaje de que la
		 * operación fue cancelada por el usuario. Si el índice no es válido, muestra un
		 * mensaje al usuario indicando que la posición del apostador es inválida.
		 */
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
		/**
		 * Este caso maneja el evento del botón "btnSelElim" que se activa cuando el
		 * usuario intenta seleccionar un apostador para eliminar. Cambia la visibilidad
		 * de las ventanas.
		 */
		case "btnSelElim": {
			velimApos.setVisible(true);
			vsapo.setVisible(false);
			break;
		}

		/**
		 * Este caso maneja el evento del botón "btnELimApost" que se activa cuando el
		 * usuario intenta eliminar un apostador.
		 * 
		 * Primero, obtiene el apostador en el índice especificado. Si el índice es
		 * válido, muestra un cuadro de diálogo de confirmación al usuario para
		 * verificar si desea eliminar el apostador. Si el usuario confirma, elimina el
		 * apostador y muestra un mensaje de que el apostador fue eliminado
		 * exitosamente. Si el usuario no confirma, muestra un mensaje de que la
		 * operación fue cancelada por el usuario.
		 */
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
		/**
		 * Este caso maneja el evento del botón "btnSelMostrar" que se activa cuando el
		 * usuario intenta seleccionar para mostrar. Cambia la visibilidad de las
		 * ventanas.
		 */
		case "btnSelMostrar": {
			vsapo.setVisible(true);
			vemos.setVisible(true);
			break;
		}
		/**
		 * Este caso maneja el evento del botón "btnMostrar" que se activa cuando el
		 * usuario intenta mostrar los apostadores. Muestra los apostadores en el área
		 * de texto de salida.
		 */
		case "btnMostrar": {
			vemos.getSalidaTos().setText(apostDao.read());
			break;
		}
		/**
		 * Este caso maneja el evento del botón "btnApues" que se activa cuando el
		 * usuario intenta ver las apuestas. Cambia la visibilidad de las ventanas.
		 */
		case "btnApues": {
			vapu.setVisible(true);
			vms.setVisible(false);
			break;
		}
		/**
		 * Este caso maneja el evento del botón "vapuReg" que se activa cuando el
		 * usuario intenta regresar. Cambia la visibilidad de las ventanas.
		 */
		case "vapuReg": {
			vms.setVisible(true);
			vapu.setVisible(false);
			break;
		}
		/**
		 * Este caso maneja el evento del botón "btnSuper" que se activa cuando el
		 * usuario intenta crear o modificar una apuesta.
		 * 
		 * Primero, muestra un cuadro de diálogo de confirmación al usuario para
		 * verificar si desea crear una apuesta. Si el usuario confirma, cambia la
		 * visibilidad de las ventanas y muestra los botones correspondientes.
		 * 
		 * Si el usuario no confirma, muestra otro cuadro de diálogo de confirmación
		 * para verificar si desea modificar una apuesta. Si el usuario confirma, cambia
		 * la visibilidad de las ventanas y muestra los botones correspondientes.
		 */
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
				int confirmacion1 = JOptionPane.showConfirmDialog(vapu, " ¿Desea eliminar una Apuesta  ?",
						"Confirmación", JOptionPane.YES_NO_OPTION);
				if (confirmacion1 == JOptionPane.YES_OPTION) {

					vapu.setVisible(false);
					break;
				}

			}
		}

		/**
		 * Este caso maneja el evento del botón "btnChance" que se activa cuando el
		 * usuario intenta ver las posibilidades. Cambia la visibilidad de las ventanas.
		 */
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
			if (!(dig1 == "0") || !(dig1 == "1") || !(dig1 == "2") || !(dig1 == "3") || !(dig1 == "4") || !(dig1 == "5")
					|| !(dig1 == "6") || !(dig1 == "7") || !(dig1 == "8") || !(dig1 == "9")) {
				JOptionPane.showMessageDialog(veSup, "inserte digitos del 0 al 9");
			} else {
				String zod = veSup.getCampoZodiac().getText();
				String val = veSup.getCampoValue().getText();
				String cedul = veSup.getCampoCedula().getText();
				String dia = veSup.getCampoDia().getText();
				String sed = veSup.getCampoSede().getText();
				if (index.isBlank() || dig1.isBlank() || dig2.isBlank() || dig3.isBlank() || dig4.isBlank()
						|| zod.isBlank() || val.isBlank() || cedul.isBlank() || dia.isBlank() || sed.isBlank()) {
					JOptionPane.showMessageDialog(veSup, "Uno o mas espacios estan vacios");
				}
				int index1 = Integer.parseInt(index);
				ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
				if (index1 >= 0 && index1 < apostadores.size()) {
					ApostadorDTO apostadorExistente = apostadores.get(index1);
					int confirmacion = JOptionPane.showConfirmDialog(vapo,
							"En la posición " + index1 + ", el nombre del apostador es "
									+ apostadorExistente.getNombre() + ". ¿Desea Apostar con este apostador ?",
							"Confirmación", JOptionPane.YES_NO_OPTION);
					if (confirmacion == JOptionPane.YES_OPTION) {
						boolean localidadExiste = sedeDao.getListOfSedes().stream()
								.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sed));

						if (localidadExiste) {
							// Validar cédula
							if (veSup.getCampoCedula().getText()
									.equals(Long.toString(apostadorExistente.getCedula()))) {
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
										// Todas ty7ytfyguihvhbjkkbjvhbjknlbjjknñlas validaciones pasaron, puedes
										// proceder con la apuesta
										superDao.create(dig1, dig2, dig3, dig4, val, zod, cedul, sed, dia);
										JOptionPane.showMessageDialog(veSup,
												apostadorExistente.getNombre() + " Apostó Exitosamente en Superastro");
										JOptionPane.showMessageDialog(veSup,
												"Recibo Generado:" + "\n" + "Nombre del apostador:"
														+ apostadorExistente.getNombre() + "\n" + "Numero de cedula :"
														+ cedul + "\n" + "Numero que aposto" + dig1 + dig2 + dig3 + dig4
														+ "Serie" + "\n" + "\n Signo del zodiaco :" + zod + "\n"
														+ " Sede en la que aposto :" + sed + "\n" + " Dia de hoy :"
														+ dia + "\n Valor de la apuesta realizada: " + val);
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
		}

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
			if (!(dig1 == "0") || !(dig1 == "1") || !(dig1 == "2") || !(dig1 == "3") || !(dig1 == "4") || !(dig1 == "5")
					|| !(dig1 == "6") || !(dig1 == "7") || !(dig1 == "8") || !(dig1 == "9")) {
				JOptionPane.showMessageDialog(veChan, "inserte digitos del 0 al 9");
			} else {
				String lot = veChan.getCampoLote().getText();
				String val = veChan.getCampoValue().getText();
				String cedul = veChan.getCampoCedula().getText();
				String dia = veChan.getCampoDia().getText();
				String sed = veChan.getCampoSede().getText();
				if (index.isBlank() || dig1.isBlank() || dig2.isBlank() || dig3.isBlank() || dig4.isBlank()
						|| lot.isBlank() || val.isBlank() || cedul.isBlank() || dia.isBlank() || sed.isBlank()) {
					JOptionPane.showMessageDialog(veChan, "Uno o mas espacios estan vacios");
				}
				int index1 = Integer.parseInt(index);
				ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
				if (index1 >= 0 && index1 < apostadores.size()) {
					ApostadorDTO apostadorExistente = apostadores.get(index1);
					int confirmacion = JOptionPane.showConfirmDialog(vapo,
							"En la posición " + index1 + ", el nombre del apostador es "
									+ apostadorExistente.getNombre() + ". ¿Desea Apostar con este apostador ?",
							"Confirmación", JOptionPane.YES_NO_OPTION);
					if (confirmacion == JOptionPane.YES_OPTION) {
						boolean localidadExiste = sedeDao.getListOfSedes().stream()
								.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sed));

						if (localidadExiste) {
							// Validar cédula
							if (veChan.getCampoCedula().getText()
									.equals(Long.toString(apostadorExistente.getCedula()))) {
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
														+ " Sede en la que aposto :" + sed + "\n" + " Dia de hoy :"
														+ dia + "\n Valor de la apuesta realizada: " + val);
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
			if (!(dig1 == "0") || !(dig1 == "1") || !(dig1 == "2") || !(dig1 == "3") || !(dig1 == "4") || !(dig1 == "5")
					|| !(dig1 == "6") || !(dig1 == "7") || !(dig1 == "8") || !(dig1 == "9")) {
				JOptionPane.showMessageDialog(veLo, "inserte digitos del 0 al 9");
			} else {
				String ser1 = veLo.getCampoSerie1().getText();
				String ser2 = veLo.getCampoSerie2().getText();
				String ser3 = veLo.getCampoSerie3().getText();
				String lot = veLo.getCampoLote().getText();
				String val = veLo.getCampoValue().getText();
				String cedul = veLo.getCampoCedula().getText();
				String dia = veLo.getCampoDia().getText();
				String sed = veLo.getCampoSede().getText();
				if (index.isBlank() || dig1.isBlank() || dig2.isBlank() || dig3.isBlank() || dig4.isBlank()
						|| lot.isBlank() || val.isBlank() || cedul.isBlank() || dia.isBlank() || sed.isBlank()) {
					JOptionPane.showMessageDialog(veLo, "Uno o mas espacios estan vacios");
				}
				int index1 = Integer.parseInt(index);
				ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
				if (index1 >= 0 && index1 < apostadores.size()) {
					ApostadorDTO apostadorExistente = apostadores.get(index1);
					int confirmacion = JOptionPane.showConfirmDialog(veLo,
							"En la posición " + index1 + ", el nombre del apostador es "
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
									if (lot.equalsIgnoreCase("Loteria de cucuta")
											|| lot.equalsIgnoreCase("loteria de boyaca")
											|| lot.equalsIgnoreCase("loteria de cundinamarca")) {
										loteDao.create(dig1, dig2, dig3, dig4, ser1, ser2, ser3, val, lot, cedul, sed,
												dia);
										JOptionPane.showMessageDialog(veLo,
												apostadorExistente.getNombre() + " Apostó Exitosamente en  la " + lot);
										JOptionPane.showMessageDialog(veLo,
												"Recibo Generado:" + "\n" + "Nombre del apostador:"
														+ apostadorExistente.getNombre() + "\n" + "Numero de cedula :"
														+ cedul + "\n" + "Numero que aposto" + dig1 + dig2 + dig3 + dig4
														+ "Serie" + ser1 + ser2 + ser3 + "\n"
														+ " Sede en la que aposto :" + sed + "\n" + " Dia de hoy :"
														+ dia + "\n Valor de la apuesta realizada: " + val);
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

			int num1 = Integer.parseInt(dig1);
			int num2 = Integer.parseInt(dig2);
			int num3 = Integer.parseInt(dig3);
			int num4 = Integer.parseInt(dig4);
			int num5 = Integer.parseInt(dig5);
			int num6 = Integer.parseInt(dig6);

			if (!(num1 >= 1 && num1 <= 45) || !(num2 >= 1 && num2 <= 45) || !(num3 >= 1 && num3 <= 45)
					|| !(num4 >= 1 && num4 <= 45) || !(num5 >= 1 && num5 <= 45) || !(num6 >= 1 && num6 <= 45)) {
				JOptionPane.showMessageDialog(veSup, "Inserte números en el rango del 1 al 45");
			} else {

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
					int confirmacion = JOptionPane.showConfirmDialog(valo,
							"En la posición " + index1 + ", el nombre del apostador es "
									+ apostadorExistente.getNombre() + ". ¿Desea Apostar con este apostador ?",
							"Confirmación", JOptionPane.YES_NO_OPTION);
					if (confirmacion == JOptionPane.YES_OPTION) {
						boolean localidadExiste = sedeDao.getListOfSedes().stream()
								.anyMatch(sede -> sede.getLocalidad().equalsIgnoreCase(sed));

						if (localidadExiste) {
							if (valo.getCampoCedula().getText().equals(Long.toString(apostadorExistente.getCedula()))) {
								if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes")
										|| dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("jueves")
										|| dia.equalsIgnoreCase("viernes") || dia.equalsIgnoreCase("sabado")
										|| dia.equalsIgnoreCase("domingo")) {

									balotDao.create(dig1, dig2, dig3, dig4, dig5, dig6, val, cedul, sed, dia);
									JOptionPane.showMessageDialog(valo,
											apostadorExistente.getNombre() + " Apostó Exitosamente en el baloto ");
									JOptionPane.showMessageDialog(valo,
											"Recibo Generado:" + "\n" + "Nombre del apostador:"
													+ apostadorExistente.getNombre() + "\n" + "Numero de cedula :"
													+ cedul + "\n" + "Numero que aposto" + dig1 + "," + dig2 + ","
													+ dig3 + "," + dig4 + "," + dig5 + "," + dig6 + "," + "\n"
													+ " Sede en la que aposto :" + sed + "\n" + " Dia de hoy :" + dia
													+ "\n Valor de la apuesta realizada: " + val);

								} else {
									JOptionPane.showMessageDialog(valo, "Dia No coincide");
								}
							} else {
								JOptionPane.showMessageDialog(valo,
										"La cédula ingresada no coincide con la cédula del apostador  o el dia de la semana no es valido.");
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
		case "selConsulApu": {
			veConClient.setVisible(true);
			veCon.setVisible(false);
			break;
		}
		case "consulApuClien": {
			veConClient.getCampoConsulta().setText("");
			ArrayList<ApostadorDTO> apostadores = apostDao.getListOfApostadores();
			String salida = "";
			String apostadores1 = "";
			for (int i = 0; i < sedeDao.getListOfSedes().size(); i++) {
				apostadores1 = "";
				for (int j = 0; j < apostDao.getListOfApostadores().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(apostDao.getListOfApostadores().get(j).getSedeJuego())) {
						apostadores1 = apostadores1.concat(apostDao.getListOfApostadores().get(j).toString() + "\n");
					}
				}
				salida += sedeDao.getListOfSedes().get(i).getLocalidad() + "\n" + apostadores1 + "\n";
			}
			veConClient.getCampoConsulta().setText(salida);
			break;

		}
		case "btnSelTot": {
			vetotal.setVisible(true);
			veCon.setVisible(false);
			break;
		}
		case "btnTotal": {
			double apuesta1 = 0;
			double apuesta2 = 0;
			double apuesta3 = 0;
			double apuesta4 = 0;
			double apuesta5 = 0;
			double sum = 0;
			String salida = "";

			for (int i = 0; i < apostDao.getListOfApostadores().size(); i++) {
				apuesta1 = 0;
				apuesta2 = 0;
				apuesta3 = 0;
				apuesta4 = 0;
				apuesta5 = 0;
				sum = 0;
				for (int j = 0; j < loteDao.getListOfLoteria().size(); j++) {
					if (apostDao.getListOfApostadores().get(i).getCedula() == loteDao.getListOfLoteria().get(j)
							.getNumDeCedula()) {

						apuesta1 += loteDao.getListOfLoteria().get(j).getValorDeLaApuesta();

					}
				}
				for (int j = 0; j < chanDao.getListOfChances().size(); j++) {
					if (apostDao.getListOfApostadores().get(i).getCedula() == chanDao.getListOfChances().get(j)
							.getNumDeCedula()) {

						apuesta2 += chanDao.getListOfChances().get(j).getValorDeLaApuesta();

					}
				}
				for (int j = 0; j < betDao.getListOfBetplays().size(); j++) {
					if (apostDao.getListOfApostadores().get(i)
							.equals(betDao.getListOfBetplays().get(j).getNumDeCedula())) {

						apuesta3 += betDao.getListOfBetplays().get(j).getValorDeLaApuesta();

					}
				}
				for (int j = 0; j < superDao.getListOfSuperastro().size(); j++) {
					if (apostDao.getListOfApostadores().get(i).getCedula() == superDao.getListOfSuperastro().get(j)
							.getNumDeCedula()) {

						apuesta4 += superDao.getListOfSuperastro().get(j).getValorDeLaApuesta();

					}
				}
				for (int j = 0; j < balotDao.getListOfBalotos().size(); j++) {
					if (apostDao.getListOfApostadores().get(i).getCedula() == balotDao.getListOfBalotos().get(j)
							.getNumDeCedula()) {

						apuesta5 += balotDao.getListOfBalotos().get(j).getValorDeLaApuesta();
					}
				}

				sum = apuesta1 + apuesta2 + apuesta3 + apuesta4 + apuesta5;
				salida += "Apostador " + apostDao.getListOfApostadores().get(i).getCedula() + ": " + sum + "\n";
				vetotal.getCampoConsulta().setText(salida);

			}
			break;
		}
		case "btnSelClientSede": {
			int opcion = JOptionPane.showConfirmDialog(veCon, "¿Desea Consultar por Cliente ?", "Confirmación",
					JOptionPane.YES_NO_OPTION);
			if (opcion == JOptionPane.YES_OPTION) {

				veClienSed.setVisible(true);
				veCon.setVisible(false);
				veClienSed.getConsultarPorSede().setVisible(false);
				veClienSed.getConsultarPorCliente().setVisible(true);
				veClienSed.getCampoConsulta().setText("");

				break;

			} else {
				int opcion1 = JOptionPane.showConfirmDialog(veCon, "¿Desea Consultar por Sede?", "Confirmación",
						JOptionPane.YES_NO_OPTION);
				if (opcion1 == JOptionPane.YES_OPTION) {

					veClienSed.setVisible(true);
					veCon.setVisible(false);
					veClienSed.getConsultarPorSede().setVisible(true);
					veClienSed.getConsultarPorCliente().setVisible(false);
					veClienSed.getCampoConsulta().setText("");
					break;
				} else {

					JOptionPane.showMessageDialog(veCon, "No se consulto nada");
					break;

				}
			}
		}
		case "btnSedConsul": {
			String salida = "";
			String apuestas = "";
			String apuesta1 = "";
			String apuesta2 = "";
			String apuesta3 = "";
			String apuesta4 = "";
			String apuesta5 = "";

			for (int i = 0; i < sedeDao.getListOfSedes().size(); i++) {
				apuesta1 = "";
				apuesta2 = "";
				apuesta3 = "";
				apuesta4 = "";
				apuesta5 = "";
				apuestas = "";
				for (int j = 0; j < loteDao.getListOfLoteria().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(loteDao.getListOfLoteria().get(j).getNameSede())) {

						apuesta1 = apuesta1.concat(loteDao.getListOfLoteria().get(j).toString());

					}
				}

				for (int j = 0; j < balotDao.getListOfBalotos().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(balotDao.getListOfBalotos().get(j).getNameSede())) {

						apuesta2 = apuesta2.concat(balotDao.getListOfBalotos().get(j).toString());

					}
				}
				for (int j = 0; j < superDao.getListOfSuperastro().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(superDao.getListOfSuperastro().get(j).getNameSede())) {

						apuesta3 = apuesta3.concat(superDao.getListOfSuperastro().get(j).toString());

					}
				}

				for (int j = 0; j < betDao.getListOfBetplays().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(betDao.getListOfBetplays().get(j).getNameSede())) {

						apuesta4 = apuesta4.concat(betDao.getListOfBetplays().get(j).toString());

					}
				}
				for (int j = 0; j < chanDao.getListOfChances().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(chanDao.getListOfChances().get(j).getNameSede())) {

						apuesta5 = apuesta5.concat(chanDao.getListOfChances().get(j).toString());

					}
				}
				apuestas = "\n" + "Loteria: " + "\n" + apuesta1 + "\n" + "\n" + "Baloto: " + "\n" + apuesta2 + "\n"
						+ "Superastro: " + "\n" + apuesta3 + "\n" + "Betplay: " + "\n" + apuesta4 + "\n" + "Chance: "
						+ "\n" + apuesta5 + "\n";

				salida = salida.concat(sedeDao.getListOfSedes().get(i).getLocalidad() + ": " + "\n" + apuestas + "\n");

			}
			String compl = apuestas + salida;
			veClienSed.getCampoConsulta().setText(compl);
			break;
		}
		case "btnClientConsul": {
			String salida = "";
			String apuestas = "";
			String apuesta1 = "";
			String apuesta2 = "";
			String apuesta3 = "";
			String apuesta4 = "";
			String apuesta5 = "";

			for (int i = 0; i < apostDao.getListOfApostadores().size(); i++) {
				apuesta1 = "";
				apuesta2 = "";
				apuesta3 = "";
				apuesta4 = "";
				apuesta5 = "";
				apuestas = "";
				for (int j = 0; j < loteDao.getListOfLoteria().size(); j++) {
					if (apostDao.getListOfApostadores().get(i).getCedula() == loteDao.getListOfLoteria().get(j)
							.getNumDeCedula()) {

						apuesta1 = apuesta1.concat(loteDao.getListOfLoteria().get(j).toString());

					}
				}
				for (int j = 0; j < superDao.getListOfSuperastro().size(); j++) {
					if (apostDao.getListOfApostadores().get(i).getCedula() == superDao.getListOfSuperastro().get(j)
							.getNumDeCedula()) {

						apuesta2 = apuesta2.concat(superDao.getListOfSuperastro().get(j).toString());

					}
				}

				for (int j = 0; j < betDao.getListOfBetplays().size(); j++) {
					if (apostDao.getListOfApostadores().get(i).getCedula() == betDao.getListOfBetplays().get(j)
							.getNumDeCedula()) {

						apuesta3 = apuesta3.concat(betDao.getListOfBetplays().get(j).toString() + "\n");

					}
				}
				for (int j = 0; j < balotDao.getListOfBalotos().size(); j++) {
					if (apostDao.getListOfApostadores().get(i).getCedula() == balotDao.getListOfBalotos().get(j)
							.getNumDeCedula()) {

						apuesta4 = apuesta4.concat(balotDao.getListOfBalotos().get(j).toString());

					}
				}
				for (int j = 0; j < chanDao.getListOfChances().size(); j++) {
					if (apostDao.getListOfApostadores().get(i).getCedula() == chanDao.getListOfChances().get(j)
							.getNumDeCedula()) {

						apuesta5 = apuesta5.concat(chanDao.getListOfChances().get(j).toString());

					}
				}
				apuestas = "Loteria: " + "\n" + apuesta1 + "\n" + "Baloto: " + "\n" + apuesta2 + "\n" + "Superastro: "
						+ "\n" + apuesta3 + "\n" + "Betplay: " + "\n" + apuesta4 + "\n" + "Chance: " + "\n" + apuesta5;

				salida = salida
						.concat(apostDao.getListOfApostadores().get(i).getCedula() + ": " + "\n" + apuestas + "\n");
			}
			String compl = apuestas + salida;
			veClienSed.getCampoConsulta().setText(compl);
			break;
		}
		case "presuReg": {
			vpre.setVisible(false);
			vms.setVisible(true);
			break;
		}
		case "salirProg": {
			vms.dispose();
			break;

		}
		case "sedRere": {
			vms.setVisible(true);
			vsed.setVisible(false);
		}
		case "btnSedesTipo": {
			vetise.setVisible(true);
			veCon.setVisible(false);

			break;
		}
		case "btnTipSede": {
			double apuestas1 = 0;
			double apuestas2 = 0;
			double apuestas3 = 0;
			double apuestas4 = 0;
			double apuestas5 = 0;
			double sumaApuestas = 0;
			String salida = "";
			for (int i = 0; i < sedeDao.getListOfSedes().size(); i++) {
				apuestas1 = 0;
				apuestas2 = 0;
				apuestas3 = 0;
				apuestas4 = 0;
				apuestas5 = 0;
				sumaApuestas = 0;
				for (int j = 0; j < loteDao.getListOfLoteria().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equals(loteDao.getListOfLoteria().get(j).getNameSede())) {

						apuestas1 += loteDao.getListOfLoteria().get(j).getValorDeLaApuesta();

					}
				}

				for (int j = 0; j < balotDao.getListOfBalotos().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(balotDao.getListOfBalotos().get(j).getNameSede())) {

						apuestas2 += balotDao.getListOfBalotos().get(j).getValorDeLaApuesta();

					}
				}

				for (int j = 0; j < chanDao.getListOfChances().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(chanDao.getListOfChances().get(j).getNameSede())) {

						apuestas3 += chanDao.getListOfChances().get(j).getValorDeLaApuesta();

					}
				}

				for (int j = 0; j < betDao.getListOfBetplays().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(betDao.getListOfBetplays().get(j).getNameSede())) {

						apuestas4 += betDao.getListOfBetplays().get(j).getValorDeLaApuesta();

					}
				}
				for (int j = 0; j < superDao.getListOfSuperastro().size(); j++) {
					if (sedeDao.getListOfSedes().get(i).getLocalidad()
							.equalsIgnoreCase(superDao.getListOfSuperastro().get(j).getNameSede())) {

						apuestas5 += superDao.getListOfSuperastro().get(j).getValorDeLaApuesta();

					}
				}
				sumaApuestas = apuestas1 + apuestas2 + apuestas3 + apuestas4 + apuestas5;
				salida = salida.concat(
						"\n" + "Sede :" + sedeDao.getListOfSedes().get(i).getLocalidad() + ": " + sumaApuestas + "\n"
								+ " Loteria: " + apuestas1 + "\n" + " Baloto: " + apuestas2 + "\n" + " Superastro: "
								+ apuestas3 + "\n" + " Betplay: " + apuestas4 + "\n" + " Chance: " + apuestas5 + "\n");

			}
			vetise.getCampoConsulta().setText(salida);
			break;
		}
		case "regTipSed": {
			veCon.setVisible(true);
			vetise.setVisible(false);

			break;
		}
		case "regClienSed": {
			veCon.setVisible(true);
			veClienSed.setVisible(false);
			break;
		}
		case "regTotal": {
			veCon.setVisible(true);
			vetotal.setVisible(false);

			break;
		}
		case "regClient": {
			veCon.setVisible(true);
			veConClient.setVisible(false);
			break;
		}
		case "regCon": {
			vms.setVisible(true);
			veCon.setVisible(false);
			break;
		}
		case "regCasa": {
			vms.setVisible(true);
			vcca.setVisible(false);
			break;
		}
		case "regElimm": {
			vsapo.setVisible(true);
			velimApos.setVisible(false);
			break;
		}
		case "regApo": {
			vsapo.setVisible(true);
			vapo.setVisible(false);
			break;
		}
		case "regBalo": {
			vapu.setVisible(true);
			valo.setVisible(false);
			break;
		}
		case "regBet": {
			vapu.setVisible(true);
			vet.setVisible(false);
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
		vcca.getRegresar().addActionListener(this);
		vcca.getRegresar().setActionCommand("regCasa");
		vpre.getBotonRegistrarPresupuesto().addActionListener(this);
		vpre.getBotonRegistrarPresupuesto().setActionCommand("btnRegistPresup");
		vpre.getBotonModificarPresupuesto().addActionListener(this);
		vpre.getBotonModificarPresupuesto().setActionCommand("btnModifPresupuesto");
		vpre.getRegresar().addActionListener(this);
		vpre.getRegresar().setActionCommand("presuReg");
		vsed.getRegistrarSede().addActionListener(this);
		vsed.getRegistrarSede().setActionCommand("btnRegistSed");
		vsed.getModificarSede().addActionListener(this);
		vsed.getModificarSede().setActionCommand("btnModifSed");
		vsed.getRegresar().addActionListener(this);
		vsed.getRegresar().setActionCommand("sedRere");
		vms.getBotonParametros().addActionListener(this);
		vms.getBotonParametros().setActionCommand("btnPara");
		vms.getBotonApostador().addActionListener(this);
		vms.getBotonApostador().setActionCommand("btnApos");
		vms.getBotonApostar().addActionListener(this);
		vms.getBotonApostar().setActionCommand("btnApues");
		vms.getBotonConsultas().addActionListener(this);
		vms.getBotonConsultas().setActionCommand("selConsul");
		vms.getBotonSalir().addActionListener(this);
		vms.getBotonSalir().setActionCommand("salirProg");
		vapo.getCrearApostador().addActionListener(this);
		vapo.getCrearApostador().setActionCommand("btnCrearApos");
		vapo.getRegresar().addActionListener(this);
		vapo.getRegresar().setActionCommand("regApo");
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
		velimApos.getRegresar().addActionListener(this);
		velimApos.getRegresar().setActionCommand("regElimm");
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
		valo.getRegresar().addActionListener(this);
		valo.getRegresar().setActionCommand("regBalo");
		vet.getApost().addActionListener(this);
		vet.getApost().setActionCommand("btnBetApost");
		vet.getRegresar().addActionListener(this);
		vet.getRegresar().setActionCommand("regBet");
		veCon.getApuestasPorCliente().addActionListener(this);
		veCon.getApuestasPorCliente().setActionCommand("selConsulApu");
		veCon.getValorTotalapuestasCliente().addActionListener(this);
		veCon.getValorTotalapuestasCliente().setActionCommand("btnSelTot");
		veCon.getClientesSede().addActionListener(this);
		veCon.getClientesSede().setActionCommand("btnSelClientSede");
		veCon.getApuestasSedesYTipo().addActionListener(this);
		veCon.getApuestasSedesYTipo().setActionCommand("btnSedesTipo");
		veCon.getRegresar().addActionListener(this);
		veCon.getRegresar().setActionCommand("regCon");
		veConClient.getConsultarPorCliente().addActionListener(this);
		veConClient.getConsultarPorCliente().setActionCommand("consulApuClien");
		veConClient.getRegresar().addActionListener(this);
		veConClient.getRegresar().setActionCommand("regClient");
		vetotal.getConsultarTotal().addActionListener(this);
		vetotal.getConsultarTotal().setActionCommand("btnTotal");
		vetotal.getRegresar().addActionListener(this);
		vetotal.getRegresar().setActionCommand("regTotal");
		veClienSed.getConsultarPorCliente().addActionListener(this);
		veClienSed.getConsultarPorCliente().setActionCommand("btnClientConsul");
		veClienSed.getConsultarPorSede().addActionListener(this);
		veClienSed.getConsultarPorSede().setActionCommand("btnSedConsul");
		veClienSed.getRegresar().addActionListener(this);
		veClienSed.getRegresar().setActionCommand("regClienSed");
		vetise.getConsultarPorTipoSede().addActionListener(this);
		vetise.getConsultarPorTipoSede().setActionCommand("btnTipSede");
		vetise.getRegresar().addActionListener(this);
		vetise.getRegresar().setActionCommand("regTipSed");

	}

}
