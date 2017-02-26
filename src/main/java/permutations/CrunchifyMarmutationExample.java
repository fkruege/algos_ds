package permutations;

/**
 * Created by fkruege on 2/18/2017.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Crunchify.com
 */

public class CrunchifyMarmutationExample implements IPermutations {

    public static void main(String[] args) {
        String s = "ABC";
        String s1 = "EBAY";
        String s2 = "Yahoo";
        System.out.println("\nString " + s + ":\nPermutations: " + crunchifyPermutation(s));
        System.out.println("\nString " + s1 + ":\nPermutations: " + crunchifyPermutation(s1));
        System.out.println("\nString " + s2 + ":\nPermutations: " + crunchifyPermutation(s2));
    }

    public List<String> findPermutations(String input) {
        Set<String> permutations = crunchifyPermutation(input);
        List<String> results = new ArrayList<String>();
        for (String s :
                permutations) {
            results.add(s);
        }

        return results;
    }

    public List<String> findAllSubStringPermutations(String input) {
        return null;
    }

    public static Set<String> crunchifyPermutation(String str) {
        Set<String> crunchifyResult = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            crunchifyResult.add("");
            return crunchifyResult;
        }

        char firstChar = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = crunchifyPermutation(rem);
        for (String newString : words) {
            for (int i = 0; i <= newString.length(); i++) {
                crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
            }
        }
        return crunchifyResult;
    }

    public static String crunchifyCharAdd(String str, char c, int j) {
        String first = str.substring(0, j);
        String last = str.substring(j);
        return first + c + last;
    }

}
