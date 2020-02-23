package org.academiadecodigo.hackstreetboys.engine.levels;

import org.academiadecodigo.hackstreetboys.controls.Controls;
import org.academiadecodigo.hackstreetboys.engine.GameEngine;
import org.academiadecodigo.hackstreetboys.frame.Canvas;
import org.academiadecodigo.hackstreetboys.gameObjects.Player;
import org.academiadecodigo.hackstreetboys.gameObjects.enemies.Enemy;
import org.academiadecodigo.hackstreetboys.gameObjects.enemies.EnemyFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameOver {

    private Picture picture;
    public static final int PADDING = 10;

    public GameOver(){
        picture = new Picture(PADDING, PADDING, "Images/GameOver/Wassily-Kandinsky-Softened-Construction_GameOver.jpg");
        picture.draw();

    }










}
