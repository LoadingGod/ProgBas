package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a;
		int b;
		int c;
		int temp;

		System.out.println("Geef een waarde voor getal a: ");
		a = in.nextInt();
		System.out.println("Geef een waarde voor getal b: ");
		b = in.nextInt();
		System.out.println("Geef een waarde voor getal c: ");
		c = in.nextInt();

		temp = a;
		a = b;
		b = c;
		c = temp;

		System.out.println("a " + a + " b " + b + " c " + c);
		in.close();

	}

}
