
public class BelastingInspecteur {
	double belasting = 0.00;

	public void belastingOphalen() {

		System.out.println("Ik kom de belasting ophalen");

		belasting = LadderKlimmen.omzet * 0.3;
		LadderKlimmen.omzet = LadderKlimmen.omzet - belasting;
	}

}
