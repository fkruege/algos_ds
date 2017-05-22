package ctci.Chapter4;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Stack;

/**
 * Created by fkruege on 4/16/17.
 */
public class BuildOrder4_7 {

    private boolean[] marked;
    private Stack<Integer> topoSort;

    public Iterable<Integer> topoSort(Digraph graph) {
        marked = new boolean[graph.V()];
        topoSort = new Stack<Integer>();

        for(int i = 0; i < graph.V(); i++){
            if(!marked[i]){
                dfs(graph, i);
            }
        }

        return topoSort;
    }

    private void dfs(Digraph graph, int vertex) {
        marked[vertex] = true;
        for (Integer adjacent : graph.adj(vertex)) {
            if (!marked[adjacent]) {
                dfs(graph, adjacent);
            }
        }
        topoSort.push(vertex);
    }
}
