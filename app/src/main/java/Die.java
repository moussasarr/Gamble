import java.util.Random;

/**
 * Created by MS on 1/23/17.
 */

public class Die {
    private int faceVal = 1;

    public int getFaceVal() {
        return faceVal;
    }

    public void setFaceVal(int faceVal) {
        this.faceVal = faceVal;
    }

    public int roll {
        Random rand = new Random();
        int randomInt =  rand.nextInt(6) + 1;
        setFaceVal(randomInt);
        getFaceVal()
    }

}
