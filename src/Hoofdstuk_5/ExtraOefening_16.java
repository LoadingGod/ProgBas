package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int lengte;
		int breedte;

		System.out.println("Geef de lengte in: ");
		lengte = in.nextInt();
		System.out.println("Geef de breedte in: ");
		breedte = in.nextInt();

		for (int i = 0; i < lengte; i++) {
			for (int j = 0; j < breedte; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();

		// extra

		for (int i = 0; i < lengte; i++) {
			for (int j = 0; j < breedte; j++) {
				if (i == 0 || i == lengte - 1) {
					System.out.print("* ");
				} else if (j == (breedte - 1) || j == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		in.close();

	}

}