package laboratorio;

public abstract class EstrategiaMovimiento {
	
	public abstract void run(LaboRobot robot);
	
	public void onHitWall(LaboRobot robot) {
		robot.back(20);
		int giro = (robot.hitWallAngle + 180) % 360;
		if (giro<0) giro+=360;
		robot.turnRight(giro);
	}

}
