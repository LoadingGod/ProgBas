package hoofdstuk_7;
import java.util.Scanner;
public class Oefening_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int aantPos = 0;
		int aantNeg = 0;
		int[] getalReeks = new int[10];
		int[] posReeks;
		int[] negReeks;
		int kleinste = Integer.MAX_VALUE;

		for (int i = 0; i < getalReeks.length; i++) {
			System.out.println("Geef een getal in: ");
			getalReeks[i] = in.nextInt();
			if (getalReeks[i] > 0) {
				aantPos++;
			} else {
				aantNeg++;
			}
		}

		posReeks = new int[aantPos];
		negReeks = new int[aantNeg];
		int posTel = 0;
		int negTel = 0;
		for (int i = 0; i < getalReeks.length; i++) {
			if (getalReeks[i] > 0) {
				posReeks[posTel] = getalReeks[i];
				posTel++;
			} else {
				negReeks[negTel] = getalReeks[i];
				negTel++;
			}
		}
		System.out.println("Positieve reeks: ");
		for (int n : posReeks) {
			System.out.println(n);
		}
		System.out.println("Negatieve reeks: ");
		for (int n : negReeks) {
			System.out.println(n);
			if (n < kleinste) {
				kleinste = n;
			}
		}

		System.out.println("Het kleinste getal is: " + kleinste);
		in.close();
	}

}
