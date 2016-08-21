package hoofdstuk_8;

public class Persoon {
	
	private String voornaam;
	private String naam;
	private double lengte; //meter
	private double gewicht; //kg, voorzie decimalen
	private int geboortejaar;
	
	//contstructors
	public Persoon(String naam, String voornaam) {
		this.naam = naam;
		this.voornaam = voornaam;
	}
	//defaultconstructor
	public Persoon() {
		this("onbekend", "onbekend"); //this betekend in dit geval andere constructor oproepen
	}
	//copyconstructor
	public Persoon(Persoon persObj) {
		this(persObj.naam, persObj.voornaam);
		/*this.voornaam = persObj.voornaam;
		this.naam = persObj.naam; */
		lengte = persObj.lengte;
		gewicht = persObj.gewicht;
		geboortejaar = persObj.geboortejaar;
	}
	//methods
	//getters
	public String getVoornaam() {
		return voornaam;
	}
	public String getNaam() {
		return naam;
	}
	public double getLengte() {
		return lengte;
	}
	public double getGewicht() {
		return gewicht;
	}
	public int getGeboortejaar() {
		return geboortejaar;
	}
	public int getLeeftijd() {
		int leeftijd = 2015 - getGeboortejaar();
		return leeftijd;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public void setLengte(double lengte) {
		if(lengte > 2.4) {
			this.lengte = 2.4;
		} else {
			this.lengte = lengte;
		}
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	public void setGeboortejaar(int geboortejaar) {
		this.geboortejaar = geboortejaar;
	}
	public void printBMI() {
		double bmi = gewicht / (lengte*lengte);
		if (bmi < 18) {
			System.out.println("ondergewicht");
		} else if (bmi < 25) {
			System.out.println("normaal");
		} else if (bmi < 30) {
			System.out.println("overgewicht");
		} else if (bmi < 40) {
			System.out.println("obesitas");
		} else {
			System.out.println("morbide obesitas");
		}
	}
	
	public void voegVoornamenToe(String... namen){
        StringBuilder hulp = new StringBuilder(voornaam);
        for (String s : namen) {
                hulp.append(" " + s);
        }
        voornaam = hulp.toString();
}
	public void groei(){		
		setLengte(lengte + 0.01);
	}
	
	public void groei(int growth){
	
		setLengte(lengte+growth/100.0);
	}
	
}
