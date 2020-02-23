package org.academiadecodigo.hackstreetboys.engine;


import org.academiadecodigo.hackstreetboys.engine.levels.LevelOne;
import org.academiadecodigo.hackstreetboys.audio.Audio;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.hackstreetboys.frame.Canvas;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;

public class GameEngine {

    private int level = 1;
    private boolean levelOneOn = true;
    private boolean levelTwoOn;
    private boolean levelOneComplete = false;
    private LevelOne levelOne;


    public GameEngine() {
        //levelOnCanvas();
        //player = new Player();
        //player.spawn();
    }


    public void start() {

        Canvas.makeCanvas(level);
        levelOne = new LevelOne();
        Audio audio = new Audio();
        audio.startAudio();
        levelOne.initLevelOne();


        switch (level) {
            case 1:
                Canvas.makeCanvas(level);
                levelOne.initLevelOne();

                Rectangle rectangle = new Rectangle(10, 10, WIDTH, HEIGHT);
                rectangle.draw();
                rectangle.fill();
                //moveGameObjects();

            case 2:
                Canvas.makeCanvas(level);
                levelOne.initLevelOne();
                Rectangle rectangle1 = new Rectangle(10, 10, WIDTH, HEIGHT);
                rectangle1.draw();
                rectangle1.fill();
                //moveGameObjects();
            case 3:
                Canvas.makeCanvas(level);
                levelOne.initLevelOne();
                Rectangle rectangle2 = new Rectangle(10, 10, WIDTH, HEIGHT);
                rectangle2.draw();
                rectangle2.fill();
                //moveGameObjects();
                break;
        }
    }
}
