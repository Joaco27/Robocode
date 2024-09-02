package laboratorio;

public class Lineal extends EstrategiaMovimiento{

	@Override
	public void run(LaboRobot robot) {
		int pixels = robot.fieldWidth + robot.fieldHeight;
		while (true) {
			robot.turnGunRight(360);
			robot.ahead(pixels);
		}
		
	}


	
	
}
