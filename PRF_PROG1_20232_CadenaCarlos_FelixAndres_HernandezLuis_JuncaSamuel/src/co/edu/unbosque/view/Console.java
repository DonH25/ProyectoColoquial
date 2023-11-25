package co.edu.unbosque.view;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Esta clase proporciona métodos para interactuar con la consola.
 */
public class Console {

	/**
	 * Scanner para leer la entrada del usuario.
	 */
	private Scanner sc;

	/**
	 * Constructor que inicializa el scanner.
	 */
	public Console() {
		sc = new Scanner(System.in);
	}

	/**
	 * Muestra un menú en la consola.
	 * 
	 * @param text El texto del menú a mostrar.
	 */
	public void showMenu(String text) {
		printWithNewLine(text);
	}

	/**
	 * Muestra un mensaje de selección inválida en la consola.
	 */
	public void showBadSelection() {
		printWithNewLine("Opcion invalida, intente otra vez");
	}

	/**
	 * Imprime un mensaje en la consola con una nueva línea al final.
	 * 
	 * @param data El mensaje a imprimir.
	 */
	public void printWithNewLine(String data) {
		System.out.println(data);
	}

	/**
	 * Imprime un mensaje en la misma línea en la consola.
	 * 
	 * @param data El mensaje a imprimir.
	 */
	public void printInSameLine(String data) {
		System.out.print(data);
	}

	/**
	 * Lee un entero de la consola.
	 * 
	 * @return El entero leído.
	 */
	public int readInt() {
		return sc.nextInt();
	}

	/**
	 * Lee un long de la consola.
	 * 
	 * @return El long leído.
	 */
	public long readLong() {
		return sc.nextLong();
	}

	/**
	 * Lee un float de la consola.
	 * 
	 * @return El float leído.
	 */
	public float readFloat() {
		return sc.nextFloat();
	}

	/**
	 * Lee un double de la consola.
	 * 
	 * @return El double leído.
	 */
	public double readDouble() {
		return sc.nextDouble();
	}

	/**
	 * Lee un char de la consola.
	 * 
	 * @return El char leído.
	 */
	public char readChar() {
		return sc.next().charAt(0);
	}

	/**
	 * Lee una palabra de la consola.
	 * 
	 * @return La palabra leída.
	 */
	public String readWord() {
		return sc.next();
	}

	/**
	 * Lee una línea completa de la consola.
	 * 
	 * @return La línea leída.
	 */
	public String readWholeLine() {
		return sc.nextLine();
	}

	/**
	 * Lee un BigInteger de la consola.
	 * 
	 * @return El BigInteger leído.
	 */
	public BigInteger readBigInt() {
		return sc.nextBigInteger();
	}

	/**
	 * Lee un BigDecimal de la consola.
	 * 
	 * @return El BigDecimal leído.
	 */
	public BigDecimal readBigDecimal() {
		return sc.nextBigDecimal();
	}

	/**
	 * Quema una línea de la consola.
	 */
	public void quemarLinea() {
		sc.nextLine();
	}

}
