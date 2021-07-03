import java.util.*;
public class Search {

	boolean linearSearch(int arr[], int val)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val) return true;
		}
		return false;
	}
	
	boolean binSearch(int arr[], int val, int l, int h)
	{
		if(l>h)
		{
			return false;
		}
		int mid=(l+h)/2;
		if(arr[mid]==val) return true;
		if(val<arr[mid])
		{
			return binSearch(arr,val,l,mid-1);
		}
		return binSearch(arr,val,mid+1,h);
	}
	
	void fillRandomArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*Integer.MAX_VALUE);
		}
		Arrays.sort(arr);
	}
	
	int getSearchTerm()
	{
		return (int)(Math.random()*Integer.MAX_VALUE);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Search ob=new Search();
		int len=1000000;
		int arr[]=new int[len];
		ob.fillRandomArray(arr);
		int val=ob.getSearchTerm();
		System.out.println("====MENU====");
		System.out.println("1. Linear Search");
		System.out.println("2. Binary Search");
		System.out.println("3. Exit");
		boolean k=true;
		while(k)
		{
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			long t1=System.currentTimeMillis();
			switch(ch)
			{
			case 1: boolean b=ob.linearSearch(arr, val); System.out.println(b?"Element found":"Element not found"); break;
			case 2: boolean c=ob.linearSearch(arr, val); System.out.println(c?"Element found":"Element not found"); break;
			case 3: k=false; break;
			default: System.out.println("Wrong choice");
			}
			long t2=System.currentTimeMillis();
			System.out.println("Time taken = "+(t2-t1)+" ms.");
		}
	}
}
