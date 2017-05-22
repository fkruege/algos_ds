package ctci.Chapter4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fkruege on 4/15/17.
 */
public class MinimalTree4_2Test {
    int[] sortedArrayOddLength = new int[]{0, 1, 2, 3, 4};
    int[] sortedArrayEvenLength = new int[]{0, 1, 2, 3, 4, 5};
    int[] sortedArray2s = new int[]{0, 1, 2, 2, 2};

    MinimalTree4_2 minTree = new MinimalTree4_2();

    @Before
    public void before() {

    }


    @Test
    public void minimumTree_2s() throws Exception {
        minTree.minimumTree(sortedArray2s);
//        assertEquals(2, minTree.height());
    }

    @Test
    public void minimumTree_Even() throws Exception {
        minTree.minimumTree(sortedArrayEvenLength);
        assertEquals(2, minTree.height());
    }


    @Test
    public void minimumTree_Odd() throws Exception {
        minTree.minimumTree(sortedArrayOddLength);
        assertEquals(2, minTree.height());
    }

}