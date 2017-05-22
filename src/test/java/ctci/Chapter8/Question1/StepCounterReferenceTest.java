package ctci.Chapter8.Question1;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/18/17.
 */
public class StepCounterReferenceTest {

    StepCounter myStepCounter;
    StepCounterReference stepCounter;

    @Before
    public void setUp() throws Exception {
        myStepCounter = new StepCounter();
        stepCounter = new StepCounterReference();
    }

    @Test
    public void getHopCombinations() throws Exception {
        int steps = 3;
        int referenceCombinations = stepCounter.getHopCombinations(steps);
        assertTrue(referenceCombinations > 0);
//        List<List<Integer>> listCombinations = myStepCounter.countHopCombinations(3);
//        assertEquals(listCombinations.size(), referenceCombinations);
    }

}