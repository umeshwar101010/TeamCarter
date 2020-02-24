package org.academiadecodigo.hackstreetboys.engine.levels;

import org.academiadecodigo.hackstreetboys.controls.Controls;
import org.academiadecodigo.hackstreetboys.engine.GameEngine;
import org.academiadecodigo.hackstreetboys.frame.Canvas;
import org.academiadecodigo.hackstreetboys.gameObjects.Player;
import org.academiadecodigo.hackstreetboys.gameObjects.enemies.Enemy;
import org.academiadecodigo.hackstreetboys.gameObjects.enemies.EnemyFactory;

public class LevelThree {
    private Player player;
    private boolean levelThreeComplete = false;
    private Enemy[] enemy;
    private int numberOfEnemies = 5;
    private GameEngine engine = new GameEngine();


    public void initLevelThree() {

        levelThreeCanvas();
        enemy = new Enemy[numberOfEnemies];
        for(int i = 0; i < enemy.length; i++) {
            enemy[i] = EnemyFactory.getNewEnemy();
            enemy[i].spawn();
        }
        player = new Player();
        player.spawn();
        Controls controls = new Controls();
        controls.setPlayerObject(player);
        controls.init();
        moveGameObjects();
    }


    public void levelThreeCanvas() {
        Canvas.makeCanvas(1);
    }

    public void moveGameObjects() {
        while (!player.isReachedObjective() || !checkCollisionLevel3()) {
            moveAllEnemies();
        }
    }

    private void moveAllEnemies() {
        for(int i = 0; i < enemy.length; i++) {
            checkCollisionLevel3();
            enemy[i].move();

        }
    }

    public boolean checkCollisionLevel3() {
        checkerLevelThree();
        if (player.isDead()) {
            System.out.println("Player is dead. Restart level");
            startLevelThree();
            return true;
        }
        if (player.getUp() == 75 && player.getLeft() == 20) {
            System.out.println("You've arrived level Two");
            player.setUp(0);
            player.setLeft(0);
            player.setReachedObjective(true);
            engine.setLevel(engine.getLevel() + 1);
            GameOver gameover = new GameOver();
            return false;
        }
        return false;
    }


    public boolean checkerLevelThree() {

        for(int i = 0; i < enemy.length; i++) {
            if((player.getUp() == enemy[i].getUp() || player.getUp() == (enemy[i].getUp() + 2) || player.getUp() == (enemy[i].getUp() - 2)) &&
                    (player.getLeft() == enemy[i].getLeft() || player.getLeft() == (enemy[i].getLeft() + 2) || player.getLeft() == (enemy[i].getLeft() - 2))) {
                player.setDead(true);
                return true;
            }
        }
        return false;
    }

    public void startLevelThree() {
        LevelThree levelThree = new LevelThree();
        levelThree.initLevelThree();
    }
}
