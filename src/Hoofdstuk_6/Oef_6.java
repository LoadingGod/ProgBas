package Hoofdstuk_6;
import java.awt.Point;
public class Oef_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(5, 8);
		Point p2 = new Point(p1.x, p1.y);

		System.out.println(p1.equals(p2));
		p2.x += 2;
		p2.y += 3;
		System.out.printf("de x en y waarde van p1 zijn %d %d %n", p1.x, p1.y);
		System.out.printf("de x en y waarde van p2 zijn %d %d", p2.x, p2.y);

	}

}
