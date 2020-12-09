package prog;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * SittingDuck - a robot by (your name here)
 */
public class SittingDuck extends JuniorRobot
{
	/**
	 * run: SittingDuck's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);
			//HVIS START I MIDTEN
		
		if (robotX <= (fieldWidth*0.5) && robotY < fieldHeight-25 && robotY > 25) {
		turnTo(270);
		ahead(fieldWidth-(fieldWidth-robotX)-25);
		}
		if (robotX > (fieldWidth*0.5) && robotY < fieldHeight-25 && robotY > 25) {
		turnTo(90);
		ahead(fieldWidth-robotX-25);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		back(0);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(0);
	}	
}
