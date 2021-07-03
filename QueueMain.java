import java.util.*;
public class QueueMain 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter queue size");
		int n=sc.nextInt();
		Queue ob=new Queue(n);
		System.out.println("====MENU====");
		System.out.println("1. Enqueue");
		System.out.println("2. Dequeue");
		System.out.println("3. Peek");
		System.out.println("4. Count");
		System.out.println("5. Show");
		System.out.println("6. Search");
		System.out.println("7. Exit");
		boolean b=true;
		do
		{
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter element to enqueue");
				ob.enqueue(sc.nextInt());
				break;
			case 2:
				System.out.println("Removing element");
				System.out.println(ob.dequeue());
				break;
			case 3:
				System.out.println("Peeking element");
				System.out.println(ob.peek());
				break;
			case 4:
				System.out.println("Counting element");
				System.out.println(ob.count());
				break;
			
			case 5:
				System.out.println("Showing elements");
				ob.show();
				break;
			case 6:
				System.out.println("Enter element to search");
				int c=ob.search(sc.nextInt());
				System.out.println(c==-1?"Element not found":"Element is at position "+c+" from front");
				break;
			case 7:
				System.out.println("Exiting program");
				b=false;
				break;
			default: 
				System.out.println("Wrong input");
			}
		}while(b);
	}
}
