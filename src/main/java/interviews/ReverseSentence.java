package interviews;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem: Reverse the order of the words in a string without using any String shortcut methods (such as split())
// Ex: "The dog ran over a hill" => "hill a over ran dog The"
// hill
// hi  -> midpoint = 1
// his -> 3/2 = midpoint = 1
public class ReverseSentence {

    public char[] reverseWordsUsingList(char[] sentence) {
        char[] reversed = new char[sentence.length];
        List<String> words = new ArrayList<>();

        char[] buffer = new char[sentence.length];
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == ' ') {
                words.add(new String(buffer).trim());
                buffer = new char[sentence.length];
            } else {
                buffer[i] = sentence[i];
            }
        }

        words.add(new String(buffer));

        StringBuilder sb = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            sb.append(words.get(i));
            sb.append(" ");
        }

        return sb.toString().trim().toCharArray();
    }


    public char[] reverseWordsUsingBuffer(char[] sentence) {
        char[] reversedBuffer = new char[sentence.length];

        Arrays.fill(reversedBuffer, ' ');

        int beginWord = -1;
        int endWord = -1;
        int index = 0;
        // start at the end of the original sentence
        for (int i = sentence.length - 1; i >= 0; i--) {
            if (endWord == -1) {
                endWord = i;
            }
            if (sentence[i] == ' ' || i == 0) {
                if (i == 0) {
                    beginWord = 0;
                } else {
                    beginWord = i + 1;
                }

                char[] buffer = Arrays.copyOfRange(sentence, beginWord, endWord + 1);
                for (int j = 0; j < buffer.length; j++) {
                    reversedBuffer[index + j] = buffer[j];
                }
                index = index + buffer.length + 1;
                endWord = -1;
            }
        }
        return reversedBuffer;
    }


}
