package Hoofdstuk_5;

import java.util.*;

public class Oef_4 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int tijd = input.nextInt();
		int uren;
		int minuten;
		int seconden;
		uren = tijd / 3600;
		minuten = (tijd - (uren *3600))/60;
		seconden = tijd - (uren *3600) - (minuten *60);
		System.out.println(uren + " "+ minuten + " "+ seconden);
		
	}
}
