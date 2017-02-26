package BreadthFirstSearch;

import edu.princeton.cs.algs4.BreadthFirstPaths;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by fkruege on 2/25/17.
 */
public class MyBreadthFirstTests2 {

    @Before
    public void before() {

    }

    @Test
    public void test1() {

        String inputGraphFileName = "src/test/resources/tinyCG.txt";
        In in = new In(inputGraphFileName);
        Graph G = new Graph(in);
        for(int i = 0; i < 6; i++){
            testGraph(G, i);
        }

    }

    @Test
    public void test2() {

        String inputGraphFileName = "src/test/resources/largeG.txt";
        In in = new In(inputGraphFileName);
        Graph G = new Graph(in);
//        testGraph(inputGraphFileName, 0);
        for(int i = 0; i < 6; i++){
            testGraph(G, i);
        }

    }

    private void testGraph(Graph G, int sourceVertex){


        int s = sourceVertex;
        BreadthFirstPaths bfs = new BreadthFirstPaths(G, s);
        MyBreadthFirst myBfs = new MyBreadthFirst(G, s);
        myBfs.breadthFirstSearch();

        for (int v = 0; v < G.V(); v++) {
            Assert.assertEquals(bfs.hasPathTo(v), myBfs.hasPathTo(v));
            if (bfs.hasPathTo(v)) {

                Iterator<Integer> path1 = bfs.pathTo(v).iterator();
                Iterator<Integer> path2 = myBfs.pathTo(v).iterator();

                while(path1.hasNext() && path2.hasNext()){
                    Assert.assertEquals(path1.next(), path2.next());
                }

                Assert.assertEquals(path1.hasNext(), path2.hasNext());
//
//
//                String crumbTrail1 = "";
//                StdOut.printf("%d to %d (%d):  ", s, v, bfs.distTo(v));
//                for (int x : bfs.pathTo(v)) {
//                    crumbTrail1 += x + ", ";
//                    if (x == s) StdOut.print(x);
//                    else StdOut.print("-" + x);
//                }
//
//                String crumbTrail2 = "";
//                for (int x : myBfs.pathTo(v)) {
//                    crumbTrail2 += x + ", ";
//                }
//
//                Assert.assertEquals(crumbTrail1, crumbTrail2);
//                StdOut.println();
            } else {
                StdOut.printf("%d to %d (-):  not connected\n", s, v);
            }
        }
    }

}
