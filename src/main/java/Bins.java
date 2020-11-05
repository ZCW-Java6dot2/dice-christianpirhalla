import java.util.HashMap;

public class Bins {
    int[] binSet; //would rather use a different structure for this, update in future?
    int lowRange;
    int highRange;

    public Bins(int i, int j) {
        this.lowRange = i;
        this.highRange = j;
        binSet = new int[highRange+1];
    }

    public Integer getBin(int i) {
        if (i >= lowRange && i <= highRange){
            return binSet[i];
        }
        return null;
    }

    public void incrementBin(int i) {
        if (i >= lowRange && i <= highRange){
            binSet[i]++;
        }
    }
}
