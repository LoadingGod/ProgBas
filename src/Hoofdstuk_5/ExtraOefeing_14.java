package Hoofdstuk_5;
import java.util.*;
public class ExtraOefeing_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gesl;
		int afstand;
		double percSlechteConditie;
		int telSlechtCon = 0;
		int totaalWerkenmers = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Geef het geslacht in: ");
		gesl = in.nextInt();

		while (gesl > 0 && gesl <= 2) {
			double conditie;
			int meters;
			System.out.println("Geef de afstand in km: ");
			afstand = in.nextInt();
			meters = afstand * 1000;

			conditie = (meters - 504.9) / 44.73; //////////////////

			if (gesl == 2 && conditie < 29 || gesl == 1 && conditie < 36) {
				telSlechtCon++;
			}
			System.out.println("Conditie: " + conditie);
			totaalWerkenmers++;
			System.out.println("Geef het geslacht in: ");
			gesl = in.nextInt();
		}

		percSlechteConditie = (double) telSlechtCon / totaalWerkenmers * 100;
		System.out.println("Percentage slechte conditie: " + percSlechteConditie + "%");
		in.close();
	}

}
