package NonLinear;
import java.util.*;
import Linear.Queue;

class ver {
	LinkedList l;
	boolean check;
	ver(){
		l=new LinkedList();
		check=false;
	}
}

public class Graph{
	int v;
	ver temp =new ver();
	ArrayList<ver> adj;
	
	Graph(int v){
		
		this.v=v;
		adj=new ArrayList<ver>(v);
		
		for(int i=0;i<v;i++) {
			 
			adj.add(new ver());
			adj.get(i).l.add(0,null);
		}
		
	}
	
	public void addedge(String src,String dest) {
		int i;
		for(i=0;i<v;i++) {
			if(adj.get(i).l.get(0)==null) {
				adj.get(i).l.removeFirst();
				adj.get(i).l.addFirst(src);
				adj.get(i).l.addLast(dest);
				
				break;
			}
			else if(src==adj.get(i).l.getFirst()) {
				adj.get(i).l.addLast(dest);
				
				break;
			}
			
		}
		
		
	}
	
	public void getGraph() {
		int i,j;
		for(i=0;i<adj.size();i++) {
			
			System.out.print(adj.get(i).l.getFirst()+"->");
			
			for(j=1;j<adj.get(i).l.size();j++) {
			
				System.out.print(adj.get(i).l.get(j)+",");
			}
			System.out.println();
		}
	}//

public void BFS(String s) {
	    String front=s; 
	    String list;
	    int count=0;
	    ArrayList<String> output=new ArrayList<String>(20);
		Queue q=new Queue();
		while(q.front()!=q.rear()||q.rear()==-1) {
	     
			for(int i=0;i<adj.size();i++) {
			
			if(front==adj.get(i).l.getFirst()&& adj.get(i).check==false) {
			
			//true part handled	
				temp = adj.get(i);
				temp.check=true;
		
				for(int j=0;j<temp.l.size();j++) {
					
					list=temp.l.get(j).toString();
					q.enq(list);
				}
				
				break;
			}    //false part is not handled
			
			}
			for(int k=0;k<output.size();k++) {
				if(output.get(k)==q.getfront()) {
					q.deq();
					count++;
					front=q.getfront();
					break;
					
				}
				
			}
			if(count==0) {
				System.out.print(q.getfront()+"--");
				output.add(q.getfront());
				front=q.getfront();
				q.deq();
				
			}
			count=0;
			
			
   
	}//while closed
}



}//graph closed

























