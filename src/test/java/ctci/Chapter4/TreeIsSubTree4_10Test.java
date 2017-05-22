package ctci.Chapter4;

import BST.*;
import BST.MyBST;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/30/17.
 */
public class TreeIsSubTree4_10Test {

    BST.MyBST<Integer, Integer> mainTree;
    BST.MyBST<Integer, Integer> subTree;

    TreeIsSubTree4_10 subTreeTester;


    @Before
    public void setUp() throws Exception {
        mainTree = new MyBST<>();
        subTree = new MyBST<>();
        subTreeTester = new TreeIsSubTree4_10();
    }

    @Test
    public void containsTree_SimpleTreeTrue() throws Exception {
        int[] input = new int[]{2, 1, 3};
        createTree(mainTree, input);
        createTree(subTree, input);
        assertTrue(subTreeTester.containsTree(mainTree, subTree));
    }


    @Test
    public void containsTree_SimpleTreeTrue2() throws Exception {
        createTree(mainTree, new int[]{2, 1, 3});
        createTree(subTree, new int[]{2, 1});
        assertTrue(subTreeTester.containsTree(mainTree, subTree));
    }


    @Test
    public void containsTree_SimpleTreeFalse() throws Exception {
        createTree(mainTree, new int[]{2, 1, 3});
        createTree(subTree, new int[]{2, 0});
        assertFalse(subTreeTester.containsTree(mainTree, subTree));
    }

    @Test
    public void containsTree_BiggertreeTrue() {
        int[] bigInput = new int[]{100, 50, 200, 40, 60, 150, 300, 30, 45, 55, 70};
        int[] smallInput = new int[]{60, 55, 70};
        createTree(mainTree, bigInput);
        createTree(subTree, smallInput);
        assertTrue(subTreeTester.containsTree(mainTree, subTree));
    }


    @Test
    public void containsTree_BothTreesSame() {
        int[] bigInput = new int[]{100, 50, 200, 40, 60, 150, 300, 30, 45, 55, 70};
        createTree(mainTree, bigInput);
        createTree(subTree, bigInput);
        assertTrue(subTreeTester.containsTree(mainTree, subTree));
    }


    @Test
    public void containsTree_BiggertreeTrue2() {
        int[] bigInput = new int[]{100, 50, 200, 40, 60, 150, 300, 30, 45, 55, 70};
        int[] smallInput = new int[]{60, 55 };
        createTree(mainTree, bigInput);
        createTree(subTree, smallInput);
        assertTrue(subTreeTester.containsTree(mainTree, subTree));
    }

    private void createTree(BST.MyBST<Integer, Integer> tree, int[] input) {
        for (int i : input) {
            tree.put(i, i);
        }
    }

}