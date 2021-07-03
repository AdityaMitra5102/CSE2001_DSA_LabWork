
public class BinarySearchTree {
	Root head;
	
	void addNode(Root temp, Root r)
	{
		if (temp==null) return;
		int x=temp.n;
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
	
	void insert(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			add(arr[i]);
		}
	}
	Root search(int x, Root r)
	{
		if(r==null) return null;
		if(r.left!=null&&x==r.left.n)return r;
		if(r.right!=null&&x==r.right.n)return r;
		if(x<r.n) return search(x, r.left);
		return search(x,r.right);
	}
	
	Root search(int x)
	{
		if(head.n==x) return head;
		return search(x,head);
	}
	
	void deleteTwoChildren(Root del)
	{
		Root succ=nextInorder(del.right);
		Root succprev=search(succ.n);
		if(succprev.left==succ) succprev.left =null;
		else succprev.right=null;					
		del.n=succ.n;
		addNode(succ.left,succprev);
		addNode(succ.right,succprev);
	}
	void deleteHead()
	{
		if(head.left!=null&&head.right!=null)
		{
			deleteTwoChildren(head);
		}
		else if(head.left==null)
		{
			head=head.right;
		}
		else
		{
			head=head.left;
		}
	}
	void delete(int x)
	{
		Root prev=search(x);
		if (prev==null)
		{
			System.out.println("Element doesnt exist. Delete failed");
			return;
		}
	
		if(x==head.n)
		{
			deleteHead();
			return;
		}
		
		boolean left=false;
		Root del=null;
		if(prev.right.n==x)
		{
			del=prev.right;
			left=false;
		}
		else
		{
			del=prev.left;
			left=true;
		}
		if(del.left==null||del.right==null)
		{
			if(del.left==null)
			{
				if(left)
				{
					prev.left=del.right;
				}
				else
				{
					prev.right=del.right;
				}
			}
			else
			{
				if(left)
				{
					prev.left=del.left;
				}
				else
				{
					prev.right=del.left;
				}
			}
		}
		else
		{
			deleteTwoChildren(del);
		}
		
	}
	
	Root nextInorder(Root r)
	{
		if(r==null) return null;
		Root t=nextInorder(r.left);
		if(t!=null) return t;
		return r;
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
