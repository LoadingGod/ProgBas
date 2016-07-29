package Hoofdstuk_5;

import java.util.*;

public class Oef_9 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("waarde A");
		int a = input.nextInt();
		System.out.println("waarde B");
		int b = input.nextInt();
		System.out.println("bewerkingscode");
		int c = input.nextInt();
		int resultaat = 0;
		switch (c) {
		case 1:
			resultaat = a + b;
			break;
		case 2:
			resultaat = a - b;
			break;
		case 3:
			resultaat = a * b;
			break;
		case 4:
			resultaat = (int) Math.pow(a, 2);
			break;
		case 5:
			resultaat = (int) Math.pow(b, 2);
			break;
		}
		System.out.println(resultaat);
	}

}
