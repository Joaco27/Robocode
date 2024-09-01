package laboratorio;

public class Circles implements IEstrategiaMovimiento{
	private boolean flag = false;
	@Override
	public void run(LaboRobot robot) {
		int pixels = ((robot.fieldWidth + robot.fieldHeight)/2)/7;
		if (flag) {
			robot.turnAheadRight(pixels, 180);
		} else {
			robot.turnAheadLeft(pixels, 180);
		}
	}

	@Override
	public void onHitWall(LaboRobot robot) {
		robot.turnRight(180);
		flag = !flag;
	}

	
	
}
