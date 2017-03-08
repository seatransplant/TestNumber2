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

    static int subtrackFromNumber(int originalNumber, int... values) {

        int value = originalNumber;

        for (int foundValue : values) {
            value -= foundValue;
        }

        return value;
    }

}
