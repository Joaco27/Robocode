package laboratorio;

public abstract class EstrategiaAtaque {

	public abstract void onScannedRobot(LaboRobot robot);
	
	public void onHitByBullet(LaboRobot robot) {
		robot.ahead(100);
		
		
	}
}
