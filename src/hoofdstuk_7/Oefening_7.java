package hoofdstuk_7;

public class Oefening_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tShirts[][] = { { 45, 102, 19, 55 }, { 79, 47, 58, 22, 46 }, { 109, 33, 112 } };
		String[] kleuren = { "rood", "wit", "blauw", "oranje", "zwart" };
		String[] maten = { "small", "medium", "large" };
		int[] totalen = new int[3];

		for (int i = 0; i < tShirts.length; i++) {
			for (int j = 0; j < tShirts[i].length; j++) {
				totalen[i] += tShirts[i][j];
			}
		}

		for (int i = 0; i < tShirts.length; i++) { ////////////////////
			for (int j = 0; j < tShirts[i].length; j++) {
				if (tShirts[i][j] < (totalen[i] / 3)) {
					System.out.println(kleuren[j] + " " + maten[i] + " moet bijbesteld worden.");
				}
			}
		}
	}

}
