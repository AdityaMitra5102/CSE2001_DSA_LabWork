import java.util.*;
public class StackParenthesis {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String open="{[(";
		String clos="}])";
		System.out.println("Input=");
		String str=sc.nextLine().trim();
		Stack ob=new Stack(str.length());//I know the stack class uses an integer array instead of char
		//But char is easily autoboxed to int so I am not editing the stack class used in the earlier assignment
		for(int i=0;i<str.length();i++)
		{
			if(open.indexOf(str.charAt(i))>=0)
			{
				ob.push(str.charAt(i));
			}
			else if(clos.indexOf(str.charAt(i))>=0)
			{
				if(open.indexOf((char)ob.peek())==clos.indexOf(str.charAt(i)))
				{
					ob.pop();
				}
				else
				{
					System.out.println("Not Balanced");
					return;
				}
			}
		}
		if(ob.count()!=0)
		{
			System.out.println("Not Balanced");
			return;
		}
		System.out.println("Balanced");
				
	}
}