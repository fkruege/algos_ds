package ctci.Chapter8;

/**
 * Created by fkruege on 5/16/17.
 */
public class Fibonnaci {

    private int[] memo;


    public int calculate(int n) {
        memo = new int[n + 1];
        return calculateFibonnaci(n);
    }

    private int calculateFibonnaci(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        int fib =
                calculateFibonnaci(n - 1)
                        + calculateFibonnaci(n - 2);
        memo[n] = fib;

        return fib;
    }
}
