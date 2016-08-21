package examenProgBasKaart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class KaartenGame {

	public static void main(String[] args) throws IOException {


		String taal;
		FileReader file = null;
		String[] kaartenKindArray = new String[4];
		String[] kaartenValueArray = new String[13];
		String[] fullArray = new String[52];
		int teller = 0;
		int aantal = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("In welke taal wilt u spelen? Kies NL voor nederlands, EN voor engels");
		taal = input.nextLine();

		if (taal.equals("EN")) {
			file = new FileReader("cards.txt");
		} else {
			file = new FileReader("kaarten.txt");
		}

		BufferedReader reader = new BufferedReader(file);

		for (int i = 0; i < 4; i++) {
			kaartenKindArray[i] = reader.readLine();
			char woord = kaartenKindArray[i].charAt(0);
			woord = Character.toUpperCase(woord);
			kaartenKindArray[i] = woord + kaartenKindArray[i].substring(1);
		}

		for (int j = 0; j < 13; j++) {
			kaartenValueArray[j] = reader.readLine();
		}
		
		reader.close();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (taal.equals("NL")) {
					fullArray[teller] = kaartenKindArray[i] + " " + kaartenValueArray[j];
					teller++;
				} else {
					fullArray[teller] = kaartenValueArray[j] + " Of " + kaartenKindArray[i];
					teller++;
				}

			}
		}
		//debug
		System.out.println("*********** DEBUG MESSAGE *************");
		for (int i = 0; i < 52; i++) {
			System.out.println(fullArray[i]);
		}
		System.out.println("************END DEBUG ****************");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		shuffle(fullArray);
		System.out.println("*********** DEBUG MESSAGE *************");
		for(int i = 0; i < 52;i++)
		{
			System.out.println(fullArray[i]);
		}
		System.out.println("************END DEBUG ****************");

		System.out.println(); //regel witruimte
		System.out.println(); //regel witruimte
		
		if (taal.equals("NL")) {
			System.out.println("Hoeveel kaarten wens je te delen?");
			aantal = input.nextInt();
		}
		else
		{
			System.out.println("How many cards you want to deal? (0=end)");
			aantal = input.nextInt();
		}
		
		
		
		while(aantal != 0)
		{
			shuffle(fullArray);
			if (taal.equals("NL")) {
				System.out.println("De eerste " + aantal +  " gedeelde kaarten zijn:");
			}
			else
			{
				System.out.println("The first " + aantal + " cards of the shuffled deck of cards: ");
				
			}
			
			System.out.println(); // regel witruimte
			for(int i = 0; i < aantal ; i++)
			{
				System.out.println(fullArray[i]);
			}
			System.out.println(); //regel witruimte
			
			if (taal.equals("NL")) {
				System.out.println("Hoeveel kaarten wens je te delen?");
				aantal = input.nextInt();
			}
			else
			{
				System.out.println("How many cards you want to deal? (0=end)");
				aantal = input.nextInt();
			}
			
			
			
		}
		input.close();		
	}
	
    public static void shuffle(String[] fullArray) {
        for ( int i = fullArray.length-1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            String temp = fullArray[i];
            fullArray[i] = fullArray[rand];
            fullArray[rand] = temp;
        }
    }
	

}
