package programmeringslab_1;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_2 {

	public static void main(String[] args) {
		String førsteTxt = showInputDialog("Oppgi et tall mellom 0 og 10:");
		String andreTxt = showInputDialog("Oppgi et annet tall mellom 0 og 10 bortsett fra " + førsteTxt + ":");
		String tredjeTxt = showInputDialog("Oppgi et annet tall mellom 0 og 10 bortsett fra " + andreTxt + ":");
		String fjerdeTxt = showInputDialog("Oppgi et annet tall mellom 0 og 10 bortsett fra" + tredjeTxt + ":");

		int tall1 = parseInt(førsteTxt);
		int tall2 = parseInt(andreTxt);
		int tall3 = parseInt(tredjeTxt);
		int tall4 = parseInt(fjerdeTxt);
		
		int minst1 = Math.min(tall1, tall2);
		int minst2 = Math.min(tall3,  tall4);
		int minste = Math.min(minst1,  minst2);
				
		showMessageDialog(null, "Det minste av de 4 tallene er: " + minste);
		
	}

}

//Ikke ferdig.