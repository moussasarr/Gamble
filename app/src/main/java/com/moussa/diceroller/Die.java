package com.moussa.diceroller;

import android.media.Image;

import java.util.Random;

/**
 * Created by MS on 1/23/17.
 */

public class Die {
    private int faceVal = 1;
    private int faceImgSrc = R.drawable.dieone;
    private int rollScore = 0;

    public Die() {
    }

    public int getFaceVal() {
        return faceVal;
    }

    public void setFaceVal(int faceVal) {
        this.faceVal = faceVal;
    }

    public int getFaceImgSrc(){
        return faceImgSrc;
    }

    public int getRollScore() {
        return rollScore;
    }

    public void setRollScore() {
        rollScore = getFaceVal();
    }

    public void setFaceImgSrc(){
        switch(faceVal){
            case 1:
                faceImgSrc = R.drawable.dieone;
                break;
            case 2:
                faceImgSrc = R.drawable.dietwo;
                break;
            case 3:
                faceImgSrc = R.drawable.diethree;
                break;
            case 4:
                faceImgSrc = R.drawable.diefour;
                break;
            case 5:
                faceImgSrc =  R.drawable.diefive;
                break;
            case 6:
                faceImgSrc =  R.drawable.diesix;
                break;
            default:
                faceImgSrc = R.drawable.dieone;
                break;
        }
    }

    public void roll(){
        Random rand = new Random();
        int randomInt =  rand.nextInt(6) + 1;
        setFaceVal(randomInt);
        setFaceImgSrc();
        setRollScore();
    }

}
