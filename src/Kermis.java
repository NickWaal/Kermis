import java.util.Scanner;

public class Kermis {
	Attractie bots = new BotsAuto("Botsauto");
	Attractie spin = new Spin("spin");
	Attractie spie = new SpiegelPaleis("spiegelpaleis");
	Attractie spook = new SpookHuis("spookhuis");
	Attractie ha = new Hawaii("hawaii");
	Attractie ladder = new LadderKlimmen("ladderklimmen");
	Attractie att = new Attractie();
	Kassa k = new Kassa();
	Monteur m = new Monteur();

	boolean draaien = true;

	void starten() {
		System.out.println("Toets 0 om te stoppen");
		while (draaien == true) {
			try {
				invoeren();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println("Totaal aantal kaarten verkocht: " + att.totaalKaarten);
			// System.out.println("Totaal aantal botsauto kaarten verkocht: " +
			// bots.botsautoKaarten);
		}
	}

	void stoppen() {
		draaien = false;
		System.out.println("De kermis is gesloten");
	}

	void keuze() {

	}

	void invoeren() throws Exception {
		System.out.println("Toets je invoer in:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (!scan.hasNextInt()) {
			System.out.println("Input is geen getal");
			scan.nextLine();
		}
		int number = scan.nextInt();

		switch (number) {
		case 1:
			bots.draaien();
			break;
		case 2:
			spin.draaien();
			break;
		case 3:
			spie.draaien();
			break;
		case 4:
			spook.draaien();
			break;
		case 5:
			ha.draaien();
			break;
		case 6:
			ladder.draaien();
			break;
		case 7:
			att.totaalKaarten();
			break;
		case 8:
			k.kassa();
			break;
		case 9:
			m.keuren();
			break;
		case 0:
			stoppen();
			break;
		}
	}
}
