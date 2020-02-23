package org.academiadecodigo.hackstreetboys.engine;


import org.academiadecodigo.hackstreetboys.engine.levels.LevelOne;
import org.academiadecodigo.hackstreetboys.audio.Audio;
import org.academiadecodigo.hackstreetboys.engine.levels.LevelTwo;
import org.academiadecodigo.hackstreetboys.engine.levels.Tutorial;
import org.academiadecodigo.hackstreetboys.gameObjects.Menu;
import org.academiadecodigo.hackstreetboys.gameObjects.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.hackstreetboys.frame.Canvas;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;

public class GameEngine {

    private int level = 0;
    private boolean levelOneOn = true;
    private boolean tutorialComplete = false;
    private boolean levelOneComplete = false;
    private LevelOne levelOne;
    private boolean gameComplete;
    private int currentLevel = 0;
    private Menu menu;
    private Tutorial tutorial;

    public GameEngine() {
        //levelOnCanvas();
        //player = new Player();
        //player.spawn();
    }

    public void start() {
        Audio audio = new Audio();
        audio.startAudio();

        tutorial = new Tutorial();
        startTutorial();


        //levelOne = new LevelOne();
        //startLevelOne();

    }
/*
    public void startLevelOne() {
        if (!levelOne.isLevelOneComplete()) {
            System.out.println("hiiiiiiiiiii");
            levelOne.initLevelOne();

        } else {
            System.out.println("level one");
            levelOneComplete = true;
            currentLevel+=1;

        }

    }*/

    public void startTutorial() {
        if (!tutorial.isTutorialComplete()) {
            System.out.println("hiiiiiiiiiii");
            tutorial.initTutorial();
        } else {
            tutorialComplete = true;
            currentLevel+=1;
            System.out.println("level one");
        }

    }



    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
