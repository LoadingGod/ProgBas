package Hoofdstuk_5;

import java.util.*;

public class Oef_8 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Punten examen 1");
		int examen1 = input.nextInt();
		System.out.println("Punten examen 2");
		int examen2 = input.nextInt();
		System.out.println("Punten examen 3");
		int examen3 = input.nextInt();
		int totaal = (examen1 + examen2 + examen3)/3;
		double percentage =( (double) totaal/20);
		String graad = "";
		if (percentage < 0.6){
			graad = "onvoldoende";
		}else if (percentage >= 0.6 && percentage <0.7){
			graad = "voldoende";
		}else if (percentage >= 0.7 && percentage <0.8){
			graad = "onderscheiding";
		}else if (percentage >= 0.8 && percentage <0.9){
			graad = "grote onderscheiding";
		}else if (percentage >= 0.9){
			graad = "grootste onderscheiding";
		}
		System.out.println(totaal+ "\t" + graad);
	}

}
