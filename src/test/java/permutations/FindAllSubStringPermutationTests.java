package permutations;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by fkruege on 2/18/2017.
 */
public class FindAllSubStringPermutationTests {

    @Test
    public void test_1(){
        FindAllSubStringsPermutations permutations =new FindAllSubStringsPermutations();
        List<String> results= permutations.findAllSubStringPermutations("abc");

        Assert.assertEquals(15, results.size());
        Assert.assertTrue(results.contains("a"));
        Assert.assertTrue(results.contains("b"));
        Assert.assertTrue(results.contains("c"));
        Assert.assertTrue(results.contains("ab"));
        Assert.assertTrue(results.contains("ac"));
        Assert.assertTrue(results.contains("ba"));
        Assert.assertTrue(results.contains("bc"));
        Assert.assertTrue(results.contains("ca"));
        Assert.assertTrue(results.contains("cb"));
        Assert.assertTrue(results.contains("abc"));
        Assert.assertTrue(results.contains("acb"));
        Assert.assertTrue(results.contains("bac"));
        Assert.assertTrue(results.contains("bca"));
        Assert.assertTrue(results.contains("cab"));
        Assert.assertTrue(results.contains("cba"));
    }
}
