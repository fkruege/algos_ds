package ctci.Chapter4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 4/2/17.
 */
public class TreeTraversalTest {

    MyBST<Integer, Integer> myBST;
    TreeTraversal traversal;

    @Before
    public void before(){
        traversal = new TreeTraversal();
        myBST = new MyBST<Integer, Integer>();
        myBST.put(10,10);
        myBST.put(5,5);
        myBST.put(20,20);
        myBST.put(3     ,3);
        myBST.put(8     ,8);
        myBST.put(15,15);
        myBST.put(25,25);
        myBST.put(2,2);
        myBST.put(4,4);
        myBST.put(6,6);
        myBST.put(9,9);

        myBST.put(12,12);
        myBST.put(17,17);
        myBST.put(22,22);
        myBST.put(29,29);

    }


    @Test
    public void testTraversals() throws Exception {

        traversal.inorderTraversal(myBST);
        traversal.preorderTraversal(myBST);
        traversal.postorderTraversal(myBST);
        traversal.levelOrder(myBST);

    }

}