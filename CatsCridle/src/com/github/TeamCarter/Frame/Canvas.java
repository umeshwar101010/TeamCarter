package com.github.TeamCarter.Frame;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

import static Objects.Menu.PADDING;

public  class Canvas {

    private int width ;
    private int height;

    private Rectangle field;


    public Canvas(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void makeCanvas() {
        Picture canvas = new Picture(PADDING, PADDING, "resources/Images/Canvas/Wassily-Kandinsky-Softened-Construction.jpg");
        canvas.draw();
    }


}
