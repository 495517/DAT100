package programmeringslab_1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_1 {

	public static void main(String[] args) {
		String lengdeTxt = showInputDialog("Oppgi lengde:");
		String breddeTxt = showInputDialog("Oppgi bredde:");
		int tall1 = parseInt(lengdeTxt);
		int tall2 = parseInt(breddeTxt);
		int areal = tall1 * tall2;
		
		showMessageDialog(null, "Arealet er: " + areal);
	}
}

/*
 * public static void main(String[] args) {
		String førsteTxt = showInputDialog("Gi et tall:");
		String andreTxt = showInputDialog("Gi et annet tall:");
		int tall1 = parseInt(førsteTxt);
		int tall2 = parseInt(andreTxt);
		int sum = tall1 + tall2;
		
		showMessageDialog(null, "Summen av tallene er: " + sum);
	}	
*/	
