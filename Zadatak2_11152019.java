package domaci_11152019;

import java.util.Scanner;

public class Zadatak2_11152019 {

	public static void main(String[] args) {
		/*
		 * Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Primer: ulaz m=3, n=7; Izlaz (vidljivo u konzoli) Hint: koristiti dve for
		 * petlje
		 */
		Scanner scan = new Scanner(System.in);
		String z = "*    ";
		System.out.println("Unesite zeljenu visina pravougaonika:");
		int visina = scan.nextInt();
		System.out.println("Unesite zeljenu duzina pravougaonika:");
		int duzina = scan.nextInt();

		for (int v = 0; v < visina; v++) {
			int d = 0;
			for (d = 0; d < duzina; d++) {
				System.out.print(z);
			}
			System.out.println();
			System.out.println();
		}
	}
}
