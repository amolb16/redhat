package range;

import org.junit.*;
import org.junit.Test;

public class RangeImplemTest{

    private RangeImplem rangeImplem;
    @Before
    public void setUp() throws Exception {
        rangeImplem = new RangeImplem();
    }
    @After
    public void tearDown() throws Exception {
        rangeImplem = null;
    }

    @Test
    public void isInTrueTest(){
        Assert.assertTrue(rangeImplem.newRange(1,5).isIn(5) );
    }

    @Test
    public void isInFalseTest(){
        Assert.assertFalse(rangeImplem.newRange(1,5).isIn(6) );
    }

    @Test
    public void minTest(){
        Assert.assertEquals(rangeImplem.newRange(1,5).add(rangeImplem.newRange(3,5)).min(), 1);
    }

    @Test
    public void maxTest(){
        Assert.assertEquals(rangeImplem.newRange(1,5).add(rangeImplem.newRange(3,8)).max(), 8);
    }

    @Test
    public void addTest(){
        Assert.assertFalse(rangeImplem.newRange(1,5).add(rangeImplem.newRange(8,10)).isIn(6));
        Assert.assertTrue(rangeImplem.newRange(1,5).add(rangeImplem.newRange(8,10)).isIn(9));
    }

//    @Test
//    public void subtractTest(){
//        Assert.assertFalse(rangeImplem.newRange(1,5).subtract(rangeImplem.newRange(3,5)).isIn(5));
//    }
}
