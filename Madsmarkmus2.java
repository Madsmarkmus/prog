package prog;
import robocode.*;

public class Madsmarkmus2 extends JuniorRobot
{
	boolean erHanDer = false;
	public void run() {
	
		if (robotY > 20) {
			turnTo(180);
			ahead(robotY-20);
			turnTo(90);
			turnGunTo(90);
		}
	
		ahead(fieldWidth-robotX-20);
		
		if (robotX == fieldWidth-20) {
			turnGunTo(0);
			if (erHanDer == true)
				fire(3);		
			turnGunTo(90);
		}
		
		back(robotX-20);	
	}
	
	public void onScannedRobot() {
		if (robotY == 20) {
			erHanDer = true;
			if (heading == 90);
				fire(3);
		}
	}
}
