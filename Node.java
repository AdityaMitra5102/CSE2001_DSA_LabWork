
public class Node {
	int data;
	Node prev;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
	Node(int data, Node p, Node n)
	{
		this(data);
		prev=p;
		next=n;
	}
	Node()
	{
		this(0,null,null);
	}
}
