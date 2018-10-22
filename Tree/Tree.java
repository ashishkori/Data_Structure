class Tree
{
	int data;
	Node left;
	Node  right;
	Tree root;
	Tree()
	{
		root=null;
	}
	public void newNode(int data){
		Node t=new Node(data);
		addNode(t,root);
	}
	public void addNode(Node node, Tree root){
		if(root==null)
		{
			root=node;
		}
		if(root!=null)
		{
			Tree head=root;
			int d=node.data;
			while(head.data>d && head.next != null)
			{
				head=head.left;
			}
			while(head.data<d && head.next != null)
			{
				head=head.right;
			}
			if(head.data>d && head.left==null)
				head.left=node;
			if(head.data<d && head.right==null)
				head.right=node;
		}
	}
	public static void main(String [] args)
	{
		System.out.println("Tree Main");
		Tree t=new Tree();
		t.addNode(0);
		t.addNode(1);
		t.addNode(2);
		t.addNode(3);
		t.addNode(4);
		
	}
}