package fibonacci;

/**
 * Created by fkruege on 2/16/17.
 */
public class TopDownFib implements IFibonacci {

    private int[] _memo;

    public int fibonacci(int n) {
        _memo = new int[n];
        return calculateFib(n);

    }

    private int calculateFib(int n) {

        int index = n-1;

        if (_memo[index] > 0) {
            return _memo[index];
        }

        int result = 0;

        if (n <= 2) {
            result = 1;
        } else {
            result = calculateFib(n - 2) + calculateFib(n - 1);
        }

        _memo[index] = result;

        return result;


    }


}
