package ctci.Chapter5.Question_04;


/**
 * Created by fkruege on 5/7/17.
 */
public class NextNumber {

    public static class NextHighestLowest {

        public final Integer highest;
        public final Integer lowest;

        public NextHighestLowest(Integer highest, Integer lowest) {
            this.highest = highest;
            this.lowest = lowest;
        }

    }

    public NextHighestLowest getNextHighestLowest(int num) {
        int numberOfOnes = getNumberOfOnes(num);
        Integer nextHighest = getNextHighest(num, numberOfOnes);
        Integer nextLowest = getNextLowest(num, numberOfOnes);
        return new NextHighestLowest(nextHighest, nextLowest);
    }

    private Integer getNextHighest(int num, int numberOfOnes) {
        for (long i = num + 1; i <= Integer.MAX_VALUE; i++) {
            int onesCount = getNumberOfOnes((int) i);
            if (onesCount == numberOfOnes) {
                return (int) i;
            }
        }
        return null;
    }


    private Integer getNextLowest(int num, int numberOfOnes) {
        for (long i = num - 1; i >= Integer.MIN_VALUE; i--) {
            int onesCount = getNumberOfOnes((int) i);
            if (onesCount == numberOfOnes) {
                System.out.println("Found: " + i + " : " + onesCount);
                return (int) i;
            }
        }
        return null;
    }

    private int getNumberOfOnes(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >>> 1;
        }
        return count;
    }

}
