package ctci.Chapter4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/16/17.
 */
public class IsValidBST4_5Test {


    int[] sortedArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    MinimalTree4_2 minTree = new MinimalTree4_2();


    @Before
    public void before() {
        minTree.minimumTree(sortedArray);
    }


    @Test
    public void isBST() throws Exception {

        IsValidBST4_5 isBST = new IsValidBST4_5();
        assertTrue(isBST.isBST(minTree.getBst().getRoot()));

    }

}