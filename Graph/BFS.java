import java.util.*;

class BFS{
	//public int start=0;
	
	BFS()
	{
		super();
	}
	
	public void printbsf(Graph g , int start)
	{
		//LinkedList<boolean> visited[]=new LinkedList<Integer>[g.getVertices()];
		boolean visited[]=new boolean[g.getVertices()];
		LinkedList<Integer> queue=new LinkedList<Integer>();
		visited[start]=true;
		queue.add(start);
		System.out.print("BSF of Given Graph Graph Starting from "+start+" is :"  );
		while(queue.size()>0)
		{
			int s=queue.removeFirst();
			System.out.print(s+ " ");
			//LinkedList x=a.add[s];
			Iterator itr =g.adj[s].iterator();
			while(itr.hasNext())
			{
				int item=(Integer)itr.next();
				if(visited[item]!=true)
				{
					visited[item]=true;
					queue.add(item);
				}
			}
		}
		System.out.println();
		
	}
}
