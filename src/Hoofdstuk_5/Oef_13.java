package Hoofdstuk_5;

import java.util.*;

public class Oef_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int getal;
		Scanner in = new Scanner(System.in);
		System.out.println("Geef een waarde voor het getal: ");
		getal = in.nextInt();

		while (getal < 1 || getal > 100) {
			if (getal < 1) {
				System.out.println("Het getal moet groter of gelijk zijn aan 1");
			} else {
				System.out.println("Het getal moet kleiner of gelijk zijn aan 100");
			}
			System.out.println("Geef een waarde voor het getal: ");
			getal = in.nextInt();

		}

		System.out.println("Getal: " + getal);
		in.close();

	}

}
