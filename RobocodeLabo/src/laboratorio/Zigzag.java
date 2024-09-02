package laboratorio;

public class Zigzag extends EstrategiaMovimiento{

	@Override
	public void run(LaboRobot robot) {
		int pixels = ((robot.fieldWidth + robot.fieldHeight)/2)/10;
		while(true) {
			robot.ahead(pixels);
			robot.turnRight(90);
			robot.ahead(pixels);
			robot.turnLeft(90);
		}
		
	}



	
	
}
