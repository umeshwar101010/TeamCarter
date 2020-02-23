package org.academiadecodigo.hackstreetboys.gameObjects.enemies;

public class EnemyFactory {

    private Enemy enemy;

    public static Enemy getNewEnemy() {
        return new Enemy();
    }


}
