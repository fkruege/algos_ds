package ctci.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 3/25/17.
 */
public class OneEdit1_5Test {

    @Test
    public void test_IsOneEdit(){
        OneEdit1_5 edit = new OneEdit1_5();
        assertTrue(edit.isOneEdit("a", "a"));
        assertTrue(edit.isOneEdit("a", "ab"));
        assertFalse(edit.isOneEdit("a", "abc"));
        assertTrue(edit.isOneEdit("pale", "ple"));
        assertTrue(edit.isOneEdit("pales", "pale"));
        assertTrue(edit.isOneEdit("pale", "bale"));
        assertFalse(edit.isOneEdit("pale", "bake"));
    }

}