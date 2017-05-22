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
public class CommonAncestor4_8_BSTTest {

    BST.MyBST<Integer, Integer> bst;
    CommonAncestor4_8_BST commonAncestor;
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

        commonAncestor = new CommonAncestor4_8_BST(bst);

    }

    @Test
    public void findAncestor_AncestorIsRoot() throws Exception {
        MyBST.Node<Integer, Integer> ancestor = commonAncestor.findAncestor(3, 12);
        assertEquals(7, ancestor.value.intValue());
    }

    @Test
    public void findAncestor_AncestorIsNull() throws Exception {
        MyBST.Node<Integer, Integer> ancestor = commonAncestor.findAncestor(7, 7);
        assertNull(ancestor);
    }

    @Test
    public void findAncestor_AncestorIsOn2ndLevel() throws Exception {
        MyBST.Node<Integer, Integer> ancestor = commonAncestor.findAncestor(1, 6);
        assertEquals(3, ancestor.value.intValue());
    }


    @Test
    public void findAncestor_AncestorIsOn4thLevel() throws Exception {
        MyBST.Node<Integer, Integer> ancestor = commonAncestor.findAncestor(9, 11);
        assertEquals(10, ancestor.value.intValue());
    }


}