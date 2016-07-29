package Hoofdstuk_5;

import java.util.*;

public class Oef_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int UUR = 3600;
		final int MINUUT = 60;
		int inschrijfNr;
		int hTijd = Integer.MAX_VALUE;
		int besteRenner = 0;
		int totaaRenners = 0;
		int trageRenners = 0;
		double perc;

		System.out.println("Geef het inschrijvingsnrr van de renner: ");
		inschrijfNr = in.nextInt();

		while (inschrijfNr > 0) {
			int sec;
			totaaRenners++;
			System.out.println("Geef de tijd in seconden: ");
			sec = in.nextInt();

			if (sec < hTijd) {
				hTijd = sec;
				besteRenner = inschrijfNr;
			}
			if (sec > 3600) {
				trageRenners++;
			}

			System.out.println("Geef het inschrijvingsnr van de renner: ");
			inschrijfNr = in.nextInt();
		}

		perc = (double) trageRenners / totaaRenners * 100;
		int uren = hTijd / UUR;
		int minuten = (hTijd / MINUUT) % 60;
		int seconden = hTijd % 60;
		System.out.println("De snelste renner is: " + besteRenner + " Met een tijd van: " + uren + "u " + minuten + "m "
				+ seconden + "s");
		System.out.println("Percentage van de renners trage dan 1 uur: " + perc + "%");
		in.close();

	}

}
