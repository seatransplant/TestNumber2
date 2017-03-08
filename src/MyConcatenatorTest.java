import static org.testng.Assert.*;
import static.org.testng.annotations.Test;


/**
 * Created by sxcos on 3/7/2017.
 * Lets test!
 */
public class MyConcatenatorTest {

    @Test

    public void testConcatanate() throws Exception {
        String concatenated = MyConcatenator.concatanate("one", "two", "three", "four");

        Assert.assertEquals("one,two,three,four");
    }


}