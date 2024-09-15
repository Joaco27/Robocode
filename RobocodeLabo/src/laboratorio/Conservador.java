package laboratorio;

public class Conservador extends EstrategiaAtaque {
    public void onScannedRobot(MCJ robot){
        robot.turnGunTo(robot.scannedAngle); 
        if(robot.energy >= 50){
            robot.fire(3);
        }else{
            robot.fire(1);
        }
        
    }

}