package permutations;

import org.junit.Assert;

import java.util.Collections;
import java.util.List;

/**
 * Created by fkruege on 2/18/2017.
 */
public class PermutationTester {

    private IPermutations _permutation;
    private IPermutations _reference;

    public PermutationTester(IPermutations permutation) {


        this._permutation = permutation;
        _reference = new CrunchifyMarmutationExample();
    }

    public void test_permutations() {
        runTest("abc");
        runTest("a");
        runTest("EBAY");
    }


    private void runTest(String input){
        List<String> permutations =findPermutations(_permutation, input);
        List<String> reference = findPermutations(_reference, input);

        validate(permutations, reference);

    }


    private void validate(List<String> mysolution, List<String> reference) {

        Assert.assertEquals(mysolution.size(), reference.size());

        for (int i = 0; i < reference.size(); i++) {
            Assert.assertEquals(mysolution.get(i), reference.get(i));
        }


    }

    private List<String> findPermutations(IPermutations permutation, String input) {
        List<String> permutations = permutation.findPermutations(input);
        Collections.sort(permutations);
        return permutations;
    }
}
