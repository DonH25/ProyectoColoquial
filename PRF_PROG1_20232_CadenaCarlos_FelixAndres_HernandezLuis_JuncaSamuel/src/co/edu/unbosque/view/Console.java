package co.edu.unbosque.view;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Console {

	private Scanner sc;

	public Console() {
		sc = new Scanner(System.in);
	}

	public void showMenu(String text) {
		printWithNewLine(text);
	}

	public void showBadSelection() {
		printWithNewLine("Opcion invalida, intente otra vez");
	}

	public void printWithNewLine(String data) {
		System.out.println(data);
	}

	public void printInSameLine(String data) {
		System.out.print(data);
	}

	public int readInt() {
		return sc.nextInt();
	}

	public long readLong() {
		return sc.nextLong();
	}

	public float readFloat() {
		return sc.nextFloat();
	}

	public double readDouble() {
		return sc.nextDouble();
	}

	public char readChar() {
		return sc.next().charAt(0);
	}

	public String readWord() {
		return sc.next();
	}

	public String readWholeLine() {
		return sc.nextLine();
	}

	public BigInteger readBigInt() {
		return sc.nextBigInteger();
	}

	public BigDecimal readBigDecimal() {
		return sc.nextBigDecimal();
	}

}
