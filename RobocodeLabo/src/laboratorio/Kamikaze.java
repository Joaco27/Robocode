package laboratorio;


public class Kamikaze extends EstrategiaAtaque{

	@Override
	public void onScannedRobot(LaboRobot robot) {
		robot.turnTo(robot.scannedAngle);
		robot.turnGunTo(robot.scannedAngle);
		for(int i=0; i<robot.scannedDistance; i++){
			robot.fire(3);
			robot.ahead(10);
		}
		
	}
}
