package com.github.TeamCarter.Frame;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import java.awt.*;

public  class Canvas {

    public static final int PADDING = 10;

    private int cellSize = 15;
    private int width ;
    private int height;

    private Rectangle field;

    public Canvas(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void makeCanvas() {
        Rectangle rectangle = new Rectangle(PADDING,PADDING, width, height);
        //this.field = new Rectangle(PADDING,PADDING, cols * cellSize, rows * cellSize);
        rectangle.setColor(Color.MAGENTA);
        rectangle.fill();
        rectangle.draw();
    }

}
