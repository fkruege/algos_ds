package interviews;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 7/22/17.
 */
public class PalindromeForIntegersTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void largestPalindrome() throws Exception {
        PalindromeForIntegers palindrome = new PalindromeForIntegers();
        int i = palindrome.largestPalindrome(111, 111);
        assertEquals(12321, i);
    }

    @Test
    public void largestPalindrome2() throws Exception {
        PalindromeForIntegers palindrome = new PalindromeForIntegers();
        int i = palindrome.largestPalindrome(333, 333);
        assertEquals(11, i);
    }
}