
public class Spin extends RisicoRijkeAttractie  {
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

	void draaien() throws Exception {
		if(b == false) {
		opstellingsKeuring();
		b =true;
		}else{
		System.out.println("De spin draait");
		spinKaarten++;
		totaalKaarten++;
		draaiLimiet++;
		omzet = omzet + prijs;
		System.out.println("Draailimiet: " + draaiLimiet);
		if(draaiLimiet == 5) {
			System.out.println("De spin heeft een onderhoudsbeurt nodig");
		}else if(draaiLimiet > 5) {
			throw new Exception("De spin moet onderhouden worden. Stuur er een monteur naar toe");
		}
	}
	}
}
