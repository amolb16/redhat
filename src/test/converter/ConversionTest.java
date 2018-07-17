package converter;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversionTest {

    private Conversion conversion;
    @Before
    public void setUp() throws Exception {
        conversion = new Conversion();
    }
    @After
    public void tearDown() throws Exception {
        conversion = null;
    }

    @Test
    public void base10to2PositiveValueTest(){
        Assert.assertEquals(conversion.base10to2("127"), "01111111");
    }

    @Test
    public void base10to2NegativeValueTest(){
        Assert.assertEquals(conversion.base10to2("-127"), "10000001");
    }

    @Test
    public void base10to2Positive0ValueTest(){
        Assert.assertEquals(conversion.base10to2("0"), "00000000");
    }

    @Test
    public void base10to2Negative0ValueTest(){
        Assert.assertEquals(conversion.base10to2("-0"), "00000000");
    }

    @Test
    public void negBase2PositiveValueTest(){
        Assert.assertEquals(conversion.negBase2("127"), "10000001");
    }

    @Test
    public void negBase2NegativeValueTest(){
        Assert.assertEquals(conversion.negBase2("-127"), "01111111");
    }

    @Test
    public void negBase2OutOfBoundPositiveValueTest(){
        Assert.assertEquals(conversion.negBase2("150"), "Given number is not in between -127 and 127");
    }

    @Test
    public void negBase2OutOfBoundNegativeValueTest(){
        Assert.assertEquals(conversion.negBase2("-160"), "Given number is not in between -127 and 127");
    }

    @Test
    public void base10to2OutOfBoundPositiveValueTest(){
        Assert.assertEquals(conversion.negBase2("320"), "Given number is not in between -127 and 127");
    }

    @Test
    public void base10to2Base2OutOfBoundNegativeValueTest(){
        Assert.assertEquals(conversion.negBase2("-350"), "Given number is not in between -127 and 127");
    }
}
