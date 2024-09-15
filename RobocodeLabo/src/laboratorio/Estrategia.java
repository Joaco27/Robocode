package laboratorio;

public interface Estrategia {
    void onScannedRobot(MCJ robot);
    void run(MCJ robot);
    void onHitByBullet(MCJ robot);
    void onHitWall(MCJ robot);

}
