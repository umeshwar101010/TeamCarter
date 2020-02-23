package org.academiadecodigo.hackstreetboys.engine.levels;


import org.academiadecodigo.hackstreetboys.controls.Controls;
import org.academiadecodigo.hackstreetboys.frame.Canvas;
import org.academiadecodigo.hackstreetboys.gameObjects.Enemy;
import org.academiadecodigo.hackstreetboys.gameObjects.Player;

public class LevelOne {

    private int level = 1;
    private Player player;
    private boolean levelOneComplete = false;
    private Enemy enemy;


    public void initLevelOne() {

        levelOneCanvas();
        enemy = new Enemy();
        enemy.spawn();
        player = new Player(enemy);
        player.spawn();
        Controls controls = new Controls();
        controls.setPlayerObject(player);
        controls.init();
        moveGameObjects();
    }


    public void levelOneCanvas() {
        Canvas.makeCanvas(1);
    }

    public void moveGameObjects() {
        while (!player.isReachedObjective() || !checkCollision()) {
            checkCollision();
            enemy.move();
        }
    }

    public boolean checkCollision() {
        if (checker() ) {
            System.out.println("Hurray....");
            return true;
        }
        if (player.getUp() == 75 && player.getLeft() == 20) {
            System.out.println("You've arrived");
            player.setReachedObjective(true);

            level++;
            return false;
        }
        return false;
    }

    public boolean checker() {
        if (player.isDead()) {
            return true;
        }
        if ((player.getUp() == enemy.getUp() || player.getUp() == (enemy.getUp() + 2) || player.getUp() == (enemy.getUp() - 2)) &&
                (player.getLeft() == enemy.getLeft() || player.getLeft() == (enemy.getLeft() + 2) || player.getLeft() == (enemy.getLeft() - 2))) {
            System.out.println("same coordinates");
            return true;
        }
        return false;
    }

    public boolean isLevelOneComplete() {
        return levelOneComplete;
    }

    public void setLevelOneComplete(boolean levelOneComplete) {
        this.levelOneComplete = levelOneComplete;
    }
}
