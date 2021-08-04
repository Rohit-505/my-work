package NonLinear;
import java.util.*;

public class Graph{
	int v;
	ArrayList<LinkedList> adj;
	
	Graph(int v){
		
		this.v=v;
		adj=new ArrayList<LinkedList>(v);
		
		for(int i=0;i<v;i++) {
			 
			adj.add(new LinkedList());
			adj.get(i).add(0,null);
		}
		
	}
	
	public void addedge(String src,String dest) {
		int i;
		for(i=0;i<v;i++) {
			if(adj.get(i).get(0)==null) {
				adj.get(i).removeFirst();
				adj.get(i).addFirst(src);
				adj.get(i).addLast(dest);
				
				break;
			}
			else if(src==adj.get(i).getFirst()) {
				adj.get(i).addLast(dest);
				
				break;
			}
			
		}
		
		
	}
	
	public void getGraph() {
		int i,j;
		for(i=0;i<adj.size();i++) {
			
			System.out.print(adj.get(i).getFirst()+"->");
			
			for(j=1;j<adj.get(i).size();j++) {
			
				System.out.print(adj.get(i).get(j)+",");
			}
			System.out.println();
		}
	}
}//graph closed
















