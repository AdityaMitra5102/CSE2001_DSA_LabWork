import java.util.*;
public class DoublyLinkedMain {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	DoublyLinkedList ob=new DoublyLinkedList();
	System.out.println("====MENU====");
	System.out.println("1. Insert at start\r\n"
			+ "2. Insert at end\r\n"
			+ "3. Insert after a given node\r\n"
			+ "4. Insert before a given node\r\n"
			+ "5. Delete at start\r\n"
			+ "6. Delete at end\r\n"
			+ "7. Delete after a given node\r\n"
			+ "8. Delete before a given node\r\n"
			+ "9. Delete a given node\r\n"
			+ "10. Traverse List\r\n"
			+ "11. Find a specific node\r\n"
			+ "12. Replace a specific node\r\n"
			+ "13. Exit");
	outer: while(true)
	{
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		switch (ch)
		{
		case 1:
			System.out.println("Enter data");
			ob.insertAtStart(sc.nextInt());
			break;
		case 2:
			System.out.println("Enter data");
			ob.insertAtEnd(sc.nextInt());
			break;
		case 3:
			System.out.println("Enter query and data");
			ob.insertAfterNode(sc.nextInt(), sc.nextInt());
			break;
		case 4:
			System.out.println("Enter query and data");
			ob.insertBeforeNode(sc.nextInt(), sc.nextInt());
			break;
		case 5:
			ob.deleteAtStart();
			break;
		case 6:
			ob.deleteAtEnd();
			break;
		case 7:
			System.out.println("Enter query");
			ob.deleteAfterNode(sc.nextInt());
			break;
		case 8:
			System.out.println("Enter query");
			ob.deleteBeforeNode(sc.nextInt());
			break;
		case 9:
			System.out.println("Enter query");
			ob.deleteNode(sc.nextInt());
			break;
		case 10:
			ob.traverse();
			break;
		case 11:
			System.out.println("Enter query");
			Node ptr=ob.findNode(sc.nextInt());
			System.out.println(ptr!=null?"Node found":"Node not found");
			break;
		case 12:
			System.out.println("Enter query and data");
			ob.replaceNode(sc.nextInt(), sc.nextInt());
			break;
		case 13:
			break outer;
		default:
			System.out.println("Wrong Input");
		}
	}
}
}
