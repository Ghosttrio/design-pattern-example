package org.ghosttrio.abstractfactory;

public class EasyEnemyFactory extends EnemyFactory {
    @Override
    public Boss createBoss() {
        return null;
    }

    @Override
    public Obstacle createObstacle() {
        return null;
    }
}
