package org.academiadecodigo.hackstreetboys.gameObjects;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;




public class Enemy extends GameObject {

    private Rectangle enemyObject;

    private int initialization=100;
    private int sizeOfEnemy=50;
    private int up=(initialization-2*PADDING)/MOVEMENT;
    private int down = (HEIGHT-2* PADDING -sizeOfEnemy )/ MOVEMENT-8;
    private int left=(initialization-2*PADDING)/MOVEMENT;
    private int right = (WIDTH-2* PADDING -sizeOfEnemy )/ MOVEMENT-8;

    public void spawn() {
        enemyObject = new Rectangle(initialization, initialization, sizeOfEnemy, sizeOfEnemy);
        //enemyObject.wait();
       /* try {
            enemyObject.wait(10000, 10);
        } catch (Exception ex) {
            System.out.println("HURRAY WE MADE IT");
        }*/
       enemyObject.fill();
        enemyObject.draw();
    }
@Override
    public void move() {
        int randomMove = (int) Math.ceil(Math.random() * 4);
    System.out.println("Enemy up = "+this.up + "   left = "+ this.left);
    System.out.println("Enemy down = "+this.down + "   right = "+ this.right);

        switch (randomMove) {
            case 1:
                moveRight();
                break;
            case 2:
                moveLeft();
                break;
            case 3:
                moveUp();
                break;
            case 4:
                moveDown();
                break;
        }

      /*  setUp(getUp() + up);
        setDown(getDown() + down);
        setLeft(getLeft() + left);
        setRight(getRight() + right);

       */

        /*if(up != 0 && right != 0 && down != 0 && left != 0){
            setUp(getUp() + up);
            setDown(getDown() + down);
            setLeft(getLeft() + left);
            setRight(getRight() + right);
        }

         */
    }

    public static void delay(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void moveRight() {

        if (right >= 0) {
            //Enemy.delay();
            enemyObject.translate(MOVEMENT, 0);
            //enemyObject.translate(10, 0);
            Enemy.delay();
            left++;
            right--;
            //Enemy.delay();

        }
    }

    public void moveLeft() {
        if (left >= 0) {
            //Enemy.delay();
            enemyObject.translate(-MOVEMENT, 0);
            Enemy.delay();
            right++;
            left--;
            //Enemy.delay();
        }
    }

    public void moveUp() {
        moveRight();
        if (up >= 0) {
            //Enemy.delay();
            enemyObject.translate(0, -MOVEMENT);
            Enemy.delay();
            down++;
            up--;
            //Enemy.delay();
        }
    }

    public void moveDown() {
        moveRight();
        if (down >= 0) {
            //Enemy.delay();
            enemyObject.translate(0, +MOVEMENT);
            Enemy.delay();
            up++;
            down--;
            //Enemy.delay();
        }
    }

    //------------------Getters and setters------------------------
    public void setUp(int up) {
        this.up = up;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setDown(int down) {
        this.down = down;
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
}
