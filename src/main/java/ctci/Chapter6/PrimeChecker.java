package ctci.Chapter6;

/**
 * Created by fkruege on 5/12/17.
 */
public class PrimeChecker {


    public boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isPrimeNumberRootCheck(int n) {
        if (n < 2) {
            return false;
        }

        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


}
