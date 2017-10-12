package ctci.Chapter8.Question1;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by fkruege on 5/17/17.
 */
public class StepCounterTest {

    StepCounterPractice practice;
    StepCounter stepCounter;
    int[] stepSize = new int[]{1, 2, 3};


    @Before
    public void setUp() throws Exception {
        practice = new StepCounterPractice();
        stepCounter = new StepCounter();
    }

    @Test
    public void countHopCombinations() throws Exception {
//        for (int i = 0; i < 25; i++) {
            int goal = 4;
            int expected = StepCounterReference.countWays(goal);
            int actual = stepCounter.getNumberWays(goal, stepSize);
            assertEquals(expected, actual);
//        }
    }


    @Test
    public void countHopCombinations2() throws Exception {
        int goal = 30;
        int hopCombinations = StepCounterReference.countWays(goal);
        int count = practice.getCount(goal, stepSize);
        assertEquals(hopCombinations, count);
//        assertTrue(count > 0);
    }

}