package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.CasaDeApuestasDAO;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;
	CasaDeApuestasDAO caDao;

	public Controller() {
		con = new Console();
		caDao = new CasaDeApuestasDAO();
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
					con.printWithNewLine("3: Salir ");
					int option = con.readInt();
					con.quemarLinea();
					switch (option) {
					case 1: {
						con.printWithNewLine("Insertar nombre de la casa de apuestas");
						String nombre = con.readWholeLine();
						con.printWithNewLine("Insertar el numero de sedes de la casa de apuestas ");
						String sedes = con.readWholeLine();
						con.printWithNewLine("Insertar el presupuesto total de la casa de apuestas ");
						String preTotal = con.readWholeLine();
						caDao.create(nombre, sedes, preTotal);

						break;

					}
					case 2:

						con.printWithNewLine("Insertar nuevo nombre de la casa de apuestas");
						String Newnombre = con.readWholeLine();
						con.printWithNewLine("Insertar el nuevo numero de sedes de la casa de apuestas ");
						String Newsedes = con.readWholeLine();
						con.printWithNewLine("Insertar el nuevo presupuesto total de la casa de apuestas ");
						String NewpreTotal = con.readWholeLine();
						caDao.create(Newnombre, Newsedes, NewpreTotal);

						break;

					case 3:
						break cicloModulo1;

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
