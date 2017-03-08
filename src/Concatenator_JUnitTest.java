import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Stephen Costanzo on 3/7/2017.
 * Lets see if JUnit Works
 */
class Concatenation_JUnitTest {
    @org.junit.jupiter.api.Test
    void concatenate() {
        String concatenated = Concatenation.concatenate("one", "two", "three", "four");

        assertEquals("one,two,three,four", concatenated);
    }

    @org.junit.jupiter.api.Test
    void concatenateNoStrings() {
        String expectedValue = "";
        String concatenated = Concatenation.concatenate(expectedValue);
        assertEquals(expectedValue, concatenated);
    }

    @org.junit.jupiter.api.Test
    void sumNumber() {
        int expectedValue = 150;
        int returnValue = Concatenation.sumNumbers(50,75,10,15);
        assertEquals(expectedValue, returnValue);
    }


}