package ctci.Chapter5;

/**
 * Created by fkruege on 5/5/17.
 */
public class Insertion5_1 {

    public int insert_m_into_n(int m, int n, int i, int j) {

        int length = (j - i) + 1;
        int newN = n;
        for(int mIndex = 0; mIndex < length; mIndex++){
            int mBit = getBitAt(m, mIndex);
            newN = setBitAt(newN, i, mBit);
            i++;
        }

        return newN;

    }

    public int getBitAt(int num, int bitPosition) {
        int mask = 1 << bitPosition;
        return (num & mask) >> bitPosition;
    }

    public int setBitAt(int num, int bitPosition, int value) {
        int clearMask = ~(1 << bitPosition);
        return (num & clearMask) | (value << bitPosition);
    }
}
