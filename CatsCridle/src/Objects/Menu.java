package Objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu {
    private Picture picture;
    public static Picture background;
    public static final int PADDING = 10;

    public Menu() {
        picture = new Picture(PADDING, PADDING, "");
        picture.draw();
    }

    public Picture getPicture() {
        return picture;
    }

}