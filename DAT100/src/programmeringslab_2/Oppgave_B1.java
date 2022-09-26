package programmeringslab_2;

import static java.lang.Math.*;
import easygraphics.EasyGraphics;
import static java.lang.Integer.*;

public class Oppgave_B1 extends EasyGraphics{

	public static void main(String[] args) {
		launch(args);
	}
	public void run() {
		makeWindow("Volum av en kule");

		int r = parseInt(getText("Angi radius:"));

		double v = (4*Math.PI*r*r*r)/3;

		drawCircle (100, 100, r);

		System.out.println("Volumet av kulen er " + v);

	}
}
