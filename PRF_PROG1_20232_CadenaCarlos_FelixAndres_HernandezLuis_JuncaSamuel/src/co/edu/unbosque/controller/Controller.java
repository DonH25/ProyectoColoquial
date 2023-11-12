package co.edu.unbosque.controller;

import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;

	public Controller() {
		con = new Console();
	}

	public void run() {
		con.printWithNewLine("");
	}
}
