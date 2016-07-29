package hoofdstuk_8;

public class PersoonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoon p = new Persoon();
		p.setNaam("Reinert");
		p.setVoornaam("Sacha");
		p.setGeboorteJaar(1995);
		p.setGewicht(86);
		p.setLengte(1.86);
		System.out.println(p.getVoornaam() + "," + p.getNaam());
		p.print();
		p.printBMI();
		p.voegNamentoe("Henry", "Richard");
		p.print();
		System.out.println("Leeftijd: " + p.getLeeftijd());
	}

}
