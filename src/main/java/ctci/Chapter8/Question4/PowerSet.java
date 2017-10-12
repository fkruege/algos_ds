package ctci.Chapter8.Question4;

import java.util.ArrayList;

public class PowerSet {

    public ArrayList<ArrayList<Integer>> findPowerSets(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();

        for (int i = 1; i <= set.size(); i++) {
            subsets(set, new ArrayList<>(), subsets, i, 0);
        }

        return subsets;
    }

    private void subsets(ArrayList<Integer> set,
                         ArrayList<Integer> current,
                         ArrayList<ArrayList<Integer>> subsets,
                         int desiredLength, int index) {

        if (index > set.size()) {
            return;
        }


        // build it up to get the desired base length
        int end = index;
        for (int i = index; i < set.size() && current.size() < desiredLength - 1; i++) {
            current.add(set.get(i));
            end = i + 1;
        }

        // now add the suffix combinations
        for (int i = end; i < set.size(); i++) {
            ArrayList<Integer> copy = new ArrayList<>(current);
            copy.add(set.get(i));
            subsets.add(copy);
        }

        // now find other combinations
        if(desiredLength > 1){
            subsets(set, new ArrayList<>(), subsets, desiredLength, index + 1);
        }

    }


    private void subsets2(ArrayList<Integer> set,
                          ArrayList<Integer> current,
                          ArrayList<ArrayList<Integer>> subsets,
                          int desiredLength, int index) {

        if (index < set.size()) {
            ArrayList<Integer> copy = new ArrayList<>(current);
            copy.add(set.get(index));
            subsets.add(copy);
        }


    }

}
