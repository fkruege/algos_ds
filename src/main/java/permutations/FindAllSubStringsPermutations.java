package permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 2/18/2017.
 */
public class FindAllSubStringsPermutations implements IPermutations {
    private List<String> _permutations = new ArrayList<String>();

    public List<String> findPermutations(String input) {
        return null;
    }

    public List<String> findAllSubStringPermutations(String input) {
        _permutations.clear();

        findSubStringPermutations("", input);


        return _permutations;
    }

    private void findSubStringPermutations(String currentPerm, String input) {

        if (currentPerm.length() == input.length()) {
//            _permutations.add(currentPerm);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            String perm = currentPerm + input.charAt(i);
            _permutations.add(perm);
            String substring = input.substring(0, i) + input.substring(i + 1, input.length());
            findSubStringPermutations(perm, substring);
        }
    }

//    private void findSubStringPermutations(String currentPerm, String input, int length) {
//
//        if (currentPerm.length() == length) {
//            _permutations.add(currentPerm);
//            return;
//        }
//
//        for (int i = 0; i < input.length(); i++) {
//            String perm = currentPerm + input.charAt(i);
//            String substring = input.substring(0, i) + input.substring(i + 1, input.length());
//            findSubStringPermutations(perm, substring, length);
//        }
//    }
}
