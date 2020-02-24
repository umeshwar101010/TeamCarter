package org.academiadecodigo.hackstreetboys.engine.levels;


import org.academiadecodigo.hackstreetboys.controls.Controls;
import org.academiadecodigo.hackstreetboys.engine.GameEngine;
import org.academiadecodigo.hackstreetboys.frame.Canvas;
import org.academiadecodigo.hackstreetboys.gameObjects.enemies.Enemy;
import org.academiadecodigo.hackstreetboys.gameObjects.Player;

public class LevelOne {


    private Player player;
    private boolean levelOneComplete = false;

    private Enemy enemy;
    private GameEngine engine = new GameEngine();
    private LevelTwo levelTwo;



    public void initLevelOne() {

        levelOneCanvas();
        enemy = new Enemy();
        enemy.spawn();
        player = new Player();
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
            startLevelOne();
            return true;
        }
        if (player.getUp() == 75 && player.getLeft() == 20) {
            System.out.println("You've arrived level One");
            player.setReachedObjective(true);
            levelOneComplete = true;
            System.out.println("level one complete: " + levelOneComplete + "player reached objective: " + player.isReachedObjective());
            startLevelTwo();
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

    public void startLevelTwo() {
        levelTwo = new LevelTwo();
        levelTwo.initLevelTwo();
    }

    public void startLevelOne() {
        LevelOne levelOne = new LevelOne();
        levelOne.initLevelOne();
    }

}
