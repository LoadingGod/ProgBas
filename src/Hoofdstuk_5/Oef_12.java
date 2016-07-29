package Hoofdstuk_5;
import java.util.Scanner;
public class Oef_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double maanPerc;
		double marsPerc;
		double jupiterPerc;

		System.out.println("Geef het percentage van de maan: ");
		maanPerc = in.nextDouble();
		System.out.println("Geef het percentage van jupiter: ");
		jupiterPerc = in.nextDouble();
		System.out.println("Geef het percentage van mars: ");
		marsPerc = in.nextDouble();

		System.out.println("\tAarde\t Maan\t Jupiter\tMars");

		for (int i = 50; i <= 120; i += 5) {
			System.out.println("\t" + i + "\t" + (int) (i * maanPerc + 0.5) + "\t" + (int) (i * jupiterPerc + 0.5)
					+ "\t \t" + (int) (i * marsPerc + 0.5));
		}
		in.close();
	}

}
