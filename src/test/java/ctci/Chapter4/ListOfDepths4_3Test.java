package ctci.Chapter4;

import BST.MyBST;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by fkruege on 4/16/17.
 */
public class ListOfDepths4_3Test {

    int[] sortedArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    MinimalTree4_2 minTree = new MinimalTree4_2();

    @Before
    public void before(){
        minTree.minimumTree(sortedArray);
    }


    @Test
    public void listDepths() throws Exception {
        MyBST<Integer, Integer> bst = minTree.getBst();

        ListOfDepths4_3 depth = new ListOfDepths4_3();
        depth.createDepthList(bst);

        List<List<Integer>> depthList = depth.getDepthList();


    }

}