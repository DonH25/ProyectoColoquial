package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.CasaDeApuestasDAO;
import co.edu.unbosque.model.persistence.JuegoDAO;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;
	CasaDeApuestasDAO caDao;
	JuegoDAO jueDao;

	public Controller() {
		con = new Console();
		caDao = new CasaDeApuestasDAO();
		jueDao = new JuegoDAO();
	}

	public void run() {
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
							con.printWithNewLine("Ahora se van a crear los juegos de la casa de apuestas");
							con.printWithNewLine("Juego#1 Baloto");
							String juego1name = "Baloto";
							String juego1tipo = "Loteria";
							con.printWithNewLine("Inserte el presupuesto del juego");
							String presu1 = con.readWholeLine();
							con.printWithNewLine("Juego#2 Loteria");
							String juego2name = "Loteria";
							String juego2tipo = "Loteria";
							con.printWithNewLine("Inserte el presupuesto del juego");
							String presu2 = con.readWholeLine();
							con.printWithNewLine("Juego#3 Chance");
							String juego3name = "Chance";
							String juego3tipo = "Chance";
							con.printWithNewLine("Inserte el presupuesto del juego");
							String presu3 = con.readWholeLine();
							con.printWithNewLine("Juego#4 Superastro");
							String juego4name = "Superastro";
							String juego4tipo = "Loteria";
							con.printWithNewLine("Inserte el presupuesto del juego");
							String presu4 = con.readWholeLine();
							con.printWithNewLine("Juego#5 Betplay");
							String juego5name = "Betplay";
							String juego5tipo = "Deportivo";
							con.printWithNewLine("Inserte el presupuesto del juego");
							String presu5 = con.readWholeLine();
							jueDao.create(juego1name, juego1tipo, presu1, juego2name, juego2tipo, presu2, juego3name,
									juego3tipo, presu3, juego4name, juego4tipo, presu4, juego5name, juego5tipo, presu5);
							break;
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
			}
		}
	}
}
