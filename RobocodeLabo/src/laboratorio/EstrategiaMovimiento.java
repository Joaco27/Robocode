package laboratorio;

public abstract class EstrategiaMovimiento {
	
	public abstract void run(LaboRobot robot);
	
	public void onHitWall(LaboRobot robot) {
		robot.turnGunTo(robot.scannedAngle);
		int giro = 180;
		robot.turnRight(giro);
	}

}
