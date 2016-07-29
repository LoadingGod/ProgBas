package Hoofdstuk_6;
import java.util.*;
public class Oef_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String tekst1;
		String tekst2;
		String nieuw = "";
		String nieuw2 = "";
		String eindRes;

		System.out.println("Geef tekst1 in: ");
		tekst1 = in.nextLine();
		System.out.println("Geef tekst2 in: ");
		tekst2 = in.nextLine();

		if (tekst1.length() >= 4) {
			nieuw += tekst1.substring(0, 4);
		} else {
			nieuw += tekst1.substring(0, tekst1.length());
			while (nieuw.length() < 4) {
				nieuw += "*";
			}
		}

		if (tekst2.length() >= 4) {
			for (int i = tekst2.length() - 4; i < tekst2.length(); i++) {
				nieuw2 += tekst2.charAt(i);
			}
		} else {
			for (int i = tekst2.length(); i > 0; i--) {
				nieuw2 += tekst2.charAt(i - 1);
			}
			while (nieuw2.length() < 4) {
				nieuw2 += "+";
			}
		}

		eindRes = nieuw.toUpperCase() + nieuw2.toLowerCase();
		System.out.println(eindRes);
		in.close();
	}

}
