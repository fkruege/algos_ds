package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fkruege on 2/11/2017.
 */

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindDuplicates {

    public static void main(String[] args){

        FindDuplicates finder = new FindDuplicates();
        assert finder.findDuplicates(new int[]{1, 1}).get(0) == 1;
        List<Integer> duplicates = finder.findDuplicates(new int[]{2, 3, 4, 1, 5, 1, 2});

        assert duplicates.contains(1);
        assert duplicates.contains(2);



    }


    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> results = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            int first = nums[i];
            int key = Arrays.binarySearch(nums, i+1, nums.length, first);
            if(key >= 0){
                results.add(first);
            }
        }

        return results;

    }
}
