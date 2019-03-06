
public class LadderKlimmen extends Attractie implements GokAttractie {
	String naam;
	static double prijs = 5;
	static double omzet;
	int oppervlakte;
	static int ladderKlimmenKaarten;

	LadderKlimmen(String naam) {
		this.naam = naam;

	}

	
	public int kansSpelBelastingBetalen() {
		// 30% van je de omzet van LadderKlimmen betalen als kansspelbelasting
		int belasting = 0;
		

		return belasting;
		
	}
	
	void draaien() {
		System.out.println("Ladderklimmen draait");
		ladderKlimmenKaarten++;
		totaalKaarten++;
		omzet = omzet + prijs;
	}

}
