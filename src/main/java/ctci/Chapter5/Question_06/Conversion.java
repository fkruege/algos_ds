package ctci.Chapter5.Question_06;

/**
 * Created by fkruege on 5/9/17.
 */
public class Conversion {

    public int flipBits(int num, int goalNum) {
        num = num ^ goalNum;

        int flipBitCount = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                flipBitCount++;
            }
            num = num >>> 1;
        }
        return flipBitCount;
    }
}
