package leetcode.FindFirstUniqueChar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fkruege on 2/17/2017.
 */
public class HashTableUniqueChar implements IFindFirstUniqueChar{

    public char find(String input) {


        HashMap<Character, Integer> charHash = new HashMap<Character, Integer>();

        for(int i = 0; i < input.length(); i++){
            Character ch = input.charAt(i);

            if(charHash.containsKey(ch)){
                Integer existing = charHash.get(ch);
                charHash.put(ch, existing.intValue() + 1);
            }else{
                charHash.put(ch, 1);
            }
        }

        for(int i = 0; i < input.length(); i++){
            Character ch = input.charAt(i);
            Integer integer = charHash.get(ch);
            if(integer.intValue() == 1){
               return ch;
            }
        }

        return Character.MIN_VALUE;



    }


}
