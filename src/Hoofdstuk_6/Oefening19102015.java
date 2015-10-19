package Hoofdstuk_6;

public class Oefening19102015 {
	public static void main(String[] args){
		
		
		System.out.printf("%16s%16s%n", "meter", "voet");
		for (double m = 1; m <= 20; m += 0.5){
			System.out.printf("%16.2f%16.2f%n", m, m*3.2808399);
		}
	}

}
