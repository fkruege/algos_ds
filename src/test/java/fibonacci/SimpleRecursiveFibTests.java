package fibonacci;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by fkruege on 2/16/17.
 */
public class SimpleRecursiveFibTests {

    @Test
    public void test_fibonacci(){
        SimpleRecursiveFib calculator = new SimpleRecursiveFib();
        FibTester fibTester = new FibTester();

        fibTester.test(calculator);

    }

}
