package BitOperators;

import org.junit.Test;

/**
 * Created by fkruege on 3/25/17.
 */
public class BitShifting {

    @Test
    public void test_BinaryRepresentation(){
        int zero = 0;
        System.out.println("0 is: " + Integer.toBinaryString(zero));
        System.out.println("-0 is: " + Integer.toBinaryString(-0));
        System.out.println("1 is: " + Integer.toBinaryString(1));
        System.out.println("-1 is: " + Integer.toBinaryString(-1));
        System.out.println("2 is: " + Integer.toBinaryString(2));
        System.out.println("-2 is: " + Integer.toBinaryString(-2));
        System.out.println("32 is: " + Integer.toBinaryString(32));
        System.out.println("-32 is: " + Integer.toBinaryString(-32));
        System.out.println(Integer.MIN_VALUE + " Integer MIN Value is: " + Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.MAX_VALUE + " Integer MAX Value is: " + Integer.toBinaryString(Integer.MAX_VALUE));

    }
}
