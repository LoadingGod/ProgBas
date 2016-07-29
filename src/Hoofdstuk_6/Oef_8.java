package Hoofdstuk_6;
import java.util.Random;
import java.awt.Rectangle;
public class Oef_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		StringBuilder rechthoekCollection = new StringBuilder();
		StringBuilder outStream = new StringBuilder();
		Rectangle grootste = new Rectangle(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
		int nrGrootste = 0;

		for (int i = 0; i < 20; i++) {
			int x = rand.nextInt(100);
			int y = rand.nextInt(100);
			int h = rand.nextInt(70) + 1;
			int b = rand.nextInt(70) + 1;
			final Rectangle r = new Rectangle(x, y, h, b);
			final Rectangle r100 = new Rectangle(100, 100, 100, 100);
			rechthoekCollection.append("Rechthoek " + (i + 1) + "\t" + x + "\t" + y + "\t" + h + "\t" + b + "\t");
			if (r100.contains(r)) {
				rechthoekCollection.append("geplaatst");
				outStream.append("Recthoek " + (i + 1) + " toegevoegd \n");
			}
			rechthoekCollection.append("\n");
			if (r.width * r.height > grootste.width * grootste.height) {
				grootste = r;
				nrGrootste = i + 1;
			}
		}

		System.out.println("Gemaakte rechthoeken: ");
		System.out.println("\t \t x \t y \t h \t b");
		System.out.println(rechthoekCollection.toString());
		System.out.println(outStream.toString());
		System.out.println("Grootste rechthoek: " + nrGrootste);
	}

}
