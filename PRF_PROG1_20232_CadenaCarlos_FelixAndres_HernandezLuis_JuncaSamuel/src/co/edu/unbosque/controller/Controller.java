package co.edu.unbosque.controller;

import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;

	public Controller() {
		con = new Console();
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
			switch (dec) {
			case 1: {

				break;
			}
			default:
				con.printWithNewLine("Noks");
				;
			}
		}
	}
}
