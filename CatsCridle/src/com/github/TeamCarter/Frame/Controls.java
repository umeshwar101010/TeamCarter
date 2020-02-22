package com.github.TeamCarter.Frame;

import Engine.GameEngine;
import Objects.Player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {
    private Player player;
    private GameEngine gameEngine;

    public void init() {
        Keyboard keyboard = new Keyboard(this);

        //right
        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rightPressed);

        //left
        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(leftPressed);//start listening to that event

        // Up
        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(upPressed);//start listening to that event

        // Down
        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(downPressed);//start listening to that event


        KeyboardEvent play = new KeyboardEvent();
                play.setKey(KeyboardEvent.KEY_P);
        play.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

                keyboard.addEventListener(play);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {


            case KeyboardEvent.KEY_RIGHT:
                player.moveRight();
                break;


            case KeyboardEvent.KEY_LEFT:
                player.moveLeft();
                break;

            case KeyboardEvent.KEY_UP:
                player.moveUp();
                break;

            case KeyboardEvent.KEY_DOWN:
                player.moveDown();
                break;


        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}


