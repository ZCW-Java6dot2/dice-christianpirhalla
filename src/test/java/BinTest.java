import org.junit.Assert;
import org.junit.Test;

public class BinTest {

    private Bins bins;

    @Test
    public void getBinTest(){
        bins = new Bins(2, 12);
        Integer expected = 0;
        Integer actual = bins.getBin(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBinTest2(){ // try to get a bin that's not there
        bins = new Bins(2, 12);
        Integer expected = null;
        Integer actual = bins.getBin(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinTest(){
        bins = new Bins(2, 12);
        bins.incrementBin(2);
        int expected = 1;
        int actual = bins.getBin(2);
        Assert.assertEquals(expected, actual);

    }

}
