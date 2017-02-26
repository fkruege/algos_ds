package leetcode;

/**
 * Created by fkruege on 2/11/2017.
 */

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {

    public static void main(String[] args){

        assert reverse(123) == 321;
        assert reverse(1534236469) == 0;

    }

    public static int reverse(int x) {

        int xx = Math.abs(x);
        long reversed = 0;

        while(xx > 0){
            reversed = reversed * 10 + xx % 10;
            if(reversed > Integer.MAX_VALUE){
                return 0;
            }
            xx /= 10;
        }

        if(x < 0){
            return (int) (reversed * -1);
        }

        return (int)reversed;


    }
}
