package programmeringslab_1;

import easygraphics.EasyGraphics;
import static java.lang.Integer.*;

public class Oppgave_6 extends EasyGraphics{

	 public static void main(String[] args) {
		 launch(args);
	}
	 
	 public void run() {
		 		 
		 makeWindow("Det franske flagget");
		 
		 int p = parseInt(getText("Prosentverdi: "));
		 
		 	setColor(0, 0, 0);
		    fillRectangle(50, 50, 400, 100);
		    setColor(255, 0, 0);
		    fillRectangle(50, 150, 400, 100);
		    setColor(255, 215, 0);
		    fillRectangle(50, 250, 400,100);
		    
	 }

}
