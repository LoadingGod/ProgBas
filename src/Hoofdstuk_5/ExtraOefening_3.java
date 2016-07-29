package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int lengte;
		int breedte;
		int diepte;
		final int PERC_WATER = 98;
		final int PERC_ONTSMETTING = 2;
		int volume;
		double percWater;
		double percOntsmet;

		System.out.println("Geef de lengte van het zwembad: ");
		lengte = in.nextInt();
		System.out.println("Geef de lengte van het breedte: ");
		breedte = in.nextInt();
		System.out.println("Geef de lengte van het diepte: ");
		diepte = in.nextInt();

		volume = lengte * breedte * diepte * 1000;

		percWater = volume / 100.0 * PERC_WATER;
		percOntsmet = volume / 100.0 * PERC_ONTSMETTING;

		System.out.println("Volume zwembad: " + volume + " liter");
		System.out.println("Aantal liter water: " + percWater);
		System.out.println("Aantal liter ontsmetting: " + percOntsmet);
		in.close();

	}

}
