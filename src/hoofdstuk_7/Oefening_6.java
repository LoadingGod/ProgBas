package hoofdstuk_7;
import java.util.Scanner;
public class Oefening_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int AANTAL_VAKKEN = 4;
		int[][] puntenArray = new int[5][AANTAL_VAKKEN];
		int[] laagstePunten = new int[AANTAL_VAKKEN];
		double[] gemiddeldePunten = new double[AANTAL_VAKKEN];
		int[] laagsteScoreStudentNr = new int[AANTAL_VAKKEN];

		for (int i = 0; i < AANTAL_VAKKEN; i++) {
			laagstePunten[i] = Integer.MAX_VALUE;
			gemiddeldePunten[i] = 0;
		}

		for (int i = 0; i < puntenArray.length; i++) {
			for (int j = 0; j < puntenArray[i].length; j++) {
				System.out.println("Geef het punt in voor stundent " + i + " voor het vak " + j);
				puntenArray[i][j] = in.nextInt();
				gemiddeldePunten[j] += puntenArray[i][j];
				if (puntenArray[i][j] < laagstePunten[j]) {
					laagstePunten[j] = puntenArray[i][j];
					laagsteScoreStudentNr[j] = i;
				}

			}
		}

		for (int i = 0; i < AANTAL_VAKKEN; i++) {
			System.out.println("Laagste punt voor vak " + i + ": " + laagstePunten[i] + " Door student nr: "
					+ laagsteScoreStudentNr[i]);
			gemiddeldePunten[i] /= 4;
			System.out.println("Gemiddeld punt voor vak " + ": " + gemiddeldePunten[i]);
		}

		in.close();
	}

}
