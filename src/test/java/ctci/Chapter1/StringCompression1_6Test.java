package ctci.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 3/26/17.
 */
public class StringCompression1_6Test {

    @Test
    public void compress() throws Exception {

        StringCompression1_6 compress = new StringCompression1_6();
        assertEquals("a2b1c5a3", compress.compress("aabcccccaaa"));
        assertEquals("a5", compress.compress("aaaaa"));
        assertEquals("abc", compress.compress("abc"));

    }

}