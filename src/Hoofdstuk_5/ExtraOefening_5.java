package Hoofdstuk_5;
import java.util.*;
public class ExtraOefening_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int getal;
		int res;

		System.out.println("Geef een geheel getal in: ");
		getal = in.nextInt();
		res = getal % 1000;

		System.out.println("De laatste 3 cijfers: " + res);
		in.close();
	}

}
