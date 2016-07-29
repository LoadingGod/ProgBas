package Hoofdstuk_6;
import java.util.*;
public class Oef_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char reeksKar = 'A';

		for (int i = 0; i <= 5; i++) {
			System.out.println("Reeks " + reeksKar);
			for (int j = 1; j <= 5; j++) {
				Random rand = new Random();
				int randG1 = rand.nextInt(21 - 5) + 5;
				int randG2 = rand.nextInt(6);
				System.out.printf("%d) %d - %d =  %n", j, randG1, randG2);
			}
			reeksKar += 1;
		}
	}

}
