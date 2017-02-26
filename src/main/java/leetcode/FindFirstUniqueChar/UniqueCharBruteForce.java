package leetcode.FindFirstUniqueChar;

/**
 * Created by fkruege on 2/17/2017.
 */
public class UniqueCharBruteForce implements IFindFirstUniqueChar {

    public char find(String input) {
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);

            int count = 1;
            for (int j = 0; j < input.length(); j++) {
                char b = input.charAt(j);
                if (i != j && a == b) {
                    count++;
                    break;
                }
            }

            if (count == 1) {
                return a;
            }
        }

        return Character.MIN_VALUE;
    }
}
