package ctci.Chapter5.Question_07;

/**
 * Created by fkruege on 5/9/17.
 */
public class PairWiseSwap {

    public int swapEvenOdds(int n) {
        int evenMask = 1431655765;
        int oddMask = ~evenMask;

        int leftShift = n << 1;
        int rightShift = n >>> 1;

        return (rightShift & evenMask) | (leftShift & oddMask);

    }
}
