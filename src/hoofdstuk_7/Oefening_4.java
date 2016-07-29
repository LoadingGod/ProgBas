package hoofdstuk_7;
import java.util.Scanner;
public class Oefening_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] namenLijst = { "An Janssen", "Bart Vriends", "Andries Michiels", "Inge kaas" };
		int[] puntenLijst = new int[namenLijst.length];
		int keuze;
		int meesteStemmen = 0;
		int gewonnen = 0;

		System.out.println("Geef je keuze in: ");
		keuze = in.nextInt();
		while (keuze > 0) {
			puntenLijst[keuze - 1] += 1;
			System.out.println("Geef je keuze in: ");
			keuze = in.nextInt();
		}

		for (int i = 0; i < namenLijst.length; i++) {
			System.out.printf("%s heeft %d stemmen %n", namenLijst[i], puntenLijst[i]);
			if (puntenLijst[i] > meesteStemmen) {
				meesteStemmen = puntenLijst[i];
				gewonnen = i;
			}
		}
		System.out.printf("%s heeft de meeste stemmen!", namenLijst[gewonnen]);
		in.close();
	}

}
