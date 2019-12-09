package domaci_11152019;

public class Zadatak1_11152019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		 * (ukljucujuci i njih) deljivih brojem 3.
		 */
		int broj1 = 9;
		int broj2 = 0;

		for (broj1 = 9; broj1 <= 250; broj1++) {

			if (broj1 % 3 == 0) {
				++broj2;
			}
		}
		System.out.println("Ukupno ima " + broj2 + " broj od 9 do 250 deljivih sa brojem 3");
	}

}
