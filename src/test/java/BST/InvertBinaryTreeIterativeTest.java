package BST;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/4/17.
 */
public class InvertBinaryTreeIterativeTest {

    InvertBinaryTreeIterative invertBinaryTree;
    InvertTreeTester invertTreeTester;


    @Before
    public void before() {
        invertBinaryTree = new InvertBinaryTreeIterative();
        invertTreeTester = new InvertTreeTester();
    }


    @Test
    public void invertTree() throws Exception {
        invertTreeTester.testInversion(invertBinaryTree);
    }


}