
public class QueueList extends DataStructureList{
	
	void push(int data)
	{
		if(head==null)
			head=new Node(data);
		else
			getLast().next=new Node(data);
	}	
	int pop()
	{
		try
		{
			int val=head.data;
			head=head.next;
			return val;
		}
		catch(NullPointerException excep)
		{
			return -1;
		}
	}
	private Node getLast()
	{
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		return ptr;
	}
	
}