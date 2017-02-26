package fibonacci;

/**
 * Created by fkruege on 2/16/17.
 */
public class BottomUpFib implements IFibonacci {

    private int[] _memo;

    public int fibonacci(int n) {

        if(n<= 2){
            return 1;
        }


        return calculateFib(n);
    }

    private int calculateFib(int n) {

        if (n < 2) {
            return 1;
        }

        _memo = new int[n];
        _memo[0] = 0;
        _memo[1] = 1;

        for (int i = 2; i < n; i++) {
            _memo[i] = _memo[i - 2] + _memo[i - 1];
        }

        return _memo[n - 2] + _memo[n - 1];


    }


}
