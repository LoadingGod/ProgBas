package Hoofdstuk_6;

public class Oef_5V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			System.out.printf("%12d. kolom", i);
		}

		System.out.println();
		for (int j = 1; j <= 9; j++) {
			String s = "";
			for (int k = 1; k <= j; k++) {
				s += k;
			}
			System.out.printf("%20f \t %-20f \t %020f \t %.3f \t %n", Double.parseDouble(s), Double.parseDouble(s),
					Double.parseDouble(s), Double.parseDouble(s));
		}
	}

}
