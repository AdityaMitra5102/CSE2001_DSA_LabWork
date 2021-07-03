import java.util.*;
public class Question4 {
int thirdCap(String s, int count, int l)
{
	if(s.length()==0) return -1;
	if(Character.isUpperCase(s.charAt(0))) count++;
	if(count==3) return l;
	return thirdCap(s.substring(1),count,++l);
	
}
public static void main(String args[])
{
	System.out.println("Enter String");
	String s=new Scanner(System.in).nextLine();
	int c=new Question4().thirdCap(s, 0, 1); //Starting with 1 because according to example, it is not being counted from 0
	if(c==-1)
	{
		System.out.println("3 Capital letters not present");
	}
	else
	{
		System.out.println(c);
	}
}
}
