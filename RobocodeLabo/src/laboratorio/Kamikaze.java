package laboratorio;

import static robocode.util.Utils.normalRelativeAngleDegrees;

public class Kamikaze implements IEstrategiaAtaque{

	@Override
	public void onScannedRobot(LaboRobot robot) {
		int giro = (robot.scannedAngle - robot.heading + 360) % 360;
        if (giro > 180)	giro -= 360;
        
		robot.turnTo(giro);
		robot.turnGunTo(giro);
		robot.ahead(robot.scannedDistance);
		robot.fire(3);
		
	}

	@Override
	public void onHitByBullet(LaboRobot robot) {
		int giro = (int) normalRelativeAngleDegrees(robot.scannedBearing + robot.heading - robot.gunHeading);
		robot.turnGunTo(giro);
		robot.fire(3);
		/*
		 * for(int i=30; i<360; i+=30) { robot.turnTo(i); robot.turnGunTo(i);
		 * robot.fire(1); }
		 */
		
	}

}
