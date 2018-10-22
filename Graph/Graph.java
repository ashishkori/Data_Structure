import java.util.*;


public class Graph{
	public Graph()
	{
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
		
	}
	void addEdge(int v,int w)
		{
			adj[v].add(u);
		}
	public int getVertices()
	{
		return vertices;
	}
	public static void main(String [] agrs)
	{
		Graph g=new Graph(4);
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,3);
		
	}
}
