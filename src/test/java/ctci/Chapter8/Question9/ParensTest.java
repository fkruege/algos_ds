package ctci.Chapter8.Question9;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/30/17.
 */
public class ParensTest {
    Parens parens;

    @Before
    public void setUp() throws Exception {
        parens = new Parens();
    }

    @Test
    public void generateParens1() throws Exception {
        Set<String> strings = parens.generateParens(1);
        assertEquals(1, strings.size());
        assertTrue(strings.contains("()"));
    }

    @Test
    public void generateParens2() throws Exception {
        Set<String> strings = parens.generateParens(2);
        assertEquals(2, strings.size());
        assertTrue(strings.contains("(())"));
        assertTrue(strings.contains("()()"));
    }

    @Test
    public void generateParens3() throws Exception {
//        List<String> reference = ParensReferenceB.generateParens(25);
//        Set<String> mine = parens.generateParens(25);
        for (int i = 1; i < 15; i++) {
            verify(i);
        }
    }

    private void verify(int count) {

        Set<String> mine = parens.generateParens(count);
        List<String> reference = ParensReferenceB.generateParens(count);

        assertEquals(reference.size(), mine.size());

        for (String ref :
                reference) {
            assertTrue(mine.contains(ref));
        }
    }

}