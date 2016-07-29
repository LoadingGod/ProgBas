package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double rentePerc;
		double beginKapitaal;
		double eindKapitaal;
		int jaren = 0;

		System.out.println("Geef het rente percentage: ");
		rentePerc = in.nextDouble();
		System.out.println("Geef het begin kapitaal: ");
		beginKapitaal = in.nextDouble();

		eindKapitaal = beginKapitaal * 2;

		while (beginKapitaal < eindKapitaal) {

			beginKapitaal = beginKapitaal * Math.pow((1 + rentePerc), jaren);
			System.out.println("Begin kapitaal jaar " + jaren + "\t" + beginKapitaal);
			jaren++;
		}

		System.out.println("Het duurt " + jaren + " jaren");

		in.close();
	}

}
