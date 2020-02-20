package Objects;

import Engine.GameEngine;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Player extends GameObject{
    private String name;
    private GameEngine engine;
    //private Obstacles obs;

    private Picture playerObject;
    //private Rectangle field;
    private static final int PLAYER_CELL_SIZE = 20;
    private int movementPixel=10;
    private int up=0;
    private int down =(850-PLAYER_CELL_SIZE-2*movementPixel)  / movementPixel;
    private int left=0;
    private int right = (423-PLAYER_CELL_SIZE-2*movementPixel) / movementPixel;
    //private int width = 390 / 10;
    //private int heigth = 820;
    public Player(){

        playerObject = new Picture(PLAYER_CELL_SIZE, PLAYER_CELL_SIZE,"resources/Images/PlayerObj/playerobj.png");
        spawn();
    }

    public void spawn(){

        playerObject.draw();
    }

    public void moveRight() {
        if(right >= 0) {
            playerObject.translate(movementPixel, 0);
            left++;
            right--;
            //engine.collide(this, obs );
            System.out.println("right: " + right+ "( up "+ up +"Down "+down +" Left "+left +" Right "+right+" )");
        }

    }

    public void moveLeft() {
        if(left >= 0) {
            playerObject.translate(-movementPixel, 0);
            right++;
            left--;

            //engine.collide(this, obs );
            System.out.println("left: " + left+ "( up "+ up +"Down "+down +" Left "+left +" Right "+right+" )");
        }
    }

    public void moveUp() {
        if(up >= 0) {
            playerObject.translate(0,-movementPixel);
            down++;
            up--;

            //engine.collide(this, obs );
            System.out.println("up: " + up+ "( up "+ up +"Down "+down +" Left "+left +" Right "+right+" )");
        }
    }

    public void moveDown() {
        if(down >= 0) {
            playerObject.translate(0,+movementPixel);
            up++;
            down--;

            //engine.collide(this, obs );
            System.out.println("down: " + down+ "( up "+ up +"Down "+down +" Left "+left +" Right "+right+" )");
        }


    }

    public int getDown() {
        return down;
    }

    public int getUp() {
        return up;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
