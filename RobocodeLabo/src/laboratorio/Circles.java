package laboratorio;

public class Circles extends EstrategiaMovimiento{
	private boolean flag = false;
	
	@Override
	public void run(LaboRobot robot) {
		int pixels = ((robot.fieldWidth + robot.fieldHeight)/2)/7;
		while (true) {
			if (flag) {
				robot.turnAheadRight(pixels, 360);
			} else {
				robot.turnAheadLeft(pixels, 360);
			}
		}
		
	}

	@Override
	public void onHitWall(LaboRobot robot) {
		robot.turnRight(180);
		flag = !flag;
	}

	
	
}
