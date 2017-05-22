package GraphSearch;

import Graphs.MyConnectedComponentGraph;
import edu.princeton.cs.algs4.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fkruege on 2/26/2017.
 */
public class MyConnctedComponentGraphTests2 {

    @Test
    public void test_1() {
        String inputGraphFileName = "src/test/resources/mediumG.txt";
        In in = new In(inputGraphFileName);
        Graph G = new Graph(in);
        test_graph(G);
    }


    private void test_graph(Graph graph){

        CC reference = new CC(graph);
        MyConnectedComponentGraph myCC = new MyConnectedComponentGraph(graph);
        myCC.findConnectedComponents();

        // number of connected components
        Assert.assertEquals(reference.count(), myCC.count());
        int m = reference.count();
        StdOut.println(m + " components");

        // compute list of vertices in each connected component
        Queue<Integer>[] components = (Queue<Integer>[]) new Queue[m];
        for (int i = 0; i < m; i++) {
            components[i] = new Queue<Integer>();
        }
        for (int v = 0; v < graph.V(); v++) {
            Assert.assertEquals(reference.id(v), myCC.id(v));
            components[reference.id(v)].enqueue(v);
        }

        // print results
        for (int i = 0; i < m; i++) {
            for (int v : components[i]) {
                StdOut.print(v + " ");
            }
            StdOut.println();
        }
    }

}
