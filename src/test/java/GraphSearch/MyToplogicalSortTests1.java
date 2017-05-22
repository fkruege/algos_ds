package GraphSearch;

import Graphs.MyTopologicalSort;
import edu.princeton.cs.algs4.Digraph;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fkruege on 3/4/17.
 */
public class MyToplogicalSortTests1 {

    @Test
    public void test_topoSort1(){

        Digraph digraph = new Digraph(7);
        digraph.addEdge(0,5);
        digraph.addEdge(0,2);
        digraph.addEdge(0,1);

        digraph.addEdge(3,6);
        digraph.addEdge(3,5);
        digraph.addEdge(3,4);

        digraph.addEdge(5,2);
        digraph.addEdge(6,4);
        digraph.addEdge(6,0);

        digraph.addEdge(3,2);
        digraph.addEdge(1,4);

        MyTopologicalSort topoSort = new MyTopologicalSort(digraph);

        StringBuilder sb = new StringBuilder();
        Iterable<Integer> order = topoSort.order();
        for(Integer i : order){
            sb.append(i.toString() + " ");
        }

        String expected = "3 6 0 5 2 1 4 ";

        Assert.assertEquals(expected, sb.toString());


    }


}
