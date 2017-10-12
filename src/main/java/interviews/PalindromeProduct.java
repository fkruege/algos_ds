package interviews;

import java.util.Stack;

/**
 * Created by fkruege on 7/22/17.
 */
public class PalindromeProduct {

    public int largestPalindrome(int high, int low) {

        for (int i = high; i >= low; i--) {
            for (int j = high; j >= low; j--) {
                int product = i * j;
                boolean isPalindrome = isPalindrome(product);
                if (isPalindrome) {
                    return product;
                }
            }
        }

        return -1;
    }

    public boolean isPalindrome(int integer) {
        Stack<Integer> stack = new Stack<>();

        int temp = integer;
        while (temp > 0) {
            stack.push(temp % 10);
            temp = temp / 10;
        }

        int reversed = 0;
        int multiplier = 1;
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop() * multiplier;
            multiplier = multiplier * 10;
        }

        return integer == reversed;

    }
}
