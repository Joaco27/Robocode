package laboratorio;

public class Kamikaze implements IEstrategiaAtaque{

	@Override
	public void onScannedRobot(LaboRobot robot) {
		robot.turnTo(robot.scannedAngle);
		robot.turnGunTo(robot.scannedAngle);
		robot.ahead(robot.scannedDistance);
		robot.fire(3);
		
	}

	@Override
	public void onHitByBullet(LaboRobot robot) {
		for(int i=30; i<360; i+=30) {
			robot.turnTo(i);
			robot.turnGunTo(i);
			robot.fire(1);
				
		}
		
	}

}
