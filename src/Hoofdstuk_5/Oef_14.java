package Hoofdstuk_5;

import java.util.*;

public class Oef_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int artikelNr;
		double tot = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Geef het artikel nr in: ");
		artikelNr = in.nextInt();

		while (artikelNr < 999) {
			int hoeveelheid;
			double ePrijs;
			System.out.println("Geef eenheidsPrijs in: ");
			ePrijs = in.nextDouble();
			System.out.println("Geef de hoeveelheid in: ");
			hoeveelheid = in.nextInt();

			tot += ePrijs * hoeveelheid;
			System.out.println("Geef het volgende artikel nr in: ");
			artikelNr = in.nextInt();
		}
		tot = (int) (tot * 100 + 0.5) / 100.0;
		System.out.println("Totaal te betalen: " + tot);
		in.close();

	}

}
