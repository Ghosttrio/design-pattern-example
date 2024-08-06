package org.ghosttrio.abstractfactory;

public class HardEnemyFactory extends EnemyFactory {
    @Override
    public Boss createBoss() {
        return new HardBoss();
    }

    @Override
    public Obstacle createObstacle() {
        return new HardObstacle();
    }
}
