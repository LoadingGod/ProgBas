package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nCel, nFahr;
		Scanner in = new Scanner(System.in);
		System.out.println("Geef het aantal graden Celcius: ");
		nCel = in.nextDouble();

		nFahr = 9 / 5.0 * nCel + 32;
		nFahr = (int) (nFahr * 10) / 10.0;

		System.out.println(nCel + " graden Celcius = " + nFahr + " graden Fahrenheit.");
		in.close();
	}

}
