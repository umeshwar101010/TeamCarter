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



    /*public Canvas(int width, int height, int level){
        this.width = width;
        this.height = height;
        makeCanvas(level);
    }*/

    public static void makeCanvas(int level) {
        Picture canvas;
        switch( level) {

            case 0:
                 canvas = new Picture(PADDING, PADDING, "resources/Images/Canvas/Wassily-Kandinsky-Softened-Construction.jpg");
                canvas.draw();
                break;
            case 1:

            canvas = new Picture(PADDING, PADDING, "resources/Images/Canvas/Kandinsky_menu.jpg");
            canvas.draw();
            break;

            default:
                canvas = new Picture(PADDING, PADDING, "resources/Images/Canvas/Wassily-Kandinsky-Softened-Construction.jpg");
                canvas.draw();
        }
    }


}
