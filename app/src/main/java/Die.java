import java.util.Random;

/**
 * Created by MS on 1/23/17.
 */

public class Die {
    private int faceVal = 1;
    private String faceImgSrc = "@drawable/diceone";
    private int rollScore = 0;

    public Die() {
    }

    public int getFaceVal() {
        return faceVal;
    }

    public void setFaceVal(int faceVal) {
        this.faceVal = faceVal;
    }

    public String getFaceImgSrc(){
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
                faceImgSrc = "@drawable/dieone";
                break;
            case 2:
                faceImgSrc = "@drawable/dietwo";
                break;
            case 3:
                faceImgSrc = "@drawable/diethree";
                break;
            case 4:
                faceImgSrc = "@drawable/diefour";
                break;
            case 5:
                faceImgSrc =  "@drawable/diefive";
                break;
            case 6:
                faceImgSrc =  "@drawable/diesix";
                break;
            default:
                faceImgSrc = "@drawable/dieone";
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
