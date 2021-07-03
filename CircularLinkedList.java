public class CircularLinkedList {
	Node head;
	
	void insertFirst(int data)
	{
		head=new Node(data);
		head.next=head;
	}
	
	public void insertAtEnd(int data)
	{
		if(head == null)
		{
			insertFirst(data);
			return;
		}
		Node temp=new Node(data);
		getLast().next=temp;
		temp.next=head;
		
	}
	public void insertAtStart(int data)
	{
		if(head == null)
		{
			insertFirst(data);
			return;
		}
		Node temp = new Node(data);
		temp.next=head;
		getLast().next=temp;
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
	
	boolean insertBeforeNode(int data1, int data2)
	{
		Node d=findPrevNode(data1);
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
		if(head.next==head)
		{
			head=null;
			return true;
		}
		Node ptr=head;
		while(ptr.next.next!=head)
		{
			ptr=ptr.next;
		}
		ptr.next=head;
		return true;
	}
	

	boolean deleteNode(Node d)
	{
		if(d==null) return false;
		if(d.next==head) head=d.next.next;
		d.next=d.next.next;
		return true;
	}
	
	boolean deleteAfterNode(int data)
	{
		Node d=findNode(data);
		return deleteNode(d);
	}
	
	boolean deleteNode(int data)
	{
		Node d=findPrevNode(data);
		return deleteNode(d);
	}

	
	boolean deleteBeforeNode(int data)
	{
		Node d=findPrev2Node(data);
		return deleteNode(d);
	}
	
	Node findNode(int data)
	{
		
		Node ptr=head;
		int c=0;
		while(ptr.next!=head)
		{
			if(ptr.data==data) return ptr;
			c++;
			ptr=ptr.next;
		}
		if(ptr.data==data) return ptr;
		
		return null;
	}
	
	Node findPrevNode(int data)
	{
		Node ptr=head;
		int c=0;
		if(ptr==null) return null;
		while(ptr.next!=head)
		{
			if(ptr.next.data==data) return ptr;
			c++;
			ptr=ptr.next;
		}
		if(ptr.next.data==data) return ptr;
		return null;
	}
	
	Node findPrev2Node(int data)
	{
		Node ptr=head;
		int c=0;
		if(ptr==null||ptr.next==head) return null;
		while(ptr.next.next!=null)
		{
			if(ptr.next.next.data==data) return ptr;
			c++;
			ptr=ptr.next;
		}
		if(ptr.next.next.data==data) return ptr;
		return null;
	}
	
	Node getLast()
	{
		if (head==null) return null;
		Node ptr=head;
		while(ptr.next!=head) ptr=ptr.next;
		return ptr;
	}
	
	int countNodes()
	{
		if (head==null) return 0;
		Node ptr=head;
		int c=0;
		do
		{
			ptr=ptr.next;
			c++;
		}while(ptr!=head);
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
		 do
		  {
			  System.out.print(" "+p.data+"->");
			  p = p.next;
		  } while(p != head);	
		  System.out.println();
	  }
	}
}

