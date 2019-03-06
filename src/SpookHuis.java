
public class SpookHuis extends Attractie {
	String naam;
	static double prijs = 3.20;
	static double omzet;
	int oppervlakte;
	static int spookHuisKaarten;

	SpookHuis(String naam) {
		this.naam = naam;

	}

	void draaien() {
		System.out.println("Het Spookhuis draait");
		spookHuisKaarten++;
		totaalKaarten++;
		omzet = omzet + prijs;
	}

}
