package Hoofdstuk_6;
import java.awt.*;
public class Oef_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(1, 2, 20, 30);
		Point p1 = new Point(5, 5);
		Rectangle rect2;

		System.out.println("Bevat rect1 p1 ? " + rect1.contains(p1));

		p1.x += 40;
		p1.y += 50;
		rect2 = new Rectangle(p1);
		rect2.height = 110;
		rect2.width = 100;
		System.out.printf("x en y van rect2: %d %d %n", rect2.x, rect2.y);
		System.out.println("Bevindt rect1 zich in rect2? " + rect2.contains(rect1.x, rect1.y));
		rect1.height += 80;
		rect1.width += 40;
		System.out.println("De hoogtes zijn even hoog ? " + (rect1.height == rect2.height));
	}

}
