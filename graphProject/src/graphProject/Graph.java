package graphProject;
import java.util.*;
import java.util.Iterator;

public interface Graph {
	//Getters
	
	//Return number of vertices
	int getNumV();
	
	//Determine if graph is directed
	boolean isDirected();
	
	//Insert Edges
	void insert(Edge edge);
	
	//Determine if the edge exists that travels from source to dest
	boolean isEdge(int source, int dest);
	
	//Get the edge between two vertices
	Edge getEdge(int source, int dest);
	
	/*
	 * Return an iterator to the edges connected to a given
	 * vertex
	 * return Iterator<Edge> to the vertices connected
	 */
	Iterator<Edge> edgeIterator(int source);
	
}
