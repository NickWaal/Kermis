
public class Hawaii extends RisicoRijkeAttractie {
	String naam;
	static double prijs = 2.90;
	static double omzet;
	int oppervlakte;
	static int hawaiiKaarten;
	static int draaiLimiet = 0;
	
	Hawaii(String naam) {
		this.naam = naam;

	}

	void draaien() throws Exception {
		System.out.println("Hawaii draait");
		hawaiiKaarten++;
		totaalKaarten++;
		draaiLimiet++;
		omzet = omzet + prijs;
		System.out.println("Draailimiet: " + draaiLimiet);
		if(draaiLimiet == 10) {
			System.out.println("Hawaii heeft een onderhoudsbeurt nodig");
		}else if(draaiLimiet > 10) {
			throw new Exception("Hawaii moet onderhouden worden. Stuur er een monteur naar toe");
		}
	}
}
