package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double beginKapitaal;
		int aantalJaren;
		double interestVoet;
		Scanner in = new Scanner(System.in);

		System.out.println("Geef het begin kapitaal in: ");
		beginKapitaal = in.nextDouble();
		System.out.println("Geef het aantal jaren in: ");
		aantalJaren = in.nextInt();
		System.out.println("Geef de interestVoet in: ");
		interestVoet = in.nextDouble();

		System.out.println("Begin kapitaal: " + beginKapitaal);
		for (int i = 1; i <= aantalJaren; i++) {
			double eindKapitaal = beginKapitaal * Math.pow((1 + interestVoet), i); //////////////
			System.out.println("Eind kapitaal jaar " + i + "\t:" + (int) (eindKapitaal * 100 + 0.5) / 100.0);
		}

		in.close();
	}

}
