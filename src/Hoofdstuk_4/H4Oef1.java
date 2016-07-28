package Hoofdstuk_4;

import java.util.*;

public class H4Oef1 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int aantalVolwassenen;
		int aantalKinderen;
		int totaleInkomPrijs;

		System.out.println("geef het aantal volwassenen in");
		aantalVolwassenen = input.nextInt();
		System.out.println("geef het aantal kinderen in");
		aantalKinderen = input.nextInt();
		totaleInkomPrijs = aantalVolwassenen * 28 + aantalKinderen * 15;
		System.out.println("te betalen: " + totaleInkomPrijs);
		input.close();
	}
}
