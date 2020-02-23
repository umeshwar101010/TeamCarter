package org.academiadecodigo.hackstreetboys.gameObjects;

import org.academiadecodigo.hackstreetboys.controls.Controls;
import org.academiadecodigo.hackstreetboys.engine.levels.LevelOne;
import org.academiadecodigo.hackstreetboys.engine.levels.LevelTwo;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu implements KeyboardHandler {
    private Picture picture;
    public static final int PADDING = 10;
    private LevelOne levelOne;
    public boolean MenuComplete;


    public Menu() {
        picture = new Picture(PADDING, PADDING, "Images/Menu/menu.png");
        picture.draw();
        startMenu();

    }

    public Picture getPicture() {
        return picture;
    }

    public void startMenu() {
        Keyboard keyboard = new Keyboard(this);
        KeyboardEvent pPressed = new KeyboardEvent();
        pPressed.setKey(KeyboardEvent.KEY_P);
        pPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pPressed);

        KeyboardEvent qPressed = new KeyboardEvent();
        qPressed.setKey(KeyboardEvent.KEY_Q);
        qPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(qPressed);
    }
    public void startLevelOne() {
        levelOne = new LevelOne();
        levelOne.startLevelOne();
    }
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_P:
                System.out.println("p");
                setMenuComplete(true);
                startLevelOne();
                break;


            case KeyboardEvent.KEY_Q:
                break;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


    public void setMenuComplete(boolean menuComplete) {
        MenuComplete = menuComplete;
    }

}
