
public abstract class DataStructureList {
	Node head;
	abstract void push(int data);
	
	abstract int pop();
	
	private Node getLast()
	{
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		return ptr;
	}
	
	int peek()
	{
		try
		{
			return head.data;
		}
		catch(NullPointerException excep)
		{
			return -1;
		}
	}
	
	int count()
	{
		int s=0;
		Node ptr=head;
		while(ptr!=null)
		{
			s++;
			ptr=ptr.next;
		}
		return s;
	}
	Node find(int data)
	{

		int s=0;
		Node ptr=head;
		while(ptr!=null)
		{
			if(ptr.data==data)
			{
				return ptr;
			}
			s++;
			ptr=ptr.next;
		}
		return null;
	}
	boolean replace(int data1, int data2)
	{
		Node d=find(data1);
		try
		{
			d.data=data2;
		}
		catch(NullPointerException excep)
		{
			return false;
		}
		return true;
	}
	void display()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" --> ");
			ptr=ptr.next;
		}
		System.out.println();
	}
}
