package permutations.Practice;

import permutations.IPermutations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fkruege on 5/28/17.
 */
public class PermPracticeWithMap implements IPermutations {

    @Override
    public List<String> findPermutations(String input) {
        HashMap<Character, Integer> charSet = createCharSet(input);
        List<String> results = new ArrayList<>();
        generate("", input.length(), charSet, results);
        return results;
    }

    private void generate(String prefix, int remaining, HashMap<Character, Integer> charSet, List<String> results) {

        if (remaining == 0) {
            results.add(prefix);
            return;
        }

        for (Character c : charSet.keySet()) {
            if (charSet.get(c) > 0) {
                int count = charSet.get(c);
                charSet.put(c, count - 1);
                generate(prefix + c, remaining - 1, charSet, results);
                charSet.put(c, count);
            }
        }

    }

    private HashMap<Character, Integer> createCharSet(String input) {
        HashMap<Character, Integer> charSet = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);

            if (charSet.containsKey(c)) {
                charSet.put(c, charSet.get(c) + 1);
            } else {
                charSet.put(c, 1);
            }
        }
        return charSet;
    }

    @Override
    public List<String> findAllSubStringPermutations(String input) {
        return null;
    }
}
