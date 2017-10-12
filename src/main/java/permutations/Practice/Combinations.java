package permutations.Practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 6/3/17.
 */
public class Combinations {

    List<List<Character>> combos;


    public List<List<Character>> getCombos(char[] input) {
        combos = new ArrayList<>();

        for (int i = 0; i <= input.length; i++) {
            getCombos(input, 0, new ArrayList<>(), i);
        }
        return combos;
    }


    private void getCombos(char[] input, int index, List<Character> current, int size) {
        if (current.size() == size) {
            combos.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < input.length; i++) {
            current.add(input[i]);
            getCombos(input, i + 1, current, size);
            current.remove(current.size() - 1);
        }
    }


}
