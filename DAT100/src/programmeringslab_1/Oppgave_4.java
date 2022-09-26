package programmeringslab_1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_4 {

	public static void main(String[] args) {
		
		String antSekTxt = showInputDialog("Skriv inn antall sekunder:");
		
		int sek = parseInt(antSekTxt);
				
		int timer = sek / 60;
		int minutter = timer % 60;
		int sekunder = sek % 60;
		
		showMessageDialog(null, "Tiden er: " + timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder.");
		
	}

}
