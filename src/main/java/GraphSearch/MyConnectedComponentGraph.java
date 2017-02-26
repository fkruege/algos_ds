package GraphSearch;

import edu.princeton.cs.algs4.Graph;

/**
 * Created by fkruege on 2/26/2017.
 */
public class MyConnectedComponentGraph {

    private Graph _graph;
    private int _componentId = 0;
    private boolean[] _marked;
    private int[] _component;
    private int[] _size;

    public MyConnectedComponentGraph(Graph graph) {
        _graph = graph;

        _componentId = 0;
        _marked = new boolean[graph.V()];
        _component = new int[graph.V()];
        _size = new int[graph.V()];
    }

    public void findConnectedComponents() {

        for (int i = 0; i < _marked.length; i++) {
            if (!_marked[i]) {
                _marked[i] = true;
                _component[i] = _componentId;
                _size[_componentId]++;
                dfs(i, _componentId++);
            }
        }
    }

    public boolean connected(int v, int w) {
        return _component[v] == _component[w];
    }

    public int count() {
        return _componentId;
    }

    public int id(int v) {
        return _component[v];
    }

    public int size(int v){
        int componentId = _component[v];
        return _size[componentId];
    }



    private void dfs(int vertex, int componentId) {

        for (Integer adjacentVertex : _graph.adj(vertex)) {
            if (!_marked[adjacentVertex]) {
                _marked[adjacentVertex] = true;
                _component[adjacentVertex] = componentId;
                _size[componentId]++;
                dfs(adjacentVertex, componentId);
            }
        }
    }


}
