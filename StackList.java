public class StackList extends DataStructureList{

	void push(int data)
	{
		head=new Node(data,head);
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
}
