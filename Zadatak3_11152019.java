package domaci_11152019;

import java.util.Scanner;

public class Zadatak3_11152019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.

		Scanner scan = new Scanner(System.in);

		int f0 = 0;
		int f1 = 1;
		int fn = f0 + f1;
		int n = 0;

		while (n < 1) {
			System.out.println("Unesite zeljenu duzinu Fibonacijevog niza (broj veci od 0):");
			n = scan.nextInt();
		}
		System.out.println("Niz duzine " + n + " je: ");
		System.out.print(f0 + " ");

		for (int array = 2; array <= n; array++) {
			System.out.print(fn + " ");
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;
		}
	}
}
