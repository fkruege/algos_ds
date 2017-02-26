package leetcode.FindFirstUniqueChar;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fkruege on 2/17/2017.
 */
public class FindUniqueNTime implements IFindFirstUniqueChar {

    public char find(String input) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        Queue<Character> queue = new LinkedList<Character>();
        Character currentUnique = null;

        for (int i = 0; i < input.length(); i++) {
            Character a = input.charAt(i);

            if (charCount.containsKey(a)) {
                Integer count = charCount.get(a);
                int newCount = count + 1;
                charCount.put(a, newCount);

                if (currentUnique.equals(a)) {
                    if (queue.size() > 0) {
                        currentUnique = queue.remove();
                    } else {
                        currentUnique = null;
                    }
                }

            } else {
                queue.add(a);
                charCount.put(a, 1);

                if (currentUnique == null) {
                    currentUnique = queue.remove();
                }
            }
        }

        if (currentUnique == null) {
            return Character.MIN_VALUE;
        }
        return currentUnique;
    }
}
