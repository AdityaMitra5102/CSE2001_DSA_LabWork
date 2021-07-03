import java.util.*;
public class Question2 {
	static Scanner sc=new Scanner(System.in);
	int[][] input()
	{
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int[][] mat=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
	int findMax(int arr[])
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	boolean isStrong(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			if(mat[i][mat.length-i-1]!=findMax(mat[i]))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		Question2 ob=new Question2();
		int[][] mat=ob.input();
		if(ob.isStrong(mat))
		{
			System.out.println("Strong Matrix");
		}
		else
		{
			System.out.println("Not a strong Matrix");
		}
	}
}
