package leetcode;

import java.util.Arrays;

/**
 * Created by fkruege on 2/20/17.
 */
public class SingleNumberXOR {
    public int singleNumber(int[] nums) {
        int oddOne = 0;
        for(int i = 0; i < nums.length; i++){
            oddOne^=nums[i];
        }

        return oddOne;
    }
}
