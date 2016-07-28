package Hoofdstuk_4;

	import java.util.*;

	public class H4Oef2 {
	    private static Scanner input = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int a;
	        int b;
	        int grootsteGetal;
	        int vermenigvuldigdGetal;
	        int kleinsteGetal;
	        int aftrekking;
	        
	        a = input.nextInt();
	        b = input.nextInt();
	        if (a > b) {
	            grootsteGetal = a;
	            kleinsteGetal = b;
	        } else {
	            grootsteGetal = b;
	            kleinsteGetal = a;
	        }
	        aftrekking = grootsteGetal - kleinsteGetal;
	        vermenigvuldigdGetal = aftrekking * 5;
	        System.out.println( grootsteGetal + " - " + kleinsteGetal + " = " + aftrekking + "\n" + aftrekking + " x 5" + " = " + vermenigvuldigdGetal);
	    }
	}
