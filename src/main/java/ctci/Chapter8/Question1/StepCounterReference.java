package ctci.Chapter8.Question1;

import java.util.Arrays;

/**
 * Created by fkruege on 5/18/17.
 */
public class StepCounterReference {

    public int getHopCombinations(int steps) {

        int[] memo = new int[steps + 1];
        Arrays.fill(memo, -1);
        return hop(steps, memo);

    }

    private int hop(int steps, int[] memo) {
        if (steps < 0) {
            return 0;
        }

        if (steps == 0) {
            return 1;
        }

        if (memo[steps] > -1) {
            return memo[steps];
        }

        memo[steps] = hop(steps - 1, memo) +
                hop(steps - 2, memo) +
                hop(steps - 3, memo);

        return memo[steps];
    }
}
