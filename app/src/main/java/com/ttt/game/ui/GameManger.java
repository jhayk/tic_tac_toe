package com.ttt.game.ui;

import android.app.Activity;
import android.view.View;

import com.ttt.game.R;
import com.ttt.game.beans.Game;

/**
 * Created by harutyungrigoryan on 6/11/15.
 */
public class GameManger {

    private Activity activity;

    public GameManger(Activity activity){
        this.activity=activity;
    }
    public void start (){
        View cell_00 = activity.findViewById(R.id.cell_00);
        cell_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public int procedure(Game y) {

      /*  //WON
        if (y.firstGird.cells[0][0].getSymbol() == 1 && y.firstGird.cells[0][1].getSymbol() == 1 && y.firstGird.cells[0][2].getSymbol() == 1) {
            return 1;
        }
        if (y.firstGird.cells[1][0].getSymbol() == 1 && y.firstGird.cells[1][1].getSymbol() == 1 && y.firstGird.cells[1][2].getSymbol() == 1) {
            return 1;
        }
        if (y.firstGird.cells[2][0].getSymbol() == 1 && y.firstGird.cells[2][1].getSymbol() == 1 && y.firstGird.cells[2][2].getSymbol() == 1) {
            return 1;
        }


        if (y.firstGird.cells[0][0].getSymbol() == 1 && y.firstGird.cells[1][0].getSymbol() == 1 && y.firstGird.cells[2][0].getSymbol() == 1) {
            return 1;
        }
        if (y.firstGird.cells[0][1].getSymbol() == 1 && y.firstGird.cells[1][1].getSymbol() == 1 && y.firstGird.cells[2][1].getSymbol() == 1) {
            return 1;
        }
        if (y.firstGird.cells[0][2].getSymbol() == 1 && y.firstGird.cells[1][2].getSymbol() == 1 && y.firstGird.cells[2][2].getSymbol() == 1) {
            return 1;
        }


        if (y.firstGird.cells[0][0].getSymbol() == 1 && y.firstGird.cells[1][1].getSymbol() == 1 && y.firstGird.cells[2][2].getSymbol() == 1) {
            return 1;
        }
        if (y.firstGird.cells[0][2].getSymbol() == 1 && y.firstGird.cells[1][1].getSymbol() == 1 && y.firstGird.cells[2][0].getSymbol() == 1) {
            return 1;
        }


        //FAIL
        if (y.firstGird.cells[0][0].getSymbol() == -1 && y.firstGird.cells[0][1].getSymbol() == -1 && y.firstGird.cells[0][2].getSymbol() == -1) {
            return -1;
        }
        if (y.firstGird.cells[1][0].getSymbol() == -1 && y.firstGird.cells[1][1].getSymbol() == -1 && y.firstGird.cells[1][2].getSymbol() == -1) {
            return -1;
        }
        if (y.firstGird.cells[2][0].getSymbol() == -1 && y.firstGird.cells[2][1].getSymbol() == -1 && y.firstGird.cells[2][2].getSymbol() == -1) {
            return -1;
        }


        if (y.firstGird.cells[0][0].getSymbol() == -1 && y.firstGird.cells[1][0].getSymbol() == -1 && y.firstGird.cells[2][0].getSymbol() == -1) {
            return -1;
        }
        if (y.firstGird.cells[0][1].getSymbol() == -1 && y.firstGird.cells[1][1].getSymbol() == -1 && y.firstGird.cells[2][1].getSymbol() == -1) {
            return -1;
        }
        if (y.firstGird.cells[0][2].getSymbol() == -1 && y.firstGird.cells[1][2].getSymbol() == -1 && y.firstGird.cells[2][2].getSymbol() == -1) {
            return -1;
        }


        if (y.firstGird.cells[0][0].getSymbol() == -1 && y.firstGird.cells[1][1].getSymbol() == -1 && y.firstGird.cells[2][2].getSymbol() == -1) {
            return -1;
        }
        if (y.firstGird.cells[0][2].getSymbol() == -1 && y.firstGird.cells[1][1].getSymbol() == -1 && y.firstGird.cells[2][0].getSymbol() == -1) {
            return -1;
        }


        //TIE
        for (int i = 0; i < y.firstGird.cells.length; i++) {
            for (int j = 0; j < y.firstGird.cells.length; j++) {
                if (y.firstGird.cells[i][j].getSymbol() == 0) {
                    return 0;
                }
            }
        }
*/
        return 0;

    }
}

