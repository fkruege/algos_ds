package leetcode;

import java.util.Arrays;

/**
 * Created by fkruege on 2/20/17.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int oddOne = 0;
        for(int i = 0; i < nums.length; i+=2){
            if(!(i + 1 < nums.length && nums[i+1] == nums[i])){
                oddOne = nums[i];
                break;
            }
        }

        return oddOne;
    }
}
