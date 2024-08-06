package org.ghosttrio.abstractfactory;

public abstract class EnemyFactory {

    public static EnemyFactory getFactory(int level) {
        if (level == 1) {
            return new EasyEnemyFactory();
        } else {
            return new HardEnemyFactory();
        }
    }

    public abstract Boss createBoss();
    public abstract Obstacle createObstacle();
}
