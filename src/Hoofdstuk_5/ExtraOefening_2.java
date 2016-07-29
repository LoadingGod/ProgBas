package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double nFahr, nCel;

		System.out.println("Geef het aantal graden Fahrenheit: ");
		nFahr = in.nextDouble();

		nCel = (nFahr - 32) * 5 / 9;
		nCel = (int) (nCel * 10 + 0.5) / 10.0;

		System.out.println(nFahr + " graden Fahrenheit = " + nCel + " graden Celcius.");
		in.close();
	}

}
