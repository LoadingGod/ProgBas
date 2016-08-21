package opdrachten;

public class RectangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program uses a rectangle");
		Rectangle rect = new Rectangle();

		System.out.println("rect1: " + rect.x + "," + rect.y + "," + rect.height + "," + rect.width);

		rect.x = 5;
		rect.y = 10;
		rect.height = 12;
		rect.width = 12;

		System.out.println("rect1: " + rect.x + "," + rect.y + "," + rect.height + "," + rect.width);

		Rectangle rect2 = new Rectangle();

		rect2.x = 7;
		rect2.y = 8;
		rect2.height = 9;
		rect2.width = 11;

		System.out.println("rect2: " + rect2.x + "," + rect2.y + "," + rect2.height + "," + rect2.width);

		rect2.grow(1, 1);
		System.out.println("rect2: " + rect2.x + "," + rect2.y + "," + rect2.height + "," + rect2.width);

		System.out.println("oppervlakte: " + rect2.getArea());
		System.out.println("omtrek: " + rect2.getPerimeter());
	}

}
