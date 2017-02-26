package factorial;

import org.junit.Test;

/**
 * Created by fkruege on 2/17/17.
 */
public class RecursiveFactorialTester {

    @Test
    public void test_factorial(){
        FactorialTester tester = new FactorialTester();
        RecursiveFactorial factorial = new RecursiveFactorial();

        tester.test(factorial);
    }
}
