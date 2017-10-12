package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 7/30/17.
 */
public class FindTheDifferenceTest {
    FindTheDifference difference;
    @Before
    public void setUp() throws Exception {
        difference = new FindTheDifference();
    }

    @Test
    public void findTheDifference() throws Exception {
        char theDifference = difference.findTheDifference("abcd", "abcde");
        assertEquals('e', theDifference);
    }


    @Test
    public void findTheDifference_a_aa() throws Exception {
        char theDifference = difference.findTheDifference("a", "aa");
        assertEquals('a', theDifference);
    }

}