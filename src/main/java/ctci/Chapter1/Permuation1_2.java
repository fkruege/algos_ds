package ctci.Chapter1;

import java.util.Hashtable;

/**
 * Created by fkruege on 3/25/17.
 */
public class Permuation1_2 {

    public boolean isPermuation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Hashtable<Character, Integer> charMap = new Hashtable<Character, Integer>();
        for (int i = 0; i < a.length(); i++) {
            char aChar = a.charAt(i);
            Integer aCount = charMap.get(aChar);
            if (aCount == null) {
                charMap.put(aChar, 1);
            } else {
                charMap.put(aChar, aCount + 1);
            }
        }

        for(int i = 0; i < b.length(); i++){
            char bChar = b.charAt(i);
            Integer count = charMap.get(bChar);
            if(count == null){
                return false;
            }else{
                count = count -1;
                if(count == 0){
                    charMap.remove(bChar);
                }
            }
        }
        return true;
    }
}
