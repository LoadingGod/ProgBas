package Hoofdstuk_5;

public class ExtraOefening_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vorigGetal = 1;
		int vorigGetal2 = 1;
		System.out.println(vorigGetal);
		System.out.println(vorigGetal2);

		for (int i = 0; i < 1500; i++) {

			if (i == vorigGetal2 + vorigGetal) {
				vorigGetal = i;
				vorigGetal2 = i - vorigGetal2;
				System.out.println(i);
			}
		}
	}

}
