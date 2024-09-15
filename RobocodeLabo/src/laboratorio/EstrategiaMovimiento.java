package laboratorio;

public abstract class EstrategiaMovimiento {
	
	public abstract void run(MCJ robot);
	
	public void onHitWall(MCJ robot) {
		robot.turnGunTo(robot.scannedAngle);
		int giro = 180;
		robot.turnRight(giro);
	}

}
