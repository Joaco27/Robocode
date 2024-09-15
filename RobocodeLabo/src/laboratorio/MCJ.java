package laboratorio;
import robocode.*;

public class MCJ extends JuniorRobot {
    private Estratega estratega;

    public MCJ() {
        // Inicializar con el estratega
        this.estratega = new Estratega();
    }

    @Override
    public void run() {
        while (true) {
            // Delegar las decisiones y ejecución al estratega
            estratega.evaluarYDecidir(this).run(this);
        }
    }

    @Override
    public void onScannedRobot() {
        // Cuando se detecta un robot, delegar en el estratega
        estratega.evaluarYDecidir(this).onScannedRobot(this);
    }

    @Override
    public void onHitByBullet() {
        // Al ser golpeado por una bala, delegar en el estratega
        estratega.evaluarYDecidir(this).onHitByBullet(this);
    }

    @Override
    public void onHitWall() {
        // Reaccionar al chocar con una pared, si es necesario
        estratega.evaluarYDecidir(this).onHitWall(this);
    }
}
