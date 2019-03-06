
public class BotsAuto extends Attractie {
	String naam;
	static double prijs = 2.50;
	static double omzet;
	int oppervlakte;
	static int botsautoKaarten;

	BotsAuto(String naam) {
		this.naam = naam;
	
	}

	void draaien() {

		System.out.println("De Botsauto draait");
		botsautoKaarten++;
		totaalKaarten++;
		omzet = omzet + prijs;
	}

}
