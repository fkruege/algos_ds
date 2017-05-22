package ctci.Chapter5;

/**
 * Created by fkruege on 5/6/17.
 */
public class IntToBinary {

    public boolean[] convertToBinary(int num) {

        boolean[] bits = new boolean[32];

        int mask = 1;
        for (int i = 0; i < 32; i++) {
            bits[i] = (num & mask) == 1;
            num = num >> 1;
        }

        return bits;


    }
}
