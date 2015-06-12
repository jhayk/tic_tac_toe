package com.ttt.game.beans;

/**
 * Created by harutyungrigoryan on 6/11/15.
 */
public class Game {
    private Grid grid = new Grid();

    private int state; // -1 fail  0 tie  1 won

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
