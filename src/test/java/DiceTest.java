import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class DiceTest {

    private Dice dice;

    @Test
    public void getSeedTest(){
        dice = new Dice(2);
        int actualSeed = dice.getSeed();
        int expectedSeed = 5;
        Assert.assertEquals(actualSeed, expectedSeed);
    }

    // do we need one for the setter?


    @Test

    public void tossAndSumTest(){
        dice = new Dice(2);
        Random random = new Random(5);
        int expectedSum = (random.nextInt(6) + 1) + (random.nextInt(6) + 1);
        int actualSum = dice.tossAndSum();
        Assert.assertEquals(actualSum, expectedSum);

    }

}
