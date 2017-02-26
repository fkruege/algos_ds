package GraphSearch;

import edu.princeton.cs.algs4.DepthFirstSearch;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fkruege on 2/26/2017.
 */
public class MyDepthFirstSearchTest2 {

    @Before
    public void before() {

    }

    @Test
    public void test_1() {

        String inputGraphFileName = "src/test/resources/tinyCG.txt";
        In in = new In(inputGraphFileName);
        Graph G = new Graph(in);
        for (int i = 0; i < 6; i++) {
            test_DFS(G, i);
        }

    }

        @Test
    public void test2() {

        String inputGraphFileName = "src/test/resources/mediumG.txt";
        In in = new In(inputGraphFileName);
        Graph G = new Graph(in);
        for(int i = 0; i < 6; i++){
            test_DFS(G, i);
        }

    }


    private void test_DFS(Graph graph, int vertex) {
        DepthFirstSearch referenceDFS = new DepthFirstSearch(graph, vertex);
        MyDepthFirstSearch myDFS  = new MyDepthFirstSearch(graph, vertex);
        myDFS.depthFirstSearch();

        Assert.assertEquals(referenceDFS.count(), myDFS.count());

        for (int v = 0; v < graph.V(); v++) {
            Assert.assertEquals(referenceDFS.marked(v), myDFS.marked(v));
        }


    }
}
