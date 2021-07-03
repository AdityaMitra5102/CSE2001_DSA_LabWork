
public class BinaryTree {
	Root head;
	void add(int x, Root r)
	{
		Root temp=new Root(x);
		if(x>r.n)
		{
			if(r.right==null)
				r.right=temp;
			else
				add(x,r.right);
		}
		if(x<r.n)
		{
			if(r.left==null)
				r.left=temp;
			else
				add(x,r.left);
		}
	}
	void add(int x)
	{
		if(head==null)
		{
			head=new Root(x);
		}
		else
		{
			add(x,head);
		}
	}
	void inorder(Root head)
	{
		if(head==null)
		{
			return;
		}
		inorder(head.left);
		System.out.print(head+" ");
		inorder(head.right);
	}
	void preorder(Root head)
	{
		if(head==null)
		{
			return;
		}
		System.out.print(head+" ");
		preorder(head.left);
		preorder(head.right);
	}
	void postorder(Root head)
	{
		if(head==null)
		{
			return;
		}
		postorder(head.left);
		postorder(head.right);
		System.out.print(head+" ");
	}
	void inorder()
	{
		inorder(head);
		System.out.println();
	}
	void preorder()
	{
		preorder(head);
		System.out.println();
	}
	void postorder()
	{
		postorder(head);
		System.out.println();
	}
}
