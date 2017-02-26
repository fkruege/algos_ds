package fibonacci;

import org.junit.Assert;

/**
 * Created by fkruege on 2/16/17.
 */
public class FibTester {

    public void test(IFibonacci calulator){

        Assert.assertEquals(1, calulator.fibonacci(1));
        Assert.assertEquals(1, calulator.fibonacci(2));
        Assert.assertEquals(2, calulator.fibonacci(3));
        Assert.assertEquals(3, calulator.fibonacci(4));
        Assert.assertEquals(5, calulator.fibonacci(5));
        Assert.assertEquals(8, calulator.fibonacci(6));

    }
}
