/**
 * Created by MS on 1/23/17.
 */

public class SixDice {
    private Die die1, die2, die3, die4, die5, die6;
    private int rollScore = 0;

    public int getRollScore() {
        return rollScore;
    }

    public void setRollScore() {
        rollScore = die1.getRollScore() + die2.getRollScore() + die3.getRollScore() + die4.getRollScore()
                + die5.getRollScore() + die6.getRollScore();
    }

    public SixDice(){
        die1 = new Die();
        die2 = new Die();
        die3 = new Die();
        die4 = new Die();
        die5 = new Die();
        die6 = new Die();
    }

    public void roll(){
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
        die6.roll();
        setRollScore();
    }
}
