package factorial;

import org.junit.Assert;

/**
 * Created by fkruege on 2/17/17.
 */
public class FactorialTester {



    public void test(IFactorial factorial) {

        Assert.assertEquals(1, factorial.calculate(1));
        Assert.assertEquals(2, factorial.calculate(2));
        Assert.assertEquals(6, factorial.calculate(3));
        Assert.assertEquals(24, factorial.calculate(4));
        Assert.assertEquals(120, factorial.calculate(5));
        Assert.assertEquals(720, factorial.calculate(6));

    }
}
