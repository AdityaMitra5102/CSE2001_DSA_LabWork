import java.util.Scanner;
public class BSTMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BinarySearchTree ob=new BinarySearchTree();
		boolean lp=true;
		System.out.println("1. Add elements");
		System.out.println("2. Search element");
		System.out.println("3. Delete element");
		System.out.println("4. Show element inorder");
		System.out.println("5. Show elements preorder");
		System.out.println("6. Show elements postorder");
		System.out.println("7. Exit");
		while(lp)
		{
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			System.out.println("How many numbers?");
			int k=sc.nextInt();
			int arr[]=new int[k];
			System.out.println("Enter elements");
			for(int i=0;i<k;i++)
			{
				arr[i]=sc.nextInt();
			}
			ob.insert(arr);
			break;
		case 2:
			System.out.println("Enter element");
			int x=sc.nextInt();
			if(ob.search(x)==null)
			{
				System.out.println("Element not found");
			}
			else
			{
				System.out.println("Element found");
			}
			break;
		case 3:
			System.out.println("Enter element");
			int y=sc.nextInt();
			ob.delete(y);
			break;
		case 4:
			ob.inorder();
			break;
		case 5:
			ob.preorder();
			break;
		case 6:
			ob.postorder();
			break;
		case 7: 
			lp=false;
			break;
		default:
			System.out.println("Invalid choice");	
		}
	}
	}
}
