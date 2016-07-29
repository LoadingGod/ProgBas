package Hoofdstuk_5;

import java.util.*;

public class Oef_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int grootte;

		System.out.println("Geef de grootte van de driekhoek: ");
		grootte = in.nextInt();

		for (int i = grootte; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		in.close();
	}

}
