import java.util.*;
public class StackMain {
	void reverseString(String k) 
	{
		Stack obj=new Stack(k.length());
		for(int i=0;i<k.length();i++)
		{
			obj.push(k.charAt(i));
		}
		String l="";
		while(!obj.isEmpty())
		{
			l+=(char)obj.pop();
		}
		System.out.println(l);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter max size");
		int n=sc.nextInt();
		Stack ob=new Stack(n);
		
		System.out.println("====MENU====");
		System.out.println("1. Push data");
		System.out.println("2. Pop data");
		System.out.println("3. Count");
		System.out.println("4. Find");
		System.out.println("5. Display");
		System.out.println("6. Change");
		System.out.println("7. Reverse String");
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
			System.out.println("Counting data");
			System.out.println(ob.count());
			break;
		case 4:
			System.out.println("Enter data to find");
			System.out.println("Data found at: "+ob.find(sc.nextInt()));
			break;
		case 5:
			System.out.println("Showing data");
			ob.display();
			break;
		case 6:
			System.out.println("Changing data");
			System.out.println("Enter data to find and replace");
			ob.change(sc.nextInt(), sc.nextInt());
			break;
		case 7:
			System.out.println("Reverse String");
			System.out.println("Enter string");
			sc.nextLine();
			String k=sc.nextLine();
			new StackMain().reverseString(k);
			break;
		case 8:
			break outer;
		default:
			System.out.println("Wrong input");
		}
		}
	}
}
