package NonLinear;
import java.util.*;
public class MAIN{
	public static void main(String[]args) {
		
	//	Scanner sc=new Scanner(System.in);
		//System.out.println("enter number of vertex");
		//int v=sc.nextInt();
		Graph g=new Graph(5);
		
			g.AddVertex("A",0);
			g.AddVertex("B",1);
			g.AddVertex("C",2);
			g.AddVertex("D",3);
			g.AddVertex("E",4);
			
			g.AddEdge("A","B");
			g.AddEdge("A","C");
			g.AddEdge("A","D");
			
			g.AddEdge("B","A");
			g.AddEdge("B","C");
			g.AddEdge("B","D");
			
			g.AddEdge("C","A");
			g.AddEdge("C","B");
			g.AddEdge("C","D");
			g.AddEdge("C","E");
			
			g.AddEdge("E","C");
			g.AddEdge("E","D");
			
			g.getconnection("C");
			
			
		
	}
}
