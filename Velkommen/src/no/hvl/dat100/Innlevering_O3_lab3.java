package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Innlevering_O3_lab3 {

	public static void main(String[] args) {

		String number = showInputDialog("Oppgi et tall");
		int n = Integer.parseInt(number);

		long fact = 1;

		if (n > 0) {

			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
			showMessageDialog(null, "Fakultet til tallet " + n + " er " + fact);
		}

		else {
			showMessageDialog(null,"Ugyldig tall");
		}

	}

}
