package Objects;

import Engine.GameEngine;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

import static Objects.Menu.PADDING;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;

public class Player extends GameObject{

    private String name;

    private Picture playerObject;
    private boolean dead=false;

    private static final int PLAYER_CELL_SIZE = 20;
    private int up;
    private int down = (HEIGHT-2* PADDING -PLAYER_CELL_SIZE ) / MOVEMENT;
    private int left;
    private int right = (WIDTH-2* PADDING -PLAYER_CELL_SIZE )/ MOVEMENT;
    private boolean reachedObjective;

    private GameEngine gameEngine;

    private int enemyUp;
    private int enemyLeft;



    public Player(Enemy enemy){

        this.enemyUp=enemy.getUp();
        this.enemyLeft=enemy.getLeft();



    }


     public void checkCollision(){

       if(this.enemyUp==this.up &&this.enemyLeft==this.left  ){
            dead=true;
           System.out.println("HURRAY.............. ");
       }

    }

    public void spawn(){
        playerObject = new Picture(PLAYER_CELL_SIZE, PLAYER_CELL_SIZE,"resources/Images/PlayerObj/playerobj.png");
        playerObject.draw();
    }

    public void moveRight() {
        checkCollision();
        if(dead){
            return;
        } else if (right >= 0) {
            playerObject.translate(MOVEMENT, 0);
            left++;
            right--;
            System.out.println("Player up = "+this.up + "   left = "+ this.left+"  down = "+this.down + "   right = "+ this.right);
            //System.out.println("destination: " + reachedObjective);
            //checkCollision();
            //System.out.println("level: " + gameEngine.isLevelOn());
        }
    }

    public void moveLeft() {
        checkCollision();
        if(dead){
            return;
        } else if(left >= 0) {
            playerObject.translate(-MOVEMENT, 0);
            right++;
            left--;
            System.out.println("Player up = "+this.up + "   left = "+ this.left+"  down = "+this.down + "   right = "+ this.right);
            //checkCollision();
            //checkDestination();
            //System.out.println("level: " + gameEngine.isLevelOn());
        }
    }

    public void moveUp() {
        checkCollision();
        if(dead){
            return;
        } else if(up >= 0) {
            playerObject.translate(0,-MOVEMENT);
            down++;
            up--;
            System.out.println("Player up = "+this.up + "   left = "+ this.left+"  down = "+this.down + "   right = "+ this.right);
            //System.out.println("\n");
            //checkCollision();
            //checkDestination();
            //System.out.println("level: " + gameEngine.isLevelOn());
        }
    }

    public void moveDown() {
        checkCollision();
        if(dead){
            return;
        } else if(down >= 0) {
            playerObject.translate(0,+MOVEMENT);
            up++;
            down--;
            System.out.println("Player up = "+this.up + "   left = "+ this.left+"  down = "+this.down + "   right = "+ this.right);
            //System.out.println("\n");
            //checkCollision();
            //checkDestination();
            //System.out.println("level: " + gameEngine.isLevelOn());
        }

    }

    public int getUp() {
        return up;
    }

    public int getLeft() {
        return left;
    }

    public int getDown() {
        return down;
    }

    public int getRight() {
        return right;
    }

    public void setReachedObjective(boolean reachedObjective) {
        this.reachedObjective = true;
    }

    public boolean isReachedObjective() {
        return reachedObjective;
    }

    public boolean isDead() {
        return dead;
    }
}
