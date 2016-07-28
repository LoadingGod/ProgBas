package Hoofdstuk_4;

import java.util.*;

public class H4Oef5 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Geef het gewicht in van een appel in gram");
		int gewicht = input.nextInt();
		int vermenigvuldig;
		System.out.println("aantal appels" + "\t"+"gewicht in gram");
		for (int i = 1;i < 101; i++){
			vermenigvuldig = gewicht * i;
			System.out.println(i + "\t"+ "\t" + vermenigvuldig + "\n");
		}
		}
	}
