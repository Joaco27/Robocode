package laboratorio;

public class Walls extends EstrategiaMovimiento{

	@Override
	public void run(LaboRobot robot) {
		int pixels = robot.fieldWidth + robot.fieldHeight;
		while (true) {
			robot.ahead(pixels);
		}
		
	}


	
	
}
