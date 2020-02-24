package org.academiadecodigo.hackstreetboys.engine.levels;

import org.academiadecodigo.hackstreetboys.controls.Controls;
import org.academiadecodigo.hackstreetboys.engine.GameEngine;
import org.academiadecodigo.hackstreetboys.gameObjects.Player;
import org.academiadecodigo.hackstreetboys.gameObjects.enemies.Enemy;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Tutorial {


    private Player player;
    private boolean tutorialComplete;
    public static final int PADDING = 10;
    private Enemy enemy;
    private GameEngine engine = new GameEngine();
    private Picture picture;
    private LevelOne levelOne;



    public void initTutorial() {
        picture = new Picture(PADDING, PADDING, "resources/Images/Tutorial/tutorialLevel.png");
        picture.draw();
        player = new Player();
        player.spawn();
        Controls controls = new Controls();
        controls.setPlayerObject(player);
        controls.init();
        moveGameObjects();
    }

    public void moveGameObjects() {
        while (!player.isReachedObjective() || checkCollisionTutorial()) {
            System.out.println(player.getUp() + " up       " + player.getLeft() + " left");
            checkCollisionTutorial();
            //enemy.move();
        }
        startLevelOne();
    }

    public boolean checkCollisionTutorial() {

        /*if (checker() ) {
            System.out.println("Hurray....");
            //startLevelOne();
            return true;
        }*/


        if (player.getUp() == 2 && player.getLeft() == 32) {
            System.out.println("You are going to level One");
            player.setReachedObjective(true);
            tutorialComplete = true;
            System.out.println("next level");
            startLevelOne();
            //engine.setLevel(engine.getLevel() + 1);
            return false;
        }
        return false;
    }

    /*public boolean checker() {
        if (player.isDead()) {
            return true;
        }
        return false;
    }*/



    public boolean isTutorialComplete() {
        return tutorialComplete;
    }

    public void setTutorialComplete(boolean tutorialComplete) {
        this.tutorialComplete = tutorialComplete;
    }

    public void startLevelOne() {
        levelOne = new LevelOne();
        levelOne.initLevelOne();
    }





}
