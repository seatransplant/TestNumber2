/**
 * Created by Stephen Costanzo on 3/7/2017.
 * Concatenate Multiple Files
 */
class Concatenation {

    static String concatenate(String... strings) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            if (i > 0) {
                builder.append(",");
            }
            builder.append(strings[i]);
        }


        return builder.toString();
    }


    static int sumNumbers(int... values) {
        int value = 0;

        for  (int foundValue : values) {
            value += foundValue ;
        }

        return value;
    }

    static int subtractFromNumber(int originalNumber, int... values) {

        int value = originalNumber;

        for (int foundValue : values) {
            value -= foundValue;
        }

        return value;
    }
    static long multiplyNumbers( long... values) {

        long value = 1;

        for (long foundValue : values) {
            value *= foundValue;
        }

        return value;
    }

    static double divideNumbers(long originalValue, long ... values){
        double value = originalValue ;
        for (long foundValue : values) {
            value = value / foundValue;
        }

        return value;
    }

    static int negateValue (int value) {
        return -value;
    }

    static int doubleValue (int value) {
        return value * 2;
    }

    static boolean isVowel(char value){
        switch (Character.toLowerCase(value )) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    static int doubleNegateValue(int value){
        return doubleValue(negateValue(value));
    }

    static double areaRectangle(double length, double width) throws IllegalArgumentException {
        if (length <=0)
            throw new IllegalArgumentException("Length has to be greater than zero.");

        if (width<=0)
            throw new IllegalArgumentException("Width has to be greater than zero.");

        return length*width;
    }
}
