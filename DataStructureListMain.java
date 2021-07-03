import java.util.*;
public class DataStructureListMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		DataStructureList ob;
		System.out.println("==== MENU ====");
		System.out.println("1. Stack operation");
		System.out.println("2. Queue operation");
		System.out.println("Enter choice");
		out: while(true) {
			System.out.println("Enter menu choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: ob=new StackList();
				break out;
			case 2: ob=new QueueList();
				break out;
			default: System.out.println("Try again");
			}
		}
					
		
		System.out.println("====MENU====");
		System.out.println("1. Push/Enqueue data");
		System.out.println("2. Pop/Dequeue data");
		System.out.println("3. Peek data");
		System.out.println("4. Count");
		System.out.println("5. Find");
		System.out.println("6. Replace");
		System.out.println("7. Display");
		System.out.println("8. Exit");
		outer: while(true) {
		System.out.println("Enter menu choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter data");
			ob.push(sc.nextInt());
			break;
		case 2:
			System.out.println("Popping data");
			System.out.println(ob.pop());
			break;
		case 3:
			System.out.println("Peek data");
			System.out.println(ob.peek());
			break;
		case 4:
			System.out.println("Counting data");
			System.out.println(ob.count());
			break;
		case 5:
			System.out.println("Enter data to find");
			Node d=ob.find(sc.nextInt());
			System.out.println(d!=null?"Element exists": "Element doesn't exist");
			break;
		case 6:
			System.out.println("Replace data");
			System.out.println("Enter data to find and replace");
			boolean b=ob.replace(sc.nextInt(), sc.nextInt());
			System.out.println(b?"Replace successful":"Replace failed");
			break;
		case 7:
			ob.display();
			break;
		case 8:
			break outer;
		default:
			System.out.println("Wrong input");
		}
		}
	}
}
