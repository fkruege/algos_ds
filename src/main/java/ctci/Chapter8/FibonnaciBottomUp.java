package ctci.Chapter8;

/**
 * Created by fkruege on 5/16/17.
 */
public class FibonnaciBottomUp {

    public int calculate(int n) {
        if (n <= 1) {
            return n;
        }

        int[] memo = new int[n + 1];

        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n - 1] + memo[n - 2];
    }

}
