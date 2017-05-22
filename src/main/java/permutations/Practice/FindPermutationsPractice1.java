package permutations.Practice;

import permutations.IPermutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 4/29/17.
 */
public class FindPermutationsPractice1 implements IPermutations {

    public List<String> findPermutations(String input) {
        List<String> permutations = new ArrayList<String>();
        permutation(new StringBuilder(), new StringBuilder(input), permutations);
        return permutations;
    }

    public List<String> findAllSubStringPermutations(String input) {
        return null;
    }

    private void permutation(StringBuilder currentPermutation,
                             StringBuilder remaining,
                             List<String> permutationList) {

        if (remaining.length() == 0) {
            permutationList.add(currentPermutation.toString());
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            StringBuilder remainingCopy = new StringBuilder(remaining.toString());
            StringBuilder permutationCopy = new StringBuilder(currentPermutation.toString());
            char newChar = remainingCopy.charAt(i);
            remainingCopy.deleteCharAt(i);
            permutationCopy.append(newChar);

            permutation(permutationCopy, remainingCopy, permutationList);
        }

    }

}
