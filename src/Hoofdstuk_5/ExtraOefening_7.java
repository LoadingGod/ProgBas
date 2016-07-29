package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int btwCode;
		double prijsIncBtw;
		double btwPerc;
		Scanner in = new Scanner(System.in);
		System.out.println("Geef de btwCode in: ");
		btwCode = in.nextInt();
		System.out.println("Geef de prijs inclusief btw in: ");
		prijsIncBtw = in.nextDouble();

		if (btwCode == 1) {
			btwPerc = 0.6;
		} else if (btwCode == 2) {
			btwPerc = 0.17;
		} else if (btwCode == 3) {
			btwPerc = 0.19;
		} else if (btwCode == 4) {
			btwPerc = 0.25;
		} else if (btwCode == 5) {
			btwPerc = 0.33;
		} else {
			btwPerc = 0.21;
		}

		prijsIncBtw = 0; // Ik ken de formule niet
		System.out.println("Het btw percentage is " + btwPerc);
		System.out.println("Prijs inclusief btz: " + prijsIncBtw);

		in.close();
	}

}
