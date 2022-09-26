package programmeringslab_2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_G3 {

	public static void main(String[] args) {


		while (true) {
			String aTxt = showInputDialog("Skriv inn et heltall:");
			String bTxt = showInputDialog("Skriv inn et heltall:");
			double a = parseInt(aTxt);
			double b = parseInt(bTxt);

			double div = a/b;

			if (b!=0) {
				showMessageDialog(null, "Verdien er: " + div);
			} else if (b==0) {
				showMessageDialog(null, "Verdien er ugyldig");
			}
			break;
		}

	}

}
