package leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fkruege on 2/20/17.
 */
public class WordSearchTests {

    @Test
    public void test_exist() {

        char[][] input = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        WordSearch search = new WordSearch();

        Assert.assertTrue(search.exist(input, "ABCCED"));
        Assert.assertTrue(search.exist(input, "SEE"));
        Assert.assertFalse(search.exist(input, "ABCB"));

    }


    @Test
    public void test_exist2() {

        char[][] input = new char[][]{
                {'a', 'd' }};

        WordSearch search = new WordSearch();

        Assert.assertFalse(search.exist(input, "abcd"));

    }

}
