
public class Kassa {
	double totaalOmzet;

	void kassa() {

		totaalOmzet = BotsAuto.omzet + Spin.omzet + Hawaii.omzet + LadderKlimmen.omzetNaBelasting + SpiegelPaleis.omzet
				+ SpookHuis.omzet;
		System.out.println("De totale omzet na belasting is:\t €" + totaalOmzet);
		System.out.println("De botsauto omzet is:\t\t\t €" + BotsAuto.omzet);
		System.out.println("De spin omzet is:\t\t\t €" + Spin.omzet);
		System.out.println("De hawaii omzet is:\t\t\t €" + Hawaii.omzet);
		System.out.println("De ladderklimmen omzet voor belasting is:€" + LadderKlimmen.omzet);
		System.out.println("De ladderklimmen omzet na belasting is:\t €" + LadderKlimmen.omzetNaBelasting);
		System.out.println("De spiegelpaleis omzet is:\t\t €" + SpiegelPaleis.omzet);
		System.out.println("De spookhuis omzet is:\t\t\t €" + SpookHuis.omzet);
	}

}
