import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Stephen Costanzo on 3/7/2017.
 * Lets see if JUnit Works
 */
class Concatenation_JUnitTest {
    @Test
    void concatenate() {
        String concatenated = Concatenation.concatenate("one", "two", "three", "four");

        assertEquals("one,two,three,four", concatenated);
    }

    @Test
    void concatenateNoStrings() {
        String expectedValue = "";
        String concatenated = Concatenation.concatenate(expectedValue);
        assertEquals(expectedValue, concatenated);
    }

    @Test
    void sumNumbers() {
        int expectedValue = 150;
        int returnValue = Concatenation.sumNumbers(50, 75, 10, 15);
        assertEquals(expectedValue, returnValue);
    }

    @Test
    void subractNumbers() {
        int originalValue = 500;
        int expectedValue = 200;
        int returnValue = Concatenation.subtractFromNumber(originalValue, 100, 25, 75, 50, 20, 30);
        assertEquals(expectedValue, returnValue);
    }

    @Test
    void multiplyNumbers() {

        long expectedValue = 5625000000L;
        long returnValue = Concatenation.multiplyNumbers(100, 25, 75, 50, 20, 30);
        assertEquals(expectedValue, returnValue);
    }

    @Test
    void divideNumbers() {

        long originalValue = 32400;
        double expectedValue = 5.4;
        double returnValue = Concatenation.divideNumbers(originalValue, 25, 8, 30);
        assertEquals(expectedValue, returnValue);
    }

    @Test
    void negateNumber() {
        int originalValue = 248;
        int expectedValue = -248;
        int returnValue = Concatenation.negateValue(originalValue);
        assertEquals(expectedValue, returnValue);
    }

    @Test
    void doubleNumber() {
        int originalValue = 30;
        int expectedValue = 60;
        int returnValue = Concatenation.doubleValue(originalValue);
        assertEquals(expectedValue, returnValue);
    }

    @Test
    void negateNumberFromNegative() {
        int originalValue = -248;
        int expectedValue = 248;
        int returnValue = Concatenation.negateValue(originalValue);
        assertEquals(expectedValue, returnValue);
    }

    @Test
    void testVowelsa() {
        boolean returnValue = Concatenation.isVowel('a');
        assertTrue(returnValue);
        returnValue = Concatenation.isVowel('e');
        assertTrue(returnValue);
        returnValue = Concatenation.isVowel('i');
        assertTrue(returnValue);
        returnValue = Concatenation.isVowel('o');
        assertTrue(returnValue);
        returnValue = Concatenation.isVowel('u');
        assertTrue(returnValue);
    }

    @Test
    void testVowelB() {
        boolean returnValue = Concatenation.isVowel('b');
        assertFalse(returnValue);

    }

    @Test
    void testVowelA() {
        boolean returnValue = Concatenation.isVowel('A');
        assertTrue(returnValue);
        returnValue = Concatenation.isVowel('E');
        assertTrue(returnValue);
        returnValue = Concatenation.isVowel('I');
        assertTrue(returnValue);
        returnValue = Concatenation.isVowel('O');
        assertTrue(returnValue);
        returnValue = Concatenation.isVowel('U');
        assertTrue(returnValue);
    }

    @Test
    void testDN() {
        int initialValue = 3913;
        int expectedValue = -7826;
        assertEquals(expectedValue, Concatenation.doubleNegateValue(initialValue));
    }

    @Test
    void testArea() {
        int initialLength = 105;
        int initialWidth = 148;
        int expectedValue = 15540;
        assertEquals(expectedValue, Concatenation.areaRectangle(initialLength, initialWidth));
    }

    @Test
    public void testAreaZeroLength() {
        int initialLength = 0;
        int initialWidth = 100;
        try {
            assertEquals(0, Concatenation.areaRectangle(initialLength, initialWidth));
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testAreaZeroWidth() {
        int initialLength = 10;
        int initialWidth = 0;
        try {
            assertEquals(0, Concatenation.areaRectangle(initialLength, initialWidth));
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testHypot(){
        int baseValue = 15;
        int heightValue = 20;
        double expectedValue = 25;
        double returnedValue ;

        returnedValue = Concatenation.getHypotenuse(baseValue, heightValue);
        assertEquals(expectedValue, returnedValue);

    }

    @Test
    public void testPalFail()
    {
        String testValue = "asdd";
        assertFalse(Concatenation.isPalendrome(testValue));
    }

    @Test
    public void testPalPassEven(){
        String testValue = "adda";
        assertTrue(Concatenation.isPalendrome(testValue));
    }

    @Test
    public void testPalPassOddNumbers(){
        String testValue = "2aduda2";
        assertTrue(Concatenation.isPalendrome(testValue));
    }

    @Test
    public void testPalPassOdd(){
        String testValue = "aduda";
        assertTrue(Concatenation.isPalendrome(testValue));
    }

}