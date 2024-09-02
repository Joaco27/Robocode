package laboratorio;

public class Snake extends EstrategiaMovimiento{

	@Override
	public void run(LaboRobot robot) {
		int pixels = ((robot.fieldWidth + robot.fieldHeight)/2)/10;
		while (true) {
			robot.turnGunRight(360);
			robot.turnAheadRight(pixels, 45);
			robot.turnAheadLeft(pixels, 90);
		}
		
	}


	
	
}
