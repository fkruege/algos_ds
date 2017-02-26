package fibonacci;

import org.junit.Test;

/**
 * Created by fkruege on 2/17/17.
 */
public class BottomUpFibTests {

    @Test
    public void test_fibonacci(){

        BottomUpFib fib = new BottomUpFib();
        FibTester fibTester = new FibTester();
        fibTester.test(fib);

    }

}
