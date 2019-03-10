
public class Spin extends RisicoRijkeAttractie {
	String naam;
	static double prijs = 2.25;
	static double omzet;
	int oppervlakte;
	static int spinKaarten;
	boolean b = false;
	static int draaiLimiet = 0;

	Spin(String naam) {
		this.naam = naam;

	}

	void draaien() throws onderhoudException {
		while (b == false) {
			opstellingsKeuring();
			b = true;
		}

		try {
			if (draaiLimiet < 5) {
				System.out.println("de Spin draait");
				spinKaarten++;
				totaalKaarten++;
				draaiLimiet++;
				omzet = omzet + prijs;
				System.out.println("Draailimiet: " + draaiLimiet);

			} else if (draaiLimiet == 5) {
				throw new onderhoudException();
			}
		}

		catch (onderhoudException s) {
			System.err.println(s + " de " + naam + " heeft onderhoud nodig, stuur een monteur langs");
		}
	}
}
