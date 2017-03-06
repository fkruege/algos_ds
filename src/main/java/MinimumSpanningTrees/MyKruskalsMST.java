package MinimumSpanningTrees;

import edu.princeton.cs.algs4.*;

/**
 * Created by fkruege on 3/5/17.
 */
public class MyKruskalsMST {

    private EdgeWeightedGraph _graph;
    private Queue<Edge> _mstEdges;

    public MyKruskalsMST(EdgeWeightedGraph graph){
        _graph = graph;
    }

    public void findMST(){
        _mstEdges = new Queue<Edge>();

        WeightedQuickUnionUF unionFind = new WeightedQuickUnionUF(_graph.V());

        MinPQ<Edge> edgeMinPQ = new MinPQ<Edge>();
        for(Edge edge : _graph.edges()){
            edgeMinPQ.insert(edge);
        }

        while(_mstEdges.size() < _graph.V() - 1 && !edgeMinPQ.isEmpty()){

            Edge newEdge = edgeMinPQ.delMin();
            int vertexA = newEdge.either();
            int vertexB = newEdge.other(vertexA);
            if(!unionFind.connected(vertexA, vertexB)){
                unionFind.union(vertexA, vertexB);
                _mstEdges.enqueue(newEdge);
            }

        }

    }

    public Iterable<Edge> edges(){
        return _mstEdges;
    }
}
