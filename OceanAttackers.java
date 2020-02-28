package openet;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * FastStart - a robot by (your name here)
 */
public class OceanAttackers extends Robot
{
	/**
	 * run: FastStart's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		 setColors(Color.blue,Color.blue,Color.blue); // body,gun,radar

		// Robot main loop
		setAdjustGunForRobotTurn(true);
		while(true) {
			turnGunLeft(360);
			//turnRight(60);
			ahead(40);
			//turnLeft(120);
			//ahead(40);
			
		}
		
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		turnGunRight(getHeading() - getRadarHeading() + e.getBearing());
		setAdjustGunForRobotTurn(true);
		//turnGunLeft(0);
		if(e.getEnergy() > 40)
			fire(3);
		else 
			fire(1.5);
		 
		fire(1.5);
		fire(1.5);
		
		ahead(25);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		//turnRight(getHeading() - getRadarHeading() + e.getBearing());
		setAdjustGunForRobotTurn(true);
		back(180);
		
		turnLeft(90);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
		turnRight(180);
	}	
}
