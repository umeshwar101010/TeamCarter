package Objects;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;


public class Enemy extends GameObject{

    private Ellipse enemyObject;
    private static final int ENEMY_CELL_SIZE = 20;
    private int up;
    private int down = 800 / 10;
    private int left;
    private int right = 370 / 10;

    public void spawn(){
        enemyObject = new  Ellipse(50,50,10,10);
        enemyObject.draw();
    }

    public void move() {
        int randomMove = (int) Math.ceil(Math.random()*4);

        switch (randomMove){
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

    public void moveRight() {

        if(right > 0) {
            enemyObject.translate(10, 0);
            //enemyObject.translate(10, 0);
            left++;
            right--;
        }
    }

    public void moveLeft() {
        if(left > 0) {
            enemyObject.translate(-10, 0);
            right++;
            left--;
        }
    }

    public void moveUp() {
        if(up > 0) {
            enemyObject.translate(0,-10);
            down++;
            up--;
        }
    }

    public void moveDown() {
        if(down > 0) {
            enemyObject.translate(0,+10);
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
