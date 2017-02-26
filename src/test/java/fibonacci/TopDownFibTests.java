package fibonacci;

import org.junit.Test;

/**
 * Created by fkruege on 2/16/17.
 */
public class TopDownFibTests {

    @Test
    public void test_fibonacci(){
        TopDownFib calculator = new TopDownFib();
        FibTester fibTester = new FibTester();

        fibTester.test(calculator);
    }
}
