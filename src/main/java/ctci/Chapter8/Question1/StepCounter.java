package ctci.Chapter8.Question1;

/**
 * Created by fkruege on 6/4/17.
 */
public class StepCounter {

    private int numberSteps;
    private int[] memo;
    private int[] validSteps;

    public int getNumberWays(int numberSteps, int[] validSteps) {

        this.numberSteps = numberSteps;
        this.validSteps = validSteps;
        this.memo = new int[numberSteps + 1];

        int numberWays = ways(0);
        return numberWays;
    }

    private int ways(int currentStep) {

        if(memo[currentStep] > 0){
            return memo[currentStep];
        }

        if (currentStep == numberSteps) {
            return 1;
        }

        int numberWays = 0;

        for (int i = 0; i < validSteps.length; i++) {
            int stepAmt = validSteps[i];
            int saveStep = currentStep + stepAmt;
            if (saveStep > numberSteps) {
                break;
            }

            numberWays += ways(saveStep);
        }

        memo[currentStep] = numberWays;

        return numberWays;
    }


}
