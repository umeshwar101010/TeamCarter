package org.academiadecodigo.hackstreetboys.frame;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public  class Canvas {

    private static double PADDING = 10;
    private int width ;
    private int height;

    private Rectangle field;

    public static void makeCanvas(int level) {
        Picture canvas;
        switch(level) {

            case 0:
                canvas = new Picture(PADDING, PADDING, "resources/Images/Canvas/Kandinsky_menu.jpg");
                canvas.draw();
                break;
            case 1:
                canvas = new Picture(PADDING, PADDING, "Images/Canvas/Wassily-Kandinsky-Softened-Construction.jpg");
                canvas.draw();
                break;

            default:
                canvas = new Picture(PADDING, PADDING, "resources/Images/Canvas/Wassily-Kandinsky-Softened-Construction.jpg");
                canvas.draw();
        }
    }
}
