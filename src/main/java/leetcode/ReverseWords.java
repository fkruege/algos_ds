package leetcode;

import java.util.Arrays;

/**
 * Created by fkruege on 7/30/17.
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 */
public class ReverseWords {
    public String reverseWordsUsingSplit(String s) {
        String[] wordsSplit = s.split(" ");
        StringBuilder sbReversed = new StringBuilder();
        for (String word : wordsSplit) {
            sbReversed.append(reverse(word) + " ");
        }
        return sbReversed.toString().trim();
    }

    public String reverseWords(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s;
        }

        char[] charArray = s.toCharArray();

        int begin = 0;
        int end = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                end = i;
                reverse(charArray, begin, end - 1);
                begin = i + 1;
            }
        }

        reverse(charArray, begin, charArray.length-1);


        return new String(charArray);
    }

    private void reverse(char[] charArray, int begin, int end) {
        int length = (end - begin) + 1;
        boolean isEvenLength = (length) % 2 == 0;
        int midpoint = (begin + end) / 2;
        midpoint = isEvenLength ? midpoint + 1 : midpoint;
        int count = 0;
        for (int i = begin; i < midpoint; i++) {
            int swap = end - count;
            char temp = charArray[i];
            charArray[i] = charArray[swap];
            charArray[swap] = temp;
            count++;
        }
    }


    private String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
