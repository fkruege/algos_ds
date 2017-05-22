package ctci.Chapter8.Question4;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/21/17.
 */
public class PowerSetTest {

    PowerSet powerSet;

    @Before
    public void setUp() throws Exception {
        powerSet = new PowerSet();
    }

    @Test
    public void findPowerSets() throws Exception {
        ArrayList<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        ArrayList<ArrayList<Integer>> powerSets = powerSet.findPowerSets(set);
        assertEquals(6,powerSets.size());
    }

}