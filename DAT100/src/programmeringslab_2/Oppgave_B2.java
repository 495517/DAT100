package programmeringslab_2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_B2 {

	public static void main(String[] args) {
		
		String prisTxt = showInputDialog("Angi pris:");
		String beløpTxt = showInputDialog("Angi beløp:");
		
		int pris = parseInt(prisTxt);
		int beløp = parseInt(beløpTxt);
		
		int veksel = beløp-pris;
		int ant10kr = veksel/10;
		int ant1kr = veksel%10;
		
		showMessageDialog(null, "Kunden får " + ant10kr + " 10-kroner og " + ant1kr + " 1-kroner tilbake.");
		
	}

}
