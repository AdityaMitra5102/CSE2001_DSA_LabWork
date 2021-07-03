
public class LinkedList {

	Node head;
	
	public void insertAtEnd(int data)
	{
		Node temp = new Node();
		temp.data = data;
		
		if(head == null)
		{
			head = temp;
		}else {
			Node p = head;
			while(p.next!=null)
			{
				p = p.next;
			}
			p.next = temp;
			temp.next = null;
		}
		
	}
	public void insertAtStart(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next=head;
		head=temp;
	}
	
	boolean insertAfterNode(int data1, int data2)
	{
		Node d=findNode(data1);
		if(d==null) return false;
		Node temp = new Node();
		temp.data = data2;
		temp.next=d.next;
		d.next=temp;
		return true;
		
	}
	
	boolean deleteAtStart()
	{
		if(head==null) return false;
		head=head.next;
		return true;
	}
	
	boolean deleteAtEnd()
	{
		if(head==null) return false;
		if(head.next==null)
		{
			head=null;
			return true;
		}
		Node ptr=head;
		while(ptr.next.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=null;
		return true;
	}
	
	boolean deleteAfterNode(int data)
	{
		Node d=findNode(data);
		if(d==null||d.next==null) return false;
		d.next=d.next.next;
		return true;
	}
	
	Node findNode(int data)
	{
		Node ptr=head;
		int c=0;
		while(ptr!=null)
		{
			if(ptr.data==data) return ptr;
			c++;
			ptr=ptr.next;
		}
		return null;
	}
	
	int countNodes()
	{
		if (head==null) return 0;
		Node ptr=head;
		int c=0;
		while(ptr!=null)
		{
			ptr=ptr.next;
			c++;
		}
		return c;
	}
	
	boolean findAndReplace(int data1, int data2)
	{
		Node d=findNode(data1);
		if(d==null) return false;
		d.data=data2;
		return true;
	}
	
	public void show() 
	{
	  if(head == null)
	  {
		  System.out.println("Cannot print as list is empty! :-(");
	  }else {
		  Node p = head;
		  while(p != null)
		  {
			  System.out.print(" "+p.data+"->");
			  p = p.next;
		  }
		  System.out.println();
	  }
	}
}
