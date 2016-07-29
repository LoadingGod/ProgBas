package Hoofdstuk_6;
import java.util.*;
public class Oef_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String zin;
		int posT;
		String nieuw = "";
		int zinLengte;

		System.out.print("Geef de zin in: ");
		zin = in.nextLine();
		zinLengte = zin.length();
		posT = zin.indexOf('t');
		if (posT == -1) {
			posT = zin.indexOf('T');
		}
		if (posT == -1) {
			System.out.println("Er is geen letter t of T in dit woord");
		} else {
			if (zinLengte % 2 == 0) {
				nieuw = zin.substring(0, posT) + zin.substring(posT, zinLengte).toLowerCase();
			} else {
				nieuw = zin.substring(0, posT) + zin.substring(posT, zinLengte).toUpperCase();
			}
		}
		System.out.println(nieuw);
		in.close();
	}

}
