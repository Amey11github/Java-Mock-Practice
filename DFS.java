class TreeEx<E>
{
	Node<E> root;
	static class Node<E>
	{
		Node<E> left;
		Node<E> right;
		E ele;

		Node(E ele)
		{
			this.ele=ele;
		}
	}

	public void preOrder(Node<E> root)
	{
		if(root==null)return;

		System.out.print(root.ele+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(Node<E> root)
	{
		if(root==null) return;

		inOrder(root.left);
		System.out.print(root.ele+" ");
		inOrder(root.right);
	}

	public void postOrder(Node<E> root)
	{
		if(root==null) return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.ele+" ");
	}
}

class DFS
{
	public static void main(String[] args) {
		TreeEx<Integer> tree=new TreeEx<>();
		tree.root=new TreeEx.Node<Integer>(10);
		tree.root.left=new TreeEx.Node<Integer>(20);
		tree.root.right=new TreeEx.Node<Integer>(30);
		tree.root.left.left=new TreeEx.Node<Integer>(40);
		tree.root.left.right=new TreeEx.Node<Integer>(50);
		tree.root.right.left=new TreeEx.Node<Integer>(60);
		tree.root.right.right=new TreeEx.Node<Integer>(70);

		tree.preOrder(tree.root);
		System.out.println();

		tree.postOrder(tree.root);
		System.out.println();

		tree.inOrder(tree.root);
		System.out.println();

		
	}
}