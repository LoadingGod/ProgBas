package hoofdstuk_7;
import java.util.Scanner;
public class Oefening_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] getalReeks = new int[10];
		Scanner in = new Scanner(System.in);
		double gem;
		int som = 0;
		int kleinTel = 0;

		for (int i = 0; i < getalReeks.length; i++) {
			System.out.println("Geef een getal in: ");
			getalReeks[i] = in.nextInt();
			som += getalReeks[i];
		}
		gem = (double) som / getalReeks.length;
		System.out.printf("Het gemiddelde is: %.1f %n", gem);

		for (int i = 0; i < getalReeks.length; i++) {

			if (getalReeks[i] < gem) {
				kleinTel++;
			}
		}

		System.out.printf("%d/%d van de getallen zijn kleiner dan het gemiddelde %n", kleinTel, getalReeks.length);
		System.out.println("Dat is " + kleinTel / 10.0 * 100 + "%");

		in.close();
	}

}
