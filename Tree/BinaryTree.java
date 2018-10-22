class BinaryTree
{
	TreeNode root;
	BinaryTree()
	{
		root=null;
	}
	BinaryTree(int data)
	{
		root=new TreeNode(data);
	}
	public void add(int data)
	{
		root=insert(root, data);
	}
	public TreeNode insert(TreeNode node,int data)
	{
		if(node==null)
		{
			root=new TreeNode(data);
			return root;
		}
		if(root.data<data && root.left!=null)
		{
			root.left= insert(root.left, data);
		}
		if(root.data>data && root.right!=null)
		{
			root.right= insert(root.right, data);
		}
		return root;
			
	}
	public void inorder(TreeNode root)
		{
			if(root==null)
				return;
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	public static void main(String [] args)
	{
		BinaryTree t=new BinaryTree();
		System.out.println("Binary Tree Java");
		t.add(1);
		t.add(2);
		t.add(4);t.add(3);t.add(5);t.add(10);
		t.inorder(t.root);
		System.out.println(t.root.data);
	}
	
}