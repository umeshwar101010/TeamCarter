package Objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player extends GameObject{
    private String name;

    private Picture playerObject;

    public void spawn(){
        playerObject = new Picture(20, 20,"Images/PlayerObj/playerobj.png");
        playerObject.draw();
    }

    public void moveRight() {
        playerObject.translate(10, 0);
    }

    public void moveLeft() {
        playerObject.translate(-10, 0);
    }

    public void moveUp() {
        playerObject.translate(0,-10);
    }

    public void moveDown() {
        playerObject.translate(0,+10);
    }


}
