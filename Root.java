public class Root {
	int n;
	Root left;
	Root right;

	Root(int x)
	{
		this(x,null,null);
	}

	Root(int x, Root l, Root r)
	{
		n=x;
		left=l;
		right=r;
	}

	Root()
	{
		this(0,null,null);
	}
	public String toString()
	{
		return Integer.toString(n);
	}
}
