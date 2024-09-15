package laboratorio;

public abstract class EstrategiaAtaque {

	public abstract void onScannedRobot(MCJ robot);
	
	public void onHitByBullet(MCJ robot) {
		robot.turnGunTo(robot.scannedAngle);
		robot.ahead(100);
		robot.turnGunTo(robot.scannedAngle);
		
	}
}
