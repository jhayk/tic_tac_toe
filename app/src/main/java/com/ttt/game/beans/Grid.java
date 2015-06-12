package com.ttt.game.beans;

/**
 * Created by harutyungrigoryan on 6/11/15.
 */
public class Grid {

   private Cell[][] cells = new Cell[3][3];

   public Cell[][] getCells() {
      return cells;
   }

   public void setCells(Cell[][] cells) {
      this.cells = cells;
   }
}
