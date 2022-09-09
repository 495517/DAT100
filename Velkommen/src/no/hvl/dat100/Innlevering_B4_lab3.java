package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
	
public class Innlevering_B4_lab3 {

	public static void main(String[] args) {
		
		//For å få opp et dialogvindu og skaffe info fra brukeren.
		String brutto = showInputDialog ("Oppgi bruttoinntekt:");
		int b = Integer.parseInt(brutto);
		
		//Her gir vi hver variabel en verdi, slik at de kan enkelt brukes senere.
		int grunn = 190349;
		double trinn_grunn = 0.0;
		
		int første = 190350;
		double trinn_en = 0.017; 
		
		int andre = 267900;
		double trinn_to = 0.040;
		
		int tredje = 643800;
		double trinn_tre = 0.134;
		
		int fjerde = 969200;
		double trinn_fire = 0.164;
		
		int femte = 2000000;
		double trinn_fem = 0.175;
		
		//Lager en if - else forgreining for å vise alle utfallene.
		if (b <= grunn) {
			showMessageDialog(null, "Du betaler " + Math.round(b * trinn_grunn) + " i skatt");
		}
		else if (b>=første && b<andre) {
			showMessageDialog(null, "Du betaler " + Math.round(b * trinn_en) + " i skatt.");
		}
		else if (b>=andre && b<tredje) {
			showMessageDialog(null, "Du betaler " + Math.round(b * trinn_to) + " i skatt.");
		}
		else if (b>=tredje && b<fjerde) {
			showMessageDialog(null, "Du betaler " + Math.round(b * trinn_tre) + " i skatt.");
		}
		else if (b>=fjerde && b<femte) {
			showMessageDialog(null, "Du betaler " + Math.round(b * trinn_fire) + " i skatt.");
		}
		else if (b>=femte) {
			showMessageDialog(null, "Du betaler " + Math.round(b * trinn_fem) + " i skatt.");
		}
	}
}