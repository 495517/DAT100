package programmeringslab_2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_G4 {

	public static void main(String[] args) {

		for (int t=1; t<=5; t++) {
			String tallTxt = showInputDialog("Gi et tall:");
			int tall = parseInt(tallTxt);
			System.out.println(tall);

		}

	}

}
