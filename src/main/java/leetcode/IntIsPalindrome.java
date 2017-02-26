package leetcode;

/**
 * Created by fkruege on 2/11/2017.
 */
public class IntIsPalindrome {

    public static void main(String[] args){

        assert isPalindrome(1);
        assert isPalindrome(11);
        assert isPalindrome(1331);
        assert !isPalindrome(122);


    }


    public static boolean isPalindrome(int x) {


        int xx = x;
        int reversed = 0;

        while(xx > 0){
            reversed = reversed * 10 + xx % 10;
            xx /= 10;
        }

        return x == reversed;
    }




}
