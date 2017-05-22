package ctci.Chapter8.Question1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 5/17/17.
 */
public class StepCounter {

    public List<List<Integer>> countHopCombinations(int numberSteps) {
        List<List<Integer>> hopCombinations = new ArrayList<>();
        hop(numberSteps, new ArrayList<>(), hopCombinations);
        return hopCombinations;
    }

    private void hop(int numberSteps, List<Integer> currentStepSequence, List<List<Integer>> hopCombinations) {

        for (int i = 1; i <= 3 && i <= numberSteps; i++) {
            List<Integer> newSequence = new ArrayList<>(currentStepSequence);
            newSequence.add(i);
            hop(numberSteps - i, newSequence, hopCombinations);
        }

        if (numberSteps == 0) {
            hopCombinations.add(currentStepSequence);
        }

    }
}
