package ctci.Chapter8.Question7;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/27/17.
 */
public class UniquePermutationsTest {

    UniquePermutations permutations;
    PermutationsReference reference;

    @Before
    public void setUp() throws Exception {
        permutations = new UniquePermutations();
        reference = new PermutationsReference();
    }

    @Test
    public void find() throws Exception {
        List<String> list = permutations.find("abc");
        assertTrue(list.size() > 0);
    }

    @Test
    public void find2() throws Exception {
        List<String> list = permutations.find("see");
        assertTrue(list.size() > 0);
    }

    @Test
    public void find3() throws Exception {
        List<String> list = permutations.find("aaa");
//        ArrayList<String> aaa = PermutationsReference.printPerms("aaa");
        ArrayList<String> aaa = PermutationsReference.printPerms("abc");
        assertTrue(list.size() > 0);
    }
}