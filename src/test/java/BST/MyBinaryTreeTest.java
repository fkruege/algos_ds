package BST;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/1/17.
 */
public class MyBinaryTreeTest {

    MyBinaryTree binaryTree;


    @Before
    public void setUp() throws Exception {
        Integer[] input = new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1};
        binaryTree = new MyBinaryTree();
        binaryTree.add(input);
        List<List<Integer>> depthList = binaryTree.getDepthList();
        System.out.println();


    }

    @Test
    public void getRoot() throws Exception {

    }

    @Test
    public void add() throws Exception {

    }

    @Test
    public void getDepthList() throws Exception {

    }

}