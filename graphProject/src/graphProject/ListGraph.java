package graphProject;
import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class ListGraph extends AbstractGraph {
	//Vertex connected to its edges
	private List<Edge>[] edges;

	
	//Constructor 
	public ListGraph(int NumV, boolean directed){
		super(NumV, directed);
		edges = new List[NumV];
		
		for(int i = 0; i < NumV; i++){
			edges[i] = new LinkedList<Edge>();
		}
		
	}
	

	public void insert(Edge edge) {
		edges[edge.getSource()].add(edge);
		if(!isDirected()){
			edges[edge.getDest()].add(new Edge(edge.getDest(),edge.getSource(),edge.getWeight()));
		}
	}


	public boolean isEdge(int source, int dest) {
		return edges[source].contains(new Edge(source, dest));
	}


	public Edge getEdge(int source, int dest) {
		Edge target = new Edge(source, dest, Double.POSITIVE_INFINITY);
		
		for(Edge edge: edges[source]){
			if(edge.equals(target))
				return edge;
		}
		return target;
	}


	public Iterator<Edge> edgeIterator(int source) {
		return edges[source].iterator();
	}
	
}
