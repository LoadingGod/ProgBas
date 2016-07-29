package Hoofdstuk_5;

import java.util.*;

public class Oef_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int getal;
		Scanner in = new Scanner(System.in);
		System.out.println("Geef een getal in: ");
		getal = in.nextInt();

		while (getal != 0) {
			System.out.println("Faculteit van het getal: " + getal + ": ");
			int facul = 1;
			for (int i = 1; i <= getal; i++) {
				if (i < getal) {
					facul *= i;
					System.out.print(i + "x");
				} else {
					System.out.print(i);
				}
			}
			System.out.println(getal + " != " + facul);
			System.out.println();
			System.out.println("Geef een getal in: ");
			getal = in.nextInt();
		}
		in.close();

	}

}
