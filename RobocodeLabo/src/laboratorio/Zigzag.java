package laboratorio;

public class Zigzag implements IEstrategiaMovimiento{

	@Override
	public void run(LaboRobot robot) {
		int pixels = ((robot.fieldWidth + robot.fieldHeight)/2)/10;
		robot.ahead(pixels);
		robot.turnRight(90);
		robot.ahead(pixels);
		robot.turnLeft(90);
	}

	@Override
	public void onHitWall(LaboRobot robot) {
		robot.turnRight(135);
	}

	
	
}
