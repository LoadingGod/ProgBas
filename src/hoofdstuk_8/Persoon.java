package hoofdstuk_8;
import java.time.LocalDate;
public class Persoon {
	private String voornaam;
	private String naam;
	private double lengte;
	private double gewicht;
	private int geboorteJaar;

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

	public int getGeboorteJaar() {
		return geboorteJaar;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setLengte(double lengte) {
		this.lengte = lengte;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public void setGeboorteJaar(int geboorteJaar) {
		this.geboorteJaar = geboorteJaar;
	}

	public int getLeeftijd() {
		return LocalDate.now().getYear() - geboorteJaar;
	}

	public void print() {
		System.out.println("Deze persoon is: " + voornaam + " " + naam);
		System.out.printf("%-14s : %.1f %n", "Gewicht", gewicht);
		System.out.printf("%-14s : %.1f %n", "Lengte", lengte);
		System.out.printf("%-14s : %d %n", "Geboortejaar", geboorteJaar);
	}

	public void printBMI() {
		double bmi;
		String out;
		bmi = gewicht / (lengte * lengte);
		bmi = (int) (bmi * 10 + 0.5) / 10.0;

		if (bmi < 18) {
			out = "ondergewicht";
		} else if (bmi < 25) {
			out = "ok";
		} else if (bmi < 30) {
			out = "overgewicht";
		} else if (bmi < 40) {
			out = "obesitas";
		} else {
			out = "ziekelijk overgewicht";
		}
		System.out.println("Bmi: " + bmi + "\t" + out);
	}

	public void voegNamentoe(String... namen) {

		for (String s : namen) {
			voornaam += " " + s + "";
		}
	}
}
