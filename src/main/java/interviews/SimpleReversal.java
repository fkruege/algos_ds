package interviews;

/**
 * Created by fkruege on 6/26/17.
 */
public class SimpleReversal {

    /**
     * Write a function that takes an array of characters, and returns those characters in reverse order.
     * Think about Big O complexity. Can you write this function without creating a new array?
     * <p>
     * e.g. [the cat is black] -> [kcalb si tac eht]
     */
    public static char[] reverse(char[] string) {

        if (string.length <= 1) {
            return string;
        }

        int endIndex = string.length - 1;

        for (int i = 0; i < string.length; i++) {
            int posA = i;
            int posB = endIndex - posA;

            if (posA == posB || posA >= posB) {
                break;
            }

            char temp = string[posA];
            string[posA] = string[posB];
            string[posB] = temp;
        }

        return string;
    }

    /**
     * Write a function to return the individual words reversed in a character array.
     * <p>
     * e.g. [the cat is black] -> [eht tac si kcalb]
     */
    public static char[] reverseWords(char[] string) {
        StringBuilder reversed = new StringBuilder(string.length);
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < string.length; i++) {
            if (string[i] == ' ') {
                if (sb.length() > 0) {
                    reversed.append(reverse(sb.toString().toCharArray()));
                    reversed.append(" ");
                    sb = new StringBuilder();
                }
            } else {
                sb.append(string[i]);
            }
        }
        if (sb.length() > 0) {
            reversed.append(reverse(sb.toString().toCharArray()));
        }

        return reversed.toString().toCharArray();

    }

}
