package hoofdstuk_8;

import java.util.Scanner;

public class Bankrekening {
	
	private String rekeningnr, naam;
	private double saldo, renteperc;
	private Scanner keyboard = new Scanner(System.in);
	
	public Bankrekening(String rekeningnr, String naam, double saldo, double renteperc) {
		this.rekeningnr = rekeningnr;
		this.naam = naam;
		if (saldo < 0) {
			saldo = 0;
		}
		this.saldo = saldo;
		if (renteperc < 0) {
			renteperc = 0;
		}
		this.renteperc = renteperc;
	}
	
	public Bankrekening() {
		this("geen", "onbekend", 1.2, 0);
	}
	
	//getters
	public double getSaldo() {
		return saldo;
	}
	//setters
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public void setRekeningnummer(String rekeningnr) {
		this.rekeningnr = rekeningnr;
	}
	public void stort(double bed) {
		if(controle()) {
		saldo += bed;
		}
		System.out.printf("na storting van %f euro", bed);
		print();
	}
	public void neemOp(double afname) {
		if (controle()) {
			if (afname > saldo) {
				System.out.println("U mag enkel " + saldo + " opnemen");
				afname = saldo;
				System.out.println("u kan geen geld opnemen");
			}
		saldo -= afname;
		System.out.printf("na opname van %f euro", afname);
		print();
		}
	}
	public void verrichting(double... bedrag) {
		if (controle()) {
		for(double b: bedrag) {
			if (b > 0){
				stort(b);
				System.out.printf("na storting van %f euro", bedrag);
				print();
			} else {				
				neemOp(b);
				System.out.printf("na opname van %f euro", bedrag);
				print();
			}
		}
		}
	}
	public void schrijfRenteBij(double rente) {
		if(controle()) {
		rente = renteperc * saldo;
		saldo += rente;
		System.out.printf("rente wordt bijgeschreven voor %f euro", rente);
		print();
		}
	}
	public void print() {
		System.out.printf("Saldo op spaarrekening %s op naam van %s bedraagt %f euro", rekeningnr, naam, saldo);
	}
	private boolean controle() {
		if(rekeningnr.equals("geen")) {
			System.out.println("Sorry, geen rekeningnummer");
			return false;
		} else {
			if (naam.equals("")) {
				System.out.println("Voer eerst een naam in");
				naam = keyboard.nextLine();
				return true;
			} else {
				return true;
			}
		}
	}
	
}
