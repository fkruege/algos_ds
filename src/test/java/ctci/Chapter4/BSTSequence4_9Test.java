package ctci.Chapter4;

import BST.*;
import BST.MyBST;
import com.sun.source.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/30/17.
 */
public class BSTSequence4_9Test {

    BST.MyBST<Integer, Integer> bst;
    int input[];

    @Before
    public void setUp() throws Exception {

        bst = new BST.MyBST<Integer, Integer>();
        input = new int[]{100, 50, 200, 40, 60, 150, 300, 30, 45, 55, 70};
        for (int i : input){
            bst.put(i, i);
        }



        List<List<Integer>> depthList = bst.getDepthList();
        System.out.println();
    }

    @Test
    public void postOrder(){
        TreeTraversal traversal = new TreeTraversal();
        traversal.postorderTraversal(bst);
    }
//
//    @Test
//    public void getArrayPermutations() throws Exception {
//
//        BSTSequence4_9 bstArrays = new BSTSequence4_9();
//        bstArrays.getArrayPermutations(bst);
//
//    }

}