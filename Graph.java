package NonLinear;
import java.util.*;

public class Graph {
	
	int v;
	 ArrayList<LinkedList> vertex;
	 
	public Graph(int v){
		this.v=v;
		vertex =new ArrayList<LinkedList>(v);
		for(int i=0;i<v;i++) {
			vertex.add(new LinkedList());
		}
		 
	 }
	 
	public void AddVertex(String w,int i) {
		 
		 vertex.get(i).addFirst(w);
		 
	 }
	 
	public void AddEdge(String source,String dest) {
		for(int i=0;i<v;i++) {
			if(source==vertex.get(i).getFirst()) {
				vertex.get(i).addLast(dest);
				
			}
			
		}
		
	}
	public void getconnection(String node) {
		for(int i=0;i<v;i++) {
			if(node==vertex.get(i).getFirst()) {
			 System.out.println(vertex.get(i));//it will give all the linked list stored element
			  
			 
			 
			}
		}
	}
	
}














