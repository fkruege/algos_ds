package ctci.Chapter1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by fkruege on 3/25/17.
 */
public class PalindromePermutation1_4 {

    public boolean isPermutation(String s) {
        int charCount = 0;
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character aChar = s.charAt(i);
            if (aChar == ' ') {
                continue;
            }

            charCount++;
            Integer aCount = charMap.get(aChar);
            if (aCount == null) {
                charMap.put(aChar, 1);
            } else {
                charMap.put(aChar, aCount + 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = charMap.entrySet();
        boolean evenLength = charCount % 2 == 0;
        if (evenLength) {
            for (Map.Entry<Character, Integer> entry : entries) {
                boolean evenCount = entry.getValue() % 2 == 0;
                if (!evenCount) {
                    return false;
                }
            }
        } else {
            boolean singleOdd = false;
            for (Map.Entry<Character, Integer> entry : entries) {
                boolean oddCount = entry.getValue() % 2 == 1;
                if (oddCount && !singleOdd) {
                    singleOdd = true;
                } else if (oddCount && singleOdd) {
                    return false;
                }
            }
    }
        return true;
    }
}
