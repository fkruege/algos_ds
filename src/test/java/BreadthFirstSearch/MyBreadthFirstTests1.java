package BreadthFirstSearch;

import edu.princeton.cs.algs4.Graph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fkruege on 2/25/17.
 */
public class MyBreadthFirstTests1 {

    @Before
    public void before() {

    }

    // simple graph test
    @Test
    public void test1() {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);

        MyBreadthFirst breadthFirst = new MyBreadthFirst(graph, 0);
        breadthFirst.breadthFirstSearch();

        Assert.assertTrue(breadthFirst.hasPathTo(0));
        Assert.assertTrue(breadthFirst.hasPathTo(1));
        Assert.assertTrue(breadthFirst.hasPathTo(2));
        Assert.assertTrue(breadthFirst.hasPathTo(3));
        Assert.assertFalse(breadthFirst.hasPathTo(4));

        Assert.assertEquals(0, breadthFirst.distTo(0));
        Assert.assertEquals(1, breadthFirst.distTo(1));
        Assert.assertEquals(1, breadthFirst.distTo(2));
        Assert.assertEquals(2, breadthFirst.distTo(3));
        Assert.assertEquals(Integer.MIN_VALUE, breadthFirst.distTo(4));


        Iterable<Integer> pathToSelf = breadthFirst.pathTo(0);
        String crumbTrail0 = getCrumbTrail(pathToSelf);

        Iterable<Integer> pathTo3 = breadthFirst.pathTo(3);
        String crumbTrail = getCrumbTrail(pathTo3);

        Assert.assertEquals("0, 1, 3,", crumbTrail.trim());

    }

    private String getCrumbTrail(Iterable<Integer> path) {
        String crumbTrail = "";
        for (Integer vertex :
                path) {
            crumbTrail += vertex.toString() + ", ";
        }
        return crumbTrail;
    }


}
