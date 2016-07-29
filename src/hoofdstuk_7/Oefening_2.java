package hoofdstuk_7;
import java.util.Random;
public class Oefening_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] getalReeks = new int[500];
		long som = 0;

		for (int i = 0; i < getalReeks.length; i++) {
			Random rand = new Random();
			getalReeks[i] = rand.nextInt();
			if (getalReeks[i] > 100) {
				som += getalReeks[i];
			}
		}

		System.out.printf("De som is %d.", som);
	}

}
