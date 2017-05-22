package ctci.Chapter5;

/**
 * Created by fkruege on 5/7/17.
 */
public class FlipBit5_3b {

    public int findLongestSequence(int num) {

        if (num == 0) {
            return 1;
        }

        if (num == -1 || num == Integer.MAX_VALUE) {
            return Integer.SIZE;
        }

        int maxLength = 0;
        int currentLength = 0;
        int previousLength = 0;

//        for (int i = 0; i < Integer.SIZE; i++) {
        while(num != 0){

            if (extractLastBit(num)) {
                currentLength++;
            } else {
                // if the 1s are contiguous
                if (extractLastBit(num >> 1)) {
                    previousLength = currentLength;
                    currentLength = 0;
                } else {
                    previousLength = 0;
                    currentLength = 0;
                }
            }

            maxLength = Math.max(maxLength, previousLength + currentLength +1);

            num = num >>> 1;
        }

        return maxLength;
    }

    private boolean extractLastBit(int num) {
        return (num & 1) == 1;
    }
}
