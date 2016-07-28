package Hoofdstuk_4;

import java.util.*;

public class H4Oef6 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int getal;
		int vermenigvuldig;
		System.out.println("geef een getal in");
		getal = input.nextInt();
		for (int count = 1; count < 21; count++){
			vermenigvuldig = getal * count;
			System.out.println(count + " x " + getal + " = " + vermenigvuldig + "\n");
		}
	}
}
