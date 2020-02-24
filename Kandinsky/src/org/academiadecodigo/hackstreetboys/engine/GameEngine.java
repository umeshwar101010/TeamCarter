package org.academiadecodigo.hackstreetboys.engine;


import org.academiadecodigo.hackstreetboys.audio.Audio;
import org.academiadecodigo.hackstreetboys.engine.levels.Tutorial;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public class GameEngine {

    private int level = 0;
    private boolean tutorialComplete = false;
    private int currentLevel = 0;
    private Tutorial tutorial;

    public GameEngine() {

    }

    public void start() {
        Audio audio = new Audio();
        audio.startAudio();
        tutorial = new Tutorial();
        startTutorial();
    }

    public void startTutorial() {
        if (!tutorial.isTutorialComplete()) {
            System.out.println("hiiiiiiiiiii");
            tutorial.initTutorial();
        } else {
            tutorialComplete = true;
        }

    }



    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
