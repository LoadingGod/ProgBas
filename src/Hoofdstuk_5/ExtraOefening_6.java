package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gewicht;
		double prijs;
		Scanner in = new Scanner(System.in);
		System.out.println("Geef het gewicht in: ");
		gewicht = in.nextDouble();

		if (gewicht <= 20) {
			prijs = 0.3;
		} else if (gewicht <= 50) {
			prijs = 0.5;
		} else if (gewicht <= 150) {
			prijs = 0.7;
		} else if (gewicht <= 250) {
			prijs = 1.0;
		} else {
			prijs = 1.9;
		}

		System.out.println(prijs);
		in.close();
	}

}
