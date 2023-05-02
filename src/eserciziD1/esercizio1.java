package eserciziD1;

import java.util.Scanner;

public class esercizio1 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci numero");
		int num = in.nextInt();
		System.out.println("Inserisci numero");
		int num2 = in.nextInt();
		System.out.println("moltiplica:" + moltiplica(num, num2));
		in.nextLine();
		System.out.println("Inserisci parola");
		String parola = in.nextLine();
		System.out.println("Inserisci numero");
		int numero = in.nextInt();
		System.out.println("valore:" + concatena(parola, numero));
		in.close();
	}

	public static int moltiplica(int a, int b) {

		return a * b;

	}

	public static String concatena(String mystring, int mynumber) {

		return mystring + mynumber;

	}

}
