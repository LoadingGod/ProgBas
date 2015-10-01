package Hoofdstuk_4;

import java.util.*;

public class H4Oef3 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int aantal;
		int eenheidsprijs;
		int totaalPrijs;
		int korting;
		int totaal;
		System.out.println("geef het aantal in");
		aantal = input.nextInt();
		System.out.println("geef de eenheidsprijs in");
		eenheidsprijs = input.nextInt();
		totaalPrijs = aantal * eenheidsprijs;
		if (totaalPrijs >= 1000) {
			korting = 22;
		} else if (totaalPrijs >= 500) {
			korting = 10;
		} else {
			korting = 0;
		}
		totaal = totaalPrijs - korting;
		System.out.println("De totale prijs is " + totaal + " Euro");
	}

}
