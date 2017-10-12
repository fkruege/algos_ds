package permutations.Practice;

import permutations.IPermutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 5/28/17.
 */
public class PermPractice1 implements IPermutations {
    private void generate(String prefix, String remaining, int desiredLength, List<String> result) {
        if (prefix.length() == desiredLength) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            String prefixCopy = prefix + remaining.charAt(i);
            String remainingCopy = remaining.substring(0, i) + remaining.substring(i + 1, remaining.length());
            generate(prefixCopy, remainingCopy, desiredLength, result);
        }
    }

    @Override
    public List<String> findPermutations(String input) {
        List<String> results = new ArrayList<>();
        generate("", input, input.length(), results);
        return results;
    }

    @Override
    public List<String> findAllSubStringPermutations(String input) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i <= input.length(); i++) {
            generate("", input, i, results);
        }

        return results;
    }
}
