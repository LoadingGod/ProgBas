package Hoofdstuk_5;

import java.util.*;

public class Oef_5 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int bedrag = input.nextInt();
		int aantal;
		int rest;
		aantal = bedrag / 20;
		rest = bedrag % 20;
		System.out.println(aantal + " briefjes van 20" + "/n" +rest +" euro");
	}
}
