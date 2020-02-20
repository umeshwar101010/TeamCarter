package Engine;

import Objects.GameObject;
import Objects.Obstacles;
import Objects.Player;
import com.github.TeamCarter.Frame.Controls;

import java.awt.*;

public class GameEngine {
    Player player;
    Obstacles obstacles;

    private int obstacle = 1;
    private int level=1;

    public GameEngine(){

        Controls controls = new Controls();
        controls.setPlayerObject(player);
        controls.init();


    }

    public void start(){
        player = new Player();
        obstacles= new Obstacles();

        while(!collide(this.player, this.obstacles)){}



    }
public boolean collide(Player a, Obstacles b){

       if(a.getUp() >6
               && a.getUp()
               < 20 && a.getLeft()
               >6  && a.getLeft()<21 ){
           System.out.println("crashed");
           return true;

       }
      return false;

}


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
