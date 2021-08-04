package NonLinear;			//driver code for graph representation for "Graph.java"
import java.util.*;
public class MAIN{
	public static void main(String[]args) {
		
		Graph g=new Graph(4);
		g.addedge("a","b");
		g.addedge("a","c");
		g.addedge("a","d");
		
		g.addedge("c","a");
		g.addedge("c","d");
		g.addedge("c","e");
		
		g.addedge("b","a");
		g.addedge("b","d");
	
		g.addedge("d","a");
		g.addedge("d","c");
		g.addedge("d","e");
		g.addedge("d","b");
		
		g.getGraph();
		
	}
}
