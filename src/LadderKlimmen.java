
public class LadderKlimmen extends Attractie implements GokAttractie {
	String naam;
	static double prijs = 5;
	static double omzet;
	int oppervlakte;
	static int ladderKlimmenKaarten;
	static int draaiLimiet = 0;
	static double omzetNaBelasting;

	LadderKlimmen(String naam) {
		this.naam = naam;

	}

//	public int kansSpelBelastingBetalen() {
//		// 30% van je de omzet van LadderKlimmen betalen als kansspelbelasting
//		int belasting = 0;
//		
//
//		return belasting;
//		
//	}

	void draaien() {
		System.out.println("Ladderklimmen draait");
		ladderKlimmenKaarten++;
		totaalKaarten++;
		omzet = omzet + prijs;
		draaiLimiet++;
		System.out.println("Ladderklimmen kaarten verkocht: " + ladderKlimmenKaarten);
		System.out.println("totaal kaarten verkocht: " + totaalKaarten);
		System.out.println("Omzet: " + omzet);
		System.out.println("Draailimiet: " + draaiLimiet);
		if (draaiLimiet == 15) {
			GokAttractie.kansSpelBelastingBetalen();
			draaiLimiet = 0;
			omzetNaBelasting = omzetNaBelasting + omzet;
			omzet = 0;
			System.out.println("Omzet: " + omzet);
			System.out.println("Omzet na belasting: " + omzetNaBelasting);
		}
	}

}
