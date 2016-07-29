package Hoofdstuk_5;
import java.util.*;
public class Oef_10 {
private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jaarwedde");
		double jaarWedde = input.nextDouble();
		System.out.println("beoordelingscode");
		int beoordelingscode = input.nextInt();
		double premieBedrag = jaarWedde/20;
		double bonus = 0;
		switch (beoordelingscode){
		case 1: bonus = premieBedrag * 1; break;
		case 2: bonus = premieBedrag * 1.10; break;
		case 3: bonus = premieBedrag * 1.20; break;
		case 4: bonus = premieBedrag * 1.30; break;
		}
		System.out.println(bonus);
	}

}
