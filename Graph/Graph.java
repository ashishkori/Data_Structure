import java.util.*;


public class Graph{
	
		public int vertices;
		public  LinkedList<Integer>  adj[];
		Graph()
		{
			super();
		}
		Graph(int v)
		{
			vertices=v;
			adj=new LinkedList[v];
			for(int i=0;i<v;i++)
			{
				adj[i]=new LinkedList();
			}
			
		}
		
	
	void addEdge(int v,int w)
		{
			adj[v].add(w);
		}
	public int getVertices()
		{
			return vertices;
		}
	public static void main(String [] args)
		{
			Graph g=new Graph(4);
			
		
			g.addEdge(0, 1); 
			g.addEdge(0, 2); 
			g.addEdge(1, 2); 
			g.addEdge(2, 0); 
			g.addEdge(2, 3); 
			g.addEdge(3, 3); 
			BFS b=new BFS();
			b.printbsf(g,2);
			//System.out.println();
			DFS d=new DFS();
			d.printdfs(g,2);
		
		}
	
}
