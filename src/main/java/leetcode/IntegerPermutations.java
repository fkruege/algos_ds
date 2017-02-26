package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 2/21/17.
 */
// https://leetcode.com/problems/permutations/?tab=Description
public class IntegerPermutations {

    private List<List<Integer>> _permutations;

    public List<List<Integer>> permute(int[] nums) {

        _permutations = new ArrayList<List<Integer>>();

        List<Integer> input = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            input.add(nums[i]);
        }

        findPermutations(new ArrayList<Integer>(), input);

        return _permutations;


    }

    private void findPermutations(List<Integer> currentPerm, List<Integer> input){

        if(input.size() == 0){
            _permutations.add(currentPerm);
            return;
        }


        for(int i = 0; i < input.size(); i++){
            List<Integer> copyOfCurrent = new ArrayList<Integer>(currentPerm);
            copyOfCurrent.add(input.get(i));
            List<Integer> copyOfInput = new ArrayList<Integer>(input);
            copyOfInput.remove(i);
            findPermutations(new ArrayList<Integer>(copyOfCurrent), copyOfInput);
        }



    }
}
