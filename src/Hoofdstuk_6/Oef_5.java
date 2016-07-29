package Hoofdstuk_6;

public class Oef_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			System.out.printf("%12d. kolom", i);
		}

		System.out.println();
		for (int j = 1; j <= 9; j++) {
			for (int i = 0; i <= 4; i++) {
				String s = "";
				for (int k = 1; k <= j; k++) {
					s += k;
				}
				switch (i) {
				case 0:
					System.out.printf("%20f \t", Double.parseDouble(s));
					break;
				case 1:
					System.out.printf("%-20f \t", Double.parseDouble(s));
					break;
				case 2:
					System.out.printf("%020f \t", Double.parseDouble(s));
					break;
				case 3:
					System.out.printf("%.3f \t", Double.parseDouble(s));
					break;
				}

			}
			System.out.println();
		}
	}

}
