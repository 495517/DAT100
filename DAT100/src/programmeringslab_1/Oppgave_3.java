package programmeringslab_1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Oppgave_3 {

	public static void main(String[] args) {
		
		String dagTxt = showInputDialog("Skriv inn et dagnummer:");
		String månedTxt = showInputDialog("Skriv inn en måned:");
		String årTxt = showInputDialog("Skriv inn et årstall:");

		int dag = parseInt(dagTxt);
		int måned = parseInt(månedTxt);
		int år = parseInt(årTxt);
		
		char skille = '|';
		
		showMessageDialog(null,"Datoen du skrev er " + dag + skille + måned + skille + år);
		
	}

}
