package Objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Player extends GameObject{
    private String name;

    private Picture playerObject;
    private Rectangle field;
    private static final int PLAYER_CELL_SIZE = 20;
    private int up;
    private int down = 820 / 10;
    private int left;
    private int right = 390 / 10;
    //private int width = 390 / 10;
    //private int heigth = 820;


    public void spawn(){
        playerObject = new Picture(PLAYER_CELL_SIZE, PLAYER_CELL_SIZE,"resources/Images/PlayerObj/playerobj.png");
        playerObject.draw();
    }

    public void moveRight() {
        if(right > 0) {
            playerObject.translate(10, 0);
            left++;
            right--;
        }

    }

    public void moveLeft() {
        if(left > 0) {
            playerObject.translate(-10, 0);
            right++;
            left--;
        }
    }

    public void moveUp() {
        if(up > 0) {
            playerObject.translate(0,-10);
            down++;
            up--;
        }
    }

    public void moveDown() {
        if(down > 0) {
            playerObject.translate(0,+10);
            up++;
            down--;
        }

    }


}
