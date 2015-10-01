package Hoofdstuk_5;

import java.util.*;

public class Oef_2 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double eenheidsprijs = 11.5;
		int aantal = input.nextInt();
		double btwPercentage = 0.21;
		double exclusiefBtw;
		double btwBedrag;
		double inclusiefBTW;
		exclusiefBtw = aantal * eenheidsprijs;
		btwBedrag = exclusiefBtw * btwPercentage;
		inclusiefBTW = exclusiefBtw + btwBedrag;
		System.out.println(exclusiefBtw + " Euro" + "\n" + btwBedrag + " Euro" + "\n" + inclusiefBTW + " Euro");
	}
}
