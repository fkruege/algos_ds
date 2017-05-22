package ctci.Chapter4;

import BST.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


/**
 * Created by fkruege on 4/16/17.
 */
public class BalanceTree4_4Test {


    int[] sortedArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    MinimalTree4_2 minTree = new MinimalTree4_2();


    @Before
    public void before() {
        minTree.minimumTree(sortedArray);
    }


    @Test
    public void isBalanced() throws Exception {
        BST.MyBST<Integer, Integer> bst = minTree.getBst();

        ListOfDepths4_3 listDepths = new ListOfDepths4_3();
        listDepths.createDepthList(bst);
        List<List<Integer>> depthList = listDepths.getDepthList();

        BalanceTree4_4 balanced = new BalanceTree4_4();
        balanced.isBalanced(bst.getRoot());


    }

}