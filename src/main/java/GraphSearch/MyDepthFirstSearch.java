package GraphSearch;

import edu.princeton.cs.algs4.Graph;
import sun.util.resources.cldr.se.CurrencyNames_se;

/**
 * Created by fkruege on 2/26/2017.
 */
public class MyDepthFirstSearch {

    private Graph _graph;
    private int _sourceVertex;

    private int _connectedToCount;
    private int[] _edgeTo;

    public MyDepthFirstSearch(Graph graph, int sourceVertex) {
        _graph = graph;
        _sourceVertex = sourceVertex;

        // sourceVertex is always connected to itself
        _connectedToCount = 1;
        _edgeTo = new int[graph.V()];
        init_edgeTo();
    }


    public void depthFirstSearch() {
        // initialize the source vertex
        _edgeTo[_sourceVertex] = _sourceVertex;
        dfs(_sourceVertex);
    }

    public boolean marked(int v)
    {
        return _edgeTo[v] != Integer.MAX_VALUE;
    }

    public int count(){
        return _connectedToCount;
    }

    private void dfs(int vertex) {
        for (Integer adjacent : _graph.adj(vertex)) {
            if (_edgeTo[adjacent] == Integer.MAX_VALUE) {
                _connectedToCount++;
                _edgeTo[adjacent] = vertex;
                dfs(adjacent);
            }
        }
    }

    private void init_edgeTo() {

        for (int i = 0; i < _edgeTo.length; i++) {
            _edgeTo[i] = Integer.MAX_VALUE;
        }

    }


}
