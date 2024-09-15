package laboratorio;
public class Estratega {
    private Estrategia estrategiaActual;

    public Estratega() {
        this.estrategiaActual = EstrategiaDefensiva.obtenerInstancia();  // Estrategia por defecto
    }

    // Método para evaluar y decidir la estrategia
    public Estrategia evaluarYDecidir(MCJ robot) {
        if (robot.energy < 30 && robot.others > 2) {
            return EstrategiaEvasiva.obtenerInstancia();
        } else if (robot.energy > 50) {
            return EstrategiaAgresiva.obtenerInstancia();
        } else {
            return EstrategiaDefensiva.obtenerInstancia();
        }
    }

    // Cambiar la estrategia
    // private void cambiarEstrategia(Estrategia nuevaEstrategia) {
    //     this.estrategiaActual = nuevaEstrategia;
    // }

    // Estrategia Defensiva como Singleton
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
            robot.turnBackRight(50, 90);
        }

        @Override
        public void run(MCJ robot) {
            while (true) {
                robot.turnGunRight(90);
                robot.back(30);
            }
        }

        @Override
        public void onHitByBullet(MCJ robot) {
            // Move ahead 100 and in the same time turn left papendicular to the bullet
		    robot.turnAheadLeft(100, 90 - robot.hitByBulletBearing);
        }

        @Override
        public void onHitWall(MCJ robot) {
            robot.turnRight(180);
            robot.ahead(50);
        }
    }

    // Estrategia Agresiva como Singleton
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
            robot.turnBackRight(50, 90);
        }

        @Override
        public void run(MCJ robot) {
            while (true) {
                robot.turnGunRight(90);
                robot.back(30);
            }
        }

        @Override
        public void onHitByBullet(MCJ robot) {
            // Move ahead 100 and in the same time turn left papendicular to the bullet
		    robot.turnAheadLeft(100, 90 - robot.hitByBulletBearing);
        }

        @Override
        public void onHitWall(MCJ robot) {
            robot.turnRight(180);
            robot.ahead(50);
        }
    }

    // Estrategia Evasiva como Singleton
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
            robot.turnBackRight(50, 90);
        }

        @Override
        public void run(MCJ robot) {
            while (true) {
                robot.turnGunRight(90);
                robot.back(30);
            }
        }

        @Override
        public void onHitByBullet(MCJ robot) {
            // Move ahead 100 and in the same time turn left papendicular to the bullet
		    robot.turnAheadLeft(100, 90 - robot.hitByBulletBearing);
        }

        @Override
        public void onHitWall(MCJ robot) {
            robot.turnRight(180);
            robot.ahead(50);
        }
    }
}
