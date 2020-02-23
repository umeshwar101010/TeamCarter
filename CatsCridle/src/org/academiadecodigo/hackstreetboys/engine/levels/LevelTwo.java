
package org.academiadecodigo.hackstreetboys.engine.levels;



import org.academiadecodigo.hackstreetboys.controls.Controls;
import org.academiadecodigo.hackstreetboys.engine.GameEngine;
import org.academiadecodigo.hackstreetboys.frame.Canvas;
import org.academiadecodigo.hackstreetboys.gameObjects.Player;
import org.academiadecodigo.hackstreetboys.gameObjects.enemies.Enemy;
import org.academiadecodigo.hackstreetboys.gameObjects.enemies.EnemyFactory;

public class LevelTwo {

    private Player player;
    private boolean levelTwoComplete = false;
    private Enemy[] enemy;
    private int numberOfEnemies = 2;
    private GameEngine engine = new GameEngine();


    public void initLevelTwo() {

        levelTwoCanvas();
        enemy = new Enemy[numberOfEnemies];
        for(int i = 0; i < enemy.length; i++) {
            enemy[i] = EnemyFactory.getNewEnemy();
            enemy[i].spawn();
        }
        //enemy.spawn();
        player = new Player();
        player.spawn();
        Controls controls = new Controls();
        controls.setPlayerObject(player);
        controls.init();
        moveGameObjects();
    }


    public void levelTwoCanvas() {
        Canvas.makeCanvas(1);
    }

    public void moveGameObjects() {
        while (!player.isReachedObjective() || !checkCollisionLevel2()) {
            moveAllEnemies();
        }
    }

    private void moveAllEnemies() {
        for(int i = 0; i < enemy.length; i++) {
            checkCollisionLevel2();
            enemy[i].move();

        }
    }

    public boolean checkCollisionLevel2() {
        checkerLevelTwo();
        if (player.isDead()) {
            System.out.println("Player is dead. Restart level");
            startLevelTwo();
            return true;
        }
        if (player.getUp() == 75 && player.getLeft() == 20) {
            System.out.println("You've arrived level Two");
            player.setReachedObjective(true);
            engine.setLevel(engine.getLevel() + 1);
            GameOver gameover= new GameOver();
            return false;
        }
        return false;
    }
/* --------- test what's commented out is the previous version -------
    public void checkerLevelTwo() {

        for(int i = 0; i < enemy.length; i++) {
            if(player.getPos().equals(enemy[i].getPos())); {
                player.setDead(true);
                System.out.println("is player dead: " + player.isDead());
                System.out.println();
            }
        }
    }

   ---another version--------
     if(player.getPos().equals(enemy[i].getPos())) {
                player.setDead(true);
                System.out.println("Checker" + player.isDead());
                System.out.println();
                return true;
            }

 */

    public boolean checkerLevelTwo() {

        for(int i = 0; i < enemy.length; i++) {
            if((player.getUp() == enemy[i].getUp() || player.getUp() == (enemy[i].getUp() + 2) || player.getUp() == (enemy[i].getUp() - 2)) &&
                    (player.getLeft() == enemy[i].getLeft() || player.getLeft() == (enemy[i].getLeft() + 2) || player.getLeft() == (enemy[i].getLeft() - 2))) {
                player.setDead(true);
                System.out.println("Checker" + player.isDead());
                System.out.println();
                return true;
            }
        }
        return false;
    }

    public void startLevelTwo() {
        LevelTwo levelTwo = new LevelTwo();
        levelTwo.initLevelTwo();
    }





    public boolean isLevelTwoComplete() {
        return levelTwoComplete;
    }

    public void setLevelTwoComplete(boolean levelOneComplete) {
        this.levelTwoComplete = levelOneComplete;
    }
}
