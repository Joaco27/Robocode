package laboratorio;

public class Snake implements IEstrategiaMovimiento{

	@Override
	public void run(LaboRobot robot) {
		robot.turnGunRight(10);
		int pixels = ((robot.fieldWidth + robot.fieldHeight)/2)/10;
		robot.turnAheadRight(pixels, 45);
		robot.turnAheadLeft(pixels, 90);
	}

	@Override
	public void onHitWall(LaboRobot robot) {
		int giro = (robot.hitWallAngle + 180) % 360;
		if (giro<0) giro+=360;
		robot.turnRight(giro);
		robot.ahead(30);
	}

	
	
}
