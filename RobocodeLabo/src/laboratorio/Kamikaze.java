package laboratorio;

import static robocode.util.Utils.normalRelativeAngleDegrees;

public class Kamikaze extends EstrategiaAtaque{

	@Override
	public void onScannedRobot(LaboRobot robot) {
		int giro = (robot.scannedAngle - robot.heading + 360) % 360;
        if (giro > 180)	giro -= 360;
        
		robot.turnTo(giro);
		robot.turnGunTo(giro);
		robot.ahead(robot.scannedDistance);
		robot.fire(3);
		
	}
}
