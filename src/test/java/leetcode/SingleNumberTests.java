package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fkruege on 2/20/17.
 */
public class SingleNumberTests {

    @Test
    public void test_SingleNumber1() {
        int[] input = new int[]{2, 2, 1};

        SingleNumber single = new SingleNumber();
        int number = single.singleNumber(input);
        Assert.assertEquals(1, number);

        SingleNumberXOR singleXor = new SingleNumberXOR();
        int number2 = singleXor.singleNumber(input);

        Assert.assertEquals(1, number2);



    }
}
