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

		ahead(fieldWidth-robotY-20);
		if (robotX > fieldWidth-30) {
			turnGunTo(0);
			if (erHanDer == true) {
				fire(3);
			}
		}
		turnGunTo(90);
		back((fieldWidth)-20-20);	
		erHanDer = false;
	}
	
	public void onScannedRobot() {
		erHanDer = true;
		if (scannedHeading == 270 || scannedHeading == 180) {
			fire(3);
		}
	}
}
