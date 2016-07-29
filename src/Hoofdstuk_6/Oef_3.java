package Hoofdstuk_6;
import java.util.*;
public class Oef_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String zin;
		String reverse = "";

		System.out.println("Geef je zin in: ");
		zin = in.nextLine();
		for (int i = zin.length(); i > 0; i--) {
			reverse += zin.charAt(i - 1);
		}
		System.out.println(reverse);
		in.close();
	}

}
