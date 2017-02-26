package permutations;

import org.junit.Test;

/**
 * Created by fkruege on 2/18/2017.
 */
public class CrunchifyMarmutationExampleTests {

    @Test
    public void test_permutations(){

        FindPermutations permutations = new FindPermutations();
        PermutationTester tester = new PermutationTester(permutations);
        tester.test_permutations();

    }
}
