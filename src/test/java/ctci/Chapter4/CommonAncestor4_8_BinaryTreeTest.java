package ctci.Chapter4;

import BST.MyBST;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by fkruege on 4/28/17.
 */
public class CommonAncestor4_8_BinaryTreeTest {

    MyBST<Integer, Integer> bst;
    CommonAncestor4_8_BinaryTree commonAncestor;
    int input[];


    @Before
    public void setUp() throws Exception {
        bst = new MyBST<>();
        input = new int[]{10, 5, 15, 4, 7, 12, 20, 3, 6, 9, 11, 13, 1, 2};
        Arrays.sort(input);

        MinimalTree4_2 minTree = new MinimalTree4_2();
        minTree.minimumTree(input);
        bst = minTree.getBst();

        List<List<Integer>> depthList = bst.getDepthList();

        commonAncestor = new CommonAncestor4_8_BinaryTree(bst);

    }

    @Test
    public void findAncestor_RootOfTree() throws Exception {
        Integer ancestor = commonAncestor.findAncestor(7, 7);
        assertNull(ancestor);
    }

    @Test
    public void findAncestor_AncestorIsRoot() throws Exception {
        Integer ancestor = commonAncestor.findAncestor(3, 12);
        assertEquals(7, ancestor.intValue());
    }

    @Test
    public void findAncestor_AncestorIsNull() throws Exception {
        Integer ancestor = commonAncestor.findAncestor(7, 7);
        assertNull(ancestor);
    }

    @Test
    public void findAncestor_AncestorIsOn2ndLevel() throws Exception {
        Integer ancestor =  commonAncestor.findAncestor(1, 6);
        assertEquals(3, ancestor.intValue());
    }


    @Test
    public void findAncestor_AncestorIsOn4thLevel() throws Exception {
        Integer ancestor =  commonAncestor.findAncestor(9, 11);
        assertEquals(10, ancestor.intValue());
    }


    @Test
    public void findAncestor_NoCommon() throws Exception {
        Integer ancestor =  commonAncestor.findAncestor(9999, 11);
        assertNull(ancestor);
    }

    @Test
    public void findAncestor_NoCommon2() throws Exception {
        Integer ancestor =  commonAncestor.findAncestor(9999, 111);
        assertNull(ancestor);
    }

}