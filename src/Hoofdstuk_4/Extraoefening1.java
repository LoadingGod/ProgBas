package Hoofdstuk_4;
import java.util.*;
public class Extraoefening1 {
private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("waarde A");
		int a = input.nextInt();
		System.out.println("waarde B");
		int b = input.nextInt();
		int kleinsteGetal;
		double kwadraat;
		if (a > b) {
			kleinsteGetal = b;
			kwadraat = Math.pow(kleinsteGetal, 2);
		} else {
			kleinsteGetal = a;
			kwadraat = Math.pow(kleinsteGetal, 2);
		}
		System.out.println("Het kleinste getal is..." + kleinsteGetal +"\n"+ "Het kwadraa van het kleinste getal is..."+ kwadraat);
	}

}
