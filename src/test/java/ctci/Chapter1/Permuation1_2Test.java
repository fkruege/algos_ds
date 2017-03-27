package ctci.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 3/25/17.
 */
public class Permuation1_2Test {

    @Test
    public void test_IsPermuation1(){

        Permuation1_2 permutation = new Permuation1_2();
        assertFalse(permutation.isPermuation("ab", "a"));
        assertTrue(permutation.isPermuation("a", "a"));
        assertFalse(permutation.isPermuation("b", "a"));
        assertTrue(permutation.isPermuation("abcd", "dcba"));
        assertTrue(permutation.isPermuation("aabbc", "cbbaa"));
        assertFalse(permutation.isPermuation("aabbcd", "cbbaaz"));

    }

}