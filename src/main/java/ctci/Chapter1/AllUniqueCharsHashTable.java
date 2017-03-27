package ctci.Chapter1;

import java.util.Hashtable;

/**
 * Created by fkruege on 3/24/17.
 */
public class AllUniqueCharsHashTable {

    boolean IsAllUniqueChars(String input){
        Hashtable<Character, Boolean> charMap = new Hashtable<Character, Boolean>();
        for(int i = 0; i < input.length(); i++){
            char iChar = input.charAt(i);
            if(charMap.containsKey(iChar)){
                return false;
            }else{
                charMap.put(iChar, true);
            }
        }

        return true;
    }
}
