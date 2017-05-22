package ctci.Chapter5;

/**
 * Created by fkruege on 5/6/17.
 */
public class BitOperators {

    public int clearBit(int num, int pos) {
        int mask = ~(1 << pos);
        return num & mask;
    }

    public int clearFromMSBToIBit(int num, int iPos) {
        int mask = (1 << iPos) - 1;
        return num & mask;
    }

    public int clearFrom0ToIBit(int num, int iPos) {
        int mask = -1 << iPos + 1;
        return mask & num;
    }

    public int setBit(int num, int position) {
        int mask = 1 << position;
        return num | mask;
    }

    public int getBit(int num, int position) {
        return (num >> position) & 1;
    }


    public boolean getBitBool(int num, int position) {
        int mask = 1 << position;
        return (mask & num) != 0;
    }

    public int count1Bits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
    }
}
