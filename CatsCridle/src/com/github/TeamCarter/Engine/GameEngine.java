package com.github.TeamCarter.Engine;

public class GameEngine {

    private int obstacle = 1;
    private int level=1;

    public void start(){



            for (int i = 0; i < obstacle; i++) {
                //PlayerMaker.playerMaker();


            }
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
