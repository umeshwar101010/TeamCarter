package Engine;

import Objects.Enemy;
import Objects.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import com.github.TeamCarter.Frame.Controls;
import com.github.TeamCarter.Frame.Canvas;

import java.awt.*;

public class GameEngine {

    private int currentLevel = 1;
    private Player player;
    private boolean levelOneOn = true;
    private boolean levelTwoOn;
    private boolean levelOneComplete = false;

    private Enemy enemy;

    public GameEngine() {
        //levelOnCanvas();
        //player = new Player();
        //player.spawn();
    }

    public void init() {
        //Player player = new Player();
        if (!levelOneComplete){
            levelOneCanvas();
            player = new Player();
            player.spawn();

            enemy = new Enemy();
            enemy.spawn();
            //enemy.move();

            Controls controls = new Controls();

            controls.setPlayerObject(player);
            controls.init();
        }


    }

  public void levelOneCanvas() {
        Canvas canvas= new Canvas(423, 850);
        canvas.makeCanvas();
    }


    public void start() {

        switch (currentLevel) {
            case 0:
//-------------------------MENU-------------------------------
            case 1:
                Rectangle rectangle = new Rectangle(10, 10, 423, 850);
                rectangle.draw();
                rectangle.fill();
                startLevelOne();
            case 2:
                Rectangle rectangle2 = new Rectangle(10, 10, 423, 850);
                rectangle2.draw();
                rectangle2.fill();
                break;
        }

    }

    public void startLevelOne(){
        init();
        while(!player.isReachedObjective()) {
            if(levelOneOn) {
                enemy.move();
                System.out.println(player.getUp() + " " + player.getLeft() + " !");;
            }
        }
        levelOneOn = false;
        levelTwoOn = true;
        currentLevel = 2;
        Rectangle c = new Rectangle(10, 10, 89, 90);
        c.draw();
        c.fill();
    }

    public boolean isLevelOneOn() {
        return levelOneOn;
    }

    public int getLevel() {
        return currentLevel;
    }

    public void setLevel(int level) {
        this.currentLevel = level;
    }

}
