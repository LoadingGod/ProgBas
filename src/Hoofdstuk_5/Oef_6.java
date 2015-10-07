package Hoofdstuk_5;

import java.util.*;
import java.math.*;

public class Oef_6 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final double artikel = 11.5;
		int aantal = input.nextInt();
		double totaal;
		final double reductie = 0.10;
		final double btw = 0.21;
		totaal = artikel * aantal + (artikel * aantal * btw) ;
		if (totaal >= 1000) {
			totaal = totaal - (totaal * reductie);
		}
		totaal = Math.round(totaal * 100.0)/ 100.0;
		System.out.println("De klant moet: " + totaal + " euro betalen.");
	}
}
