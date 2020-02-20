package Objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Obstacles extends GameObject{


    private Picture playerObject;
    public void spawn(){
        playerObject = new Picture(100, 100,"resources/Images/EnemyObs/square.png");
        playerObject.draw();
    }


}
