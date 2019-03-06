
public class Kassa {
	double totaalOmzet;
	
	void kassa() {

		totaalOmzet = BotsAuto.omzet + Spin.omzet + Hawaii.omzet 
				+ LadderKlimmen.omzet + SpiegelPaleis.omzet + SpookHuis.omzet;
		System.out.println("De totale omzet is: €" + totaalOmzet);
		System.out.println("De botsauto omzet is: €" + BotsAuto.omzet);
		System.out.println("De spin omzet is: €" + Spin.omzet);
		System.out.println("De hawaii omzet is: €" + Hawaii.omzet);
		System.out.println("De ladderklimmen omzet is: €" + LadderKlimmen.omzet);
		System.out.println("De spiegelpaleis omzet is: €" + SpiegelPaleis.omzet);
		System.out.println("De spookhuis omzet is: €" + SpookHuis.omzet);
	}
	

}
