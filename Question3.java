import java.util.*;
public class Question3 {
void magic(int n)
{
	System.out.print(n+" ");
	if(n==1) return;
	if(n%2==0) magic(n/2);
	else magic(3*n+1);
}

public static void main(String args[])
{
	System.out.print("n=");
	int n=new Scanner(System.in).nextInt();
	new Question3().magic(n);
}
}
