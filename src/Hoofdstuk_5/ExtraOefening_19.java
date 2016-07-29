package Hoofdstuk_5;

public class ExtraOefening_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int som = 0;
		int tel = 2;

		for (int i = 1; i <= 23; i += 2) {
			som += Math.pow(i, tel); /////////
			tel++;
		}
		System.out.println("De totaal som is: " + som);
	}

}
