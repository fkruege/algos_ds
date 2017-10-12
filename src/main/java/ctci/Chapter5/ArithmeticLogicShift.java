package ctci.Chapter5;

import java.util.HashMap;

public class ArithmeticLogicShift {

    public int repeatedArithmeticShift(int x, int count) {
        for (int i = 0; i < count; i++) {
            x >>= 1;  // arithmetic shift by 1
        }
        return x;
    }

    public int repeatedLogicalShift(int x, int count) {
        for (int i = 0; i < count; i++) {
            x >>>= 1; // logical shift by 1
        }
        return x;
    }


}
