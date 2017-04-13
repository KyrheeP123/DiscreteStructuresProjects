package graphProject;
//import java.util.*;
//import java.util.Iterator;

public class Edge {
	//Instance variables
	private int dest;
	private int source;
	private double weight;
	
	//Constructors 
	
	public Edge(int source, int dest){
		this.dest = dest;
		this.source = source;
		this.weight = 1.0;
	}

	public Edge(int source, int dest, double weight){
		this.dest = dest;
		this.source = source;
		this.weight = weight;
	}
	
	//Getters 
	
	public int getDest(){
		return dest;
	}
	
	public int getSource(){
		return source;
	}
	
	public double getWeight(){
		return weight;
	}
	
	//Setters
	
	public void setDest(int dest){
		this.dest = dest;
	}
	
	public void setSource(int source){
		this.source = source; 
	}
	
	public void setWeight(double weight){
		this.weight = weight; 
	}
	
	//Methods

	public boolean equals(Edge E){
		/* Compare two edges
		 * Return true if the source and destination edges are the same
		 * Don't consider weight
		 */
		return (this.dest == E.dest && this.source == E.source);
	}
	
	public String toString(){
		return "Source:" + " " + source + " " + "Destination: " + dest + " "+ "Height" + " " + weight;
	}
	
	public int hashCode(){
		/*Generate hash code based on the source and the destination
		 * 
		 */
		int hash = 1; 
		
		hash = (Integer.valueOf(this.dest * 13 + this.dest)).intValue() + (Integer.valueOf(this.source * 10 + this.source)).intValue() ;
		
		return hash;
	}
	

	
}
