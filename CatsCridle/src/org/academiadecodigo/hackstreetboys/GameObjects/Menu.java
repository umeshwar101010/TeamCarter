package org.academiadecodigo.hackstreetboys.GameObjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu {
    private Picture picture;
    public static Picture background;
    public static final int PADDING = 10;

    public Menu() {
        picture = new Picture(PADDING, PADDING, "resources/Images/Canvas/Kandinsky_menu.jpg");
        picture.draw();
    }

    public Picture getPicture() {
        return picture;
    }

}
