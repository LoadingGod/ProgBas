package examenWoordRaden;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vraag2 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		FileReader b = new FileReader("geschenken.txt");
		String[] geschenken = new String[50];
		String cadeaus = b.leesRegel();
		int teller = 0;
		int aKlanten = 0;

		String naam = in.next("geef de naam van de klant in: ");
		while (!naam.equals("+") && !naam.equals("-")) {
			System.out.println("geef het aankoopbedrag: ");
			double aankoopBedrag = in.nextDouble();
			if (aankoopBedrag < 1400) {
				teller++;
			}
			aKlanten++;
			String afdruk = Verwerk(naam, aankoopBedrag);
			System.out.println(afdruk);
			naam = in.next("geef de naam van de klant in: ");
		}
		System.out.println((teller / aKlanten * 100));
		for (int i = 0; i < 3; i++)
			System.out.println(cadeaus);
	}

	static String Verwerk(String naam, double aankoopBedrag) {
		String afdruk = "";
		int aantalGeschenken = (int) aankoopBedrag / 700;
		afdruk = naam + " krijgt " + aantalGeschenken + " geschenken";
		if (aantalGeschenken == 0) {
			aantalGeschenken = 1;
		}

		return afdruk;

	}
}
