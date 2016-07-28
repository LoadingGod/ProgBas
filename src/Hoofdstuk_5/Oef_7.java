package Hoofdstuk_5;

import java.util.Scanner;

public class Oef_7 {
private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lengte afstand vlucht in km");
		int lengte = input.nextInt();
		System.out.println("soort vlucht of klasse");
		int klasse = input.nextInt();
		double korting = 0;
		switch (klasse){
		case 1: korting = 1; break;
		case 2: korting = 0.8; break;
		case 3: korting = 0.7; break;
		}
		double kostVlucht;
		if (lengte <1000){
			kostVlucht = lengte * 0.25;
		}else if(lengte >= 1000 && lengte < 2999){
			kostVlucht = lengte * 0.20;
		}else{
			kostVlucht = lengte * 0.12;
		}
		double prijs = kostVlucht*korting;
		System.out.println(kostVlucht);
		System.out.println(prijs);
	}

}
