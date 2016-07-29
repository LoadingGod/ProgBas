package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jaar;
		int maand;
		int dag;
		int hjaar, hmaand, hdag;
		int lft;
		Scanner in = new Scanner(System.in);

		System.out.println("Geef je geboorte jaar in: ");
		jaar = in.nextInt();
		System.out.println("Geef je geboorte maand in: ");
		maand = in.nextInt();
		System.out.println("Geef je geboorte dag in: ");
		dag = in.nextInt();
		System.out.println("Geef het huidig jaar in: ");
		hjaar = in.nextInt();
		System.out.println("Geef de huide maand in: ");
		hmaand = in.nextInt();
		System.out.println("Geef de huide dag in: ");
		hdag = in.nextInt();

		lft = hjaar - jaar - 1;

		if (hmaand == maand) {
			if (hdag > dag) {
				lft += 1;
			}
		} else if (hmaand > maand) {
			lft += 1;
		}
		System.out.println(lft);
		in.close();
	}

}
