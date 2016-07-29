package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arbeidersNr;
		int hWerkuur = Integer.MIN_VALUE;
		int hWerkUurArbeidNr = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Geef de arbeidersNr in: ");
		arbeidersNr = in.nextInt();

		while (arbeidersNr > 0) {
			double uurLoon;
			int werkUren;
			double totaalLoon = 0;
			System.out.println("Geef het uurloon in: ");
			uurLoon = in.nextDouble();
			System.out.println("Geef de gewerkte uren van een week in: ");
			werkUren = in.nextInt();
			if (werkUren > hWerkuur) {
				hWerkuur = werkUren;
				hWerkUurArbeidNr = arbeidersNr;
			}
			for (int i = 1; i <= werkUren; i++) { ///////////// :
				if (i < 38) {
					totaalLoon += uurLoon;
				} else {
					totaalLoon += uurLoon * 1.5;
				}
			}

			System.out.println("ArbeidersNr: " + arbeidersNr + " weekLoon: " + totaalLoon);

			System.out.println("Geef de arbeidersNr in: ");
			arbeidersNr = in.nextInt();
		}

		System.out.println("WerknemerNr met de meeste werkuren: " + hWerkUurArbeidNr);
		in.close();
	}

}
