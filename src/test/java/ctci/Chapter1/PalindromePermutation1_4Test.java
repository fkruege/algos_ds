package ctci.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 3/25/17.
 */
public class PalindromePermutation1_4Test {

    @Test
    public void test_IsPermutation1(){
        PalindromePermutation1_4 perm = new PalindromePermutation1_4();
        assertTrue(perm.isPermutation("taco cat"));
        assertTrue(perm.isPermutation("a"));
        assertTrue(perm.isPermutation(""));
        assertFalse(perm.isPermutation("ab"));
        assertTrue(perm.isPermutation("aba"));
        assertTrue(perm.isPermutation("aaa"));
    }



}