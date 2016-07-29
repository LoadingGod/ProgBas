package Hoofdstuk_5;

import java.util.*;

public class Oef_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double hTemp = Integer.MIN_VALUE;
		double gemTemp;
		double sum = 0;
		final int AANTAL_DAGEN = 10;

		for (int i = 0; i < AANTAL_DAGEN; i++) {
			double temp;
			System.out.println("Geef de temparatuur in voor dag " + (i + 1));
			temp = in.nextDouble();
			sum += temp;
			if (temp > hTemp) {
				hTemp = temp;
			}
		}

		gemTemp = sum / AANTAL_DAGEN;
		gemTemp = Math.round(gemTemp);
		System.out.println("Hoogte temperatuur: " + hTemp + "\nGemiddelde temperatuur: " + gemTemp);
		in.close();
	}

}
