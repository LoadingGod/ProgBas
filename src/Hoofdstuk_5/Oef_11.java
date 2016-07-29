package Hoofdstuk_5;
import java.util.*;
public class Oef_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int som = 0;
		int getal;
		int negTel = 0;

		System.out.println("Geef een getal in: ");
		getal = in.nextInt();
		while (getal != 0) {
			if (getal < 0) {
				negTel++;
			}
			som += getal;
			System.out.println("Geef een getal in: ");
			getal = in.nextInt();
		}

		System.out.println("De som is: " + som + " Aantal negatieve getallen: " + negTel);
		in.close();
	}

}
