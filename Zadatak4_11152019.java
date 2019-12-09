package domaci_11152019;

import java.util.Scanner;

public class Zadatak4_11152019 {

	public static void main(String[] args) {
		/*
		 * Napisati program u kom korisnik unosi n za broj clanova Fibonacijevog niza, a
		 * ispisuje sve brojeve Fibonacijevog niza ciji je zbir cifara deljiv sa k (broj
		 * k se takodje ucitava preko tastature).
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int f0 = 0;
		int f1 = 1;
		int fn = f0 + f1;
		int n = 0;

		while (n < 1) {
			System.out.println("Unesite zeljenu duzinu Fibonacijevog niza (broj veci od 0):");
			n = scan.nextInt();
		}

		System.out.println(
				"Unesite broj da proverite deljivost zbira cifara svakog pojedinacnog broja trazenog Fibonacijevog niza istim:");
		int k = scan.nextInt();

		System.out.print("Trazeni brojevi su: " + f0 + " ");
		for (int array = 2; array <= n; array++) {
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;
			int fnTmp = fn;

			int digitSum = 0;
			while (fnTmp > 0) {
				int digit = fnTmp % 10;
				digitSum += digit;
				fnTmp = fnTmp / 10;
			}

			if (digitSum % k == 0) {
				System.out.print(fn + " ");
			}
		}
	}
}
