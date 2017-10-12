package ctci.Chapter8.Question7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by fkruege on 5/27/17.
 */
public class UniquePermutations {

    public List<String> find(String s) {
        List<String> permutations = new ArrayList<>();
        HashSet<String> permSets = new HashSet<>();

        permutations2("", s, permutations, permSets);
        return permutations;
    }

    private void permutations2(String s, String remaining, List<String> list, HashSet<String> permSets) {

        if (remaining.length() == 0) {
            list.add(s);
            return;
        }

//        String permSetKey = s + "," + remaining;
        String permSetKey = s  + remaining;
        if (permSets.contains(permSetKey)) {
            return;
        }

        permSets.add(permSetKey);


        for (int i = 0; i < remaining.length(); i++) {
            String sCopy = s + remaining.charAt(i);
            String remainingCopy = remaining.substring(0, i) + remaining.substring(i + 1, remaining.length());
//            System.out.println(sCopy + " " + remainingCopy);
            permutations2(sCopy, remainingCopy, list, permSets);
        }
    }


}
