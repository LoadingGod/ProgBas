package Hoofdstuk_4;

import java.util.*;

public class extraOefening2 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		System.out.println("waarde A");
		a = input.nextInt();
		System.out.println("waarde B");
		b = input.nextInt();
		System.out.println("waarde C");
		c = input.nextInt();
		int som;
		if ((a+b)<20){
			som = a+b+c;
			System.out.println(som);
		} else{
			if ((a+b)>= 20)
				System.out.println("Te groot");
		}
	}

}
