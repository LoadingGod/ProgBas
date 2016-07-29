package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int a, b, c;
		int gr1, gr2, gr3;

		a = rand.nextInt(100);
		System.out.println("a=" + a);
		b = rand.nextInt(100);
		System.out.println("b=" + b);
		c = rand.nextInt(100);
		System.out.println("c=" + c);

		if (a > b) {
			if (a > c) {
				gr1 = a;
				if (b > c) {
					gr2 = b;
					gr3 = c;
				} else {
					gr2 = c;
					gr3 = b;
				}

			} else {
				gr1 = c;
				gr2 = a;
				gr3 = b;
			}
		} else {
			if (a > c) {
				gr1 = b;
				gr2 = a;
				gr3 = c;
			} else {
				if (b > c) {
					gr1 = b;
					gr2 = c;
					gr3 = a;
				} else {
					gr1 = c;
					gr2 = b;
					gr3 = a;
				}
			}
		}

		System.out.println("Grootste: " + gr1);
		System.out.println("Tweede Grootste: " + gr2);
		System.out.println("Derde Grootste: " + gr3);
	}

}
