package prog;
import robocode.*;

public class Madsmarkmus extends JuniorRobot
{
	int antalRamt = 0;
	int antalRunder = 0;

	public void run() {
		
		
		
		//HVIS START I MARGIN
		if (robotX < 25){
			turnTo(90);
			ahead(25-robotX);
			turnTo(0);
		}
		else if (robotX > fieldWidth-25){
			turnTo(270);
			ahead(25-(fieldWidth-robotX));
			turnTo(180);
		} 
		else if (robotY < 25){
			turnTo(0);
			ahead(25-robotY);
			turnTo(270);
		}
		else if (robotY > fieldHeight-25){
			turnTo(180);
			ahead(25-(fieldHeight-robotY));
			turnTo(90);
		}
		
		//HVIS PÅ KØRELINJEN
		
		if (robotX == 25){
			if (antalRunder <= 4) {
				fire(0.1);
			}
			if (antalRunder > 4 && antalRamt > 0) {
				fire(2);
			}
			turnTo(0);
			ahead(fieldHeight-robotY-25);
			antalRunder ++;
		}
		if (robotX == (fieldWidth-25)){
			if (antalRunder <= 4) {
				fire(0.1);
			}
			if (antalRunder > 4 && antalRamt > 0) {
				fire(2);
			}
			turnTo(180);
			ahead(robotY-25);
			antalRunder ++;
		}
	    if (robotY == 25){
			if (antalRunder <= 4) {
				fire(0.1);
			}
			if (antalRunder > 4 && antalRamt > 0) {
				fire(2);
			}
			turnTo(270);
			ahead(fieldWidth-(fieldWidth-robotX)-25);
			antalRunder ++;
		}
		if (robotY == (fieldHeight-25)) {
			if (antalRunder <= 4) {
				fire(0.1);
			}
			if (antalRunder > 4 && antalRamt > 0) {
				fire(2);
			}
			turnTo(90);
			ahead(fieldWidth-robotX-25);
			antalRunder ++;
		}
	
		
			

		//HVIS START I MIDTEN
		
		if (robotX <= (fieldWidth*0.5) && robotY < fieldHeight-25 && robotY > 25) {
		turnTo(270);
		turnGunTo(0);
		ahead(fieldWidth-(fieldWidth-robotX)-25);
	
		}
		if (robotX > (fieldWidth*0.5) && robotY < fieldHeight-25 && robotY > 25) {
		turnTo(90);
		ahead(fieldWidth-robotX-25);
		turnGunTo(gunHeading+90);
		}	
		
		turnGunTo(heading+90);		

	}
	
	public void onHitRobot() {
		antalRamt ++;
	}

	
}