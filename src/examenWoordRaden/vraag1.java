package examenWoordRaden;

import java.util.Scanner;

public class vraag1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String letterwoord = MaakWoord();
		System.out.println("het te raden woord is " + letterwoord);

		System.out.println("geef het aantal pogingen");
		int aantalBeurten = in.nextInt();
		while (aantalBeurten < 3 || aantalBeurten > 10) {
			System.out.println("het getal ligt niet tussen 3 en 10");
			System.out.println("geef het aantal beurten (tussen 3 en 10) dat speler 2 mag raden: ");
			aantalBeurten = in.nextInt();
		}
		boolean juist = false;
		int aantalGokken = 0;

		System.out.println("raad een 4-letterwoord dat begint met een " + letterwoord.charAt(0) + ", je krijgt "
				+ aantalBeurten + " beurten");
		String gok = in.next();
		while (gok.length() != 4) {
			System.out.println("FOUT :-( geen 4-letterwoord");
			gok = in.next();
		}
		if (gok.equals(letterwoord)) {
			juist = true;
		} else {
			while (!juist && aantalGokken < aantalBeurten - 1) {
				int pogingen = aantalBeurten - aantalGokken - 1;
				aantalGokken++;
				for (int i = 0; i < 4; i++) {
					if (gok.charAt(i) == letterwoord.charAt(i)) {
						System.out.print("*");
					} else {
						System.out.print("-");
					}
				}
				if (gok.equals(letterwoord)) {
					juist = true;
				} else {
					System.out.println("FOUT, nog " + pogingen + " pogingen");
					gok = in.next();
					while (gok.length() != 4) {
						System.out.println("FOUT :-( geen 4-letterwoord");
						gok = in.next();
					}
				}
			}
			if (juist) {
				System.out.print("YOU WIN :-)");
			} else {
				System.out.println("verloren");
			}
		}
		in.close();
	}

	static String MaakWoord() {
		Scanner in = new Scanner(System.in);
		System.out.println("geef een te raden tekenreeks");
		String tekenreeks = in.next();
		String bijnaLetterwoord = "";
		for (int i = tekenreeks.length() - 1; i >= 0; i--) {
			char teken = tekenreeks.charAt(i);

			if (Character.isLetter(teken)) {
				bijnaLetterwoord += teken;
			}

		}
		in.close();
		bijnaLetterwoord = bijnaLetterwoord.toLowerCase();

		String letterwoord = bijnaLetterwoord.substring(0, 4);
		return letterwoord;
	}
}
