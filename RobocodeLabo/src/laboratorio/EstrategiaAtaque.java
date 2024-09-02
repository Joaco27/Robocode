package laboratorio;

public abstract class EstrategiaAtaque {

	public abstract void onScannedRobot(LaboRobot robot);
	
	public void onHitByBullet(LaboRobot robot) {
		robot.back(10);
		robot.turnGunRight(360);
	}
}
