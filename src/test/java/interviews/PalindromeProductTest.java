package interviews;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 7/22/17.
 */
public class PalindromeProductTest {
    PalindromeProduct palindrome = new PalindromeProduct();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void largestPalindrome() throws Exception {
        int i = palindrome.largestPalindrome(999, 100);
        assertTrue(i > 0);
    }

    @Test
    public void isPalindrome() throws Exception {
        assertTrue(palindrome.isPalindrome(111));
        assertTrue(palindrome.isPalindrome(12121));
        assertTrue(palindrome.isPalindrome(2));
        assertFalse(palindrome.isPalindrome(233));
    }

}