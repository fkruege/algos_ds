package ctci.Chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by fkruege on 4/1/17.
 */
public class Palindrome2_6Test {

    Palindrome2_6_StringBuilder palindrome = new Palindrome2_6_StringBuilder();
    Palindrome2_6_Stack palindromeStack = new Palindrome2_6_Stack();

    Node n1a = new Node(1);
    Node n2a = new Node(2);
    Node n2b = new Node(2);
    Node n1b = new Node(1);

    Node z4a = new Node(4);
    Node z2 = new Node(2);
    Node z4b = new Node(4);


    @Before
    public void before() {
        n1a.next = n2a;
        n2a.next = n2b;
        n2b.next = n1b;

        z4a.next = z2;
        z2.next = z4b;
    }

    @Test
    public void isPalindrome1() throws Exception {
        assertTrue(this.palindrome.isPalindrome(n1a));
        assertTrue(this.palindromeStack.isPalindrome(n1a));
    }

    @Test
    public void isPalindrome1b() throws Exception {
        n2b.value = 3;
        assertFalse(this.palindrome.isPalindrome(n1a));
        assertFalse(this.palindromeStack.isPalindrome(n1a));
    }


    @Test
    public void isPalindrome2() throws Exception {
        assertTrue(this.palindrome.isPalindrome(z4a));
        assertTrue(this.palindromeStack.isPalindrome(z4a));
    }

    @Test
    public void isPalindrome3() throws Exception {
        z4b.value = 9;
        assertFalse(this.palindrome.isPalindrome(z4a));
        assertFalse(this.palindromeStack.isPalindrome(z4a));
    }

}