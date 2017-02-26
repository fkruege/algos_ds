package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by fkruege on 2/21/17.
 */
public class IntegerPermutationsTests {

    @Test
    public void test_permutations(){
        IntegerPermutations permutations = new IntegerPermutations();
        int[] input = new int[]{1, 2, 3};

        List<List<Integer>> results = permutations.permute(input);
        Assert.assertEquals(6, results.size());
        for (List<Integer> result :
                results) {
            Assert.assertEquals(3, result.size());
        }
    }
}
