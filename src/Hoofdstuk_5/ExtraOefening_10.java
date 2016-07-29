package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jaar;
		boolean schrikkelJaar = false;
		Scanner in = new Scanner(System.in);
		boolean voorwaarde1 = false, voorwaarde2 = false;

		System.out.println("Geef het jaar in: "); //////////////
		jaar = in.nextInt();

		if ((jaar / 4) % 1 == 0) {
			voorwaarde1 = true;
		}
		if ((jaar / 100.0) % 1 == 0 && (jaar / 400.0) % 1 == 0) {
			voorwaarde2 = true;
		}

		if (voorwaarde1 && voorwaarde2) {
			schrikkelJaar = true;
		}

		System.out.println(schrikkelJaar);
		in.close();
	}

}
