package MCJ;
import robocode.*;

public class MCJ extends JuniorRobot {
    private Estratega estratega;

    public MCJ() {
        this.estratega = new Estratega();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Hola");
            estratega.evaluarYDecidir(this).run(this);
        }
    }

    @Override
    public void onScannedRobot() {
        estratega.evaluarYDecidir(this).onScannedRobot(this);
    }

    @Override
    public void onHitByBullet() {
        estratega.evaluarYDecidir(this).onHitByBullet(this);
    }

    @Override
    public void onHitWall() {
        estratega.evaluarYDecidir(this).onHitWall(this);
    }
}
