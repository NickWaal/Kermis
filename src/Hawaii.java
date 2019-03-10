
public class Hawaii extends RisicoRijkeAttractie {
	String naam;
	static double prijs = 2.90;
	static double omzet;
	int oppervlakte;
	boolean b = false;
	static int hawaiiKaarten;
	static int draaiLimiet = 0;

	Hawaii(String naam) {
		this.naam = naam;

	}

	void draaien() throws onderhoudException {

		while (b == false) {
			opstellingsKeuring();
			b = true;
		}

		try {
			if (draaiLimiet < 10) {
				System.out.println("Hawaii draait");
				hawaiiKaarten++;
				totaalKaarten++;
				draaiLimiet++;
				omzet = omzet + prijs;
				System.out.println("Draailimiet: " + draaiLimiet);

			} else if (draaiLimiet == 10) {
				throw new onderhoudException();
			}
		}

		catch (onderhoudException s) {
			System.err.println(s + " " + naam + " heeft onderhoud nodig, stuur een monteur langs");
		}
	}
}
