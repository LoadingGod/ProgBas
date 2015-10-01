package Hoofdstuk_4;

import java.util.*;

public class H4Oef4 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int jaar;
		int rating;
		int basisPrijs = 5;
		System.out.println("geef het jaar van de DVD in");
		jaar = input.nextInt();
		System.out.println("geef de rating");
		rating = input.nextInt();
		jaar = jaar - year;
		if (jaar <= 2 ){
			basisPrijs = basisPrijs ++;
		}
		if (rating >= 4){
			basisPrijs = basisPrijs +2;
		} else if (rating >= 2) {
			basisPrijs = basisPrijs ++;
		}
		if (basisPrijs > 7){
			basisPrijs = 7;
		}
		System.out.println("de DVD kost " + basisPrijs + " Euro");
	}
}