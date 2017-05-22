package ctci.Chapter4;


import BST.MyBST;

/**
 * Created by fkruege on 4/15/17.
 */
public class MinimalTree4_2 {

    MyBST<Integer, Integer> bst = new MyBST<Integer, Integer>();


    public MinimalTree4_2() {

    }

    public int height() {
        return 0;
    }

    public void minimumTree(int[] sorted) {
        add(sorted, 0, sorted.length - 1);
    }

    public MyBST<Integer, Integer> getBst(){
        return bst;
    }

    private void add(int[] sorted, int lowerBound, int upperBound) {

        if (upperBound < lowerBound || lowerBound > upperBound) {
            return;
        } else {
            int value = 0;
            int middle = (lowerBound + upperBound) / 2;
            value = sorted[middle];
            bst.put(value, value);
            add(sorted, lowerBound, middle - 1);
            add(sorted, middle + 1, upperBound);
        }
    }
}
