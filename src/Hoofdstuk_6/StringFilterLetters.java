package Hoofdstuk_6;

import java.util.Scanner;

public class StringFilterLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String test = "";
		String output = new String("");
		System.out.println("geef een string in");
		test = input.next();
		for (int i = 0; i < test.length(); i++){
			if (Character.isLetter(test.charAt(i))){
				output = output + test.charAt(i);
			}
		}
		System.out.println(output);
		input.close();
	}

}
