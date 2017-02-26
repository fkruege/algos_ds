package permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 2/18/2017.
 */
public class FindPermutations implements IPermutations {

    List<String> _permutations = new ArrayList<String>();

    public List<String> findPermutations(String input) {
        _permutations.clear();
        find("", input);
        return _permutations;
    }

    public List<String> findAllSubStringPermutations(String input) {
        return null;
    }

    private void find(String currentPerm, String input) {

        if (input.length() == 0) {
            _permutations.add(currentPerm);
            System.out.println(currentPerm);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            String perm = currentPerm + input.charAt(i);
            String substring = input.substring(0, i) + input.substring(i + 1, input.length());
            find(perm, substring);
        }


    }
}
