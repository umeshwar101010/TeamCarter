package org.academiadecodigo.hackstreetboys.engine.levels;

import org.academiadecodigo.hackstreetboys.frame.Canvas;

public class Menu {

    private boolean levelOneMenu;

    public void levelMenuCanvas() {
        Canvas.makeCanvas(0);
    }

    public void initMenu() {
        levelMenuCanvas();
    }

    public boolean isLevelOneMenu() {
        return levelOneMenu;
    }

    public void setLevelOneMenu(boolean levelOneMenu) {
        this.levelOneMenu = levelOneMenu;
    }
}
