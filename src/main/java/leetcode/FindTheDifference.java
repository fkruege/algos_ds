package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by fkruege on 7/30/17.
 * https://leetcode.com/problems/find-the-difference/description/
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            Integer current = charMap.get(charArray[i]);
            if(current == null){
                charMap.put(charArray[i], 1);
            }else{
                charMap.put(charArray[i], current + 1);
            }
        }

        charArray = t.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            Integer current = charMap.get(charArray[i]);
            if(current == null || current == 0){
                return charArray[i];
            }else{
               charMap.put(charArray[i], current - 1);
            }
        }
        return ' ';
    }
}
