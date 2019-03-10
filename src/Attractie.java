
public class Attractie {

	static int totaalKaarten;

	void draaien() throws Exception {
		System.out.println("De attractie draait");
	}

	void totaalKaarten() {

		totaalKaarten = BotsAuto.botsautoKaarten + Spin.spinKaarten + Hawaii.hawaiiKaarten
				+ LadderKlimmen.ladderKlimmenKaarten + SpiegelPaleis.spiegelPaleisKaarten + SpookHuis.spookHuisKaarten;

		System.out.println("Een overzicht van de totaal verkochte kaarten" + "\nen de verkochte kaarten per categorie");
		System.out.println("Totaal aantal kaarten: " + totaalKaarten);
		System.out.println("Totaal aantal botsauto: " + BotsAuto.botsautoKaarten);
		System.out.println("Totaal aantal spin: " + Spin.spinKaarten);
		System.out.println("Totaal aantal hawaii: " + Hawaii.hawaiiKaarten);
		System.out.println("Totaal aantal ladderklimmen: " + LadderKlimmen.ladderKlimmenKaarten);
		System.out.println("Totaal aantal spiegelpaleis: " + SpiegelPaleis.spiegelPaleisKaarten);
		System.out.println("Totaal aantal spookhuis: " + SpookHuis.spookHuisKaarten);
	}

}
