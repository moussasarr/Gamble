/**
 * Created by MS on 1/23/17.
 */

package com.moussa.diceroller;

public class FourDice {
    private Die die1, die2, die3, die4;
    private int rollScore = 0;

    public int getRollScore() {
        return rollScore;
    }

    public void setRollScore() {
        rollScore = die1.getRollScore() + die2.getRollScore() + die3.getRollScore() + die4.getRollScore();
    }

    public FourDice(){
        die1 = new Die();
        die2 = new Die();
        die3 = new Die();
        die4 = new Die();
    }

    public void roll(){
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        setRollScore();
    }

}
