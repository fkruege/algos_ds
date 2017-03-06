package GraphSearch;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Stack;

/**
 * Created by fkruege on 3/4/17.
 */
public class MyTopologicalSort {

    private Digraph _digraph;
    private boolean[] _marked;
    private Stack<Integer> _topoSort;

    public MyTopologicalSort(Digraph digraph){
        _digraph = digraph;
        _marked = new boolean[_digraph.V()];
    }

    public Iterable<Integer> order(){
        _topoSort = new Stack<Integer>();
        for(int i = 0; i < _digraph.V(); i++){
            if(!_marked[i]){
                dfs(i);
            }
        }
        return _topoSort;
    }

    private void dfs(int vertex){

        _marked[vertex] = true;
        for(Integer adjacent : _digraph.adj(vertex)){
            if(!_marked[adjacent]){
                dfs(adjacent);
            }
        }

        _topoSort.push(vertex);
    }

}
