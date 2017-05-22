package ctci.Chapter5.Question_06;

/**
 * Created by fkruege on 5/9/17.
 */
public class ReferenceA {

    public static int bitSwapRequired(int a, int b) {
        int count = 0;
        for (int c = a ^ b; c != 0; c = c >>> 1) {
            count += c & 1;
        }
        return count;
    }

}
