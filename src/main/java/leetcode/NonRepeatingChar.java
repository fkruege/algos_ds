package leetcode;

import java.util.HashMap;

/**
 * Created by fkruege on 1/18/2017.
 */
public class NonRepeatingChar {

    public static void main(String[] args) {

        assert getFirstNonRepeating("hello").equals("h");
        assert getFirstNonRepeating("aabbccd").equals("d");
        assert getFirstNonRepeating("").equals("");
        assert getFirstNonRepeating("aabbccdd").equals("");
        assert getFirstNonRepeating("AAAAAb").equals("b");


    }

    private static String getFirstNonRepeating(String input) {

        HashMap<String, Integer> stringCounter = new HashMap<String, Integer>();

        for (int i = 0; i < input.length(); i++) {
            String substring = input.substring(i, i + 1);

            if (stringCounter.containsKey(substring)) {
                Integer count = stringCounter.get(substring);
                stringCounter.put(substring, new Integer(count.intValue() + 1));
            } else {
                stringCounter.put(substring, new Integer(1));
            }
        }

        for (int i = 0; i < input.length(); i++) {
            String substring = input.substring(i, i + 1);
            Integer count = stringCounter.get(substring);
            if(count.intValue() == 1){
                return substring;
            }
        }
        return "";
    }


}
