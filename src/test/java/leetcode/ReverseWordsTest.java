package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 7/30/17.
 */
public class ReverseWordsTest {

    String input1 = "Let's take LeetCode contest";
    String output1 = "s'teL ekat edoCteeL tsetnoc";

    ReverseWords reverse;
    @Before
    public void setUp() throws Exception {
        reverse = new ReverseWords();
    }

    @Test
    public void reverseWordsUsingSplit() throws Exception {
        String actual = reverse.reverseWordsUsingSplit(input1);
        assertEquals(output1, actual);
    }


    @Test
    public void reverseWords() throws Exception {
        String actual = reverse.reverseWords(input1);
        assertEquals(output1, actual);
    }

}