package hoofdstuk_7;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Scanner;
public class Oefening_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int AANTAL_PUNTEN = 5;
		int[] xCoords = new int[AANTAL_PUNTEN];
		int[] yCoords = new int[AANTAL_PUNTEN];
		Point[] puntArray = new Point[AANTAL_PUNTEN];
		Rectangle[] rects = new Rectangle[AANTAL_PUNTEN];

		for (int i = 0; i < AANTAL_PUNTEN; i++) {
			System.out.println("Geef het x coordinaat in: ");
			xCoords[i] = in.nextInt();
			System.out.println("Geef het y coordinaat in: ");
			yCoords[i] = in.nextInt();
			puntArray[i] = new Point(xCoords[i], yCoords[i]);
			rects[i] = new Rectangle(puntArray[i]);
			rects[i].setSize(1, 3);
		}

		rects[AANTAL_PUNTEN - 1].setBounds(0, 0, 2, 3);

		for (int i = 0; i < rects.length; i++) {
			System.out.printf("Rechthoek nr %d: x = %d y = %d h = %d b = %d %n", i + 1, rects[i].x, rects[i].y,
					rects[i].height, rects[i].width);
		}

		for (int i = 0; i < rects.length; i++) {
			System.out.printf("Rect nummer:  %d: ", i + 1);
			for (int j = 0; j < AANTAL_PUNTEN; j++) {
				if (rects[i].contains(puntArray[j])) {
					System.out.printf("punt %d ", j + 1);
				}
			}
			System.out.println();

		}

		System.out.print("Recthoeken die de laatste rechthoek snijden: ");
		for (int i = 0; i < rects.length - 1; i++) {
			if (rects[i].intersects(rects[AANTAL_PUNTEN - 1])) {
				System.out.print("Rechthoek " + i + "\t");
			}
		}

		in.close();
	}

}
