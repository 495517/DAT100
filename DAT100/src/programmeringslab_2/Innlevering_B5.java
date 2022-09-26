package programmeringslab_2;

import static javax.swing.JOptionPane.*;

public class Innlevering_B5 {

	public static void main(String[] args) {
		//Oppgave c

		//Her gir vi hver variabel en verdi, slik at de kan enkelt brukes senere.
		int a = 90;

		int b = 80;

		int c = 60;

		int d = 50;

		int e = 40;

		int f = 0;
		
//Setter inn en for løkke
		for (int i = 1; i<=10; i++) {

			//Lager en while loop for tilfellene.
			while (true) {
				
				//For å få opp et dialogvindu og skaffe info fra brukeren.
				String karakter = showInputDialog ("Din poengsum:");
				int k = Integer.parseInt(karakter);	

				//Lager en if - else forgreining for å vise alle utfallene.
				if (k<f || k>100) {
					showMessageDialog(null, "Din poengsum er ikke gyldig");
				} else {
					if (k>=f && k<e) {
						showMessageDialog(null, "Din karakter er F");
					} else if (k>=e && k<d) {
						showMessageDialog(null, "Din karakter er E");
					} else if (k>=d && k<c) {
						showMessageDialog(null, "Din karakter er D");
					} else if (k>=c && k<b) {
						showMessageDialog(null, "Din karakter er C");
					} else if (k>=b && k<a) {
						showMessageDialog(null, "Din karakter er B");
					} else if (k>=a && k<=100) {
						showMessageDialog(null, "Din karakter er A");
					}

					break;
				}

			};
		}
	}
}



/*Oppgave a
 * For å få opp et dialogvindu og skaffe info fra brukeren.
 * 	
 * 	String karakter = showInputDialog ("Din poengsum:");
 * 	int k = Integer.parseInt(karakter);
 * 
 * Her gir vi hver variabel en verdi, slik at de kan enkelt brukes senere.
 *	
 *	int a = 90;
 *	int b = 80;
 *	int c = 60;
 *	int d = 50;
 *	int e = 40;
 *	int f = 0;
 *
 * Lager en if - else forgreining for å vise alle utfallene.
 *		
 *	if (k<f || k>100) {
 *			showMessageDialog(null, "Din poengsum er ikke gyldig");
 *		} else if (k>=f && k<e) {
 *			showMessageDialog(null, "Din karakter er F");
 *		} else if (k>=e && k<d) {
 *			showMessageDialog(null, "Din karakter er E");
 *		} else if (k>=d && k<c) {
 *			showMessageDialog(null, "Din karakter er D");
 *		} else if (k>=c && k<b) {
 *			showMessageDialog(null, "Din karakter er C");
 *		} else if (k>=b && k<a) {
 *			showMessageDialog(null, "Din karakter er B");
 *		} else if (k>=a && k<=100) {
 *			showMessageDialog(null, "Din karakter er A");
 *		}
 */

/* Oppgave b
 * Her gir vi hver variabel en verdi, slik at de kan enkelt brukes senere.
 *
 *	int a = 90;
 *	int b = 80;
 *	int c = 60;
 *	int d = 50;
 *	int e = 40;
 *	int f = 0;
 *
 * Lager en for løkke for de 10 studentene.
 *	
 *	for (int i = 1; i<=10; i++) {
 *
 * For å få opp et dialogvindu og skaffe info fra brukeren.
 *	
 *	String karakter = showInputDialog ("Din poengsum:");
 *	int k = Integer.parseInt(karakter);
 *
 * Lager en if - else forgreining for å vise alle utfallene.
 *	
 *	if (k<f || k>100) {
 *			showMessageDialog(null, "Din poengsum er ikke gyldig");
 *		} else if (k>=f && k<e) {
 *			showMessageDialog(null, "Din karakter er F");
 *		} else if (k>=e && k<d) {
 *			showMessageDialog(null, "Din karakter er E");
 *		} else if (k>=d && k<c) {
 *			showMessageDialog(null, "Din karakter er D");
 *		} else if (k>=c && k<b) {
 *			showMessageDialog(null, "Din karakter er C");
 *		} else if (k>=b && k<a) {
 *			showMessageDialog(null, "Din karakter er B");
 *		} else if (k>=a && k<=100) {
 *			showMessageDialog(null, "Din karakter er A");
 *		}
 *	}
 * 
 */