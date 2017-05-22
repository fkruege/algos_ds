package ctci.Chapter5;

import edu.princeton.cs.algs4.Queue;

/**
 * Created by fkruege on 5/7/17.
 */
public class FlipBit5_3 {

    public static final int DEFAULT_INDEX = -1;
    public static final int INT_SIZE = 31;

    public static class ConsecutiveOnes {
        int startIndex = -1;
        int endIndex = -1;

        public ConsecutiveOnes(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public int getConsecutiveCount() {
            if (startIndex == DEFAULT_INDEX || endIndex == DEFAULT_INDEX) {
                return 0;
            } else {
                return (endIndex - startIndex) + 1;
            }

        }
    }

    public int findLongest1Sequence(int num) {

        Queue<ConsecutiveOnes> consecutiveOnes = new Queue<>();

        if(num == -1){
            return INT_SIZE + 1;
        }

        int oneStartIndex = DEFAULT_INDEX;
        int oneEndIndex = DEFAULT_INDEX;

        for (int i = 0; i <= INT_SIZE; i++) {
            boolean bit = extractLastBit(num);

            if (bit) {
                if (oneStartIndex < 0) {
                    oneStartIndex = i;
                    oneEndIndex = DEFAULT_INDEX;
                }
            } else {
                if (oneStartIndex >= 0) {
                    oneEndIndex = i - 1;
                    consecutiveOnes.enqueue(new ConsecutiveOnes(oneStartIndex, oneEndIndex));
                    oneStartIndex = DEFAULT_INDEX;
                }
            }
            num = num >> 1;
        }

        // no 1s
        if (consecutiveOnes.isEmpty()) {
            return -1;
        }

        if (consecutiveOnes.size() == 1) {
            ConsecutiveOnes longestOnes = consecutiveOnes.dequeue();
            return longestOnes.getConsecutiveCount();
        }

        int optimalOneCount = -1;
        int optimalFlipPos = -1;
        ConsecutiveOnes previous = consecutiveOnes.dequeue();
        while (!consecutiveOnes.isEmpty()) {
            ConsecutiveOnes current = consecutiveOnes.dequeue();

            int previousOneCount = previous.getConsecutiveCount();
            int currentOneCount = current.getConsecutiveCount();

            // 2 contiguous 1s
            if (current.startIndex - 2 == previous.endIndex) {
                if (previousOneCount + currentOneCount + 1 > optimalOneCount) {
                    optimalOneCount = previousOneCount + currentOneCount + 1;
                }
            } else {
                if (previousOneCount + 1 > currentOneCount && previousOneCount + 1 > optimalOneCount) {
                    optimalOneCount = previousOneCount + 1;
                    continue;
                }

                if (currentOneCount + 1 > previousOneCount && currentOneCount + 1 > optimalOneCount) {
                    optimalOneCount = currentOneCount + 1;
                    continue;
                }
            }
            previous = current;
        }

        return optimalOneCount;
    }

    private boolean extractLastBit(int num) {
        int mask = 1;
        return (num & mask) == 1;
    }


}
