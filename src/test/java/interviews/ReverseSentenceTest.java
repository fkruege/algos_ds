package interviews;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 7/22/17.
 */
public class ReverseSentenceTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void reverseWordsUsingList_1() throws Exception {
        ReverseSentence reverse = new ReverseSentence();
        String sentence = "Hello World";
        char[] reversedSentence = reverse.reverseWordsUsingList(sentence.toCharArray());
        assertEquals("World Hello", new String(reversedSentence));
    }

    @Test
    public void reverseWordsUsingList_2() throws Exception {
        ReverseSentence reverse = new ReverseSentence();
        String sentence = "The dog ran over a hill";
        char[] reversedSentence = reverse.reverseWordsUsingList(sentence.toCharArray());
        assertEquals("hill a over ran dog The", new String(reversedSentence));
    }


    @Test
    public void reverseWordsUsingBuffer_1() throws Exception {
        ReverseSentence reverse = new ReverseSentence();
        String sentence = "Hello World";
        char[] reversedSentence = reverse.reverseWordsUsingBuffer(sentence.toCharArray());
        assertEquals("World Hello", new String(reversedSentence));
    }


    @Test
    public void reverseWordsUsingBuffer_2() throws Exception {
        ReverseSentence reverse = new ReverseSentence();
        String sentence = "The dog ran over a hill";
        char[] reversedSentence = reverse.reverseWordsUsingBuffer(sentence.toCharArray());
        assertEquals("hill a over ran dog The", new String(reversedSentence));
    }
}