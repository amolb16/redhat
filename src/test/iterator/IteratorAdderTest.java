package iterator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorAdderTest {

    private IteratorAdder iteratorAdder;
    @Before
    public void setUp() throws Exception {
        iteratorAdder = new IteratorAdder();
    }
    @After
    public void tearDown() throws Exception {
        iteratorAdder = null;
    }

    @Test
    public void combineTest(){
        List<String> expectedList = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        Iterator<String> itr1 = Arrays.asList("a", "b", "c", "d").iterator();
        Iterator<String> itr2 = Arrays.asList("e", "f", "g", "h").iterator();
        List<String> combinedList = iteratorAdder.combine(itr1, itr2);
        Assert.assertEquals(combinedList, expectedList);
    }
}
