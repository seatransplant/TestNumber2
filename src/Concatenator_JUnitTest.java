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
    void sumNumbers() {
        int expectedValue = 150;
        int returnValue = Concatenation.sumNumbers(50,75,10,15);
        assertEquals(expectedValue, returnValue);
    }

    @org.junit.jupiter.api.Test
    void subractNumbers() {
        int originalValue = 500;
        int expectedValue = 200;
        int returnValue = Concatenation.subtractFromNumber(originalValue, 100,25,75,50,20,30);
        assertEquals(expectedValue,returnValue);
    }

    @org.junit.jupiter.api.Test
    void multiplyNumbers() {

        long expectedValue = 5625000000L;
        long returnValue = Concatenation.multiplyNumbers( 100,25,75,50,20,30);
        assertEquals(expectedValue,returnValue);
    }

    @org.junit.jupiter.api.Test
    void divideNumbers() {

        long originalValue = 32400;
        double expectedValue = 5.4;
        double returnValue = Concatenation.divideNumbers( originalValue,25,8, 30);
        assertEquals(expectedValue,returnValue);
    }

    @org.junit.jupiter.api.Test
    void negateNumber(){
        int originalValue = 248;
        int expectedValue = -248;
        int returnValue = Concatenation.negateValue(originalValue);
        assertEquals(expectedValue, returnValue);
    }
}