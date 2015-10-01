package Hoofdstuk_5;

import java.util.*;

public class Oef_3 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double afgKm = input.nextDouble();
		double verbruik = input.nextDouble();
		double prijsL = input.nextDouble();
		double brandstof;
		double kostprijs;
		double prijsPerKilometer;
		brandstof = afgKm / verbruik;
		kostprijs = brandstof * prijsL;
		prijsPerKilometer = (brandstof / afgKm) * prijsL;
		System.out.println(brandstof + " L" + "\n" + kostprijs + " Euro" + "\n" + prijsPerKilometer + " Euro");

	}

}
