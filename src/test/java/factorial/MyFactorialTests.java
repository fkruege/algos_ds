package factorial;

import factorial.MyFactorial;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fkruege on 2/18/2017.
 */
public class MyFactorialTests {

    @Test
    public void test_factorial1(){
        MyFactorial factorial = new MyFactorial();
        Assert.assertEquals(1, factorial.factorial(1));
        Assert.assertEquals(2, factorial.factorial(2));
        Assert.assertEquals(6, factorial.factorial(3));
        Assert.assertEquals(24, factorial.factorial(4));
        Assert.assertEquals(120, factorial.factorial(5));
    }
}
