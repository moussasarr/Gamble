/**
 * Created by MS on 1/23/17.
 */

package com.moussa.diceroller;

public class ThreeDice {
    Die die1, die2, die3;
    private int rollScore = 0;

    public int getRollScore() {
        return rollScore;
    }

    public void setRollScore() {
       rollScore = die1.getRollScore() + die2.getRollScore() + die3.getRollScore();
    }

    public ThreeDice(){
        die1 = new Die();
        die2 = new Die();
        die3 = new Die();
    }

    public void roll(){
        die1.roll();
        die2.roll();
        die3.roll();
        setRollScore();
    }

    public int[] getFaceImgValues(){
        int die1Face, die2Face, die3Face;
        int [] values = new int[3];

        die1Face = die1.getFaceImgSrc();
        die2Face = die2.getFaceImgSrc();
        die3Face = die3.getFaceImgSrc();
        values[0] =  die1Face;
        values[1] =  die2Face;
        values[2] =  die3Face;
        return values;
    }

}
