package ctci.Chapter8.Question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fkruege on 6/3/17.
 */
public class StepCounterPractice {

    private List<List<Integer>> combinations;
    private int[] allowableSteps;
    private int count;
    int memo[];

    List<HashSet<Integer>> previousSteps;

    public List<List<Integer>> getStepCombinations(int numberSteps, int[] allowableSteps) {
        this.previousSteps = new ArrayList<>(numberSteps + 1);

        for (int i = 0; i < numberSteps + 1; i++) {
            previousSteps.add(new HashSet<>());
        }

        this.allowableSteps = allowableSteps;
        combinations = new ArrayList<>();
//        tryStep(numberSteps, new ArrayList<>());
        tryStep3(0, numberSteps, new ArrayList<>());
        return combinations;
    }

    public int getCount(int numberSteps, int[] allowableSteps) {
        count = 0;
        memo = new int[numberSteps + 1];
        this.allowableSteps = allowableSteps;
        tryStep2(numberSteps);
        return count;
    }

    private void tryStep3(int currentStep, int totalSteps, List<Integer> list) {
        if (currentStep == totalSteps) {
            combinations.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < allowableSteps.length; i++) {
            int step = allowableSteps[i];
            int copy = currentStep;

            if (previousSteps.get(copy).contains(step) && previousSteps.get(copy).contains(Integer.MAX_VALUE)) {
                recreateSolutions(step, copy, totalSteps, list);
                continue;
            }

            if (copy + step > totalSteps) {
                previousSteps.get(copy).add(Integer.MAX_VALUE);
                return;
            }

            previousSteps.get(copy).add(step);
            copy = copy + step;
            list.add(step);
            tryStep3(copy, totalSteps, list);
            list.remove(list.size() - 1);
        }
    }

    private void recreateSolutions(int startAtStep, int currentStep, int totalSteps, List<Integer> list) {
        if (currentStep == totalSteps) {
            combinations.add(new ArrayList<>(list));
            return;
        }

        HashSet<Integer> solutions = previousSteps.get(currentStep);
        Iterator<Integer> iterator = solutions.iterator();
        while (iterator.hasNext()) {
            int step = iterator.next();
            if (step < startAtStep || step == Integer.MAX_VALUE) {
                continue;
            }
            int copy = currentStep + step;
            list.add(step);
            recreateSolutions(startAtStep, copy, totalSteps, list);
            list.remove(list.size() - 1);
        }
    }

    private void tryStep(int numberSteps, List<Integer> list) {
        if (numberSteps == 0) {
            combinations.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < allowableSteps.length; i++) {
            int step = allowableSteps[i];
            int remainingSteps = numberSteps - step;
            if (remainingSteps < 0) {
                continue;
            }

            int previousStepIndex = previousSteps.size() - remainingSteps;
            if (previousSteps.get(previousStepIndex) == null) {
                HashSet<Integer> stepAttempts = new HashSet<>();
                stepAttempts.add(step);
                previousSteps.set(previousStepIndex, stepAttempts);
            } else {
                HashSet<Integer> stepAttempts = previousSteps.get(previousStepIndex);
                if (stepAttempts.contains(step)) {
                    continue;
                }
                stepAttempts.add(step);
            }


            list.add(step);
            tryStep(remainingSteps, list);
            list.remove(list.size() - 1);
        }
    }


    private void tryStep2(int numberSteps) {
        if (numberSteps == 0) {
            count++;
            return;
        }

        for (int i = 0; i < allowableSteps.length; i++) {
            int step = allowableSteps[i];
            int remainingSteps = numberSteps - step;
            if (remainingSteps < 0) {
                continue;
            }

            tryStep2(remainingSteps);
        }
    }


}
