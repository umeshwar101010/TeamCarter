package Engine;

import Objects.Enemy;
import Objects.GameObject;
import Objects.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import com.github.TeamCarter.Frame.Controls;
import com.github.TeamCarter.Frame.Canvas;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import static Objects.Menu.PADDING;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;

public class GameEngine {

    private int obstacle = 1;
    private int level = 0;


    //private boolean levelOneOn = true;
    private boolean levelTwoOn;

    private Player player;
    private Enemy enemy;

    private GameObject gameObject;
    private Canvas canvas; //= new Canvas(gameObject.WIDTH, gameObject.HEIGHT, level);


    public GameEngine() {
        //levelOnCanvas();
        //player = new Player();
        //player.spawn();
    }


    public void init() {
        //Player player = new Player();
        //levelOneCanvas();

        enemy = new Enemy();
        enemy.spawn();


        player = new Player(enemy);
        player.spawn();


        //enemy.move();

        Controls controls = new Controls();

        controls.setPlayer(player);
        controls.init();
    }

    //    public void levelOneCanvas() {
    //      Canvas canvas= new Canvas(WIDTH, HEIGHT);
    //    canvas.makeCanvas();
    //}
    public void start() {

        Canvas.makeCanvas(level);
        init();


        switch (level) {
            case 1:
                Canvas.makeCanvas(level);
                init();

                Rectangle rectangle = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
                rectangle.draw();
                rectangle.fill();

            case 2:
                Canvas.makeCanvas(level);
                init();
                Rectangle rectangle1 = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
                rectangle1.draw();
                rectangle1.fill();
            case 3:
                Canvas.makeCanvas(level);
                init();
                Rectangle rectangle2 = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
                rectangle2.draw();
                rectangle2.fill();
                break;
        }
        moveGameObjects();
    }

    public void moveGameObjects() {

        while (!player.isReachedObjective() || !checkCollision()) {
            checkCollision();


            enemy.move();
            //System.out.println(player.getUp() + " " + player.getLeft() + " !");



        }


    }
    public boolean checker() {
        if (player.isDead()) {
            return true;
        }
        if ((player.getUp() == enemy.getUp() || player.getUp() == (enemy.getUp() + 2) || player.getUp() == (enemy.getUp() - 2)) &&
                (player.getLeft() == enemy.getLeft() || player.getLeft() == (enemy.getLeft() + 2) || player.getLeft() == (enemy.getLeft() - 2))) {
            System.out.println("same coordinates");
            return true;
        }
        return false;
    }

    /*
    public boolean checker() {
        if (player.isDead()) {
            return true;
        }
        if ((player.getUp() == enemy.getUp() || player.getUp() == (enemy.getUp() + 2) || player.getUp() == (enemy.getUp() - 2)) &&
                (player.getLeft() == enemy.getLeft() || player.getLeft() == (enemy.getLeft() + 2) || player.getLeft() == (enemy.getLeft() - 2))) {
            System.out.println("same coordinates");
            return true;
        }
        return false;
    }*/

    /*public boolean checker (){
      if(player.getUp() == enemy.getUp() && player.getLeft()==enemy.getLeft()){
          System.out.println("same coordinates");
          return true;
      }
      return false;
    }*/
    /*public boolean checker (){
        int up= (player.getUp()==enemy.getUp())?1:0;
        //int down=(player.getDown()==enemy.getDown()?1:0);
        int left =(player.getLeft()==enemy.getLeft()?1:0);
        //int right=(player.getRight()==enemy.getRight()?1:0);
        int total=up+left;
        return total==2 ? true : false;
    }*/

    public boolean checkCollision() {

        if (checker() ) {
            System.out.println("Hurray....");
            start();

            return true;
        }
        if (player.getUp() == 75 && player.getLeft() == 20) {
            System.out.println("You've arrived");
            player.setReachedObjective(true);
            level++;
            start();

            return false;
        }
        return false;
    }



    /*public void startLevelOne(){
        init();

        levelOneOn = false;
        levelTwoOn = true;
        level = 2;
        System.out.println("hiiiiii");
        Rectangle c = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
        c.draw();
        c.fill();
    }*/
/*
  private boolean reachedObjective;

    public void checkCollision(){

        if(player.getUp() == 75 && player.getLeft() == 20){
            System.out.println("You've arrived");
            reachedObjective = true;
        }
    }


 */


    public int getObstacle() {
        return obstacle;
    }

    public int getLevel() {
        return level;
    }

    public void setObstacle(int obstacle) {
        this.obstacle = obstacle;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
