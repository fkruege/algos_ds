package ctci.Chapter8.Question1;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by fkruege on 5/17/17.
 */
public class StepCounterTest {

    StepCounter stepCounter;


    @Before
    public void setUp() throws Exception {
        stepCounter = new StepCounter();
    }

    @Test
    public void countHopCombinations() throws Exception {
        List<List<Integer>> lists = stepCounter.countHopCombinations(30);
        assertTrue(lists.size() > 0);
    }

}