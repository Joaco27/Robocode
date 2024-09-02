package laboratorio;

import static robocode.util.Utils.normalRelativeAngleDegrees;

public class Conservador extends EstrategiaAtaque {
    public void onScannedRobot(LaboRobot robot){
        robot.turnGunTo(robot.scannedAngle); 
        robot.fire(2);
    }

}