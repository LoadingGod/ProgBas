package Hoofdstuk_4;

import java.util.*;

public class H4Oef5Optie2 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("geef het gewicht in gram");
		int gewicht = input.nextInt();
		int vermenigvuldig;
		int i = 0;
		while (i < 100){
			i++;
			vermenigvuldig = gewicht * i;
			System.out.println(i + "\t"+"\t"+vermenigvuldig);
			
		}
	}

}
