import java.util.*;
public class Question1 {
	static Scanner sc=new Scanner(System.in);
	int[][] multiply(int arr1[][], int arr2[][])
	{
		int res[][]=new int[arr1.length*arr2.length][arr1[0].length*arr2[0].length];
		int a=0, b=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				int abase=i*arr2.length;
				a=0;
				for(int k=0;k<arr2.length;k++)
				{
					int bbase=j*arr2[0].length;
					b=0;
					for(int l=0;l<arr2[0].length;l++)
					{
						
						res[a+abase][b+bbase]=arr1[i][j]*arr2[k][l];
						b++;
					}
					a+=1;
				}
				
			}
		}
		return res;
	}
	
	int[][] input()
	{
		System.out.println("Enter size");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter elements");
		int[][] mat=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	
	void show(int mat[][])
	{
		System.out.println("Showing matrix");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) 
	{
		Question1 ob=new Question1();
		int[][] mat1=ob.input();
		int[][] mat2=ob.input();
		int[][] mat3=ob.multiply(mat1,mat2);
		ob.show(mat3);
	}
}
