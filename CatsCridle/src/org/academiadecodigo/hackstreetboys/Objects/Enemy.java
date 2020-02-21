package org.academiadecodigo.hackstreetboys.Objects;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;

import static org.academiadecodigo.hackstreetboys.Objects.Menu.PADDING;



public class Enemy extends GameObject {

    private Ellipse enemyObject;


    private int up;
    private int down = (HEIGHT-2* PADDING -PLAYER_CELL_SIZE)/ MOVEMENT;
    private int left;
    private int right = (WIDTH-2* PADDING -PLAYER_CELL_SIZE )/ 10;

    public void spawn() {
        enemyObject = new Ellipse(50, 50, 50, 50);
        //enemyObject.wait();
       /* try {
            enemyObject.wait(10000, 10);
        } catch (Exception ex) {
            System.out.println("HURRAY WE MADE IT");
        }*/
       enemyObject.fill();
        enemyObject.draw();
    }

    public void move() {
        int randomMove = (int) Math.ceil(Math.random() * 4);

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
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void moveRight() {

        if (right >= 0) {
            Enemy.delay();
            enemyObject.translate(MOVEMENT, 0);
            //enemyObject.translate(10, 0);

            left++;
            right--;
        }
    }

    public void moveLeft() {
        if (left >= 0) {
            Enemy.delay();
            enemyObject.translate(-MOVEMENT, 0);
            right++;
            left--;
        }
    }

    public void moveUp() {
        if (up >= 0) {
            Enemy.delay();
            enemyObject.translate(0, -MOVEMENT);
            down++;
            up--;
        }
    }

    public void moveDown() {
        if (down >= 0) {
            Enemy.delay();
            enemyObject.translate(0, +MOVEMENT);
            up++;
            down--;
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
