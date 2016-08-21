package hoofdstuk_8;

public class Tijdstip {
	private int uur, minuten, seconden;
	//constructors
	public Tijdstip(int uur, int minuten, int seconden) {		
		controle(uur, minuten, seconden);
	}
	public Tijdstip(int seconden) {
		controle(0,0,seconden);
	}
	public Tijdstip(Tijdstip laHeure) {
		this(laHeure.uur, laHeure.minuten, laHeure.seconden);
	}
	public Tijdstip() {
		
	}
	//getters
	public int getUur() {
		return uur;
	}

	public int getMinuten() {
		return minuten;
	}

	public int getSeconden() {
		return seconden;
	}
	//setters
	public void setUur(int uur) {
		controle(uur, minuten, seconden);
	}

	public void setMinuten(int minuten) {
		controle(uur, minuten, seconden);		
	}

	public void setSeconden(int seconden) {
		controle(uur, minuten, seconden);
	}
	public void voegUrenToe(int uur) {
		this.uur += uur;
		controle(this.uur, minuten, seconden);
	}
	public void voegUrenToe() {
		voegUrenToe(1);
	}
	public void voegMinutenToe(int minuten) {
		this.minuten = this.minuten + minuten;
		controle(uur, this.minuten, seconden);
	}
	public void voegSecondenToe(int seconden) {
		this.seconden = this.seconden + seconden;
		controle(uur, minuten, this.seconden);
	}
	private void controle(int uur, int minuten, int seconden) {
		this.seconden = seconden % 60;
		minuten += seconden/60;
		
		this.minuten = minuten % 60;				
		uur += minuten / 60;
		
		this.uur = uur % 24;
	}
	
	public void print(boolean nota) {
		if (nota) {
			if (uur>=12){
				if (uur == 12 && minuten == 0) {
					System.out.printf("%02d:%02d PM (noon)",uur, minuten);
				}
				else {
					System.out.printf("%02d:%02d PM",uur-12, minuten);
				}
			} else {
				if (uur == 0 && minuten == 0) {
					System.out.printf("%02d:%02d AM (midnight)", uur,minuten);
				}
				else {
					System.out.printf("%02d:%02d AM", uur, minuten);
				}
			}
		}
		else {
			System.out.printf("%d:%02d u",uur,minuten);
		}
	}		
	public void printTechnisch() {		
		System.out.printf("%02d:%02d:%02d", uur, minuten,  seconden); //aanvullen met nullen indien nodig
	}
	
}
