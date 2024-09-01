package laboratorio;

public class Walls implements IEstrategiaMovimiento{

	@Override
	public void run(LaboRobot robot) {
		int pixels = robot.fieldWidth + robot.fieldHeight;
		robot.ahead(pixels);
		
	}

	@Override
	public void onHitWall(LaboRobot robot) {
		robot.turnRight(90);
		
	}

	
	
}
