package laboratorio;
import robocode.*;


public class LaboRobot extends JuniorRobot
{
	
	private IEstrategiaMovimiento movimiento = new Snake();
	private IEstrategiaAtaque ataque = new Kamikaze();

	@Override	
	public void run() {

		movimiento.run(this);
		
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		ataque.onScannedRobot(this);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		ataque.onHitByBullet(this);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		movimiento.onHitWall(this);
	}	
}