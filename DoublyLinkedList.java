
public class DoublyLinkedList {
Node head;
	void insertAtStart(int data)
	{
		Node temp=new Node(data,null,head);
		if(head!=null) head.prev=temp;
		head=temp;
	}
	
	void insertAtEnd(int data)
	{
		if(head==null) 
		{
			insertAtStart(data);
			return;
		}
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=new Node(data,ptr,null);
	}
	Node findNode(int data)
	{
		Node ptr=head;
		while(ptr!=null)
		{
			if(ptr.data==data) return ptr;
			ptr=ptr.next;
		}
		return null;
	}
	void insertAfterNode(int query, int data)
	{
		Node ptr=findNode(query);
		if(ptr==null) return;
		if(ptr.next==null) 
		{
			insertAtEnd(data);
			return;
		}
		Node temp=new Node(data,ptr,ptr.next);
		ptr.next.prev=temp;
		ptr.next=temp;
	}
	void insertBeforeNode(int query, int data)
	{
		Node ptr=findNode(query);
		if(ptr==null) return;
		if(ptr.prev==null) 
		{
			insertAtStart(data);
			return;
		}
		ptr=ptr.prev;
		Node temp=new Node(data,ptr,ptr.next);
		ptr.next.prev=temp;
		ptr.next=temp;
	}
	void deleteAtStart()
	{
		if(head==null) return;
		head=head.next;
		head.prev=null;
	}
	void deleteAtEnd()
	{
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.prev.next=null;
	}
	void deleteBeforeNode(int query)
	{
		Node ptr=findNode(query);
		if(ptr==null||ptr.prev==null) return;
		if(ptr.prev.prev==null)
		{
			deleteAtStart();
			return;
		}
		ptr=ptr.prev;
		ptr.prev.next=ptr.next;
		ptr.next.prev=ptr.prev;
	}
	void deleteAfterNode(int query)
	{
		Node ptr=findNode(query);
		if(ptr==null||ptr.next==null) return;
		if(ptr.next.next==null)
		{
			deleteAtEnd();
			return;
		}
		ptr=ptr.next;
		ptr.prev.next=ptr.next;
		ptr.next.prev=ptr.prev;
		
	}
	void deleteNode(int query)
	{
		Node ptr=findNode(query);
		if(ptr==null) return;
		if(ptr.prev==null)
		{
			deleteAtStart();
			return;
		}
		if(ptr.next==null)
		{
			deleteAtEnd();
			return;
		}
		ptr.prev.next=ptr.next;
		ptr.next.prev=ptr.prev;
	}
	void traverse()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
	void replaceNode(int query, int data)
	{
		Node ptr=findNode(query);
		if(ptr==null) return;
		ptr.data=data;
	}
}
