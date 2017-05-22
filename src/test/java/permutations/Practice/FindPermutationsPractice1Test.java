package permutations.Practice;

import org.junit.Before;
import org.junit.Test;
import permutations.FindPermutations;
import permutations.PermutationTester;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/29/17.
 */
public class FindPermutationsPractice1Test {


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findPermutations() throws Exception {
        FindPermutationsPractice1 permutations = new FindPermutationsPractice1();
        PermutationTester tester = new PermutationTester(permutations);
        tester.test_permutations();
    }

    @Test
    public void findAllSubStringPermutations() throws Exception {

    }

}