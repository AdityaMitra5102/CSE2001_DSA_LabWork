import java.util.*;
public class Graph {
int adjmat[][];
void read()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of nodes");
	int n=sc.nextInt();
	adjmat=new int[n][];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter number of adjacent nodes for node "+i);
		int m=sc.nextInt();
		adjmat[i]=new int[m];
		System.out.println("Enter adjacent nodes for node "+i);
		for(int j=0;j<m;j++)
		{
			adjmat[i][j]=sc.nextInt();
		}
	}
}

void show()
{
	System.out.println("\nShowing adjacency matrix");
	for(int i=0;i<adjmat.length;i++)
	{
		System.out.print("Node "+i+" links: ");
		for(int j=0;j<adjmat[i].length;j++)
		{
			System.out.print(adjmat[i][j]+" ");
		}
		System.out.println();
	}
}
boolean checkCycle()
{
	for(int i=0;i<adjmat.length;i++)
	{
		boolean arr[]=new boolean[adjmat.length];
		if(maintainVisited(arr,i)) return true;
	}
	return false;
}

boolean maintainVisited(boolean arr[], int curr)
{
	if(arr[curr]) return true;
	else arr[curr]=true;
	for(int i=0;i<adjmat[curr].length;i++)
	{
		if(maintainVisited(arr,adjmat[curr][i])) return true;
	}
	return false;
}

public static void main(String args[])
{
	Graph ob=new Graph();
	ob.read();
	ob.show();
	System.out.println(ob.checkCycle()?"Cycle exist":"Cycle does not exist");
}
}
