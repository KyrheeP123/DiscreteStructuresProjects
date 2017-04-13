package graphProject;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class MatrixGraph extends AbstractGraph {
	private double [][] edges;
//	private boolean directed;

	public MatrixGraph(int numV, boolean directed) {
		super(numV, directed);
		edges = new double [numV][numV];
		
		for(int i = 0; i < numV; i++){
			for(int j = 0; j <numV; j++){
				edges[i][j] = Double.POSITIVE_INFINITY;
			}
		}
	}

	public void insert(Edge edge) {
		// TODO Auto-generated method stub
		edges[edge.getSource()][edge.getDest()] = edge.getWeight();
		
		if(isDirected()){
			edges[edge.getDest()][edge.getSource()] = edge.getWeight();
		}
		
	}


	public boolean isEdge(int source, int dest) {
		// TODO Auto-generated method stub
		return edges[source][dest] != Double.POSITIVE_INFINITY;
				
	}


	public Edge getEdge(int source, int dest) {
		Edge target;
		
		if(edges[source][dest] == Double.POSITIVE_INFINITY)
			target = null;
		
		else
			target = new Edge(source, dest, edges[source][dest]);
		
		return target;
	
	}


	public class EdgeIterator implements Iterator<Edge> {
		private int row;
		private int index; 
	
		public EdgeIterator(int i){
			row = i;
			index = 0;
			
		}
		 
		public Edge next(){
			if(hasNext()){
				return new Edge(row, index, edges[row][index]);
			}
			else{
				try{
					throw new Exception("Row" +  index);
				} catch(Exception ex){
					Logger.getLogger(MatrixGraph.class.getName());
				}
				return null;
			}
		}

		@Override
		public boolean hasNext() {
			while(edges[row][index] == Double.POSITIVE_INFINITY) index++;
			return index != getNumV();
		}
	}


	@Override
	public Iterator<Edge> edgeIterator(int source) {
		// TODO Auto-generated method stub
		return null;
		
	}
	
	
	

}
