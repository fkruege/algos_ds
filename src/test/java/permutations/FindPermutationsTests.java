package permutations;

import org.junit.Test;
import permutations.Practice.PermPractice1;
import permutations.Practice.PermPracticeWithMap;

/**
 * Created by fkruege on 2/18/2017.
 */
public class FindPermutationsTests {

    @Test
    public void test_permutations(){
        FindPermutations permutations = new FindPermutations();
        PermutationTester tester = new PermutationTester(permutations);
        tester.test_permutations();
    }


    @Test
    public void test_permutations2(){
        PermPractice1 permutations = new PermPractice1();
        PermutationTester tester = new PermutationTester(permutations);
        tester.test_permutations();
    }


    @Test
    public void test_permutations3(){
        PermPracticeWithMap permutations = new PermPracticeWithMap();
        PermutationTester tester = new PermutationTester(permutations);
        tester.test_permutations();
    }
}
