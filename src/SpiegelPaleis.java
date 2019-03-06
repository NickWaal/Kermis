
public class SpiegelPaleis extends Attractie {
	String naam;
	static double prijs = 2.75;
	static double omzet;
	int oppervlakte;
	static int spiegelPaleisKaarten;

	SpiegelPaleis(String naam) {
		this.naam = naam;

	}

	void draaien() {
		System.out.println("Het Spiegelpaleis draait");
		spiegelPaleisKaarten++;
		totaalKaarten++;
		omzet = omzet + prijs;
	}

}
