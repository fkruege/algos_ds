package ctci.Chapter1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fkruege on 3/24/17.
 */
public class AllUniqueCharTests {

    public final String TEST1 = "";
    public final String TEST2 = "a";
    public final String TEST3 = "aa";
    public final String TEST4 = "abc";
    public final String TEST5 = "abcdd";

    @Test
    public void test_BruteForce1(){
        AllUniqueCharsBruteForce unique = new AllUniqueCharsBruteForce();
        Assert.assertTrue(unique.IsAllUniqueChars(TEST1));
        Assert.assertTrue(unique.IsAllUniqueChars(TEST2));
        Assert.assertFalse(unique.IsAllUniqueChars(TEST3));
        Assert.assertTrue(unique.IsAllUniqueChars(TEST4));
        Assert.assertFalse(unique.IsAllUniqueChars(TEST5));

    }

    @Test
    public void test_HashMap1(){
        AllUniqueCharsHashTable unique = new AllUniqueCharsHashTable();
        Assert.assertTrue(unique.IsAllUniqueChars(TEST1));
        Assert.assertTrue(unique.IsAllUniqueChars(TEST2));
        Assert.assertFalse(unique.IsAllUniqueChars(TEST3));
        Assert.assertTrue(unique.IsAllUniqueChars(TEST4));
        Assert.assertFalse(unique.IsAllUniqueChars(TEST5));

    }

}
