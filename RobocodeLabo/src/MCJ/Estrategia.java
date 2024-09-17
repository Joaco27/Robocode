package MCJ;
public interface Estrategia {
    public void onScannedRobot(MCJ robot);
    public void run(MCJ robot);
    public void onHitByBullet(MCJ robot);
    public void onHitWall(MCJ robot);

}
