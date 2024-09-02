package laboratorio;

public abstract class EstrategiaAtaque {

	public abstract void onScannedRobot(LaboRobot robot);
	
	public void onHitByBullet(LaboRobot robot) {
		robot.turnGunTo(robot.scannedAngle);
		robot.ahead(100);
		robot.turnGunTo(robot.scannedAngle);
		
		
	}
}
