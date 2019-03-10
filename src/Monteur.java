import java.util.Scanner;

public class Monteur {

	void keuren() {
		System.out.println("Naar welke attractie wil je de monteur sturen?\n1 = Spin \n2 = Hawaii ");

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
			System.out.println("Onderhoud Spin");
			Spin.draaiLimiet = 0;
			break;
		case 2:
			System.out.println("Onderhoud Hawaii");
			Hawaii.draaiLimiet = 0;
			break;

		}

	}
}