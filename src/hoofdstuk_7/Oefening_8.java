package hoofdstuk_7;
import java.util.Scanner;
public class Oefening_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String naam;
		String[] sterrenBeelden = { "steenbok", "Waterman", "Vis", "Ram", "Stier", "Tweeling", "Kreeft", "Leeuw",
				"Maagd", "Weegschaal", "Schorpioen", "Boogschutter", "Steenbok" };

		System.out.println("Geef je naam in: ");
		naam = in.nextLine();
		while (!naam.equals("\\")) {
			String voornaam;
			int gDag;
			int gMaand;
			int maandSter;
			StringBuilder sb = new StringBuilder();

			System.out.println("Geef je voornaam in: ");
			voornaam = in.nextLine();
			System.out.println("Geef je geboorte dag in: ");
			gDag = in.nextInt();
			System.out.println("Geef je geboorte maand in: ");
			gMaand = in.nextInt();

			sb.append(voornaam.toUpperCase().charAt(0));
			sb.append(". ");
			sb.append(naam.toUpperCase());
			sb.append(" ");

			if (gDag < 21) {
				maandSter = gMaand - 1;
			} else {
				maandSter = gMaand;
			}

			sb.append(sterrenBeelden[maandSter]);

			System.out.println(sb.toString());

			System.out.println("Geef je naam in: ");
			naam = in.nextLine();
			in.nextLine();

		}

		in.close();
	}

}
