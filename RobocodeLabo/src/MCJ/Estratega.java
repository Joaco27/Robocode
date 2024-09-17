package MCJ;
public class Estratega {
    private Estrategia estrategiaActual;

    public Estratega() {
        this.estrategiaActual = EstrategiaAgresiva.obtenerInstancia();  
    }

    public Estrategia evaluarYDecidir(MCJ robot) {
        if (robot.energy < 30) {
            return EstrategiaDefensiva.obtenerInstancia();
        } else if (robot.energy > 50) {
            return EstrategiaAgresiva.obtenerInstancia();
        } else {
            return EstrategiaEvasiva.obtenerInstancia();
        }
    }


    // Cambiar la estrategia
    // private void cambiarEstrategia(Estrategia nuevaEstrategia) {
    //     this.estrategiaActual = nuevaEstrategia;
    // }

    private static class EstrategiaDefensiva implements Estrategia {
        private static EstrategiaDefensiva instancia;

        private EstrategiaDefensiva() {}

        public static EstrategiaDefensiva obtenerInstancia() {
            if (instancia == null) {
                instancia = new EstrategiaDefensiva();
            }
            return instancia;
        }

        @Override
        public void onScannedRobot(MCJ robot) {
        	robot.turnGunTo(robot.scannedAngle);
            robot.fire(2);
            robot.ahead(100);
            robot.turnGunTo(robot.scannedAngle);
        }

        @Override
        public void run(MCJ robot) {
            while (true) {
                robot.ahead(100); 
                robot.turnGunRight(360);
                robot.back(100);
                robot.turnGunRight(360);
            }
        }

        @Override
        public void onHitByBullet(MCJ robot) {
            robot.turnTo(robot.hitByBulletBearing - 90);
            robot.ahead(100);
            robot.turnGunTo(robot.hitByBulletAngle);
        }

        @Override
        public void onHitWall(MCJ robot) {
            robot.turnBackRight(100, 180);
        }
    }

    private static class EstrategiaAgresiva implements Estrategia {
        private static EstrategiaAgresiva instancia;

        private EstrategiaAgresiva() {}

        public static EstrategiaAgresiva obtenerInstancia() {
            if (instancia == null) {
                instancia = new EstrategiaAgresiva();
            }
            return instancia;
        }

        @Override
        public void onScannedRobot(MCJ robot) {
            robot.turnGunTo(robot.scannedAngle);
            robot.fire(2);
            robot.turnTo(robot.scannedAngle);
            robot.ahead(robot.scannedDistance - 50);
            robot.turnGunRight(360);
        }

        @Override
        public void run(MCJ robot) {
            while (true) {
                robot.turnGunRight(360);
            }
        }

        @Override
        public void onHitByBullet(MCJ robot) {
            robot.turnTo(robot.hitByBulletAngle);
            robot.turnGunTo(robot.hitByBulletAngle);
        }

        @Override
        public void onHitWall(MCJ robot) {
            robot.turnBackRight(100, 180);
        }
    }

    private static class EstrategiaEvasiva implements Estrategia {
        private static EstrategiaEvasiva instancia;

        private EstrategiaEvasiva() {}

        public static EstrategiaEvasiva obtenerInstancia() {
            if (instancia == null) {
                instancia = new EstrategiaEvasiva();
            }
            return instancia;
        }

        @Override
        public void onScannedRobot(MCJ robot) {
            robot.turnGunTo(robot.scannedAngle);
            robot.fire(2);
            robot.turnGunTo(robot.scannedAngle);        
        }

        @Override
        public void run(MCJ robot) {
            while (true) {
                robot.turnAheadRight(50, 90);
                robot.turnGunRight(360);
                robot.turnAheadLeft(50, 90);
                robot.turnGunRight(360);
            }
        }

        @Override
        public void onHitByBullet(MCJ robot) {
            robot.turnBackRight(75, 90);
            robot.turnBackLeft(75, 90);
        }

        @Override
        public void onHitWall(MCJ robot) {
            robot.turnBackRight(100, 180);
        }
    }
}
