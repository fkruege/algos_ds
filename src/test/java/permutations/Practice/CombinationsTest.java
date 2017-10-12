package permutations.Practice;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 6/3/17.
 */
public class CombinationsTest {

    Combinations combos;

    @Before
    public void setUp() throws Exception {
        combos = new Combinations();
    }

    @Test
    public void getCombos() throws Exception {
        List<List<Character>> combos = this.combos.getCombos(new char[]{'a', 'b', 'c'});
        assertTrue(combos.size() > 0);
    }

}