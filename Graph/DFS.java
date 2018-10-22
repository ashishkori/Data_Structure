import java.util.*;
class DFS{
	//int start =0;
	DFS()
	{
		super();
	}
	
	public void printdfs(Graph g, int start)
	{
		System.out.print("DFS given Graph Starting from "+start+" is :"  );
		boolean visited[]=new boolean[g.getVertices()];
		Stack<Integer> stack=new Stack<Integer>();
		//Stack<Integer> stack = new Stack<Integer>();
		stack.push(start);
		while(!stack.empty())
		{
			int curr=stack.pop();
			System.out.print(curr+" ");
			//LinkedList l=g.adj[curr];
			//g.add[curr].stream.map();
			for(Integer i:g.adj[curr])
			{
				if(!visited[i]==true)
				{
					visited[i]=true;
					stack.push(i);
				}
			}
		}
		System.out.println();
	}
}